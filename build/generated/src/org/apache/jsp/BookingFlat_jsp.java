package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cust.Customer;

public final class BookingFlat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

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



      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Amanora Table</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script>\n");
      out.write("        function ajaxloader(id)\n");
      out.write("        {\n");
      out.write("            console.log(id);\n");
      out.write("            $.ajax({url: \"ViewCustomerAjax.jsp\", success: function(result){\n");
      out.write("            //$(\"#div1\").html(result);\n");
      out.write("            console.log(result);\n");
      out.write("            }});\n");
      out.write(";\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <!-- Page Heading -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            Tables\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.html\">Dashboard</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <i class=\"fa fa-table\"></i> Tables\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h2>Customer details </h2><a class=\"btn btn-primary\" href=\"#\">Add customer</a>\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-bordered table-hover table-striped\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Customer Name</th>\n");
      out.write("                                        <th>Flat Name</th>\n");
      out.write("                                        <th>PrimaryPhone#</th>\n");
      out.write("                                        <th>SecondaryPhone#</th>\n");
      out.write("                                        <th>Email</th>\n");
      out.write("                                        <th>Present Address</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                    while(rs.next())
                                    {
                                        
                                   Customer cs=new Customer(rs);
                                   
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> ");
      out.print(cs.getFname());
      out.write(' ');
      out.print(cs.getMname());
      out.write(' ');
      out.print(cs.getLname());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(cs.getFlat());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(cs.getPhone1());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(cs.getPhone2());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(cs.getEmail());
      out.write("</td>\n");
      out.write("                                        <td><a class=\"btn btn-danger\" href=\"/AmanoraTown/DeleteCustomer?id=");
      out.print(cs.getId());
      out.write("\">delete</a>\n");
      out.write("                                            <a class=\"btn btn-primary\" href=\"/AmanoraTown/EditCustomer.jsp?id=");
      out.print(cs.getId());
      out.write("\">Edit</a>\n");
      out.write("                                            <a class=\"btn btn-primary\" onclick='ajaxloader(");
      out.print(cs.getId());
      out.write(")'>View</a></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
 
                                     }
                                    
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                                \n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
