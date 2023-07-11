package com.example.day03;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MappingSpec extends HttpServlet {
    public void init() {
    }

//    @Override
//    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        super.doHead(req, resp);
//        System.out.println("im head  method");
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Mapping Spec DoGet!!");
        System.out.println("Context Path "+ req.getContextPath());
        System.out.println("Servlet Path "+ req.getServletPath());
        System.out.println("Path info "+req.getPathInfo());
        System.out.println("Query String "+req.getQueryString());
        System.out.println("Request URL "+req.getRequestURL());
        System.out.println("Protocol "+req.getProtocol());
        System.out.println("Scheme "+req.getScheme());
        System.out.println("Remote Host "+req.getRemoteHost());
        System.out.println("Remote Address "+req.getRemoteAddr());
        System.out.println("Server Name "+req.getServerName());
        System.out.println("Server port "+req.getServerPort());
        System.out.println("Local  Name "+req.getLocalName());
        System.out.println("Local  Address "+req.getLocalAddr());
        System.out.println("Local  Port "+req.getLocalPort());
        System.out.println("Get Method "+req.getMethod());
        System.out.println("path 01 :  "+req.getServletContext().getContextPath());
        System.out.println("path 01 :  "+req.getServletContext().getRealPath("mapping"));

    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Mapping Spec DoPost!!");
        System.out.println("Context Path "+ req.getContextPath());
        System.out.println("Servlet Path "+ req.getServletPath());
        System.out.println("Path info "+req.getPathInfo());
        System.out.println("Query String "+req.getQueryString());
        System.out.println("Request URL "+req.getRequestURL());
        System.out.println("Protocol "+req.getProtocol());
        System.out.println("Scheme "+req.getScheme());
        System.out.println("Remote Host "+req.getRemoteHost());
        System.out.println("Remote Address "+req.getRemoteAddr());
        System.out.println("Server Name "+req.getServerName());
        System.out.println("Server port "+req.getServerPort());
        System.out.println("Local  Name "+req.getLocalName());
        System.out.println("Local  Address "+req.getLocalAddr());
        System.out.println("Local  Port "+req.getLocalPort());
        System.out.println("Get Method "+req.getMethod());
        System.out.println("path 01 :  "+req.getServletContext().getContextPath());
        System.out.println("path 01 :  "+req.getServletContext().getRealPath("mapping"));





    }
}
