<%-- 
    Document   : BookingFlat
    Created on : 28 May, 2016, 11:12:10 PM
    Author     : Annu
--%>
<%@page import="cust.Customer"%>
<%
java.sql.Connection con;
java.sql.Statement s;
java.sql.ResultSet rs;
java.sql.PreparedStatement pst;

con=null;
s=null;
pst=null;
rs=null;

//String url= "jdbc:jtds:sqlserver://ANNU-PC/MyAmanora";
//String id= "sa";
//String pass = "sysadmin";

            String driver = "com.mysql.jdbc.Driver";
            String connection = "jdbc:mysql://localhost/Amanora";
            String user = "root";
            String password = "";
    try{
        
                //String username = request.getParameter("uname");   
        //String password = request.getParameter("password");
        Class.forName(driver); 
        con = java.sql.DriverManager.getConnection(connection, user, password); 
        pst = con.prepareStatement("Select * from customer");
        //pst.setString(1, username);
       // pst.setString(2, password);
        
         rs = pst.executeQuery();                        
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


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Amanora Table</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        function ajaxloader(id)
        {
            console.log(id);
            $.ajax({url: "ViewCustomerAjax.jsp", success: function(result){
            //$("#div1").html(result);
            console.log(result);
            }});
;
        }
        </script>

</head>

<body>

    <div id="wrapper">

      

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Tables
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Tables
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    
                    <div class="col-lg-12">
                        <h2>Customer details </h2><a class="btn btn-primary" href="#">Add customer</a>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>Customer Name</th>
                                        <th>Flat Name</th>
                                        <th>PrimaryPhone#</th>
                                        <th>SecondaryPhone#</th>
                                        <th>Email</th>
                                        <th>Present Address</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                    while(rs.next())
                                    {
                                        
                                   Customer cs=new Customer(rs);
                                   
                                    %>
                                    
                                    <tr>
                                        <td> <%=cs.getFname()%> <%=cs.getMname()%> <%=cs.getLname()%></td>
                                        <td><%=cs.getFlat()%></td>
                                        <td><%=cs.getPhone1()%></td>
                                        <td><%=cs.getPhone2()%></td>
                                        <td><%=cs.getEmail()%></td>
                                        <td><a class="btn btn-danger" href="/AmanoraTown/DeleteCustomer?id=<%=cs.getId()%>">delete</a>
                                            <a class="btn btn-primary" href="/AmanoraTown/EditCustomer.jsp?id=<%=cs.getId()%>">Edit</a>
                                            <a class="btn btn-primary" onclick='ajaxloader(<%=cs.getId()%>)'>View</a></td>
                                    </tr>
                                    <% 
                                     }
                                    %>
                                </tbody>
                                
                            </table>
                        </div>
                    </div>
                </div>
                <!-- /.row -->

                
                <!-- /.row -->

                
                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
