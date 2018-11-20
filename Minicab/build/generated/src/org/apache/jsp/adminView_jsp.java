package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("             \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class =\"navbar navbar-inverse bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/login.jsp\">Log in</a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/register.jsp\">Register</a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/driver.jsp\">Driver</a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Minicab/customer.jsp\">Customer</a>\n");
      out.write("        </nav>\n");
      out.write("         <div class=\"centre\">\n");
      out.write("        <header>\n");
      out.write("        <h2>Admin View</h2>\n");
      out.write("        </header>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("        <h1>   ");

            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        
      out.write(" </h1>\n");
      out.write("        <form method=\"POST\" action=\"UserService.do\">\n");
      out.write("        <p />\n");
      out.write("            View a table <br />\n");
      out.write("            <input type=\"radio\" name=\"tbl\" value=\"List\">List Users<br />\n");
      out.write("            <input type=\"radio\" name=\"tbl\" value=\"NewUser\">New User<br />\n");
      out.write("            <input type=\"radio\" name=\"tbl\" value=\"Update\">Password Change<br />\n");
      out.write("            <input type=\"radio\" name=\"tbl\" value=\"Delete\">Delete a User<br />\n");
      out.write("            <input type=submit value=\"Action\"></form><form method=\"POST\" action=\"Logout.do\"><input type=\"submit\" value=\"Logout\"/> </form>   <br /> \n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
