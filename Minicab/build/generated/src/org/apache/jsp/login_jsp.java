package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Jdbc;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ;
            String str="login"; 
            String url = "loginP.do";
        
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Login Main Page</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            header {\n");
      out.write("                background-color: #666;\n");
      out.write("                padding: 5px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 35px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .centre {\n");
      out.write("                margin: auto;\n");
      out.write("                width: 25%;\n");
      out.write("                    padding:10px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <h2>Login Page:</h2>\n");
      out.write("        </header>\n");
      out.write("      ");
      out.write("\n");
      out.write("        <div class=\"centre\">\n");
      out.write("            \n");
      out.write("        <form method=\"POST\" action=\"loginP.do\">  \n");
      out.write("            <h3> Please provide your following details </3>\n");
      out.write("                <br>\n");
      out.write("                </br>\n");
      out.write("                \n");
      out.write("            <table>\n");
      out.write("              <!--  <tr>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th>Please provide your following details</th>\n");
      out.write("                </tr>!-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"username\" placeholder=\"username\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" placeholder=\"password\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> \n");
      out.write("                    <td> <input type=\"submit\" value=\"login\"/></form> <form method=\"POST\" action=\"register.jsp\"><input type=\"submit\" value=\"Register\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("       \n");
      out.write("        </form>  \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("              \n");
      out.write("        ");

            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        
      out.write("\n");
      out.write("       \n");
      out.write("        </br>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
