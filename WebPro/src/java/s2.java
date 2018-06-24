/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ramesh
 */
public class s2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet s1</title>");            
            out.println("</head>");
            out.println("<body id='home'>");
            out.println("<div id='header'><h1><span style='color:red'>My</span> Dreams</h1></div>");
            out.println("<ul><li><a href='s1' class='p1'>Home</a></li>"
                    + "<li><a href='s2' class='p2'>About Us</a></li>"
                    + "<li><a href='s3' class='p3'>Contact Us</a></li>"
                    + "<li><a href='s4' class='p4'>Login</a></li>"
                    + "<li class='l1'><a href='s5' class='p5'>Register</a></li>"
                    + "</ul>");
            out.println("<div style='background-color:silver'><br/></div>");
            out.println("<div style='background-color:red;padding-top:-10px;'><br/></div>");
            out.println("<style>"
                    + "body{ max-width:960px;margin-left:auto;margin-right:auto;background-color:black;}"
                    +"#header{ background-color:silver;float:left;}"
                    + "ul li{ list-style-type:none;display:inline-block;margin-top:30px;background-color:red;padding:6px;}"
                    + "ul{ float:right;margin:0px;padding:0px;overflow:hidden;}"
                    + "li a{ display:block;text-align:center;}"
                    + "a{text-decoration:none;font-size:18px;color:white;padding:20px;}"
                    + "a:hover{color:red;}"
                    + "ul li a:hover{background-color:white;padding:15px;border-radius:8px;transition-duration:1s;}"
                    + "h1{padding:10px;}"
                    +"ul li .p2{ background-color:white;padding:15px;border-radius:8px;color:red;font-weight:bold}"                   
                    + ".p5{color:gold;font-weight:bold;}"
                    + "</style>");
            //out.println("<h1>Servlet s1 at " + request.getContextPath() + "</h1>");
            out.println("<p style='color:gray;transform:translate(476px,-53px);'><span style='color:red'>Contact:</span> xyz@gmail.com;</p> <p  style='color:gray;transform:translate(650px,-86px);'><span style='color:red'/>Ph.</span> 0123456789</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
