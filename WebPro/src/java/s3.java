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
                    + "<div style='width:200px;text-align:center;font-family:Comic Sans MS;font-size:20px;border:2px solid red;background-color:red;border-radius:8px;padding:10px;font-weight:bold;'>Follow Us</div>");
            out.println("<div style='width:200px;padding:10px;border-radius:0px 0px 8px 8px;border:2px solid red;margin-top:-10px;margin-left:auto;margin-right:auto;background-color:Tomato;float:left;'><br/><center><a href='www.gmail.com'><img src='g.png' class='g' style='width:100px;height:100px;'/></center><center></a><a href='www.facebook.com'><img src='f.png' class='f' style='width:120px;height:100px'/></a><br/><a href='www.twitter.com'><img src='t.png' class='t' style='width:120px;height:100px;'/></a><br/><a href='www.youtube.com'><img src='y.png' class='y' style='width:120px;height:100px;margin-top:-20px'/></a></center></div>");
            out.println("<table style='float:center;margin-left:230px;border-radius:8px;'><tr><td style='background-color:tomato;padding:5px;border-radius:8px 0px 0px 0px;width:150px;font-family:Comic Sans MS;font-weight:bold;text-align:center;color:red;'>Contact Name</td><td style='background-color:tomato;padding:5px;width:300px;font-weight:bold;text-align:center;font-family:Comic Sans MS;color:red;' class='t'>Contact No.</td></tr>"
                    + "<tr><td style='background-color:gray;padding:5px;border-radius:0px 0px 0px 0px;width:150px;font-family:Comic Sans MS;font-weight:bold;text-align:center;'>xyz</td><td style='background-color:silver;padding:5px;width:300px;font-weight:bold;text-align:center;font-family:Comic Sans MS;' class='t1'>7458598956</td></tr>"
                    + "<tr><td style='background-color:gray;padding:5px;border-radius:0px 0px 0px 8px;width:150px;font-family:Comic Sans MS;font-weight:bold;text-align:center;'>abc</td><td style='background-color:silver;padding:5px;width:300px;font-weight:bold;text-align:center;font-family:Comic Sans MS;' class='t2'>7547568656</td></tr></table>"
                    + "<div class='circle'><br/><br/><br/><div style='width:100px;height:50px;background-color:red;margin-left:200px;border-radius:50px;'></div><div style='width:10px;height:10px;background-color:red;border-radius:10px;margin-left:350px;'></div><br/><div style='width:10px;height:10px;background-color:red;border-radius:10px;margin-left:390px;'><br/></div><div style='width:10px;height:10px;background-color:red;border-radius:10px;margin-left:200px;margin-top:305px;'></div><br/><div style='width:10px;height:10px;background-color:red;border-radius:10px;margin-left:160px;margin-top:-50px;'></div><div style='width:10px;height:10px;background-color:red;border-radius:10px;margin-left:200px;margin-top:-30px;'></div></div>br/><br/><br/><br/><br/><br/><div style='width:1000px;height:20px;background-color:red'></div>"
                    + "<div class='ci' style='float:right;border-radius:200px;margin:50px;border:20px solid black;border-left:20px solid transparent;border-top:20px solid transparent;transform:translate(-402px,-80px) rotate(135deg);'></div>");
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
                    +"ul li .p3{ background-color:white;padding:15px;border-radius:8px;color:red;font-weight:bold;font-weight:bold}"                   
                    + ".p5{color:gold;font-weight:bold;}"
                    + ".g:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".f:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".t:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".y:hover{padding:10px;transition-duration:0.9s;background-color:rgb(0,0,0,0.5);}"
                    + ".t{border-radius:0px 8px 0px 0px;}"
                    + ".t1{border-radius:0px 0px 0px 0px;}"
                    + ".t2{border-radius:0px 0px 8px 0px;}"
                    + ".circle{height:500px;width:500px;background-color:tomato;float:right;margin-top:-160px;border-radius:500px;border:2px solid red;}"
                    + ".circle:hover{-webkit-animation:c 6s infinite;}"
                    + "@keyframes c{ 0%{background-color:gray;-webkit-transform:rotate(360deg);}25%{background-color:white;}50%{background-color:black;}75%{background-color:pink;}100%{background-color:yellow;}}"
                  
                    
                    + "</style>");
            //out.println("<h1>Servlet s1 at " + request.getContextPath() + "</h1>");
            out.println("<p style='color:gray;transform:translate(655px,-446px);'><span style='color:red'>Contact:</span> xyz@gmail.com;</p> <p  style='color:gray;transform:translate(830px,-480px);'><span style='color:red'/>Ph.</span> 0123456789</p>");
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
