package com.example.API;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MappingSpec extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Mapping Spce !!");
        System.out.println("Context Path " + request.getContextPath());
        System.out.println("Path info " + request.getPathInfo());
        System.out.println("Query String " + request.getQueryString());
        System.out.println("Request URL " + request.getRequestURI());
        System.out.println("Protocol " + request.getProtocol());
        System.out.println("Scheme " + request.getScheme());
        System.out.println("Remote Host " + request.getRemoteHost());
        System.out.println("Remote Address " + request.getRemoteAddr());
        System.out.println("Server Name " + request.getServerName());
        System.out.println("Server port " + request.getServerPort());
        System.out.println("Local  Name " + request.getLocalName());
        System.out.println("Local  Address " + request.getLocalAddr());
        System.out.println("Local  Port " + request.getLocalPort());
        System.out.println("Get Method " + request.getMethod());


    }
}
