<%-- 
    Document   : viewcustomer
    Created on : 8 Jun, 2016, 1:40:33 AM
    Author     : Annu
--%>

<%@page import="cust.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.jsp" %>
<%
    java.sql.Connection con;
java.sql.Statement s;
java.sql.ResultSet rs;
java.sql.PreparedStatement pst;

con=null;
s=null;
pst=null;
rs=null;
Customer cs=new Customer();
String driver = "com.mysql.jdbc.Driver";
String connection = "jdbc:mysql://localhost/Amanora";
String user = "root";
String password = "";
    try{
        
        Class.forName(driver); 
        
            con = java.sql.DriverManager.getConnection(connection, user, password); 
            String str="Select * from customer where Id="+request.getParameter("id");
            s=con.createStatement();
            rs=s.executeQuery(str);
            rs.next() ;
            cs=new Customer(rs);
            //out.println(cs.toString());
            //out.println(request.getParameter("id"));
            //pst=con.prepareStatement(sql)
           // pst = con.prepareStatement(cs.ToSqlUpdate());
          //  pst.executeUpdate();                         
            
   }
   catch(Exception e){     
       e.printStackTrace();
       out.println("Something went wrong !! Please try again"); 
       //out.println(username);  
   }      

    
%>

   <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>Column Name</th>
                                        <th>Detail</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                  
                                    
                                    <tr>
                                        <td>Customer Name:</td>
                                        <td> <%=cs.getFname()%> <%=cs.getMname()%> <%=cs.getLname()%></td>
                                    </tr>
                                     <tr>
                                        <td>Gender:</td>
                                        <td> <%=cs.getGender()%></td>
                                    </tr>
                                    <tr>
                                        <td> Flat Name: </td>
                                        <td><%=cs.getFlat()%></td>
                                    </tr>
                                    <tr>
                                        <td> Phone 1: </td>
                                        <td><%=cs.getPhone1()%></td>
                                    </tr>
                                    <tr>
                                        <td> Phone 2: </td>
                                        <td><%=cs.getPhone2()%></td>
                                    </tr>
                                    <tr>
                                        <td> Email: </td>
                                       <td><%=cs.getEmail()%></td>
                                    </tr>
                                    <tr>
                                        <td> Present Address </td>
                                       <td><%=cs.getAddress1()%></td>
                                    </tr>
                                     <tr>
                                        <td> Permanent Address </td>
                                       <td><%=cs.getAddress2()%></td>
                                    </tr>
                                     <tr>
                                        <td> Permanent Address </td>
                                       <td><%=cs.getAddress3()%></td>
                                    </tr>
                                   
                                   
                                </tbody>
                                
                            </table>
                        </div>

<%@include file="Footer.jsp" %>
