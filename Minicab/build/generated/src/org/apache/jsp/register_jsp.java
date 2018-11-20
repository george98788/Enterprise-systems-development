package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class =\"navbar navbar-inverse bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/login.jsp\">Log in</a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/register.jsp\">Register</a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/driver.jsp\">Driver</a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/customer.jsp\">Customer</a>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"row justify-content-md-center\">\n");
      out.write("    <form method=\"POST\" action=\"CustomerRegistration.do\">    \n");
      out.write("        <h2> Please provide your following details</h2>\n");
      out.write("            <table>       \n");
      out.write("                <tr>\n");
      out.write("                    <td>Full name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"fullname\" placeholder=\"Full Name\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>House/Flat Number:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"houseNo\" placeholder=\"House/Flat Number\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Street/Road Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"roadName\" placeholder=\"Street/Road\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>City/Town name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cityName\" placeholder=\"City/Town\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Postal Code:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"postcode\" placeholder=\"Postal Code\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"usernameReg\" placeholder=\"Username\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"passwordReg\" placeholder=\"Password\"required/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                <div class =\"input-group mb-3\">\n");
      out.write("                    <input type=\"submit\" value=\"Register\" class=\"btn btn-primary\"/>\n");
      out.write("                </div>\n");
      out.write("                 </form>   \n");
      out.write("        </div>\n");
      out.write("        ");

            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
              
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("        </form>   \n");
      out.write("    </form>  \n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
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
