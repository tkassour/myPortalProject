package org.apache.jsp.WEB_002dINF.apsadmin.jsp.common.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_getAsString_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_escape_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_resourceURL_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_catch;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insertAttribute_name_ignore_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_info_var_paramName_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_info_paramName_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insertAttribute_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_include_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_getAsString_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_escape_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_resourceURL_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_catch = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insertAttribute_name_ignore_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_info_var_paramName_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_info_paramName_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insertAttribute_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_set_var.release();
    _jspx_tagPool_tiles_getAsString_name_nobody.release();
    _jspx_tagPool_s_property_value_escape_nobody.release();
    _jspx_tagPool_wp_resourceURL_nobody.release();
    _jspx_tagPool_c_catch.release();
    _jspx_tagPool_tiles_insertAttribute_name_ignore_nobody.release();
    _jspx_tagPool_wp_info_var_paramName_key_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_wp_info_paramName_key_nobody.release();
    _jspx_tagPool_tiles_insertAttribute_name_nobody.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_s_url_namespace_action.release();
    _jspx_tagPool_s_param_name.release();
    _jspx_tagPool_s_url_namespace_action_nobody.release();
    _jspx_tagPool_s_url_value_nobody.release();
    _jspx_tagPool_s_include_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<title>Entando - ");
      if (_jspx_meth_s_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_property_1(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_0(_jspx_page_context))
        return;
      out.write("administration/bootstrap/css/bootstrap.min.css\" media=\"screen\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_1(_jspx_page_context))
        return;
      out.write("administration/css/bootstrap-theme-entando-ce/css/bootstrap.min.css\" media=\"screen\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_2(_jspx_page_context))
        return;
      out.write("administration/css/bootstrap-override.css\" media=\"screen\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_3(_jspx_page_context))
        return;
      out.write("administration/css/bootstrap-offcanvas.css\" media=\"screen\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_wp_resourceURL_4(_jspx_page_context))
        return;
      out.write("administration/css/bootstrap-addendum.css\" media=\"screen\" />\n");
      out.write("\t");
      if (_jspx_meth_c_catch_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_5(_jspx_page_context))
        return;
      out.write("administration/js/html5shiv.js\"></script>\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_6(_jspx_page_context))
        return;
      out.write("administration/js/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_7(_jspx_page_context))
        return;
      out.write("administration/js/jquery-1.9.1.min.js\"></script>\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_8(_jspx_page_context))
        return;
      out.write("administration/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_9(_jspx_page_context))
        return;
      out.write("administration/js/bootstrap-offcanvas.js\"></script>\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_wp_resourceURL_10(_jspx_page_context))
        return;
      out.write("administration/js/shortcuts.js\"></script>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_wp_info_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertAttribute_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" id=\"container-main\">\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\t<p class=\"sr-only\" id=\"fagiano_start\">");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("\t<div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("\t\t<div class=\"col-sm-3 sidebar-offcanvas col-sm-push-9 col-md-push-9 col-lg-push-9\" id=\"sidebar\">\n");
      out.write("\t\t\t<div class=\"panel-group margin-base-bottom\" role=\"navigation\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\" id=\"user-avatar\">\n");
      out.write("\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#submenu-user\" class=\"display-block\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\" width=\"34\" height=\"34\" alt=\" \" class=\"img-rounded\" />\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"submenu-user\" class=\"panel-collapse collapse\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"panel-body nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\" title=\"");
      if (_jspx_meth_s_text_2(_jspx_page_context))
        return;
      out.write(" ( ");
      if (_jspx_meth_s_text_3(_jspx_page_context))
        return;
      out.write(" )\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon fa fa-globe fa-fw\"></span>&#32;\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_text_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon fa fa-power-off fa-fw\"></span>&#32;\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_text_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_include_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<nav role=\"navigation\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_tiles_insertAttribute_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<p class=\"sr-only\">\n");
      out.write("\t\t\t\t\t<a href=\"#fagiano_start\" id=\"fagiano_mainContent\">");
      if (_jspx_meth_s_text_6(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-9 col-sm-pull-3 col-md-pull-3 col-lg-pull-3\" id=\"container-content\">\n");
      out.write("\t\t\t<div class=\"navbar navbar-default navbar-static-top\" id=\"navbar\" role=\"banner\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<a href=\"#sidebar\" class=\"btn-offcanvas navbar-toggle pull-right visible-xs\" data-toggle=\"offcanvas\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">");
      if (_jspx_meth_s_text_12(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"");
      if (_jspx_meth_s_url_6(_jspx_page_context))
        return;
      out.write("\"><img src=\"");
      if (_jspx_meth_wp_resourceURL_12(_jspx_page_context))
        return;
      out.write("administration/img/entando-logo-symbol-70x42.png\" alt=\"Entando - Access. Build. Connect.\" widthh=\"120\" height=\"42\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
      if (_jspx_meth_tiles_insertAttribute_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t<div class=\"col-sm-12 margin-large-top\">\n");
      out.write("\t\t\t<ul class=\"sr-only\">\n");
      out.write("\t\t\t\t<li><a href=\"#fagiano_mainContent\">");
      if (_jspx_meth_s_text_13(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#fagiano_start\">");
      if (_jspx_meth_s_text_14(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"text-center\" role=\"contentinfo\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_tiles_insertAttribute_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("currentLang.code");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent(null);
    _jspx_th_s_set_0.setVar("documentTitle");
    int _jspx_eval_s_set_0 = _jspx_th_s_set_0.doStartTag();
    if (_jspx_eval_s_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_tiles_getAsString_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_set_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var.reuse(_jspx_th_s_set_0);
      return true;
    }
    _jspx_tagPool_s_set_var.reuse(_jspx_th_s_set_0);
    return false;
  }

  private boolean _jspx_meth_tiles_getAsString_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_set_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_getAsString_0 = (org.apache.tiles.jsp.taglib.GetAsStringTag) _jspx_tagPool_tiles_getAsString_name_nobody.get(org.apache.tiles.jsp.taglib.GetAsStringTag.class);
    _jspx_th_tiles_getAsString_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_getAsString_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_set_0);
    _jspx_th_tiles_getAsString_0.setName("title");
    int _jspx_eval_tiles_getAsString_0 = _jspx_th_tiles_getAsString_0.doStartTag();
    if (_jspx_th_tiles_getAsString_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_getAsString_name_nobody.reuse(_jspx_th_tiles_getAsString_0);
      return true;
    }
    _jspx_tagPool_tiles_getAsString_name_nobody.reuse(_jspx_th_tiles_getAsString_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_escape_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent(null);
    _jspx_th_s_property_1.setValue("%{getText(#documentTitle)}");
    _jspx_th_s_property_1.setEscape(false);
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_escape_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_escape_nobody.reuse(_jspx_th_s_property_1);
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

  private boolean _jspx_meth_c_catch_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:catch
    org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_c_catch_0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _jspx_tagPool_c_catch.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
    _jspx_th_c_catch_0.setPageContext(_jspx_page_context);
    _jspx_th_c_catch_0.setParent(null);
    int[] _jspx_push_body_count_c_catch_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_catch_0 = _jspx_th_c_catch_0.doStartTag();
      if (_jspx_eval_c_catch_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tiles_insertAttribute_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
            return true;
          int evalDoAfterBody = _jspx_th_c_catch_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_catch_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_catch_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_catch_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_catch_0.doFinally();
      _jspx_tagPool_c_catch.reuse(_jspx_th_c_catch_0);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_0 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _jspx_tagPool_tiles_insertAttribute_name_ignore_nobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_insertAttribute_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_tiles_insertAttribute_0.setName("cssSpecial");
    _jspx_th_tiles_insertAttribute_0.setIgnore(true);
    int _jspx_eval_tiles_insertAttribute_0 = _jspx_th_tiles_insertAttribute_0.doStartTag();
    if (_jspx_th_tiles_insertAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insertAttribute_name_ignore_nobody.reuse(_jspx_th_tiles_insertAttribute_0);
      return true;
    }
    _jspx_tagPool_tiles_insertAttribute_name_ignore_nobody.reuse(_jspx_th_tiles_insertAttribute_0);
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

  private boolean _jspx_meth_wp_resourceURL_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_8 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_8.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_8.setParent(null);
    int _jspx_eval_wp_resourceURL_8 = _jspx_th_wp_resourceURL_8.doStartTag();
    if (_jspx_th_wp_resourceURL_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_8);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_8);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_9 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_9.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_9.setParent(null);
    int _jspx_eval_wp_resourceURL_9 = _jspx_th_wp_resourceURL_9.doStartTag();
    if (_jspx_th_wp_resourceURL_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_9);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_9);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_10 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_10.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_10.setParent(null);
    int _jspx_eval_wp_resourceURL_10 = _jspx_th_wp_resourceURL_10.doStartTag();
    if (_jspx_th_wp_resourceURL_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_10);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_10);
    return false;
  }

  private boolean _jspx_meth_wp_info_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_0 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_var_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_0.setParent(null);
    _jspx_th_wp_info_0.setKey("systemParam");
    _jspx_th_wp_info_0.setParamName("firstTimeMessages");
    _jspx_th_wp_info_0.setVar("firstTimeMessagesVar");
    int _jspx_eval_wp_info_0 = _jspx_th_wp_info_0.doStartTag();
    if (_jspx_th_wp_info_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_0);
      return true;
    }
    _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstTimeMessagesVar eq true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<script>\n");
        out.write("\t\t\tvar Entando = Entando||{};\n");
        out.write("\t\t\tEntando.info = Entando.type || {};\n");
        out.write("\t\t\tEntando.info.applicationBaseURL = \"");
        if (_jspx_meth_wp_info_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\";\n");
        out.write("\t\t</script>\n");
        out.write("\t\t<script src=\"");
        if (_jspx_meth_wp_resourceURL_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("administration/js/first-time-messages.js\"></script>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_wp_info_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_1 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_wp_info_1.setKey("systemParam");
    _jspx_th_wp_info_1.setParamName("applicationBaseURL");
    int _jspx_eval_wp_info_1 = _jspx_th_wp_info_1.doStartTag();
    if (_jspx_th_wp_info_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_paramName_key_nobody.reuse(_jspx_th_wp_info_1);
      return true;
    }
    _jspx_tagPool_wp_info_paramName_key_nobody.reuse(_jspx_th_wp_info_1);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_11 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_11.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    int _jspx_eval_wp_resourceURL_11 = _jspx_th_wp_resourceURL_11.doStartTag();
    if (_jspx_th_wp_resourceURL_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_11);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_11);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_1 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _jspx_tagPool_tiles_insertAttribute_name_nobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_insertAttribute_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_1.setParent(null);
    _jspx_th_tiles_insertAttribute_1.setName("extraResources");
    int _jspx_eval_tiles_insertAttribute_1 = _jspx_th_tiles_insertAttribute_1.doStartTag();
    if (_jspx_th_tiles_insertAttribute_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_1);
      return true;
    }
    _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_1);
    return false;
  }

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("title.mainFunctions");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("current_username");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.currentUser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${null != sessionScope.currentUser.profile}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("current_username");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.currentUser.profile.displayName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current_username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setAction("avatarStream");
    _jspx_th_s_url_0.setNamespace("/do/currentuser/avatar");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_0.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_0);
    _jspx_th_s_param_0.setName("gravatarSize");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_0.doInitBody();
      }
      do {
        out.write('3');
        out.write('4');
        int evalDoAfterBody = _jspx_th_s_param_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.currentUser.japsUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<li>\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"");
        if (_jspx_meth_s_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon fa fa-user fa-fw\"></span>&#32;\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_s_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_s_url_1.setAction("editProfile");
    _jspx_th_s_url_1.setNamespace("/do/CurrentUser");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_s_text_1.setName("note.changeYourPassword");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_s_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent(null);
    _jspx_th_s_url_2.setValue("/");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_text_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent(null);
    _jspx_th_s_text_2.setName("note.goToPortal");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_s_text_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent(null);
    _jspx_th_s_text_3.setName("note.sameWindow");
    int _jspx_eval_s_text_3 = _jspx_th_s_text_3.doStartTag();
    if (_jspx_th_s_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
    return false;
  }

  private boolean _jspx_meth_s_text_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_4 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_4.setPageContext(_jspx_page_context);
    _jspx_th_s_text_4.setParent(null);
    _jspx_th_s_text_4.setName("note.goToPortal");
    int _jspx_eval_s_text_4 = _jspx_th_s_text_4.doStartTag();
    if (_jspx_th_s_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
    return false;
  }

  private boolean _jspx_meth_s_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent(null);
    _jspx_th_s_url_3.setAction("logout");
    _jspx_th_s_url_3.setNamespace("/do");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_text_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_5 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_5.setPageContext(_jspx_page_context);
    _jspx_th_s_text_5.setParent(null);
    _jspx_th_s_text_5.setName("menu.exit");
    int _jspx_eval_s_text_5 = _jspx_th_s_text_5.doStartTag();
    if (_jspx_th_s_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
    return false;
  }

  private boolean _jspx_meth_s_include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_0 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_0.setPageContext(_jspx_page_context);
    _jspx_th_s_include_0.setParent(null);
    _jspx_th_s_include_0.setValue("/WEB-INF/apsadmin/jsp/common/inc/menu-shortcuts.jsp");
    int _jspx_eval_s_include_0 = _jspx_th_s_include_0.doStartTag();
    if (_jspx_th_s_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_2 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _jspx_tagPool_tiles_insertAttribute_name_nobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_insertAttribute_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_2.setParent(null);
    _jspx_th_tiles_insertAttribute_2.setName("menu");
    int _jspx_eval_tiles_insertAttribute_2 = _jspx_th_tiles_insertAttribute_2.doStartTag();
    if (_jspx_th_tiles_insertAttribute_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_2);
      return true;
    }
    _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_2);
    return false;
  }

  private boolean _jspx_meth_s_text_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_6 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_6.setPageContext(_jspx_page_context);
    _jspx_th_s_text_6.setParent(null);
    _jspx_th_s_text_6.setName("note.backToStart");
    int _jspx_eval_s_text_6 = _jspx_th_s_text_6.doStartTag();
    if (_jspx_th_s_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstTimeMessagesVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t<div class=\"alert alert-info margin-none margin-base-top fade in\" id=\"first-time-messages\">\n");
        out.write("\t\t\t\t\t<button class=\"close\" data-dismiss=\"alert\" data-first-time-messages=\"dismiss\"><span class=\"icon fa fa-times\"></span></button>\n");
        out.write("\t\t\t\t\t<p class=\"margin-none\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_text_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("<br />\n");
        out.write("\t\t\t\t\t\t<a class=\"alert-link\" href=\"");
        if (_jspx_meth_s_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("#additional-features\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_text_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("&#32;<span class=\"icon fa fa-arrow-right\"></span>\n");
        out.write("\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t</p>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div class=\"alert alert-warning margin-none margin-base-top fade out hide\" id=\"first-time-messages-undo\">\n");
        out.write("\t\t\t\t\t<a class=\"alert-link\" href=\"#\" data-first-time-messages=\"dismiss\" data-dismiss=\"alert\">");
        if (_jspx_meth_s_text_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</a>&#32;");
        if (_jspx_meth_s_text_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("&#32;<a class=\"alert-link\" href=\"");
        if (_jspx_meth_s_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("#additional-features\"><code>");
        if (_jspx_meth_s_text_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</code></a>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_s_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_7 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_7.setPageContext(_jspx_page_context);
    _jspx_th_s_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_text_7.setName("label.firstTimeMessages.moreFeatures");
    int _jspx_eval_s_text_7 = _jspx_th_s_text_7.doStartTag();
    if (_jspx_th_s_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
    return false;
  }

  private boolean _jspx_meth_s_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_url_4.setAction("configSystemParams");
    _jspx_th_s_url_4.setNamespace("/do/BaseAdmin");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_8 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_8.setPageContext(_jspx_page_context);
    _jspx_th_s_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_text_8.setName("label.firstTimeMessages.goActivateFeatures");
    int _jspx_eval_s_text_8 = _jspx_th_s_text_8.doStartTag();
    if (_jspx_th_s_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
    return false;
  }

  private boolean _jspx_meth_s_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_9 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_9.setPageContext(_jspx_page_context);
    _jspx_th_s_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_text_9.setName("label.firstTimeMessages.undo");
    int _jspx_eval_s_text_9 = _jspx_th_s_text_9.doStartTag();
    if (_jspx_th_s_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
    return false;
  }

  private boolean _jspx_meth_s_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_10 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_10.setPageContext(_jspx_page_context);
    _jspx_th_s_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_text_10.setName("label.firstTimeMessages.ifYouMissed");
    int _jspx_eval_s_text_10 = _jspx_th_s_text_10.doStartTag();
    if (_jspx_th_s_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
    return false;
  }

  private boolean _jspx_meth_s_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_url_5.setAction("configSystemParams");
    _jspx_th_s_url_5.setNamespace("/do/BaseAdmin");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_text_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_11 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_11.setPageContext(_jspx_page_context);
    _jspx_th_s_text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_s_text_11.setName("label.firstTimeMessages.settingsGeneral");
    int _jspx_eval_s_text_11 = _jspx_th_s_text_11.doStartTag();
    if (_jspx_th_s_text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_11);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_11);
    return false;
  }

  private boolean _jspx_meth_s_text_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_12 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_12.setPageContext(_jspx_page_context);
    _jspx_th_s_text_12.setParent(null);
    _jspx_th_s_text_12.setName("label.menu");
    int _jspx_eval_s_text_12 = _jspx_th_s_text_12.doStartTag();
    if (_jspx_th_s_text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_12);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_12);
    return false;
  }

  private boolean _jspx_meth_s_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent(null);
    _jspx_th_s_url_6.setAction("main");
    _jspx_th_s_url_6.setNamespace("/do");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_12 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_12.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_12.setParent(null);
    int _jspx_eval_wp_resourceURL_12 = _jspx_th_wp_resourceURL_12.doStartTag();
    if (_jspx_th_wp_resourceURL_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_12);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_12);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_3 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _jspx_tagPool_tiles_insertAttribute_name_nobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_insertAttribute_3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_3.setParent(null);
    _jspx_th_tiles_insertAttribute_3.setName("body");
    int _jspx_eval_tiles_insertAttribute_3 = _jspx_th_tiles_insertAttribute_3.doStartTag();
    if (_jspx_th_tiles_insertAttribute_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_3);
      return true;
    }
    _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_3);
    return false;
  }

  private boolean _jspx_meth_s_text_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_13 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_13.setPageContext(_jspx_page_context);
    _jspx_th_s_text_13.setParent(null);
    _jspx_th_s_text_13.setName("note.backToMainContent");
    int _jspx_eval_s_text_13 = _jspx_th_s_text_13.doStartTag();
    if (_jspx_th_s_text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_13);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_13);
    return false;
  }

  private boolean _jspx_meth_s_text_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_14 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_14.setPageContext(_jspx_page_context);
    _jspx_th_s_text_14.setParent(null);
    _jspx_th_s_text_14.setName("note.backToStart");
    int _jspx_eval_s_text_14 = _jspx_th_s_text_14.doStartTag();
    if (_jspx_th_s_text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_14);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_14);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_4 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _jspx_tagPool_tiles_insertAttribute_name_nobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_insertAttribute_4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_4.setParent(null);
    _jspx_th_tiles_insertAttribute_4.setName("footer");
    int _jspx_eval_tiles_insertAttribute_4 = _jspx_th_tiles_insertAttribute_4.doStartTag();
    if (_jspx_th_tiles_insertAttribute_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_4);
      return true;
    }
    _jspx_tagPool_tiles_insertAttribute_name_nobody.reuse(_jspx_th_tiles_insertAttribute_4);
    return false;
  }
}
