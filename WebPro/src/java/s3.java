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
public class s3 extends HttpServlet {

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
            out.println("<div style='background-color:red;padding-top:-10px;'><br/></div><br/><br/><br/><br/><br/><br/><br/>"
                    + "<div style='width:200px;text-align:center;font-family:Comic Sans MS;font-size:20px;background-color:red;border-radius:8px;padding:10px;font-weight:bold;'>Follow Us</div>");
            out.println("<div style='width:200px;padding:10px;border-radius:0px 0px 8px 8px;margin-top:-10px;margin-left:auto;margin-right:auto;background-color:Tomato;float:left;'><br/><center><a href='www.gmail.com'><img src='g.png' class='g' style='width:100px;height:100px;'/></center><center></a><a href='www.facebook.com'><img src='f.png' class='f' style='width:120px;height:100px'/></a><br/><a href='www.twitter.com'><img src='t.png' class='t' style='width:120px;height:100px;'/></a><br/><a href='www.youtube.com'><img src='y.png' class='y' style='width:120px;height:100px;margin-top:-20px'/></a></center></div>");
            out.println("<table style='float:center;margin-left:250px;border-radius:8px;'><tr><td style='background-color:red;padding:5px;border-radius:8px 0px 0px 0px;width:150px;font-family:Comic Sans MS;font-weight:bold;text-align:center;'>Contact Name</td><td style='background-color:tomato;padding:5px;width:300px;font-weight:bold;text-align:center;font-family:Comic Sans MS;' class='t'>Contact No.</td></tr>"
                    + "<tr><td style='background-color:gray;padding:5px;border-radius:0px 0px 0px 0px;width:150px;font-family:Comic Sans MS;font-weight:bold;text-align:center;'>xyz</td><td style='background-color:silver;padding:5px;width:300px;font-weight:bold;text-align:center;font-family:Comic Sans MS;' class='t1'>7458598956</td></tr>"
                    + "<tr><td style='background-color:gray;padding:5px;border-radius:0px 0px 0px 8px;width:150px;font-family:Comic Sans MS;font-weight:bold;text-align:center;'>abc</td><td style='background-color:silver;padding:5px;width:300px;font-weight:bold;text-align:center;font-family:Comic Sans MS;' class='t2'>7547568656</td></tr></table>");
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
                    +"ul li .p3{ background-color:white;padding:15px;border-radius:8px;color:red;font-weight:bold;font-weight:bold}"                   
                    + ".p5{color:gold;font-weight:bold;}"
                    + ".g:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".f:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".t:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".y:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".t{border-radius:0px 8px 0px 0px;}"
                    + ".t1{border-radius:0px 0px 0px 0px;}"
                    + ".t2{border-radius:0px 0px 8px 0px;}"
                    + "</style>");
            //out.println("<h1>Servlet s1 at " + request.getContextPath() + "</h1>");
            out.println("<p style='color:gray;transform:translate(440px,-333px);'><span style='color:red'>Contact:</span> xyz@gmail.com;</p> <p  style='color:gray;transform:translate(610px,-365px);'><span style='color:red'/>Ph.</span> 0123456789</p>");
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
