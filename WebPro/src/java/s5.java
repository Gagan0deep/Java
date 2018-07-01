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
public class s5 extends HttpServlet {

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
            out.println("<div style='background-color:red;padding-top:-10px;'><br/></div><br/><br/><br/><br/>");
            out.println("<div style='background-color:gold;color:red;border-radius:8px'><marquee>The Registeration will be closed soon....!.So The Students are requested to register as soon as possible.</marquee></div>");
            out.println("<div style='background-color:gray;border-radius:8px;width:500px;transform:translate(340px,50px);text-align:center;padding:10px;font-size:20px;font-weight:bold;font-family:Comic Sans MS'>Register<br/></div><div style='background-color:silver;width:500px;transform:translate(340px,45px);padding:10px;'><br/>"
                    + "<div style='padding-left:70px;font-size:18px;margin-left:10px;'>Username<input type='username' name='username' placeholder='xyz' style='padding:5px;margin-left:20px;border-radius:8px;'/><br/><br/>"
                    + "Password <input type='password' name='password' placeholder='***********' style='padding:5px;margin-left:18px;border-radius:8px;'/><br/><br/>"
                    + "Email-Id <input type='email' name='email' placeholder='xyz@gmail.com' style='padding:5px;margin-left:23px;border-radius:8px;'/><br/><br/>"
                    + "Date Of Birth<input type='date' name='date' style='padding:5px;margin-left:20px;border-radius:8px;'/><br/><br/>"
                    + "<button style='padding:8px;margin-left:120px;border-radius:8px;'>Sign up</button><br/><br/><div style='background-color:gray;width:500px;transform:translate(-90px,22px);padding:10px;'></div></div></div>");
            out.println("<div style='width:100%;transform:translate(0,100px);background:linear-gradient(to right,silver,red);'><br/></div>");
            out.println("<style>"
                    + "body{ max-width:1200px;margin-left:auto;margin-right:auto;background-color:black;}"
                    +"#header{ background-color:silver;float:left;}"
                    + "ul li{ list-style-type:none;display:inline-block;margin-top:30px;background-color:red;padding:6px;}"
                    + "ul{ float:right;margin:0px;padding:0px;overflow:hidden;}"
                    + "li a{ display:block;text-align:center;}"
                    + "a{text-decoration:none;font-size:18px;color:white;padding:20px;}"
                    + "a:hover{color:red;}"
                    + "ul li a:hover{background-color:white;padding:15px;border-radius:8px;transition-duration:1s;}"
                    + "h1{padding:10px;}"
                    +"ul li .p5{ background-color:white;padding:15px;border-radius:8px;color:red;font-weight:bold;}"                   
                    + ".p5{color:gold;font-weight:bold;}"
                    + "button:hover{ font-weight:bold;background-color:gray;}"
                    + "button{box-shadow:1px 1px;}"
                    + "</style>");
            //out.println("<h1>Servlet s1 at " + request.getContextPath() + "</h1>");
            out.println("<p style='color:gray;transform:translate(880px,-530px);'><span style='color:red'>Contact:</span> xyz@gmail.com; <span style='color:red'/>Ph.</span> 0123456789</p>");
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
