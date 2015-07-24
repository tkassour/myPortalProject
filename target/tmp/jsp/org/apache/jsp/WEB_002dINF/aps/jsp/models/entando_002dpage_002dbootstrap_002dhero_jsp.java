package org.apache.jsp.WEB_002dINF.aps.jsp.models;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class entando_002dpage_002dbootstrap_002dhero_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_currentPage_param_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_i18n_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_info_paramName_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_resourceURL_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_imgURL_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_show_frame_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_i18n_key_escapeXml_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_wp_currentPage_param_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_i18n_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_info_paramName_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_resourceURL_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_imgURL_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_show_frame_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_i18n_key_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_wp_currentPage_param_nobody.release();
    _jspx_tagPool_wp_i18n_key_nobody.release();
    _jspx_tagPool_wp_info_paramName_key_nobody.release();
    _jspx_tagPool_wp_resourceURL_nobody.release();
    _jspx_tagPool_wp_imgURL_nobody.release();
    _jspx_tagPool_wp_show_frame_nobody.release();
    _jspx_tagPool_wp_i18n_key_escapeXml_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<title>\n");
      out.write("\t\t");
      if (_jspx_meth_wp_currentPage_0(_jspx_page_context))
        return;
      out.write(" - ");
      if (_jspx_meth_wp_i18n_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t<meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("\t\t<link rel=\"icon\" href=\"");
      if (_jspx_meth_wp_info_0(_jspx_page_context))
        return;
      out.write("favicon.png\" type=\"image/png\" />\n");
      out.write("\n");
      out.write("\t\t<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_0(_jspx_page_context))
        return;
      out.write("static/js/entando-misc-html5-essentials/html5shiv.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/lesscss-active/lesscss.jsp", out, false);
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/models-common-utils.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"navbar-inner\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"#\"><img src=\"");
      if (_jspx_meth_wp_imgURL_0(_jspx_page_context))
        return;
      out.write("entando-logo.png\" alt=\"Entando - Access. Build. Connect.\" /></a>\n");
      out.write("\t\t\t\t<div class=\"nav-collapse collapse\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_wp_show_0(_jspx_page_context))
        return;
      if (_jspx_meth_wp_show_1(_jspx_page_context))
        return;
      if (_jspx_meth_wp_show_2(_jspx_page_context))
        return;
      if (_jspx_meth_wp_show_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div><!-- /.nav-collapse -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- /navbar-inner -->\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Main hero unit for a primary marketing message or call to action -->\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_wp_show_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Example row of columns -->\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_17(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_18(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_19(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_21(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_22(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_wp_show_23(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<footer class=\"padding-medium-top\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row margin-medium-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_wp_show_24(_jspx_page_context))
        return;
      if (_jspx_meth_wp_show_25(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row margin-medium-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_wp_show_26(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_wp_show_27(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_wp_show_28(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<p class=\"span12 text-center margin-medium-top\">");
      if (_jspx_meth_wp_i18n_1(_jspx_page_context))
        return;
      out.write(" - Powered by <a href=\"http://www.entando.com/\">Entando - Access. Build. Connect.</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_wp_currentPage_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:currentPage
    com.agiletec.aps.tags.CurrentPageTag _jspx_th_wp_currentPage_0 = (com.agiletec.aps.tags.CurrentPageTag) _jspx_tagPool_wp_currentPage_param_nobody.get(com.agiletec.aps.tags.CurrentPageTag.class);
    _jspx_th_wp_currentPage_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_currentPage_0.setParent(null);
    _jspx_th_wp_currentPage_0.setParam("title");
    int _jspx_eval_wp_currentPage_0 = _jspx_th_wp_currentPage_0.doStartTag();
    if (_jspx_th_wp_currentPage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_currentPage_param_nobody.reuse(_jspx_th_wp_currentPage_0);
      return true;
    }
    _jspx_tagPool_wp_currentPage_param_nobody.reuse(_jspx_th_wp_currentPage_0);
    return false;
  }

  private boolean _jspx_meth_wp_i18n_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:i18n
    com.agiletec.aps.tags.I18nTag _jspx_th_wp_i18n_0 = (com.agiletec.aps.tags.I18nTag) _jspx_tagPool_wp_i18n_key_nobody.get(com.agiletec.aps.tags.I18nTag.class);
    _jspx_th_wp_i18n_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_i18n_0.setParent(null);
    _jspx_th_wp_i18n_0.setKey("PORTAL_TITLE");
    int _jspx_eval_wp_i18n_0 = _jspx_th_wp_i18n_0.doStartTag();
    if (_jspx_th_wp_i18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_i18n_key_nobody.reuse(_jspx_th_wp_i18n_0);
      return true;
    }
    _jspx_tagPool_wp_i18n_key_nobody.reuse(_jspx_th_wp_i18n_0);
    return false;
  }

  private boolean _jspx_meth_wp_info_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_0 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_0.setParent(null);
    _jspx_th_wp_info_0.setKey("systemParam");
    _jspx_th_wp_info_0.setParamName("applicationBaseURL");
    int _jspx_eval_wp_info_0 = _jspx_th_wp_info_0.doStartTag();
    if (_jspx_th_wp_info_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_paramName_key_nobody.reuse(_jspx_th_wp_info_0);
      return true;
    }
    _jspx_tagPool_wp_info_paramName_key_nobody.reuse(_jspx_th_wp_info_0);
    return false;
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

  private boolean _jspx_meth_wp_imgURL_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:imgURL
    com.agiletec.aps.tags.ImgURLTag _jspx_th_wp_imgURL_0 = (com.agiletec.aps.tags.ImgURLTag) _jspx_tagPool_wp_imgURL_nobody.get(com.agiletec.aps.tags.ImgURLTag.class);
    _jspx_th_wp_imgURL_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_imgURL_0.setParent(null);
    int _jspx_eval_wp_imgURL_0 = _jspx_th_wp_imgURL_0.doStartTag();
    if (_jspx_th_wp_imgURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_imgURL_nobody.reuse(_jspx_th_wp_imgURL_0);
      return true;
    }
    _jspx_tagPool_wp_imgURL_nobody.reuse(_jspx_th_wp_imgURL_0);
    return false;
  }

  private boolean _jspx_meth_wp_show_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_0 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_0.setParent(null);
    _jspx_th_wp_show_0.setFrame(0);
    int _jspx_eval_wp_show_0 = _jspx_th_wp_show_0.doStartTag();
    if (_jspx_th_wp_show_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_0);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_0);
    return false;
  }

  private boolean _jspx_meth_wp_show_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_1 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_1.setParent(null);
    _jspx_th_wp_show_1.setFrame(1);
    int _jspx_eval_wp_show_1 = _jspx_th_wp_show_1.doStartTag();
    if (_jspx_th_wp_show_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_1);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_1);
    return false;
  }

  private boolean _jspx_meth_wp_show_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_2 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_2.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_2.setParent(null);
    _jspx_th_wp_show_2.setFrame(2);
    int _jspx_eval_wp_show_2 = _jspx_th_wp_show_2.doStartTag();
    if (_jspx_th_wp_show_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_2);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_2);
    return false;
  }

  private boolean _jspx_meth_wp_show_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_3 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_3.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_3.setParent(null);
    _jspx_th_wp_show_3.setFrame(3);
    int _jspx_eval_wp_show_3 = _jspx_th_wp_show_3.doStartTag();
    if (_jspx_th_wp_show_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_3);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_3);
    return false;
  }

  private boolean _jspx_meth_wp_show_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_4 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_4.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_4.setParent(null);
    _jspx_th_wp_show_4.setFrame(4);
    int _jspx_eval_wp_show_4 = _jspx_th_wp_show_4.doStartTag();
    if (_jspx_th_wp_show_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_4);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_4);
    return false;
  }

  private boolean _jspx_meth_wp_show_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_5 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_5.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_5.setParent(null);
    _jspx_th_wp_show_5.setFrame(5);
    int _jspx_eval_wp_show_5 = _jspx_th_wp_show_5.doStartTag();
    if (_jspx_th_wp_show_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_5);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_5);
    return false;
  }

  private boolean _jspx_meth_wp_show_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_6 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_6.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_6.setParent(null);
    _jspx_th_wp_show_6.setFrame(6);
    int _jspx_eval_wp_show_6 = _jspx_th_wp_show_6.doStartTag();
    if (_jspx_th_wp_show_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_6);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_6);
    return false;
  }

  private boolean _jspx_meth_wp_show_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_7 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_7.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_7.setParent(null);
    _jspx_th_wp_show_7.setFrame(7);
    int _jspx_eval_wp_show_7 = _jspx_th_wp_show_7.doStartTag();
    if (_jspx_th_wp_show_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_7);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_7);
    return false;
  }

  private boolean _jspx_meth_wp_show_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_8 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_8.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_8.setParent(null);
    _jspx_th_wp_show_8.setFrame(8);
    int _jspx_eval_wp_show_8 = _jspx_th_wp_show_8.doStartTag();
    if (_jspx_th_wp_show_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_8);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_8);
    return false;
  }

  private boolean _jspx_meth_wp_show_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_9 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_9.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_9.setParent(null);
    _jspx_th_wp_show_9.setFrame(9);
    int _jspx_eval_wp_show_9 = _jspx_th_wp_show_9.doStartTag();
    if (_jspx_th_wp_show_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_9);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_9);
    return false;
  }

  private boolean _jspx_meth_wp_show_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_10 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_10.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_10.setParent(null);
    _jspx_th_wp_show_10.setFrame(10);
    int _jspx_eval_wp_show_10 = _jspx_th_wp_show_10.doStartTag();
    if (_jspx_th_wp_show_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_10);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_10);
    return false;
  }

  private boolean _jspx_meth_wp_show_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_11 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_11.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_11.setParent(null);
    _jspx_th_wp_show_11.setFrame(11);
    int _jspx_eval_wp_show_11 = _jspx_th_wp_show_11.doStartTag();
    if (_jspx_th_wp_show_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_11);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_11);
    return false;
  }

  private boolean _jspx_meth_wp_show_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_12 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_12.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_12.setParent(null);
    _jspx_th_wp_show_12.setFrame(12);
    int _jspx_eval_wp_show_12 = _jspx_th_wp_show_12.doStartTag();
    if (_jspx_th_wp_show_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_12);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_12);
    return false;
  }

  private boolean _jspx_meth_wp_show_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_13 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_13.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_13.setParent(null);
    _jspx_th_wp_show_13.setFrame(13);
    int _jspx_eval_wp_show_13 = _jspx_th_wp_show_13.doStartTag();
    if (_jspx_th_wp_show_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_13);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_13);
    return false;
  }

  private boolean _jspx_meth_wp_show_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_14 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_14.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_14.setParent(null);
    _jspx_th_wp_show_14.setFrame(14);
    int _jspx_eval_wp_show_14 = _jspx_th_wp_show_14.doStartTag();
    if (_jspx_th_wp_show_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_14);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_14);
    return false;
  }

  private boolean _jspx_meth_wp_show_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_15 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_15.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_15.setParent(null);
    _jspx_th_wp_show_15.setFrame(15);
    int _jspx_eval_wp_show_15 = _jspx_th_wp_show_15.doStartTag();
    if (_jspx_th_wp_show_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_15);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_15);
    return false;
  }

  private boolean _jspx_meth_wp_show_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_16 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_16.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_16.setParent(null);
    _jspx_th_wp_show_16.setFrame(16);
    int _jspx_eval_wp_show_16 = _jspx_th_wp_show_16.doStartTag();
    if (_jspx_th_wp_show_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_16);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_16);
    return false;
  }

  private boolean _jspx_meth_wp_show_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_17 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_17.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_17.setParent(null);
    _jspx_th_wp_show_17.setFrame(17);
    int _jspx_eval_wp_show_17 = _jspx_th_wp_show_17.doStartTag();
    if (_jspx_th_wp_show_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_17);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_17);
    return false;
  }

  private boolean _jspx_meth_wp_show_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_18 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_18.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_18.setParent(null);
    _jspx_th_wp_show_18.setFrame(18);
    int _jspx_eval_wp_show_18 = _jspx_th_wp_show_18.doStartTag();
    if (_jspx_th_wp_show_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_18);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_18);
    return false;
  }

  private boolean _jspx_meth_wp_show_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_19 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_19.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_19.setParent(null);
    _jspx_th_wp_show_19.setFrame(19);
    int _jspx_eval_wp_show_19 = _jspx_th_wp_show_19.doStartTag();
    if (_jspx_th_wp_show_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_19);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_19);
    return false;
  }

  private boolean _jspx_meth_wp_show_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_20 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_20.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_20.setParent(null);
    _jspx_th_wp_show_20.setFrame(20);
    int _jspx_eval_wp_show_20 = _jspx_th_wp_show_20.doStartTag();
    if (_jspx_th_wp_show_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_20);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_20);
    return false;
  }

  private boolean _jspx_meth_wp_show_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_21 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_21.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_21.setParent(null);
    _jspx_th_wp_show_21.setFrame(21);
    int _jspx_eval_wp_show_21 = _jspx_th_wp_show_21.doStartTag();
    if (_jspx_th_wp_show_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_21);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_21);
    return false;
  }

  private boolean _jspx_meth_wp_show_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_22 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_22.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_22.setParent(null);
    _jspx_th_wp_show_22.setFrame(22);
    int _jspx_eval_wp_show_22 = _jspx_th_wp_show_22.doStartTag();
    if (_jspx_th_wp_show_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_22);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_22);
    return false;
  }

  private boolean _jspx_meth_wp_show_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_23 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_23.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_23.setParent(null);
    _jspx_th_wp_show_23.setFrame(23);
    int _jspx_eval_wp_show_23 = _jspx_th_wp_show_23.doStartTag();
    if (_jspx_th_wp_show_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_23);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_23);
    return false;
  }

  private boolean _jspx_meth_wp_show_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_24 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_24.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_24.setParent(null);
    _jspx_th_wp_show_24.setFrame(24);
    int _jspx_eval_wp_show_24 = _jspx_th_wp_show_24.doStartTag();
    if (_jspx_th_wp_show_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_24);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_24);
    return false;
  }

  private boolean _jspx_meth_wp_show_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_25 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_25.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_25.setParent(null);
    _jspx_th_wp_show_25.setFrame(25);
    int _jspx_eval_wp_show_25 = _jspx_th_wp_show_25.doStartTag();
    if (_jspx_th_wp_show_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_25);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_25);
    return false;
  }

  private boolean _jspx_meth_wp_show_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_26 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_26.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_26.setParent(null);
    _jspx_th_wp_show_26.setFrame(26);
    int _jspx_eval_wp_show_26 = _jspx_th_wp_show_26.doStartTag();
    if (_jspx_th_wp_show_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_26);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_26);
    return false;
  }

  private boolean _jspx_meth_wp_show_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_27 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_27.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_27.setParent(null);
    _jspx_th_wp_show_27.setFrame(27);
    int _jspx_eval_wp_show_27 = _jspx_th_wp_show_27.doStartTag();
    if (_jspx_th_wp_show_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_27);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_27);
    return false;
  }

  private boolean _jspx_meth_wp_show_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:show
    com.agiletec.aps.tags.WidgetTag _jspx_th_wp_show_28 = (com.agiletec.aps.tags.WidgetTag) _jspx_tagPool_wp_show_frame_nobody.get(com.agiletec.aps.tags.WidgetTag.class);
    _jspx_th_wp_show_28.setPageContext(_jspx_page_context);
    _jspx_th_wp_show_28.setParent(null);
    _jspx_th_wp_show_28.setFrame(28);
    int _jspx_eval_wp_show_28 = _jspx_th_wp_show_28.doStartTag();
    if (_jspx_th_wp_show_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_28);
      return true;
    }
    _jspx_tagPool_wp_show_frame_nobody.reuse(_jspx_th_wp_show_28);
    return false;
  }

  private boolean _jspx_meth_wp_i18n_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:i18n
    com.agiletec.aps.tags.I18nTag _jspx_th_wp_i18n_1 = (com.agiletec.aps.tags.I18nTag) _jspx_tagPool_wp_i18n_key_escapeXml_nobody.get(com.agiletec.aps.tags.I18nTag.class);
    _jspx_th_wp_i18n_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_i18n_1.setParent(null);
    _jspx_th_wp_i18n_1.setKey("COPYRIGHT");
    _jspx_th_wp_i18n_1.setEscapeXml(false);
    int _jspx_eval_wp_i18n_1 = _jspx_th_wp_i18n_1.doStartTag();
    if (_jspx_th_wp_i18n_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_i18n_key_escapeXml_nobody.reuse(_jspx_th_wp_i18n_1);
      return true;
    }
    _jspx_tagPool_wp_i18n_key_escapeXml_nobody.reuse(_jspx_th_wp_i18n_1);
    return false;
  }
}
