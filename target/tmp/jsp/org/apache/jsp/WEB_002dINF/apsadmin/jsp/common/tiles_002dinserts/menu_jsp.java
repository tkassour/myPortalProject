package org.apache.jsp.WEB_002dINF.apsadmin.jsp.common.tiles_002dinserts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_info_var_paramName_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_ifauthorized_permission;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_pluginsSubMenu_objectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_include_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_ifauthorized_var_permission_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_entityTypes_var_entityManagerName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_info_var_paramName_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_ifauthorized_permission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_pluginsSubMenu_objectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_entityTypes_var_entityManagerName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_s_url_namespace_action_nobody.release();
    _jspx_tagPool_wp_info_var_paramName_key_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_wp_ifauthorized_permission.release();
    _jspx_tagPool_wpsa_pluginsSubMenu_objectName_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_iterator_value_id.release();
    _jspx_tagPool_wpsa_include_value_nobody.release();
    _jspx_tagPool_s_else.release();
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.release();
    _jspx_tagPool_wpsa_entityTypes_var_entityManagerName_nobody.release();
    _jspx_tagPool_s_iterator_var_value.release();
    _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.release();
    _jspx_tagPool_s_url_namespace_action.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_param_name.release();
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
      out.write("\n");
      out.write("<p id=\"manage\" class=\"sr-only\">");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write(":</p>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("\t<a class=\"btn btn-info btn-block\" href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\"><span class=\"icon fa fa-cog\"></span>&#32;");
      if (_jspx_meth_s_text_1(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<ul class=\"nav nav-pills nav-stacked\" id=\"backoffice-menu-main\" role=\"menubar\">\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_wp_info_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_wp_info_1(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      if (_jspx_meth_wpsa_pluginsSubMenu_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      if (_jspx_meth_wp_ifauthorized_2(_jspx_page_context))
        return;
      if (_jspx_meth_wp_ifauthorized_3(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      if (_jspx_meth_wp_ifauthorized_6(_jspx_page_context))
        return;
      if (_jspx_meth_wp_ifauthorized_7(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("</ul>\n");
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

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("note.userbar.intro");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setNamespace("/do/BaseAdmin");
    _jspx_th_s_url_0.setAction("settings");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_text_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent(null);
    _jspx_th_s_text_1.setName("menu.configure");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
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
    _jspx_th_wp_info_0.setParamName("groupsOnDemand");
    _jspx_th_wp_info_0.setVar("groupsOnDemandVar");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${groupsOnDemandVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_ifauthorized_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_wp_ifauthorized_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_0 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_wp_ifauthorized_0.setPermission("superuser");
    int _jspx_eval_wp_ifauthorized_0 = _jspx_th_wp_ifauthorized_0.doStartTag();
    if (_jspx_eval_wp_ifauthorized_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_0, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_0, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_0);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_0);
    return false;
  }

  private boolean _jspx_meth_s_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_0);
    _jspx_th_s_url_1.setAction("list");
    _jspx_th_s_url_1.setNamespace("/do/Group");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_0);
    _jspx_th_s_text_2.setName("menu.accountAdmin.groups");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_wp_info_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_1 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_var_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_1.setParent(null);
    _jspx_th_wp_info_1.setKey("systemParam");
    _jspx_th_wp_info_1.setParamName("categoriesOnDemand");
    _jspx_th_wp_info_1.setVar("categoriesOnDemandVar");
    int _jspx_eval_wp_info_1 = _jspx_th_wp_info_1.doStartTag();
    if (_jspx_th_wp_info_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_1);
      return true;
    }
    _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_1);
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoriesOnDemandVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_ifauthorized_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
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

  private boolean _jspx_meth_wp_ifauthorized_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_1 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_wp_ifauthorized_1.setPermission("manageCategories");
    int _jspx_eval_wp_ifauthorized_1 = _jspx_th_wp_ifauthorized_1.doStartTag();
    if (_jspx_eval_wp_ifauthorized_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_1, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_1, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_1);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_1);
    return false;
  }

  private boolean _jspx_meth_s_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_1);
    _jspx_th_s_url_2.setAction("viewTree");
    _jspx_th_s_url_2.setNamespace("/do/Category");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_1);
    _jspx_th_s_text_3.setName("menu.categoryAdmin");
    int _jspx_eval_s_text_3 = _jspx_th_s_text_3.doStartTag();
    if (_jspx_th_s_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
    return false;
  }

  private boolean _jspx_meth_wpsa_pluginsSubMenu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:pluginsSubMenu
    com.agiletec.apsadmin.tags.PluginsSubMenuTag _jspx_th_wpsa_pluginsSubMenu_0 = (com.agiletec.apsadmin.tags.PluginsSubMenuTag) _jspx_tagPool_wpsa_pluginsSubMenu_objectName_nobody.get(com.agiletec.apsadmin.tags.PluginsSubMenuTag.class);
    _jspx_th_wpsa_pluginsSubMenu_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_pluginsSubMenu_0.setParent(null);
    _jspx_th_wpsa_pluginsSubMenu_0.setObjectName("pluginsSubMenus");
    int _jspx_eval_wpsa_pluginsSubMenu_0 = _jspx_th_wpsa_pluginsSubMenu_0.doStartTag();
    if (_jspx_th_wpsa_pluginsSubMenu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_pluginsSubMenu_objectName_nobody.reuse(_jspx_th_wpsa_pluginsSubMenu_0);
      return true;
    }
    _jspx_tagPool_wpsa_pluginsSubMenu_objectName_nobody.reuse(_jspx_th_wpsa_pluginsSubMenu_0);
    return false;
  }

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("#pluginsSubMenus.size > 0");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t<li class=\"panel-group\" role=\"presentation\">\n");
        out.write("\t\t\t<div class=\"panel panel-default\" role=\"presentation\">\n");
        out.write("\t\t\t\t<div class=\"panel-heading\" role=\"presentation\">\n");
        out.write("\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#submenu-plugins\" class=\"display-block\" id=\"aria-menu-plugin\"  aria-haspopup=\"true\" role=\"menuitem\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("&#32;\n");
        out.write("\t\t\t\t\t\t<span class=\"icon fa fa-chevron-down pull-right\"></span>\n");
        out.write("\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div id=\"submenu-plugins\" class=\"panel-collapse collapse\">\n");
        out.write("\t\t\t\t\t<ul class=\"panel-body nav nav-pills nav-stacked\" role=\"menubar\" aria-labelledby=\"aria-menu-plugin\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_iterator_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</li>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_4 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_4.setPageContext(_jspx_page_context);
    _jspx_th_s_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_text_4.setName("menu.plugins");
    int _jspx_eval_s_text_4 = _jspx_th_s_text_4.doStartTag();
    if (_jspx_th_s_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_iterator_0.setValue("#pluginsSubMenus");
    _jspx_th_s_iterator_0.setId("pluginSubMenu");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        if (_jspx_meth_wpsa_include_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_wpsa_include_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:include
    com.agiletec.apsadmin.tags.IncludeTag _jspx_th_wpsa_include_0 = (com.agiletec.apsadmin.tags.IncludeTag) _jspx_tagPool_wpsa_include_value_nobody.get(com.agiletec.apsadmin.tags.IncludeTag.class);
    _jspx_th_wpsa_include_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsa_include_0.setValue("%{#pluginSubMenu.subMenuFilePath}");
    int _jspx_eval_wpsa_include_0 = _jspx_th_wpsa_include_0.doStartTag();
    if (_jspx_th_wpsa_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_include_value_nobody.reuse(_jspx_th_wpsa_include_0);
      return true;
    }
    _jspx_tagPool_wpsa_include_value_nobody.reuse(_jspx_th_wpsa_include_0);
    return false;
  }

  private boolean _jspx_meth_s_else_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_0 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_0.setPageContext(_jspx_page_context);
    _jspx_th_s_else_0.setParent(null);
    int _jspx_eval_s_else_0 = _jspx_th_s_else_0.doStartTag();
    if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t<li role=\"presentation\"><a href=\"#\" role=\"menuitem\" >");
        if (_jspx_meth_s_text_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_else_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
    return false;
  }

  private boolean _jspx_meth_s_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_5 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_5.setPageContext(_jspx_page_context);
    _jspx_th_s_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_0);
    _jspx_th_s_text_5.setName("menu.plugins");
    int _jspx_eval_s_text_5 = _jspx_th_s_text_5.doStartTag();
    if (_jspx_th_s_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_2 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_var_permission_nobody.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_2.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_2.setParent(null);
    _jspx_th_wp_ifauthorized_2.setPermission("managePages");
    _jspx_th_wp_ifauthorized_2.setVar("isEditPages");
    int _jspx_eval_wp_ifauthorized_2 = _jspx_th_wp_ifauthorized_2.doStartTag();
    if (_jspx_th_wp_ifauthorized_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_2);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_2);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_3 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_var_permission_nobody.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_3.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_3.setParent(null);
    _jspx_th_wp_ifauthorized_3.setPermission("superuser");
    _jspx_th_wp_ifauthorized_3.setVar("isSuperuser");
    int _jspx_eval_wp_ifauthorized_3 = _jspx_th_wp_ifauthorized_3.doStartTag();
    if (_jspx_th_wp_ifauthorized_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_3);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_3);
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isEditPages || isSuperuser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_ifauthorized_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        if (_jspx_meth_wp_info_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_wp_ifauthorized_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_4 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_4.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_wp_ifauthorized_4.setPermission("managePages");
    int _jspx_eval_wp_ifauthorized_4 = _jspx_th_wp_ifauthorized_4.doStartTag();
    if (_jspx_eval_wp_ifauthorized_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_4, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_4, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_4, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_4, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_4);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_4);
    return false;
  }

  private boolean _jspx_meth_s_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_4);
    _jspx_th_s_url_3.setAction("viewTree");
    _jspx_th_s_url_3.setNamespace("/do/Page");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_6 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_6.setPageContext(_jspx_page_context);
    _jspx_th_s_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_4);
    _jspx_th_s_text_6.setName("menu.pageAdmin");
    int _jspx_eval_s_text_6 = _jspx_th_s_text_6.doStartTag();
    if (_jspx_th_s_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
    return false;
  }

  private boolean _jspx_meth_s_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_4);
    _jspx_th_s_url_4.setAction("viewWidgets");
    _jspx_th_s_url_4.setNamespace("/do/Portal/WidgetType");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_7 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_7.setPageContext(_jspx_page_context);
    _jspx_th_s_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_4);
    _jspx_th_s_text_7.setName("menu.widgetAdmin");
    int _jspx_eval_s_text_7 = _jspx_th_s_text_7.doStartTag();
    if (_jspx_th_s_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
    return false;
  }

  private boolean _jspx_meth_wp_info_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_2 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_var_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_2.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_wp_info_2.setKey("systemParam");
    _jspx_th_wp_info_2.setParamName("apisOnDemand");
    _jspx_th_wp_info_2.setVar("apisOnDemandVar");
    int _jspx_eval_wp_info_2 = _jspx_th_wp_info_2.doStartTag();
    if (_jspx_th_wp_info_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_2);
      return true;
    }
    _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apisOnDemandVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_ifauthorized_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_wp_ifauthorized_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_5 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_5.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_wp_ifauthorized_5.setPermission("superuser");
    int _jspx_eval_wp_ifauthorized_5 = _jspx_th_wp_ifauthorized_5.doStartTag();
    if (_jspx_eval_wp_ifauthorized_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<li class=\"panel-group\" role=\"presentation\">\n");
        out.write("\t\t<div class=\"panel panel-default\" role=\"presentation\">\n");
        out.write("\t\t\t<div class=\"panel-heading\" role=\"presentation\">\n");
        out.write("\t\t\t\t<a data-toggle=\"collapse\" href=\"#submenu-api\" class=\"display-block\" id=\"aria-menu-api\" aria-haspopup=\"true\" role=\"menuitem\">\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_text_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("&#32;\n");
        out.write("\t\t\t\t\t<span class=\"icon fa fa-chevron-down pull-right\"></span>\n");
        out.write("\t\t\t\t</a>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div id=\"submenu-api\" class=\"panel-collapse collapse\" role=\"presentation\">\n");
        out.write("\t\t\t\t<ul class=\"panel-body nav nav-pills nav-stacked\"  role=\"menubar\" aria-labelledby=\"aria-menu-api\">\n");
        out.write("\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("\" >");
        if (_jspx_meth_s_text_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("\" >");
        if (_jspx_meth_s_text_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("\" >");
        if (_jspx_meth_s_text_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_5, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</div>\n");
        out.write("\t</li>\n");
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_5);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_5);
    return false;
  }

  private boolean _jspx_meth_s_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_8 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_8.setPageContext(_jspx_page_context);
    _jspx_th_s_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_text_8.setName("menu.apisAdmin");
    int _jspx_eval_s_text_8 = _jspx_th_s_text_8.doStartTag();
    if (_jspx_th_s_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
    return false;
  }

  private boolean _jspx_meth_s_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_url_5.setAction("list");
    _jspx_th_s_url_5.setNamespace("/do/Api/Resource");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_9 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_9.setPageContext(_jspx_page_context);
    _jspx_th_s_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_text_9.setName("menu.apisAdmin.resources");
    int _jspx_eval_s_text_9 = _jspx_th_s_text_9.doStartTag();
    if (_jspx_th_s_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
    return false;
  }

  private boolean _jspx_meth_s_url_6(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_url_6.setAction("list");
    _jspx_th_s_url_6.setNamespace("/do/Api/Service");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_10 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_10.setPageContext(_jspx_page_context);
    _jspx_th_s_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_text_10.setName("menu.apisAdmin.services");
    int _jspx_eval_s_text_10 = _jspx_th_s_text_10.doStartTag();
    if (_jspx_th_s_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
    return false;
  }

  private boolean _jspx_meth_s_url_7(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_url_7.setAction("list");
    _jspx_th_s_url_7.setNamespace("/do/Api/Consumer");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_text_11(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_11 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_11.setPageContext(_jspx_page_context);
    _jspx_th_s_text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_5);
    _jspx_th_s_text_11.setName("menu.apisAdmin.consumers");
    int _jspx_eval_s_text_11 = _jspx_th_s_text_11.doStartTag();
    if (_jspx_th_s_text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_11);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_11);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_6 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_var_permission_nobody.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_6.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_6.setParent(null);
    _jspx_th_wp_ifauthorized_6.setPermission("editContents");
    _jspx_th_wp_ifauthorized_6.setVar("isEditContents");
    int _jspx_eval_wp_ifauthorized_6 = _jspx_th_wp_ifauthorized_6.doStartTag();
    if (_jspx_th_wp_ifauthorized_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_6);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_6);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_7 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_var_permission_nobody.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_7.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_7.setParent(null);
    _jspx_th_wp_ifauthorized_7.setPermission("manageResources");
    _jspx_th_wp_ifauthorized_7.setVar("isManageResources");
    int _jspx_eval_wp_ifauthorized_7 = _jspx_th_wp_ifauthorized_7.doStartTag();
    if (_jspx_th_wp_ifauthorized_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_7);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_7);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isEditContents || isManageResources}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_ifauthorized_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        if (_jspx_meth_wp_info_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_8 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_8.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_wp_ifauthorized_8.setPermission("editContents");
    int _jspx_eval_wp_ifauthorized_8 = _jspx_th_wp_ifauthorized_8.doStartTag();
    if (_jspx_eval_wp_ifauthorized_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("\t\t<li class=\"panel-group\" role=\"presentation\">\n");
        out.write("\t\t\t<div class=\"panel panel-default overflow-visible\" role=\"presentation\">\n");
        out.write("\t\t\t\t<div class=\"panel-heading\" role=\"presentation\">\n");
        out.write("\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#submenu-contents\" class=\"display-block\" id=\"aria-menu-jacms-contentadmin\"  aria-haspopup=\"true\" role=\"menuitem\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_text_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("&#32;\n");
        out.write("\t\t\t\t\t\t<span class=\"icon fa fa-chevron-down pull-right\"></span>\n");
        out.write("\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div id=\"submenu-contents\" class=\"panel-collapse collapse\" role=\"presentation\">\n");
        out.write("\t\t\t\t\t<ul class=\"panel-body nav nav-pills nav-stacked\" role=\"menubar\" aria-labelledby=\"aria-menu-jacms-contentadmin\">\n");
        out.write("\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_wpsa_entityTypes_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t<li class=\"dropdown hidden-xs hidden-sm visible-md visible-lg\" role=\"presentation\">\n");
        out.write("\t\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" id=\"aria-menu-jacms-new\" role=\"menuitem\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_text_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("&#32;");
        if (_jspx_meth_s_text_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("&#32;<span class=\"caret\"></span>\n");
        out.write("\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menubar\" aria-labelledby=\"aria-menu-jacms-new\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_iterator_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_iterator_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t<li role=\"presentation\" class=\"divider visible-xs visible-sm hidden-md hidden-lg\"><hr role=\"presentation\" class=\"margin-none\" />\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_wp_ifauthorized_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</li>\n");
        out.write("\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_8);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_8);
    return false;
  }

  private boolean _jspx_meth_s_text_12(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_12 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_12.setPageContext(_jspx_page_context);
    _jspx_th_s_text_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_text_12.setName("jacms.menu.contentAdmin");
    int _jspx_eval_s_text_12 = _jspx_th_s_text_12.doStartTag();
    if (_jspx_th_s_text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_12);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_12);
    return false;
  }

  private boolean _jspx_meth_s_url_8(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_url_8.setAction("list");
    _jspx_th_s_url_8.setNamespace("/do/jacms/Content");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_s_text_13(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_13 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_13.setPageContext(_jspx_page_context);
    _jspx_th_s_text_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_text_13.setName("jacms.menu.contentAdmin.list");
    int _jspx_eval_s_text_13 = _jspx_th_s_text_13.doStartTag();
    if (_jspx_th_s_text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_13);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_13);
    return false;
  }

  private boolean _jspx_meth_wpsa_entityTypes_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:entityTypes
    org.entando.entando.apsadmin.tags.EntityTypesInfoTag _jspx_th_wpsa_entityTypes_0 = (org.entando.entando.apsadmin.tags.EntityTypesInfoTag) _jspx_tagPool_wpsa_entityTypes_var_entityManagerName_nobody.get(org.entando.entando.apsadmin.tags.EntityTypesInfoTag.class);
    _jspx_th_wpsa_entityTypes_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_entityTypes_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_wpsa_entityTypes_0.setEntityManagerName("jacmsContentManager");
    _jspx_th_wpsa_entityTypes_0.setVar("contentTypesVar");
    int _jspx_eval_wpsa_entityTypes_0 = _jspx_th_wpsa_entityTypes_0.doStartTag();
    if (_jspx_th_wpsa_entityTypes_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_entityTypes_var_entityManagerName_nobody.reuse(_jspx_th_wpsa_entityTypes_0);
      return true;
    }
    _jspx_tagPool_wpsa_entityTypes_var_entityManagerName_nobody.reuse(_jspx_th_wpsa_entityTypes_0);
    return false;
  }

  private boolean _jspx_meth_s_text_14(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_14 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_14.setPageContext(_jspx_page_context);
    _jspx_th_s_text_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_text_14.setName("label.new.male");
    int _jspx_eval_s_text_14 = _jspx_th_s_text_14.doStartTag();
    if (_jspx_th_s_text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_14);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_14);
    return false;
  }

  private boolean _jspx_meth_s_text_15(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_15 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_15.setPageContext(_jspx_page_context);
    _jspx_th_s_text_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_text_15.setName("label.content");
    int _jspx_eval_s_text_15 = _jspx_th_s_text_15.doStartTag();
    if (_jspx_th_s_text_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_15);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_15);
    return false;
  }

  private boolean _jspx_meth_s_iterator_1(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_iterator_1.setVar("contentTypeVar");
    _jspx_th_s_iterator_1.setValue("#contentTypesVar");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        if (_jspx_meth_jacmswpsa_contentType_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        if (_jspx_meth_s_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_iterator_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_1);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_1);
    return false;
  }

  private boolean _jspx_meth_jacmswpsa_contentType_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jacmswpsa:contentType
    com.agiletec.plugins.jacms.apsadmin.tags.ContentTypeInfoTag _jspx_th_jacmswpsa_contentType_0 = (com.agiletec.plugins.jacms.apsadmin.tags.ContentTypeInfoTag) _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.get(com.agiletec.plugins.jacms.apsadmin.tags.ContentTypeInfoTag.class);
    _jspx_th_jacmswpsa_contentType_0.setPageContext(_jspx_page_context);
    _jspx_th_jacmswpsa_contentType_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_jacmswpsa_contentType_0.setTypeCode("%{#contentTypeVar.typeCode}");
    _jspx_th_jacmswpsa_contentType_0.setProperty("isAuthToEdit");
    _jspx_th_jacmswpsa_contentType_0.setVar("isAuthToEditVar");
    int _jspx_eval_jacmswpsa_contentType_0 = _jspx_th_jacmswpsa_contentType_0.doStartTag();
    if (_jspx_th_jacmswpsa_contentType_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.reuse(_jspx_th_jacmswpsa_contentType_0);
      return true;
    }
    _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.reuse(_jspx_th_jacmswpsa_contentType_0);
    return false;
  }

  private boolean _jspx_meth_s_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_if_1.setTest("%{#isAuthToEditVar}");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<li role=\"presentation\" class=\"hidden-xs hidden-sm visible-md visible-lg\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\" >");
        if (_jspx_meth_s_text_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("&#32;");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
    return false;
  }

  private boolean _jspx_meth_s_url_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_9 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_9.setPageContext(_jspx_page_context);
    _jspx_th_s_url_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_url_9.setAction("createNew");
    _jspx_th_s_url_9.setNamespace("/do/jacms/Content");
    int _jspx_eval_s_url_9 = _jspx_th_s_url_9.doStartTag();
    if (_jspx_eval_s_url_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_9.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_9);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_9);
    return false;
  }

  private boolean _jspx_meth_s_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_9);
    _jspx_th_s_param_0.setName("contentTypeCode");
    _jspx_th_s_param_0.setValue("%{#contentTypeVar.typeCode}");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_text_16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_16 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_16.setPageContext(_jspx_page_context);
    _jspx_th_s_text_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_16.setName("label.new.male");
    int _jspx_eval_s_text_16 = _jspx_th_s_text_16.doStartTag();
    if (_jspx_th_s_text_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_16);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_16);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_property_0.setValue("%{#contentTypeVar.typeDescr}");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_2(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_s_iterator_2.setVar("contentTypeVar");
    _jspx_th_s_iterator_2.setValue("#contentTypesVar");
    int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
    if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_2.doInitBody();
      }
      do {
        if (_jspx_meth_jacmswpsa_contentType_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        if (_jspx_meth_s_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_iterator_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_2);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_2);
    return false;
  }

  private boolean _jspx_meth_jacmswpsa_contentType_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jacmswpsa:contentType
    com.agiletec.plugins.jacms.apsadmin.tags.ContentTypeInfoTag _jspx_th_jacmswpsa_contentType_1 = (com.agiletec.plugins.jacms.apsadmin.tags.ContentTypeInfoTag) _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.get(com.agiletec.plugins.jacms.apsadmin.tags.ContentTypeInfoTag.class);
    _jspx_th_jacmswpsa_contentType_1.setPageContext(_jspx_page_context);
    _jspx_th_jacmswpsa_contentType_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_jacmswpsa_contentType_1.setTypeCode("%{#contentTypeVar.typeCode}");
    _jspx_th_jacmswpsa_contentType_1.setProperty("isAuthToEdit");
    _jspx_th_jacmswpsa_contentType_1.setVar("isAuthToEditVar");
    int _jspx_eval_jacmswpsa_contentType_1 = _jspx_th_jacmswpsa_contentType_1.doStartTag();
    if (_jspx_th_jacmswpsa_contentType_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.reuse(_jspx_th_jacmswpsa_contentType_1);
      return true;
    }
    _jspx_tagPool_jacmswpsa_contentType_var_typeCode_property_nobody.reuse(_jspx_th_jacmswpsa_contentType_1);
    return false;
  }

  private boolean _jspx_meth_s_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_if_2.setTest("%{#isAuthToEditVar}");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<li role=\"presentation\" class=\"visible-xs visible-sm hidden-md hidden-lg\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write("\" >");
        if (_jspx_meth_s_text_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write("&#32;");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
    return false;
  }

  private boolean _jspx_meth_s_url_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_10 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_10.setPageContext(_jspx_page_context);
    _jspx_th_s_url_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_url_10.setAction("createNew");
    _jspx_th_s_url_10.setNamespace("/do/jacms/Content");
    int _jspx_eval_s_url_10 = _jspx_th_s_url_10.doStartTag();
    if (_jspx_eval_s_url_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_10.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_10, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_10);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_10);
    return false;
  }

  private boolean _jspx_meth_s_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_1 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_1.setPageContext(_jspx_page_context);
    _jspx_th_s_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_10);
    _jspx_th_s_param_1.setName("contentTypeCode");
    _jspx_th_s_param_1.setValue("%{#contentTypeVar.typeCode}");
    int _jspx_eval_s_param_1 = _jspx_th_s_param_1.doStartTag();
    if (_jspx_th_s_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
    return false;
  }

  private boolean _jspx_meth_s_text_17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_17 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_17.setPageContext(_jspx_page_context);
    _jspx_th_s_text_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_text_17.setName("label.new.male");
    int _jspx_eval_s_text_17 = _jspx_th_s_text_17.doStartTag();
    if (_jspx_th_s_text_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_17);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_17);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_property_1.setValue("%{#contentTypeVar.typeDescr}");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_9(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_9 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_9.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_8);
    _jspx_th_wp_ifauthorized_9.setPermission("superuser");
    int _jspx_eval_wp_ifauthorized_9 = _jspx_th_wp_ifauthorized_9.doStartTag();
    if (_jspx_eval_wp_ifauthorized_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_info_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_9, _jspx_page_context))
          return true;
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_9, _jspx_page_context))
          return true;
        if (_jspx_meth_wp_info_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_9, _jspx_page_context))
          return true;
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_9);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_9);
    return false;
  }

  private boolean _jspx_meth_wp_info_3(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_3 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_var_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_3.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_9);
    _jspx_th_wp_info_3.setKey("systemParam");
    _jspx_th_wp_info_3.setParamName("contentModelsOnDemand");
    _jspx_th_wp_info_3.setVar("contentModelsOnDemandVar");
    int _jspx_eval_wp_info_3 = _jspx_th_wp_info_3.doStartTag();
    if (_jspx_th_wp_info_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_3);
      return true;
    }
    _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_3);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_9);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contentModelsOnDemandVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_s_url_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_11 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_11.setPageContext(_jspx_page_context);
    _jspx_th_s_url_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_s_url_11.setAction("list");
    _jspx_th_s_url_11.setNamespace("/do/jacms/ContentModel");
    int _jspx_eval_s_url_11 = _jspx_th_s_url_11.doStartTag();
    if (_jspx_th_s_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_11);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_11);
    return false;
  }

  private boolean _jspx_meth_s_text_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_18 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_18.setPageContext(_jspx_page_context);
    _jspx_th_s_text_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_s_text_18.setName("jacms.menu.contentModelAdmin");
    int _jspx_eval_s_text_18 = _jspx_th_s_text_18.doStartTag();
    if (_jspx_th_s_text_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_18);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_18);
    return false;
  }

  private boolean _jspx_meth_wp_info_4(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_4 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_var_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_4.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_9);
    _jspx_th_wp_info_4.setKey("systemParam");
    _jspx_th_wp_info_4.setParamName("contentTypesOnDemand");
    _jspx_th_wp_info_4.setVar("contentTypesOnDemandVar");
    int _jspx_eval_wp_info_4 = _jspx_th_wp_info_4.doStartTag();
    if (_jspx_th_wp_info_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_4);
      return true;
    }
    _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_4);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_9);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contentTypesOnDemandVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_s_url_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_12 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_12.setPageContext(_jspx_page_context);
    _jspx_th_s_url_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_s_url_12.setAction("initViewEntityTypes");
    _jspx_th_s_url_12.setNamespace("/do/Entity");
    int _jspx_eval_s_url_12 = _jspx_th_s_url_12.doStartTag();
    if (_jspx_eval_s_url_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_12.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_12, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_12);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_12);
    return false;
  }

  private boolean _jspx_meth_s_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_2 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_2.setPageContext(_jspx_page_context);
    _jspx_th_s_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_12);
    _jspx_th_s_param_2.setName("entityManagerName");
    int _jspx_eval_s_param_2 = _jspx_th_s_param_2.doStartTag();
    if (_jspx_eval_s_param_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_2.doInitBody();
      }
      do {
        out.write("jacmsContentManager");
        int evalDoAfterBody = _jspx_th_s_param_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_2);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_2);
    return false;
  }

  private boolean _jspx_meth_s_text_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_19 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_19.setPageContext(_jspx_page_context);
    _jspx_th_s_text_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_s_text_19.setName("jacms.menu.contentTypeAdmin");
    int _jspx_eval_s_text_19 = _jspx_th_s_text_19.doStartTag();
    if (_jspx_th_s_text_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_19);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_19);
    return false;
  }

  private boolean _jspx_meth_wp_info_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_5 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_var_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_5.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_wp_info_5.setKey("systemParam");
    _jspx_th_wp_info_5.setParamName("resourceArchivesOnDemand");
    _jspx_th_wp_info_5.setVar("resourceArchivesOnDemandVar");
    int _jspx_eval_wp_info_5 = _jspx_th_wp_info_5.doStartTag();
    if (_jspx_th_wp_info_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_5);
      return true;
    }
    _jspx_tagPool_wp_info_var_paramName_key_nobody.reuse(_jspx_th_wp_info_5);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourceArchivesOnDemandVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_wp_ifauthorized_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_10 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_10.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_wp_ifauthorized_10.setPermission("manageResources");
    int _jspx_eval_wp_ifauthorized_10 = _jspx_th_wp_ifauthorized_10.doStartTag();
    if (_jspx_eval_wp_ifauthorized_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<li role=\"presentation\" class=\"panel-group\">\n");
        out.write("\t\t\t<div role=\"presentation\" class=\"panel panel-default\">\n");
        out.write("\t\t\t\t<div role=\"presentation\" class=\"panel-heading\">\n");
        out.write("\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#submenu-resources\" class=\"display-block\" id=\"aria-menu-jacms-resources\"  aria-haspopup=\"true\" role=\"menuitem\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_text_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_10, _jspx_page_context))
          return true;
        out.write("&#32;\n");
        out.write("\t\t\t\t\t\t<span class=\"icon fa fa-chevron-down pull-right\"></span>\n");
        out.write("\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div id=\"submenu-resources\" class=\"panel-collapse collapse\" role=\"presentation\">\n");
        out.write("\t\t\t\t\t<ul class=\"panel-body nav nav-pills nav-stacked\" role=\"menubar\" aria-labelledby=\"aria-menu-jacms-resources\">\n");
        out.write("\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_10, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_10, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_10, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_10, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</li>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_wp_ifauthorized_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wp_ifauthorized_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_10);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_permission.reuse(_jspx_th_wp_ifauthorized_10);
    return false;
  }

  private boolean _jspx_meth_s_text_20(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_20 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_20.setPageContext(_jspx_page_context);
    _jspx_th_s_text_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_10);
    _jspx_th_s_text_20.setName("jacms.menu.resourceAdmin");
    int _jspx_eval_s_text_20 = _jspx_th_s_text_20.doStartTag();
    if (_jspx_th_s_text_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_20);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_20);
    return false;
  }

  private boolean _jspx_meth_s_url_13(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_13 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_13.setPageContext(_jspx_page_context);
    _jspx_th_s_url_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_10);
    _jspx_th_s_url_13.setAction("list");
    _jspx_th_s_url_13.setNamespace("/do/jacms/Resource");
    int _jspx_eval_s_url_13 = _jspx_th_s_url_13.doStartTag();
    if (_jspx_eval_s_url_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_13.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_13, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_13);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_13);
    return false;
  }

  private boolean _jspx_meth_s_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_3 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_3.setPageContext(_jspx_page_context);
    _jspx_th_s_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_13);
    _jspx_th_s_param_3.setName("resourceTypeCode");
    int _jspx_eval_s_param_3 = _jspx_th_s_param_3.doStartTag();
    if (_jspx_eval_s_param_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_3.doInitBody();
      }
      do {
        out.write("Image");
        int evalDoAfterBody = _jspx_th_s_param_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_3);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_3);
    return false;
  }

  private boolean _jspx_meth_s_text_21(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_21 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_21.setPageContext(_jspx_page_context);
    _jspx_th_s_text_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_10);
    _jspx_th_s_text_21.setName("jacms.menu.imageAdmin");
    int _jspx_eval_s_text_21 = _jspx_th_s_text_21.doStartTag();
    if (_jspx_th_s_text_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_21);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_21);
    return false;
  }

  private boolean _jspx_meth_s_url_14(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_14 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_14.setPageContext(_jspx_page_context);
    _jspx_th_s_url_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_10);
    _jspx_th_s_url_14.setAction("list");
    _jspx_th_s_url_14.setNamespace("/do/jacms/Resource");
    int _jspx_eval_s_url_14 = _jspx_th_s_url_14.doStartTag();
    if (_jspx_eval_s_url_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_14.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_14, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_14);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_14);
    return false;
  }

  private boolean _jspx_meth_s_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_4 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_4.setPageContext(_jspx_page_context);
    _jspx_th_s_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_14);
    _jspx_th_s_param_4.setName("resourceTypeCode");
    int _jspx_eval_s_param_4 = _jspx_th_s_param_4.doStartTag();
    if (_jspx_eval_s_param_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_4.doInitBody();
      }
      do {
        out.write("Attach");
        int evalDoAfterBody = _jspx_th_s_param_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_4);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_4);
    return false;
  }

  private boolean _jspx_meth_s_text_22(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_22 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_22.setPageContext(_jspx_page_context);
    _jspx_th_s_text_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_10);
    _jspx_th_s_text_22.setName("jacms.menu.attachAdmin");
    int _jspx_eval_s_text_22 = _jspx_th_s_text_22.doStartTag();
    if (_jspx_th_s_text_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_22);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_22);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isSuperuser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<li class=\"panel-group\" role=\"presentation\">\n");
        out.write("\t\t<div class=\"panel panel-default\" role=\"presentation\">\n");
        out.write("\t\t\t<div class=\"panel-heading\" role=\"presentation\">\n");
        out.write("\t\t\t\t<a data-toggle=\"collapse\" href=\"#submenu-template\" class=\"display-block\" id=\"aria-menu-template\" aria-haspopup=\"true\" role=\"menuitem\">\n");
        out.write("\t\t\t\t\tTemplate\n");
        out.write("\t\t\t\t\t<span class=\"icon fa fa-chevron-down pull-right\"></span>\n");
        out.write("\t\t\t\t</a>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div id=\"submenu-template\" class=\"panel-collapse collapse\" role=\"presentation\">\n");
        out.write("\t\t\t\t<ul class=\"panel-body nav nav-pills nav-stacked\" role=\"menubar\" aria-labelledby=\"aria-menu-template\">\n");
        out.write("\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<li><a href=\"");
        if (_jspx_meth_s_url_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\" >");
        if (_jspx_meth_s_text_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" href=\"");
        if (_jspx_meth_s_url_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</div>\n");
        out.write("\t</li>\n");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_s_url_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_15 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_15.setPageContext(_jspx_page_context);
    _jspx_th_s_url_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_s_url_15.setAction("list");
    _jspx_th_s_url_15.setNamespace("/do/PageModel");
    int _jspx_eval_s_url_15 = _jspx_th_s_url_15.doStartTag();
    if (_jspx_th_s_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_15);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_15);
    return false;
  }

  private boolean _jspx_meth_s_text_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_23 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_23.setPageContext(_jspx_page_context);
    _jspx_th_s_text_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_s_text_23.setName("menu.pageModelAdmin");
    int _jspx_eval_s_text_23 = _jspx_th_s_text_23.doStartTag();
    if (_jspx_th_s_text_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_23);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_23);
    return false;
  }

  private boolean _jspx_meth_s_url_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_16 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_16.setPageContext(_jspx_page_context);
    _jspx_th_s_url_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_s_url_16.setNamespace("/do/Portal/GuiFragment");
    _jspx_th_s_url_16.setAction("list");
    int _jspx_eval_s_url_16 = _jspx_th_s_url_16.doStartTag();
    if (_jspx_th_s_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_16);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_16);
    return false;
  }

  private boolean _jspx_meth_s_text_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_24 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_24.setPageContext(_jspx_page_context);
    _jspx_th_s_text_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_s_text_24.setName("menu.guiFragmentAdmin");
    int _jspx_eval_s_text_24 = _jspx_th_s_text_24.doStartTag();
    if (_jspx_th_s_text_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_24);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_24);
    return false;
  }

  private boolean _jspx_meth_s_url_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_17 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_17.setPageContext(_jspx_page_context);
    _jspx_th_s_url_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_s_url_17.setAction("list");
    _jspx_th_s_url_17.setNamespace("/do/FileBrowser");
    int _jspx_eval_s_url_17 = _jspx_th_s_url_17.doStartTag();
    if (_jspx_th_s_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_17);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_17);
    return false;
  }

  private boolean _jspx_meth_s_text_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_25 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_25.setPageContext(_jspx_page_context);
    _jspx_th_s_text_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_s_text_25.setName("menu.filebrowserAdmin");
    int _jspx_eval_s_text_25 = _jspx_th_s_text_25.doStartTag();
    if (_jspx_th_s_text_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_25);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_25);
    return false;
  }
}
