package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SalesAgent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<CENTER><h1>Sales Agent ");
      out.print(session.getAttribute("us"));
      out.write("</H1></CENTER>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\" media=\"screen\">\n");
      out.write("     body{\n");
      out.write("        background-color: gainsboro;\n");
      out.write("    }\n");
      out.write("    .nav{\n");
      out.write("   \n");
      out.write("background-color: gainsboro;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".nav a \n");
      out.write("{\n");
      out.write("     border: 2px lightblue solid;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        background-color: white;\n");
      out.write("   margin-top: 10px;\n");
      out.write("   padding: 10px 60px  ;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".nav a{\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write(".nav a:hover{\n");
      out.write("    content: \"\";\n");
      out.write("        background: linear-gradient(45deg,lightblue,white,lightblue);  \n");
      out.write("  \n");
      out.write("}\n");
      out.write(".main\n");
      out.write("    {\n");
      out.write("        background-image: url(sales.jpg);\n");
      out.write("        background-size: 1000px 100%;\n");
      out.write("    } \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div style=\"width: 1345px;\" class=\"nav\">\n");
      out.write("\t<div class=\"pd_menu_01 \">\n");
      out.write("<a href=\"index.jsp\">Home</a>\n");
      out.write("<a href=\"SViewProduct.jsp\">View Product</a>\n");
      out.write("<a href=\"SPendingOrder.jsp\">Pending Order</a>\n");
      out.write("<a href=\"SCompleteOrder.jsp\">Complete Order</a>\n");
      out.write("<a href=\"SCompanyProfile\">Company Profile </a>\n");
      out.write("<a href=\"index.jsp\">Sign Out</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    <div class=\"main\" style=\"width: 1345px;height:700px;border-color:gray;border-style:solid;border-width:1px;\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div style=\"width: 1345px;\" >\n");
      out.write("            <table style=\"width: 1345px;background-image: url('images/footer_bg.png'); background-repeat: repeat-x; background-attachment: scroll;\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("               \n");
      out.write("\n");
      out.write("                <nav class=\"nav\">\n");
      out.write("                    <marquee>\n");
      out.write("                        <span id=\"Label7\" style=\"color:black;\">Copyright &copy; Reserved to Distributer Logistic Network</span>\n");
      out.write("                  \n");
      out.write("\n");
      out.write("                   \n");
      out.write("                        <span id=\"Label8\" style=\"color:black;\">Developed By : Analyze Infotech</span>\n");
      out.write("                    </marquee>\n");
      out.write("                </nav>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
