package cust;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cust.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Annu
 */
public class PostCustomer extends HttpServlet {

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
            out.println("<title>Servlet PostCustomer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PostCustomer at " + request.getContextPath() + "</h1>");
          // out.println(request.getAttribute("Fname"));
            java.sql.Connection con;
            java.sql.Statement s;
            java.sql.ResultSet rs;
            java.sql.PreparedStatement pst;
            
               con=null;
               s=null;
               pst=null;
                rs=null;
             String driver = "com.mysql.jdbc.Driver";
            String connection = "jdbc:mysql://localhost/Amanora";
            String user = "root";
            String password = "";
    try{
        
                //String username = request.getParameter("uname");   
        //String password = request.getParameter("password");
        Class.forName(driver); 
        con = java.sql.DriverManager.getConnection(connection, user, password); 
            Customer cs=new Customer();
            cs.setFname(request.getParameter("Fname"));
             cs.setMname(request.getParameter("Mname"));
             cs.setLname(request.getParameter("Lname"));
             cs.setFlat(request.getParameter("Flat")); 
            cs.setEmail(request.getParameter("Email1")+"@"+request.getParameter("Email2")); 
            cs.setGender(request.getParameter("Gender"));
            cs.setPhone1(request.getParameter("Phone1"));
            cs.setPhone2(request.getParameter("Phone2"));
            cs.setAddress1(request.getParameter("Address1"));
            cs.setAddress2(request.getParameter("Address2"));
            cs.setAddress3(request.getParameter("Address3"));
               out.println(cs.ToSqlCreate());
               
               
       pst = con.prepareStatement(cs.ToSqlCreate());
        //pst.setString(1, username);
       // pst.setString(2, password);
        
         pst.executeUpdate();                        
       /* while(rs.next())           
        {
            
            Customer cs=new Customer(rs);
            out.println(cs.toString());
        }  */      
   }
   catch(Exception e){     
       e.printStackTrace();
       out.println("Something went wrong !! Please try again"); 
       //out.println(username);  
   }      
               
           //out.println(request.getParameter("Fname"));
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
