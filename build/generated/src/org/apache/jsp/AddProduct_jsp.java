package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DistributorHome.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Product</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: beige\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<CENTER><H1>Distributor--");
      out.print(session.getAttribute("us"));
      out.write("</H1></center>\n");
      out.write("<html>\n");
      out.write("<head>\n");
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
      out.write("   padding: 10px 10px  ;\n");
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
      out.write("        background-image: url(retailer.webp);\n");
      out.write("        background-size: 1000px 100%;\n");
      out.write("    } \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    <div style=\"width:1345px;\" class=\"nav\">\n");
      out.write("  \n");
      out.write("<a href=\"index.jsp\">Home</a>\n");
      out.write("\n");
      out.write("<a href=\"AddProduct.jsp\">Add Product</a>\n");
      out.write("\n");
      out.write("<a href=\"DeleteProduct.jsp\">Delete Product</a>\n");
      out.write("\n");
      out.write("<a href=\"SalesAgentApprove.jsp\">Sales Agent</a>\n");
      out.write("\n");
      out.write("<a href=\"Retailer.jsp\">Retailer</a>\n");
      out.write("<a href=\"DOrderDetail.jsp\">Order Detail</a>\n");
      out.write("<a href=\"OrderReport.jsp\">Order Report</a>\n");
      out.write("    <a href=\"ViewFeedback.jsp\">View Feedback</a>\n");
      out.write("\n");
      out.write("<a href=\"CompanyAccoun.jsp\">Company Account</a>\n");
      out.write("\n");
      out.write("<a href=\"index.jsp\">Sign Out</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

    String msg=request.getParameter("msg");
    if(msg!=null)
        {

        out.println(msg);
        }
    
      out.write("\n");
      out.write("    <div style=\"width:1345px;height:550px;\" class=\"main\">\n");
      out.write("</div>\n");
      out.write("<div style=\"width: 1345px;\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:950px;border-color:gray;border-style:solid;border-width:1px;\">\n");
      out.write("    <form name=\"\" action=\"AddProductConf.jsp\">\n");
      out.write("<table width=\"950px\">\n");
      out.write("<tr>\n");
      out.write("<td width=\"175px\">&nbsp;</td>\n");
      out.write("<td width=\"600px\">&nbsp;</td>\n");
      out.write("<td width=\"175px\">&nbsp;</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"175px\">&nbsp;</td>\n");
      out.write("<td width=\"600px\">\n");
      out.write("<fieldset>\n");
      out.write("<legend style=\"color:#E55D05;font-size:20pt;\">Add Product</legend>\n");
      out.write("<table width=\"600px\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"200px\" style=\"text-align:left;\">&nbsp;Product Name</td>\n");
      out.write("<td width=\"100px\" style=\"text-align:center;\">&nbsp;:</td>\n");
      out.write("<td width=\"300px\" style=\"text-align:left;\">&nbsp;<input type=\"text\" name=\"t1\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"200px\" style=\"text-align:left;\">&nbsp;Product Category</td>\n");
      out.write("<td width=\"100px\" style=\"text-align:center;\">&nbsp;:</td>\n");
      out.write("<td width=\"300px\" style=\"text-align:left;\">&nbsp;<input type=\"text\" name=\"t2\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"200px\" style=\"text-align:left;\">&nbsp;Product Price</td>\n");
      out.write("<td width=\"100px\" style=\"text-align:center;\">&nbsp;:</td>\n");
      out.write("<td width=\"300px\" style=\"text-align:left;\">&nbsp;<input type=\"text\" name=\"t3\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"200px\" style=\"text-align:left;\">&nbsp;Product Color</td>\n");
      out.write("<td width=\"100px\" style=\"text-align:center;\">&nbsp;:</td>\n");
      out.write("<td width=\"300px\" style=\"text-align:left;\">&nbsp;<input type=\"text\" name=\"t4\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"200px\" style=\"text-align:left;\">&nbsp;</td>\n");
      out.write("<td width=\"100px\" style=\"text-align:center;\">&nbsp;</td>\n");
      out.write("<td width=\"300px\" style=\"text-align:left;\">&nbsp;\n");
      out.write("\t<table width=\"300px\">\n");
      out.write("\t<tr>\n");
      out.write("\t<td style=\"text-align:left;width:100;\">&nbsp;<input type=\"Submit\"  style=\"color:White;background-color:#E55D05;border-color:#E55D05;border-style:None;\"  value=\"SUBMIT\" ></td>\n");
      out.write("\t<td style=\"text-align:left;width:10;\">&nbsp;</td>\n");
      out.write("\t<td style=\"text-align:left;width:190;\">&nbsp;<input type=\"RESET\" style=\"color:White;background-color:#E55D05;border-color:#E55D05;border-style:None;\"  value=\"RESET\" ></td>\n");
      out.write("\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</fieldset>\n");
      out.write("</td>\n");
      out.write("<td width=\"175px\">&nbsp;</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"175px\">&nbsp;</td>\n");
      out.write("<td width=\"600px\">&nbsp;</td>\n");
      out.write("<td width=\"175px\">&nbsp;</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");

String ss=request.getParameter("msg");
if(ss!=null)
    {
    out.println(ss);

    }




      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("<div style=\"width: 950px;\">\n");
      out.write("                <table style=\"width: 950px;background-image: url('images/footer_bg.png'); background-repeat: repeat-x; background-attachment: scroll;\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("                        <td style=\"width: 500px; text-align:center;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"width: 500px; text-align:center;\">\n");
      out.write("\n");
      out.write("                            &nbsp;\n");
      out.write("\n");
      out.write("                            <span id=\"Label7\" style=\"color:White;\">Copyright &copy; Reserved to Distributed Logistic Network</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("                        <td style=\"width: 500px; text-align:center;\">\n");
      out.write("                            <span id=\"Label8\" style=\"color:White;\">Developed By : Analyze Infotech</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("                        <td style=\"width: 500px; text-align:center;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("                        <td style=\"width: 225px;\">\n");
      out.write("                            &nbsp;</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
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
