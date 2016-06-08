<%-- 
    Document   : EditCustomer
    Created on : 29 May, 2016, 11:57:49 PM
    Author     : Annu
--%>

<%@page import="cust.Customer"%>
<%-- 
    Document   : AddCustomer
    Created on : 29 May, 2016, 1:44:13 AM
    Author     : Annu
--%>

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


            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Sector <small>Booking Flat</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i> Sector
                            </li>
                        </ol>
                    </div>
                </div>
             <form role="form" method="POST" action="/AmanoraTown/PutCustomer?id=<%=cs.getId()%>">
                            <div class="form-group">
                                <label>Flat Name</label>
                                <input value="<%=cs.getFlat()%>" name="Flat" class="form-control" placeholder="T1-F3-456">
                            </div>
                            <div class="form-group">
                                <label>Customer Name</label>
                                <div class="row">
                                    <div class="col-sm-4">
                                    <input value="<%=cs.getFname()%>" name="Fname" class="form-control" placeholder="FirstName">
                                    </div>
                                        <div class="col-sm-4">
                                  <input  value="<%=cs.getMname()%>" name="Mname" class="form-control" placeholder="MiddleName">
                                        </div>
                                        <div class="col-sm-4">
                                   <input value="<%=cs.getLname()%>"  name="Lname" class="form-control" placeholder="Lastname">
                                   </div>
                                   <div>
                                </div> 
                            </div>
                 
                 <div class="form-group">
                     <div class="row">
                         <div class="col-sm-1">
                                <label style="margin-top:10px;">Gender</label>
                         </div>
                               <div class="col-sm-1">

                                <div class="radio">
                                    <label>
                                        <input type="radio" name="Gender" id="optionsRadios1" value="M" <%=cs.IsMale()%>>Male
                                    </label>
                                </div>
                               </div>
                                 <div class="col-sm-1">

                                <div class="radio">
                                    <label>
                                        <input type="radio" name="Gender" id="optionsRadios2" value="F" <%=cs.IsFemale()%>>Female
                                    </label>
                                </div>
                                </div>
                     </div>
                            </div>
                            <div class="form-group">
                                <label>Customer Email</label>
                               
                                <div class="row" style="margin-bottom: 15px;">
                                <div class="col-sm-4">
                                <input value="<%=cs.getEmailUser()%>" name="Email1" class="form-control " placeholder="anitagarje">
                                </div>
                                    <div class="col-sm-4">
                                      @domain
                                    </div>
                                <div class="col-sm-4">
                                <select name="Email2" class="form-control">
                                    <option>gmail.com</option>
                                    <option>yahoo.com</option>
                                    <option>hotmail.com</option>
                                  </select>
                                    </div>
                                </div>
                                
                                
                            <div class="form-group">
                                <label>Primary Phone #</label>
                                <input value="<%=cs.getPhone1()%>" name="Phone1" type="number" class="form-control" placeholder="8983751858">
                            </div>
                             <div class="form-group">
                                <label>Secondary Phone #</label>
                                <input value="<%=cs.getPhone2()%>" name="Phone2" type="number" class="form-control" placeholder="9665713474">
                            </div>
                             <div class="form-group">
                                <label>Address #</label>
                                <div class="row">
                                    <div class="col-sm-4">
                               <textarea  name="Address1" class="form-control" rows="6" placeholder="Present Address"> <%=cs.getAddress1()%></textarea>
                                    </div>
                                      <div class="col-sm-4">
                               <textarea  name="Address2" class="form-control" rows="6" placeholder="Permanent Address"><%=cs.getAddress2()%></textarea>
                                    </div>
                                      <div class="col-sm-4">
                               <textarea  name="Address3" class="form-control" rows="6" placeholder="Office Address"><%=cs.getAddress3()%></textarea>
                                    </div>
                                </div>
                            </div>
                       </div>
                           
                            <button type="submit" class="btn btn-primary">Submit Button</button>
                          

             </form>
                
                
            </div>
            <!-- /.container-fluid -->
            <%@include file="Footer.jsp" %>

     
