package com.company.controller;

import com.company.comm.Const;
import com.company.dao.pojo.Parking;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IParkingService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/findParking")
public class ParkingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String community = request.getParameter("community");
        IParkingService parkingService = (IParkingService) ServiceFactory.getInstance(Const.PARKING);
        if (community == null) {
            List<Parking> parkings = parkingService.findAll();
            request.setAttribute("parkings",parkings);
            request.getRequestDispatcher("/parking.jsp").forward(request,response);
        } else {
            List<Parking> parkings = parkingService.findByCid(Integer.parseInt(community));
            System.out.println(1);
            request.setAttribute("parkings",parkings);
            request.getRequestDispatcher("/parking.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = ((HttpServletRequest) req).getSession();
//        String username = (String) session.getAttribute("username");
//        IParkingService parkingService = (IParkingService) ServiceFactory.getInstance(Const.PARKING);
//        List<Parking> parkings = parkingService.findByName(username);
//        req.setAttribute("parkings",parkings);
//        req.getRequestDispatcher("/parking.jsp").forward(req,resp);

        String community = request.getParameter("community");
        IParkingService parkingService = (IParkingService) ServiceFactory.getInstance(Const.PARKING);
        if (community == null || Integer.parseInt(community) == 0) {
            List<Parking> parkings = parkingService.findAll();
            request.setAttribute("parkings",parkings);
            request.getRequestDispatcher("/parking.jsp").forward(request,response);
        } else {
            List<Parking> parkings = parkingService.findByCid(Integer.parseInt(community));
            System.out.println(1);
            request.setAttribute("parkings",parkings);
            request.getRequestDispatcher("/parking.jsp").forward(request,response);
        }
    }
}
