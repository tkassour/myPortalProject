package org.apache.jsp.WEB_002dINF.aps.jsp.widgets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class program_005fscore_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_resourceURL_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_wp_resourceURL_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_wp_resourceURL_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("\t\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_0(_jspx_page_context))
        return;
      out.write("static/css/test.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_1(_jspx_page_context))
        return;
      out.write("static/css/dashboard.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"leftwrap\">\n");
      out.write("    \t\t\t<div id=\"tit_left\"  ></div>\n");
      out.write("                <div id=\"tripsSummary\">\n");
      out.write("        \t\t\t<div id=\"score\">\n");
      out.write("    \t\t\t\t\t<div id=\"leftProg\">\n");
      out.write("            \t\t\t\t<div class=\"itemLeft\" style=\"padding-left: 10px\">\n");
      out.write("                                <div class=\"item_text\">\n");
      out.write("                                \t<!-- <div class=\"item_tit\">Updated</div> -->\n");
      out.write("                                \t<!-- <div class=\"item_value\"></div> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"item_tit\" style=\" left: 10px; \"> Updated </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"item_value\" style=\"font-size: 20px; left: 10px\"> 06/25/15 </span>\n");
      out.write("                                </div>\n");
      out.write("                                <img id=\"\" style=\"left: 25px;\" src=\"");
      if (_jspx_meth_wp_resourceURL_2(_jspx_page_context))
        return;
      out.write("static/img/disc_icon.png\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"itemLeft\">\n");
      out.write("                                <div class=\"item_text\">\n");
      out.write("                                \t<div class=\"item_tit\">Events</div>\n");
      out.write("                                \t<div class=\"item_value\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <img id=\"score_events\" src=\"");
      if (_jspx_meth_wp_resourceURL_3(_jspx_page_context))
        return;
      out.write("static/img/events_cia.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"itemLeft\">\n");
      out.write("                                <div class=\"item_text\">\n");
      out.write("                                \t<div class=\"item_tit\">Trips</div>\n");
      out.write("                                \t<div class=\"item_value\">60</div>\n");
      out.write("                                </div>\n");
      out.write("                                <img id=\"score_trip\" src=\"");
      if (_jspx_meth_wp_resourceURL_4(_jspx_page_context))
        return;
      out.write("static/img/trip_cia.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("            \t\t\t<div id=\"progress\" >\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t<div id=\"rightProg\">\n");
      out.write("                            <div class=\"itemRight\">\n");
      out.write("                                <div class=\"item_text\">\n");
      out.write("                                \t<div class=\"item_tit\">Miles</div>\n");
      out.write("                                \t<div class=\"item_value\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <img id=\"score_miles\" src=\"");
      if (_jspx_meth_wp_resourceURL_5(_jspx_page_context))
        return;
      out.write("static/img/miles_cia.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"itemRight\">\n");
      out.write("                                <div class=\"item_text\">\n");
      out.write("                                \t<div class=\"item_tit\">Days</div>\n");
      out.write("                                \t<div class=\"item_value\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <img id=\"score_days\" src=\"");
      if (_jspx_meth_wp_resourceURL_6(_jspx_page_context))
        return;
      out.write("static/img/days_icon.png\"/>\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"itemRight\">\n");
      out.write("                                <div class=\"item_text\">\n");
      out.write("                                \t<div class=\"item_tit\">Hours</div>\n");
      out.write("                                \t<div class=\"item_value\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <img id=\"score_hours\" src=\"");
      if (_jspx_meth_wp_resourceURL_7(_jspx_page_context))
        return;
      out.write("static/img/hours_cia.png\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("        \t\t\t</div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>");
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

  private boolean _jspx_meth_wp_resourceURL_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_0 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_0.setParent(null);
    int _jspx_eval_wp_resourceURL_0 = _jspx_th_wp_resourceURL_0.doStartTag();
    if (_jspx_th_wp_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_0);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_0);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_1 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_1.setParent(null);
    int _jspx_eval_wp_resourceURL_1 = _jspx_th_wp_resourceURL_1.doStartTag();
    if (_jspx_th_wp_resourceURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_1);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_1);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_2 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_2.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_2.setParent(null);
    int _jspx_eval_wp_resourceURL_2 = _jspx_th_wp_resourceURL_2.doStartTag();
    if (_jspx_th_wp_resourceURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_2);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_2);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_3 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_3.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_3.setParent(null);
    int _jspx_eval_wp_resourceURL_3 = _jspx_th_wp_resourceURL_3.doStartTag();
    if (_jspx_th_wp_resourceURL_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_3);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_3);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_4 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_4.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_4.setParent(null);
    int _jspx_eval_wp_resourceURL_4 = _jspx_th_wp_resourceURL_4.doStartTag();
    if (_jspx_th_wp_resourceURL_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_4);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_4);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_5 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_5.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_5.setParent(null);
    int _jspx_eval_wp_resourceURL_5 = _jspx_th_wp_resourceURL_5.doStartTag();
    if (_jspx_th_wp_resourceURL_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_5);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_5);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_6 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_6.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_6.setParent(null);
    int _jspx_eval_wp_resourceURL_6 = _jspx_th_wp_resourceURL_6.doStartTag();
    if (_jspx_th_wp_resourceURL_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_6);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_6);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_7 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_7.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_7.setParent(null);
    int _jspx_eval_wp_resourceURL_7 = _jspx_th_wp_resourceURL_7.doStartTag();
    if (_jspx_th_wp_resourceURL_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_7);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_7);
    return false;
  }
}
