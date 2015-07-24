package org.apache.jsp.WEB_002dINF.apsadmin.jsp.common.activity_002dstream.inc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stream_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_0.mapFunction("fn:replace", org.apache.taglibs.standard.functions.Functions.class, "replace", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_0.mapFunction("fn:trim", org.apache.taglibs.standard.functions.Functions.class, "trim", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_ifauthorized_var_permission_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_activityStreamLastUpdateDate_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_date_var_name_format_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value_status;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_actionLogRecord_var_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_date_name_format_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_ifauthorized_var_permission_groupName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_activityTitle_namespace_actionType_actionName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_var_namespace_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_paramMap_map_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_escape_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_activityStreamLikeRecords_var_recordId_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_date_nice_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_activityStreamCommentRecords_var_recordId_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_hidden_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_submit_value_type_data$1loading$1text_data$1entando_cssClass;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_activityStreamLastUpdateDate_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_date_var_name_format_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value_status = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_actionLogRecord_var_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_date_name_format_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_ifauthorized_var_permission_groupName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_activityTitle_namespace_actionType_actionName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_var_namespace_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_paramMap_map_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_escape_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_activityStreamLikeRecords_var_recordId_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_date_nice_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_activityStreamCommentRecords_var_recordId_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsf_hidden_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsf_submit_value_type_data$1loading$1text_data$1entando_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_s_set_var_value_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_else.release();
    _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.release();
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.release();
    _jspx_tagPool_wpsa_activityStreamLastUpdateDate_var_nobody.release();
    _jspx_tagPool_s_date_var_name_format_nobody.release();
    _jspx_tagPool_s_iterator_var_value_status.release();
    _jspx_tagPool_wpsa_actionLogRecord_var_key_nobody.release();
    _jspx_tagPool_s_set_var_value_scope_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_date_name_format_nobody.release();
    _jspx_tagPool_s_url_namespace_action.release();
    _jspx_tagPool_s_param_name.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_wp_ifauthorized_var_permission_groupName_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_wpsa_activityTitle_namespace_actionType_actionName_nobody.release();
    _jspx_tagPool_s_url_var_namespace_action.release();
    _jspx_tagPool_wpsa_paramMap_map_nobody.release();
    _jspx_tagPool_s_property_value_escape_nobody.release();
    _jspx_tagPool_wpsa_activityStreamLikeRecords_var_recordId_nobody.release();
    _jspx_tagPool_s_date_nice_name_nobody.release();
    _jspx_tagPool_s_iterator_var_value.release();
    _jspx_tagPool_wpsa_activityStreamCommentRecords_var_recordId_nobody.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_s_url_namespace_action_nobody.release();
    _jspx_tagPool_wpsf_hidden_value_name_nobody.release();
    _jspx_tagPool_wpsf_submit_value_type_data$1loading$1text_data$1entando_cssClass.release();
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

 pageContext.setAttribute("carriageReturn", "\r"); 
 pageContext.setAttribute("newLine", "\n"); 
 pageContext.setAttribute("tabChar", "\t"); 
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      if (_jspx_meth_s_set_2(_jspx_page_context))
        return;
      if (_jspx_meth_wp_userProfileAttribute_0(_jspx_page_context))
        return;
      if (_jspx_meth_wp_userProfileAttribute_1(_jspx_page_context))
        return;
      if (_jspx_meth_wp_ifauthorized_0(_jspx_page_context))
        return;
      if (_jspx_meth_wpsa_activityStreamLastUpdateDate_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_date_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ajax");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.ajax eq 'true'}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_s_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent(null);
    _jspx_th_s_set_0.setVar("ajax");
    _jspx_th_s_set_0.setValue("#attr.ajax");
    int _jspx_eval_s_set_0 = _jspx_th_s_set_0.doStartTag();
    if (_jspx_th_s_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_0);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_0);
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
    _jspx_th_s_if_0.setTest("#ajax");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        if (_jspx_meth_s_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_s_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_1 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_1.setPageContext(_jspx_page_context);
    _jspx_th_s_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_set_1.setVar("activityStreamListVar");
    _jspx_th_s_set_1.setValue("%{getActionRecordIds()}");
    int _jspx_eval_s_set_1 = _jspx_th_s_set_1.doStartTag();
    if (_jspx_th_s_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_1);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_1);
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

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("currentUsernameVar");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${session.currentUser.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_s_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_2 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_2.setPageContext(_jspx_page_context);
    _jspx_th_s_set_2.setParent(null);
    _jspx_th_s_set_2.setVar("currentUsernameVar");
    _jspx_th_s_set_2.setValue("#attr.currentUsernameVar");
    int _jspx_eval_s_set_2 = _jspx_th_s_set_2.doStartTag();
    if (_jspx_th_s_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_2);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_2);
    return false;
  }

  private boolean _jspx_meth_wp_userProfileAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:userProfileAttribute
    org.entando.entando.aps.tags.UserProfileAttributeTag _jspx_th_wp_userProfileAttribute_0 = (org.entando.entando.aps.tags.UserProfileAttributeTag) _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.get(org.entando.entando.aps.tags.UserProfileAttributeTag.class);
    _jspx_th_wp_userProfileAttribute_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_userProfileAttribute_0.setParent(null);
    _jspx_th_wp_userProfileAttribute_0.setUsername((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentUsernameVar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_wp_userProfileAttribute_0.setAttributeRoleName("userprofile:fullname");
    _jspx_th_wp_userProfileAttribute_0.setVar("browserUserFullnameVar");
    int _jspx_eval_wp_userProfileAttribute_0 = _jspx_th_wp_userProfileAttribute_0.doStartTag();
    if (_jspx_th_wp_userProfileAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_0);
      return true;
    }
    _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_0);
    return false;
  }

  private boolean _jspx_meth_wp_userProfileAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:userProfileAttribute
    org.entando.entando.aps.tags.UserProfileAttributeTag _jspx_th_wp_userProfileAttribute_1 = (org.entando.entando.aps.tags.UserProfileAttributeTag) _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.get(org.entando.entando.aps.tags.UserProfileAttributeTag.class);
    _jspx_th_wp_userProfileAttribute_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_userProfileAttribute_1.setParent(null);
    _jspx_th_wp_userProfileAttribute_1.setUsername((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentUsernameVar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_wp_userProfileAttribute_1.setAttributeRoleName("userprofile:email");
    _jspx_th_wp_userProfileAttribute_1.setVar("browserUserEmailAttributeVar");
    int _jspx_eval_wp_userProfileAttribute_1 = _jspx_th_wp_userProfileAttribute_1.doStartTag();
    if (_jspx_th_wp_userProfileAttribute_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_1);
      return true;
    }
    _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_1);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_0 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_var_permission_nobody.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_0.setParent(null);
    _jspx_th_wp_ifauthorized_0.setPermission("superuser");
    _jspx_th_wp_ifauthorized_0.setVar("browserIsSuperUser");
    int _jspx_eval_wp_ifauthorized_0 = _jspx_th_wp_ifauthorized_0.doStartTag();
    if (_jspx_th_wp_ifauthorized_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_0);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_var_permission_nobody.reuse(_jspx_th_wp_ifauthorized_0);
    return false;
  }

  private boolean _jspx_meth_wpsa_activityStreamLastUpdateDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:activityStreamLastUpdateDate
    org.entando.entando.apsadmin.tags.ActivityStreamLastUpdateTag _jspx_th_wpsa_activityStreamLastUpdateDate_0 = (org.entando.entando.apsadmin.tags.ActivityStreamLastUpdateTag) _jspx_tagPool_wpsa_activityStreamLastUpdateDate_var_nobody.get(org.entando.entando.apsadmin.tags.ActivityStreamLastUpdateTag.class);
    _jspx_th_wpsa_activityStreamLastUpdateDate_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_activityStreamLastUpdateDate_0.setParent(null);
    _jspx_th_wpsa_activityStreamLastUpdateDate_0.setVar("lastUpdateDateVar");
    int _jspx_eval_wpsa_activityStreamLastUpdateDate_0 = _jspx_th_wpsa_activityStreamLastUpdateDate_0.doStartTag();
    if (_jspx_th_wpsa_activityStreamLastUpdateDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_activityStreamLastUpdateDate_var_nobody.reuse(_jspx_th_wpsa_activityStreamLastUpdateDate_0);
      return true;
    }
    _jspx_tagPool_wpsa_activityStreamLastUpdateDate_var_nobody.reuse(_jspx_th_wpsa_activityStreamLastUpdateDate_0);
    return false;
  }

  private boolean _jspx_meth_s_date_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_0 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_var_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_0.setPageContext(_jspx_page_context);
    _jspx_th_s_date_0.setParent(null);
    _jspx_th_s_date_0.setName("%{#lastUpdateDateVar}");
    _jspx_th_s_date_0.setFormat("yyyy-MM-dd HH:mm:ss|SSS");
    _jspx_th_s_date_0.setVar("lastUpdateDateVar");
    int _jspx_eval_s_date_0 = _jspx_th_s_date_0.doStartTag();
    if (_jspx_th_s_date_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_var_name_format_nobody.reuse(_jspx_th_s_date_0);
      return true;
    }
    _jspx_tagPool_s_date_var_name_format_nobody.reuse(_jspx_th_s_date_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value_status.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("#activityStreamListVar");
    _jspx_th_s_iterator_0.setVar("actionLogRecordIdVar");
    _jspx_th_s_iterator_0.setStatus("currentEvent");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        if (_jspx_meth_wpsa_actionLogRecord_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_wp_userProfileAttribute_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_wp_userProfileAttribute_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t<li\n");
        out.write("\t\tclass=\"media row padding-large-bottom\"\n");
        out.write("\t\tdata-entando-id=\"");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\tdata-entando-creationdate=\"");
        if (_jspx_meth_s_date_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\tdata-entando-updatedate=\"");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t>\n");
        out.write("\t\t<div class=\"col-xs-12 col-sm-2 col-lg-1 margin-small-bottom activity-stream-picture\">\n");
        out.write("\t\t\t<img alt=\" \" src=\"");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" width=\"56\" height=\"56\" class=\"img-circle media-object\" />\n");
        out.write("\t\t</div>\n");
        out.write("\t\t<div class=\"media-body col-xs-12 col-sm-10 col-lg-11 activity-stream-event ");
        if (_jspx_meth_s_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_set_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_wp_ifauthorized_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<div class=\"popover right display-block\" data-entando=\"ajax-update\">\n");
        out.write("\t\t\t\t<div class=\"arrow\"></div>\n");
        out.write("\t\t\t\t<div class=\"popover-content\">\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t&#32;&middot;&#32;\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_wpsa_activityTitle_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(":&#32;\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_set_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_wpsa_activityStreamLikeRecords_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_set_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t<p class=\"margin-small-vertical\">\n");
        out.write("\t\t\t\t\t\t<time datetime=\"");
        if (_jspx_meth_s_date_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" title=\"");
        if (_jspx_meth_s_date_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" class=\"text-info\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_date_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</time>\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t&#32;&middot;&#32;\n");
        out.write("\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t<a\n");
        out.write("\t\t\t\t\t\t\tdata-entando=\"like-link\"\n");
        out.write("\t\t\t\t\t\t\thref=\"");
        if (_jspx_meth_s_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_else_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t</p>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_wpsa_activityStreamCommentRecords_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<div class=\"padding-base-left\" style=\"margin-left: 20px\" data-entando=\"ajax-update\">\n");
        out.write("\t\t\t\t<h4 class=\"sr-only\">");
        if (_jspx_meth_s_text_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</h4>\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_iterator_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"padding-base-left margin-small-top\" style=\"margin-left: 20px\">\n");
        out.write("\t\t\t\t<div class=\"insert-comment media ");
        if (_jspx_meth_s_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t<span class=\"pull-left\" >\n");
        out.write("\t\t\t\t\t\t<img\n");
        out.write("\t\t\t\t\t\t\tclass=\"img-circle media-object stream-img-small\"\n");
        out.write("\t\t\t\t\t\t\tsrc=\"");
        if (_jspx_meth_s_url_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" />\n");
        out.write("\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t<div class=\"media-body\">\n");
        out.write("\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t<form action=\"");
        if (_jspx_meth_s_url_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" class=\"form-horizontal\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_wpsf_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<label for=\"textarea-stream-");
        if (_jspx_meth_s_property_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" class=\"sr-only\">");
        if (_jspx_meth_s_text_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</label>\n");
        out.write("\t\t\t\t\t\t\t<textarea\n");
        out.write("\t\t\t\t\t\t\t\tid=\"textarea-stream-");
        if (_jspx_meth_s_property_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\t\trole=\"textbox\"\n");
        out.write("\t\t\t\t\t\t\t\taria-multiline=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\tclass=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-control\"\n");
        out.write("\t\t\t\t\t\t\t\tcols=\"30\"\n");
        out.write("\t\t\t\t\t\t\t\trows=\"1\"\n");
        out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
        if (_jspx_meth_s_property_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\t\ttitle=\"");
        if (_jspx_meth_s_property_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\t\tname=\"commentText\"></textarea>\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_wpsf_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</form>\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</div>\n");
        out.write("\t</li>\n");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value_status.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value_status.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_wpsa_actionLogRecord_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:actionLogRecord
    org.entando.entando.apsadmin.tags.ActionLogRecordTag _jspx_th_wpsa_actionLogRecord_0 = (org.entando.entando.apsadmin.tags.ActionLogRecordTag) _jspx_tagPool_wpsa_actionLogRecord_var_key_nobody.get(org.entando.entando.apsadmin.tags.ActionLogRecordTag.class);
    _jspx_th_wpsa_actionLogRecord_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_actionLogRecord_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsa_actionLogRecord_0.setKey("%{#actionLogRecordIdVar}");
    _jspx_th_wpsa_actionLogRecord_0.setVar("actionLogRecordVar");
    int _jspx_eval_wpsa_actionLogRecord_0 = _jspx_th_wpsa_actionLogRecord_0.doStartTag();
    if (_jspx_th_wpsa_actionLogRecord_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_actionLogRecord_var_key_nobody.reuse(_jspx_th_wpsa_actionLogRecord_0);
      return true;
    }
    _jspx_tagPool_wpsa_actionLogRecord_var_key_nobody.reuse(_jspx_th_wpsa_actionLogRecord_0);
    return false;
  }

  private boolean _jspx_meth_s_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_3 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_scope_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_3.setPageContext(_jspx_page_context);
    _jspx_th_s_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_3.setVar("usernameVar");
    _jspx_th_s_set_3.setValue("#actionLogRecordVar.username");
    _jspx_th_s_set_3.setScope("page");
    int _jspx_eval_s_set_3 = _jspx_th_s_set_3.doStartTag();
    if (_jspx_th_s_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_scope_nobody.reuse(_jspx_th_s_set_3);
      return true;
    }
    _jspx_tagPool_s_set_var_value_scope_nobody.reuse(_jspx_th_s_set_3);
    return false;
  }

  private boolean _jspx_meth_wp_userProfileAttribute_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:userProfileAttribute
    org.entando.entando.aps.tags.UserProfileAttributeTag _jspx_th_wp_userProfileAttribute_2 = (org.entando.entando.aps.tags.UserProfileAttributeTag) _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.get(org.entando.entando.aps.tags.UserProfileAttributeTag.class);
    _jspx_th_wp_userProfileAttribute_2.setPageContext(_jspx_page_context);
    _jspx_th_wp_userProfileAttribute_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wp_userProfileAttribute_2.setUsername((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameVar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_wp_userProfileAttribute_2.setAttributeRoleName("userprofile:fullname");
    _jspx_th_wp_userProfileAttribute_2.setVar("fullnameVar");
    int _jspx_eval_wp_userProfileAttribute_2 = _jspx_th_wp_userProfileAttribute_2.doStartTag();
    if (_jspx_th_wp_userProfileAttribute_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_2);
      return true;
    }
    _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_2);
    return false;
  }

  private boolean _jspx_meth_wp_userProfileAttribute_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:userProfileAttribute
    org.entando.entando.aps.tags.UserProfileAttributeTag _jspx_th_wp_userProfileAttribute_3 = (org.entando.entando.aps.tags.UserProfileAttributeTag) _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.get(org.entando.entando.aps.tags.UserProfileAttributeTag.class);
    _jspx_th_wp_userProfileAttribute_3.setPageContext(_jspx_page_context);
    _jspx_th_wp_userProfileAttribute_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wp_userProfileAttribute_3.setUsername((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameVar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_wp_userProfileAttribute_3.setAttributeRoleName("userprofile:email");
    _jspx_th_wp_userProfileAttribute_3.setVar("emailAttributeVar");
    int _jspx_eval_wp_userProfileAttribute_3 = _jspx_th_wp_userProfileAttribute_3.doStartTag();
    if (_jspx_th_wp_userProfileAttribute_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_3);
      return true;
    }
    _jspx_tagPool_wp_userProfileAttribute_var_username_attributeRoleName_nobody.reuse(_jspx_th_wp_userProfileAttribute_3);
    return false;
  }

  private boolean _jspx_meth_s_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_4 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_4.setPageContext(_jspx_page_context);
    _jspx_th_s_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_4.setVar("fullnameVar");
    _jspx_th_s_set_4.setValue("#attr.fullnameVar");
    int _jspx_eval_s_set_4 = _jspx_th_s_set_4.doStartTag();
    if (_jspx_th_s_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_4);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_4);
    return false;
  }

  private boolean _jspx_meth_s_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_5 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_5.setPageContext(_jspx_page_context);
    _jspx_th_s_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_5.setVar("emailAttributeVar");
    _jspx_th_s_set_5.setValue("#attr.emailAttributeVar");
    int _jspx_eval_s_set_5 = _jspx_th_s_set_5.doStartTag();
    if (_jspx_th_s_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_5);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_5);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("#actionLogRecordVar.id");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_date_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_1 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_1.setPageContext(_jspx_page_context);
    _jspx_th_s_date_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_date_1.setName("#actionLogRecordVar.actionDate");
    _jspx_th_s_date_1.setFormat("yyyy-MM-dd HH:mm:ss|SSS");
    int _jspx_eval_s_date_1 = _jspx_th_s_date_1.doStartTag();
    if (_jspx_th_s_date_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_1);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_1);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("#lastUpdateDateVar");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_0.setAction("avatarStream");
    _jspx_th_s_url_0.setNamespace("/do/user/avatar");
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
        if (_jspx_meth_s_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_0, _jspx_page_context))
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
        out.write('5');
        out.write('6');
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

  private boolean _jspx_meth_s_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_1 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_1.setPageContext(_jspx_page_context);
    _jspx_th_s_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_0);
    _jspx_th_s_param_1.setName("username");
    _jspx_th_s_param_1.setValue("#actionLogRecordVar.username");
    int _jspx_eval_s_param_1 = _jspx_th_s_param_1.doStartTag();
    if (_jspx_th_s_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
    return false;
  }

  private boolean _jspx_meth_s_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_if_1.setTest("#currentEvent.first && !#ajax");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("event-first");
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

  private boolean _jspx_meth_s_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_6 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_6.setPageContext(_jspx_page_context);
    _jspx_th_s_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_6.setVar("activityStreamInfoVar");
    _jspx_th_s_set_6.setValue("#actionLogRecordVar.activityStreamInfo");
    int _jspx_eval_s_set_6 = _jspx_th_s_set_6.doStartTag();
    if (_jspx_th_s_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_6);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_6);
    return false;
  }

  private boolean _jspx_meth_s_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_7 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_scope_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_7.setPageContext(_jspx_page_context);
    _jspx_th_s_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_7.setVar("authGroupNameVar");
    _jspx_th_s_set_7.setValue("#activityStreamInfoVar.linkAuthGroup");
    _jspx_th_s_set_7.setScope("page");
    int _jspx_eval_s_set_7 = _jspx_th_s_set_7.doStartTag();
    if (_jspx_th_s_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_scope_nobody.reuse(_jspx_th_s_set_7);
      return true;
    }
    _jspx_tagPool_s_set_var_value_scope_nobody.reuse(_jspx_th_s_set_7);
    return false;
  }

  private boolean _jspx_meth_s_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_8 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_scope_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_8.setPageContext(_jspx_page_context);
    _jspx_th_s_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_8.setVar("authPermissionNameVar");
    _jspx_th_s_set_8.setValue("#activityStreamInfoVar.linkAuthPermission");
    _jspx_th_s_set_8.setScope("page");
    int _jspx_eval_s_set_8 = _jspx_th_s_set_8.doStartTag();
    if (_jspx_th_s_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_scope_nobody.reuse(_jspx_th_s_set_8);
      return true;
    }
    _jspx_tagPool_s_set_var_value_scope_nobody.reuse(_jspx_th_s_set_8);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_1 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_var_permission_groupName_nobody.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wp_ifauthorized_1.setGroupName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${authGroupNameVar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_wp_ifauthorized_1.setPermission((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${authPermissionNameVar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_wp_ifauthorized_1.setVar("isAuthorizedVar");
    int _jspx_eval_wp_ifauthorized_1 = _jspx_th_wp_ifauthorized_1.doStartTag();
    if (_jspx_th_wp_ifauthorized_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_ifauthorized_var_permission_groupName_nobody.reuse(_jspx_th_wp_ifauthorized_1);
      return true;
    }
    _jspx_tagPool_wp_ifauthorized_var_permission_groupName_nobody.reuse(_jspx_th_wp_ifauthorized_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isAuthorizedVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<a\n");
        out.write("\t\t\t\t\t\t\t\thref=\"");
        if (_jspx_meth_s_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\t\ttitle=\"");
        if (_jspx_meth_s_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write(':');
        out.write(' ');
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_else_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_s_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_s_url_1.setAction("view");
    _jspx_th_s_url_1.setNamespace("/do/userprofile");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_1.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_2 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_2.setPageContext(_jspx_page_context);
    _jspx_th_s_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_1);
    _jspx_th_s_param_2.setName("username");
    _jspx_th_s_param_2.setValue("#actionLogRecordVar.username");
    int _jspx_eval_s_param_2 = _jspx_th_s_param_2.doStartTag();
    if (_jspx_th_s_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_2);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_2);
    return false;
  }

  private boolean _jspx_meth_s_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_s_text_0.setName("label.viewProfile");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_s_property_2.setValue("#actionLogRecordVar.username");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_s_if_2.setTest("null != #fullnameVar && #fullnameVar.length() > 0");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_property_3.setValue("#fullnameVar");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_else_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_1 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_1.setPageContext(_jspx_page_context);
    _jspx_th_s_else_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    int _jspx_eval_s_else_1 = _jspx_th_s_else_1.doStartTag();
    if (_jspx_eval_s_else_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_1.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_else_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_1);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_1);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_1);
    _jspx_th_s_property_4.setValue("#actionLogRecordVar.username");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_s_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_else_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_s_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_3 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_3.setPageContext(_jspx_page_context);
    _jspx_th_s_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_s_if_3.setTest("null != #fullnameVar && #fullnameVar.length() > 0");
    int _jspx_eval_s_if_3 = _jspx_th_s_if_3.doStartTag();
    if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_3.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_property_5.setValue("#fullnameVar");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_else_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_2 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_2.setPageContext(_jspx_page_context);
    _jspx_th_s_else_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    int _jspx_eval_s_else_2 = _jspx_th_s_else_2.doStartTag();
    if (_jspx_eval_s_else_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_2.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_else_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_2);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_2);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_2);
    _jspx_th_s_property_6.setValue("#actionLogRecordVar.username");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_wpsa_activityTitle_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:activityTitle
    org.entando.entando.apsadmin.tags.ActivityTitleTag _jspx_th_wpsa_activityTitle_0 = (org.entando.entando.apsadmin.tags.ActivityTitleTag) _jspx_tagPool_wpsa_activityTitle_namespace_actionType_actionName_nobody.get(org.entando.entando.apsadmin.tags.ActivityTitleTag.class);
    _jspx_th_wpsa_activityTitle_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_activityTitle_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsa_activityTitle_0.setActionName("%{#actionLogRecordVar.actionName}");
    _jspx_th_wpsa_activityTitle_0.setNamespace("%{#actionLogRecordVar.namespace}");
    _jspx_th_wpsa_activityTitle_0.setActionType("%{#activityStreamInfoVar.actionType}");
    int _jspx_eval_wpsa_activityTitle_0 = _jspx_th_wpsa_activityTitle_0.doStartTag();
    if (_jspx_th_wpsa_activityTitle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_activityTitle_namespace_actionType_actionName_nobody.reuse(_jspx_th_wpsa_activityTitle_0);
      return true;
    }
    _jspx_tagPool_wpsa_activityTitle_namespace_actionType_actionName_nobody.reuse(_jspx_th_wpsa_activityTitle_0);
    return false;
  }

  private boolean _jspx_meth_s_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_9 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_9.setPageContext(_jspx_page_context);
    _jspx_th_s_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_9.setVar("linkTitleVar");
    _jspx_th_s_set_9.setValue("%{getTitle('view/edit', #activityStreamInfoVar.objectTitles)}");
    int _jspx_eval_s_set_9 = _jspx_th_s_set_9.doStartTag();
    if (_jspx_th_s_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_9);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_9);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isAuthorizedVar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_s_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<a href=\"");
        if (_jspx_meth_s_property_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_property_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</a>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_s_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_s_url_2.setAction("%{#activityStreamInfoVar.linkActionName}");
    _jspx_th_s_url_2.setNamespace("%{#activityStreamInfoVar.linkNamespace}");
    _jspx_th_s_url_2.setVar("actionUrlVar");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_eval_s_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_2.doInitBody();
      }
      do {
        if (_jspx_meth_wpsa_paramMap_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_namespace_action.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_var_namespace_action.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_wpsa_paramMap_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:paramMap
    com.agiletec.apsadmin.tags.ParamMapTag _jspx_th_wpsa_paramMap_0 = (com.agiletec.apsadmin.tags.ParamMapTag) _jspx_tagPool_wpsa_paramMap_map_nobody.get(com.agiletec.apsadmin.tags.ParamMapTag.class);
    _jspx_th_wpsa_paramMap_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_paramMap_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_2);
    _jspx_th_wpsa_paramMap_0.setMap("#activityStreamInfoVar.linkParameters");
    int _jspx_eval_wpsa_paramMap_0 = _jspx_th_wpsa_paramMap_0.doStartTag();
    if (_jspx_th_wpsa_paramMap_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_paramMap_map_nobody.reuse(_jspx_th_wpsa_paramMap_0);
      return true;
    }
    _jspx_tagPool_wpsa_paramMap_map_nobody.reuse(_jspx_th_wpsa_paramMap_0);
    return false;
  }

  private boolean _jspx_meth_s_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_escape_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_s_property_7.setValue("#actionUrlVar");
    _jspx_th_s_property_7.setEscape(false);
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_escape_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_escape_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_property_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_s_property_8.setValue("#linkTitleVar");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_s_property_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_s_property_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_9 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_9.setPageContext(_jspx_page_context);
    _jspx_th_s_property_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_s_property_9.setValue("#linkTitleVar");
    int _jspx_eval_s_property_9 = _jspx_th_s_property_9.doStartTag();
    if (_jspx_th_s_property_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
    return false;
  }

  private boolean _jspx_meth_wpsa_activityStreamLikeRecords_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:activityStreamLikeRecords
    org.entando.entando.apsadmin.tags.ActivityStreamLikeRecordsTag _jspx_th_wpsa_activityStreamLikeRecords_0 = (org.entando.entando.apsadmin.tags.ActivityStreamLikeRecordsTag) _jspx_tagPool_wpsa_activityStreamLikeRecords_var_recordId_nobody.get(org.entando.entando.apsadmin.tags.ActivityStreamLikeRecordsTag.class);
    _jspx_th_wpsa_activityStreamLikeRecords_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_activityStreamLikeRecords_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsa_activityStreamLikeRecords_0.setRecordId("%{#actionLogRecordIdVar}");
    _jspx_th_wpsa_activityStreamLikeRecords_0.setVar("activityStreamLikeRecordsVar");
    int _jspx_eval_wpsa_activityStreamLikeRecords_0 = _jspx_th_wpsa_activityStreamLikeRecords_0.doStartTag();
    if (_jspx_th_wpsa_activityStreamLikeRecords_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_activityStreamLikeRecords_var_recordId_nobody.reuse(_jspx_th_wpsa_activityStreamLikeRecords_0);
      return true;
    }
    _jspx_tagPool_wpsa_activityStreamLikeRecords_var_recordId_nobody.reuse(_jspx_th_wpsa_activityStreamLikeRecords_0);
    return false;
  }

  private boolean _jspx_meth_s_set_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_10 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_10.setPageContext(_jspx_page_context);
    _jspx_th_s_set_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_set_10.setValue("%{#activityStreamLikeRecordsVar.containsUser(#currentUsernameVar)}");
    _jspx_th_s_set_10.setVar("likeRecordsContainsUserVar");
    int _jspx_eval_s_set_10 = _jspx_th_s_set_10.doStartTag();
    if (_jspx_th_s_set_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_10);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_10);
    return false;
  }

  private boolean _jspx_meth_s_date_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_2 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_2.setPageContext(_jspx_page_context);
    _jspx_th_s_date_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_date_2.setName("#actionLogRecordVar.actionDate");
    _jspx_th_s_date_2.setFormat("yyyy-MM-dd HH:mm");
    int _jspx_eval_s_date_2 = _jspx_th_s_date_2.doStartTag();
    if (_jspx_th_s_date_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_2);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_2);
    return false;
  }

  private boolean _jspx_meth_s_date_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_3 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_3.setPageContext(_jspx_page_context);
    _jspx_th_s_date_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_date_3.setName("#actionLogRecordVar.actionDate");
    _jspx_th_s_date_3.setFormat("yyyy-MM-dd HH:mm");
    int _jspx_eval_s_date_3 = _jspx_th_s_date_3.doStartTag();
    if (_jspx_th_s_date_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_3);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_3);
    return false;
  }

  private boolean _jspx_meth_s_date_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_4 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_nice_name_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_4.setPageContext(_jspx_page_context);
    _jspx_th_s_date_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_date_4.setName("#actionLogRecordVar.actionDate");
    _jspx_th_s_date_4.setNice(true);
    int _jspx_eval_s_date_4 = _jspx_th_s_date_4.doStartTag();
    if (_jspx_th_s_date_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_nice_name_nobody.reuse(_jspx_th_s_date_4);
      return true;
    }
    _jspx_tagPool_s_date_nice_name_nobody.reuse(_jspx_th_s_date_4);
    return false;
  }

  private boolean _jspx_meth_s_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_4 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_4.setPageContext(_jspx_page_context);
    _jspx_th_s_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_if_4.setTest("#activityStreamLikeRecordsVar.size() > 0");
    int _jspx_eval_s_if_4 = _jspx_th_s_if_4.doStartTag();
    if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t&#32;&middot;&#32;\n");
        out.write("\t\t\t\t\t\t\t<span\n");
        out.write("\t\t\t\t\t\t\t\tdata-toggle=\"tooltip\"\n");
        out.write("\t\t\t\t\t\t\t\tdata-placement=\"bottom\"\n");
        out.write("\t\t\t\t\t\t\t\tdata-original-title=\"");
        if (_jspx_meth_s_iterator_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        if (_jspx_meth_s_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_property_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t&#32;\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
    return false;
  }

  private boolean _jspx_meth_s_iterator_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_iterator_1.setValue("#activityStreamLikeRecordsVar");
    _jspx_th_s_iterator_1.setVar("activityStreamLikeRecordVar");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("&#32;\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_s_property_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_10 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_10.setPageContext(_jspx_page_context);
    _jspx_th_s_property_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_10.setValue("#activityStreamLikeRecordVar.displayName");
    int _jspx_eval_s_property_10 = _jspx_th_s_property_10.doStartTag();
    if (_jspx_th_s_property_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
    return false;
  }

  private boolean _jspx_meth_s_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_text_1.setName("label.like.likesthis");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_s_property_11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_11 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_11.setPageContext(_jspx_page_context);
    _jspx_th_s_property_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_property_11.setValue("#activityStreamLikeRecordsVar.size()");
    int _jspx_eval_s_property_11 = _jspx_th_s_property_11.doStartTag();
    if (_jspx_th_s_property_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
    return false;
  }

  private boolean _jspx_meth_s_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_text_2.setName("label.like.number");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_s_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_3.setNamespace("/do/ActivityStream");
    _jspx_th_s_url_3.setAction("%{#likeRecordsContainsUserVar ? 'unlikeActivity' : 'likeActivity'}");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_eval_s_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_3.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_3 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_3.setPageContext(_jspx_page_context);
    _jspx_th_s_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_3);
    _jspx_th_s_param_3.setName("recordId");
    _jspx_th_s_param_3.setValue("%{#actionLogRecordIdVar}");
    int _jspx_eval_s_param_3 = _jspx_th_s_param_3.doStartTag();
    if (_jspx_th_s_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_3);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_3);
    return false;
  }

  private boolean _jspx_meth_s_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_5 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_5.setPageContext(_jspx_page_context);
    _jspx_th_s_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_if_5.setTest("%{#likeRecordsContainsUserVar}");
    int _jspx_eval_s_if_5 = _jspx_th_s_if_5.doStartTag();
    if (_jspx_eval_s_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_5.doInitBody();
      }
      do {
        if (_jspx_meth_s_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_5);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_5);
    return false;
  }

  private boolean _jspx_meth_s_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_5);
    _jspx_th_s_text_3.setName("label.like.unlike");
    int _jspx_eval_s_text_3 = _jspx_th_s_text_3.doStartTag();
    if (_jspx_th_s_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
    return false;
  }

  private boolean _jspx_meth_s_else_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_3 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_3.setPageContext(_jspx_page_context);
    _jspx_th_s_else_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    int _jspx_eval_s_else_3 = _jspx_th_s_else_3.doStartTag();
    if (_jspx_eval_s_else_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_3.doInitBody();
      }
      do {
        if (_jspx_meth_s_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_else_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_3);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_3);
    return false;
  }

  private boolean _jspx_meth_s_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_4 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_4.setPageContext(_jspx_page_context);
    _jspx_th_s_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_3);
    _jspx_th_s_text_4.setName("label.like.like");
    int _jspx_eval_s_text_4 = _jspx_th_s_text_4.doStartTag();
    if (_jspx_th_s_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
    return false;
  }

  private boolean _jspx_meth_wpsa_activityStreamCommentRecords_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:activityStreamCommentRecords
    org.entando.entando.apsadmin.tags.ActivityStreamCommentRecordsTag _jspx_th_wpsa_activityStreamCommentRecords_0 = (org.entando.entando.apsadmin.tags.ActivityStreamCommentRecordsTag) _jspx_tagPool_wpsa_activityStreamCommentRecords_var_recordId_nobody.get(org.entando.entando.apsadmin.tags.ActivityStreamCommentRecordsTag.class);
    _jspx_th_wpsa_activityStreamCommentRecords_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_activityStreamCommentRecords_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsa_activityStreamCommentRecords_0.setRecordId("%{#actionLogRecordIdVar}");
    _jspx_th_wpsa_activityStreamCommentRecords_0.setVar("activityStreamCommentListVar");
    int _jspx_eval_wpsa_activityStreamCommentRecords_0 = _jspx_th_wpsa_activityStreamCommentRecords_0.doStartTag();
    if (_jspx_th_wpsa_activityStreamCommentRecords_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_activityStreamCommentRecords_var_recordId_nobody.reuse(_jspx_th_wpsa_activityStreamCommentRecords_0);
      return true;
    }
    _jspx_tagPool_wpsa_activityStreamCommentRecords_var_recordId_nobody.reuse(_jspx_th_wpsa_activityStreamCommentRecords_0);
    return false;
  }

  private boolean _jspx_meth_s_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_5 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_5.setPageContext(_jspx_page_context);
    _jspx_th_s_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_text_5.setName("activity.stream.title.comments");
    int _jspx_eval_s_text_5 = _jspx_th_s_text_5.doStartTag();
    if (_jspx_th_s_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
    return false;
  }

  private boolean _jspx_meth_s_iterator_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_iterator_2.setValue("#activityStreamCommentListVar");
    _jspx_th_s_iterator_2.setVar("activityStreamCommentVar");
    int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
    if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<div class=\"media\"\n");
        out.write(" \t\t\t\t\t\tdata-entando-commentid=\"");
        if (_jspx_meth_s_property_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\tdata-entando-commentdate=\"");
        if (_jspx_meth_s_date_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t\t<a\n");
        out.write("\t\t\t\t\t\t\tclass=\"pull-left\"\n");
        out.write("\t\t\t\t\t\t\thref=\"");
        if (_jspx_meth_s_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\ttitle=\"");
        if (_jspx_meth_s_text_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write(":&#32;");
        if (_jspx_meth_s_property_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\t>\n");
        out.write("\t\t\t\t\t\t\t<img\n");
        out.write("\t\t\t\t\t\t\t\tclass=\"img-circle media-object stream-img-small\"\n");
        out.write("\t\t\t\t\t\t\t\tsrc=\"");
        if (_jspx_meth_s_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\" />\n");
        out.write("\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t<div class=\"media-body\">\n");
        out.write("\t\t\t\t\t\t\t<h5 class=\"media-heading\">\n");
        out.write("\t\t\t\t\t\t\t\t<a\n");
        out.write("\t\t\t\t\t\t\t\t\thref=\"");
        if (_jspx_meth_s_url_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t\t\t\t\t\t\t\t\ttitle=\"");
        if (_jspx_meth_s_text_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write(":&#32;");
        if (_jspx_meth_s_property_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_property_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("</a>\n");
        out.write("\t\t\t\t\t\t\t\t&#32;&middot;&#32;<time datetime=\"");
        if (_jspx_meth_s_date_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\" title=\"");
        if (_jspx_meth_s_date_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\" class=\"text-info\">\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_date_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</time>\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_s_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</h5>\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<span class=\"media-text\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_s_property_12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_12 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_12.setPageContext(_jspx_page_context);
    _jspx_th_s_property_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_12.setValue("#activityStreamCommentVar.id");
    int _jspx_eval_s_property_12 = _jspx_th_s_property_12.doStartTag();
    if (_jspx_th_s_property_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
    return false;
  }

  private boolean _jspx_meth_s_date_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_5 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_5.setPageContext(_jspx_page_context);
    _jspx_th_s_date_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_date_5.setName("%{#activityStreamCommentVar.commentDate}");
    _jspx_th_s_date_5.setFormat("yyyy-MM-dd HH:mm:ss|SSS");
    int _jspx_eval_s_date_5 = _jspx_th_s_date_5.doStartTag();
    if (_jspx_th_s_date_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_5);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_5);
    return false;
  }

  private boolean _jspx_meth_s_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_url_4.setAction("view");
    _jspx_th_s_url_4.setNamespace("/do/userprofile");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_eval_s_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_4.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_4 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_4.setPageContext(_jspx_page_context);
    _jspx_th_s_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_4);
    _jspx_th_s_param_4.setName("username");
    _jspx_th_s_param_4.setValue("#activityStreamCommentVar.username");
    int _jspx_eval_s_param_4 = _jspx_th_s_param_4.doStartTag();
    if (_jspx_th_s_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_4);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_4);
    return false;
  }

  private boolean _jspx_meth_s_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_6 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_6.setPageContext(_jspx_page_context);
    _jspx_th_s_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_text_6.setName("label.viewProfile");
    int _jspx_eval_s_text_6 = _jspx_th_s_text_6.doStartTag();
    if (_jspx_th_s_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
    return false;
  }

  private boolean _jspx_meth_s_property_13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_13 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_13.setPageContext(_jspx_page_context);
    _jspx_th_s_property_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_13.setValue("#activityStreamCommentVar.displayName");
    int _jspx_eval_s_property_13 = _jspx_th_s_property_13.doStartTag();
    if (_jspx_th_s_property_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
    return false;
  }

  private boolean _jspx_meth_s_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_url_5.setAction("avatarStream");
    _jspx_th_s_url_5.setNamespace("/do/user/avatar");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_eval_s_url_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_5.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_5, _jspx_page_context))
          return true;
        if (_jspx_meth_s_param_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_param_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_5 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_5.setPageContext(_jspx_page_context);
    _jspx_th_s_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_5);
    _jspx_th_s_param_5.setName("gravatarSize");
    int _jspx_eval_s_param_5 = _jspx_th_s_param_5.doStartTag();
    if (_jspx_eval_s_param_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_5.doInitBody();
      }
      do {
        out.write('5');
        out.write('6');
        int evalDoAfterBody = _jspx_th_s_param_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_5);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_5);
    return false;
  }

  private boolean _jspx_meth_s_param_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_6 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_6.setPageContext(_jspx_page_context);
    _jspx_th_s_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_5);
    _jspx_th_s_param_6.setName("username");
    _jspx_th_s_param_6.setValue("#activityStreamCommentVar.username");
    int _jspx_eval_s_param_6 = _jspx_th_s_param_6.doStartTag();
    if (_jspx_th_s_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_6);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_6);
    return false;
  }

  private boolean _jspx_meth_s_url_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_url_6.setAction("view");
    _jspx_th_s_url_6.setNamespace("/do/userprofile");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_eval_s_url_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_6.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_param_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_7 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_7.setPageContext(_jspx_page_context);
    _jspx_th_s_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_6);
    _jspx_th_s_param_7.setName("username");
    _jspx_th_s_param_7.setValue("#activityStreamCommentVar.username");
    int _jspx_eval_s_param_7 = _jspx_th_s_param_7.doStartTag();
    if (_jspx_th_s_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_7);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_7);
    return false;
  }

  private boolean _jspx_meth_s_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_7 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_7.setPageContext(_jspx_page_context);
    _jspx_th_s_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_text_7.setName("label.viewProfile");
    int _jspx_eval_s_text_7 = _jspx_th_s_text_7.doStartTag();
    if (_jspx_th_s_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
    return false;
  }

  private boolean _jspx_meth_s_property_14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_14 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_14.setPageContext(_jspx_page_context);
    _jspx_th_s_property_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_14.setValue("#activityStreamCommentVar.displayName");
    int _jspx_eval_s_property_14 = _jspx_th_s_property_14.doStartTag();
    if (_jspx_th_s_property_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
    return false;
  }

  private boolean _jspx_meth_s_property_15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_15 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_15.setPageContext(_jspx_page_context);
    _jspx_th_s_property_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_15.setValue("#activityStreamCommentVar.displayName");
    int _jspx_eval_s_property_15 = _jspx_th_s_property_15.doStartTag();
    if (_jspx_th_s_property_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
    return false;
  }

  private boolean _jspx_meth_s_date_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_6 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_6.setPageContext(_jspx_page_context);
    _jspx_th_s_date_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_date_6.setName("#activityStreamCommentVar.commentDate");
    _jspx_th_s_date_6.setFormat("yyyy-MM-dd HH:mm");
    int _jspx_eval_s_date_6 = _jspx_th_s_date_6.doStartTag();
    if (_jspx_th_s_date_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_6);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_6);
    return false;
  }

  private boolean _jspx_meth_s_date_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_7 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_7.setPageContext(_jspx_page_context);
    _jspx_th_s_date_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_date_7.setName("#activityStreamCommentVar.commentDate");
    _jspx_th_s_date_7.setFormat("yyyy-MM-dd HH:mm");
    int _jspx_eval_s_date_7 = _jspx_th_s_date_7.doStartTag();
    if (_jspx_th_s_date_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_7);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_7);
    return false;
  }

  private boolean _jspx_meth_s_date_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_8 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_nice_name_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_8.setPageContext(_jspx_page_context);
    _jspx_th_s_date_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_date_8.setName("%{#activityStreamCommentVar.commentDate}");
    _jspx_th_s_date_8.setNice(true);
    int _jspx_eval_s_date_8 = _jspx_th_s_date_8.doStartTag();
    if (_jspx_th_s_date_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_nice_name_nobody.reuse(_jspx_th_s_date_8);
      return true;
    }
    _jspx_tagPool_s_date_nice_name_nobody.reuse(_jspx_th_s_date_8);
    return false;
  }

  private boolean _jspx_meth_s_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_6 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_6.setPageContext(_jspx_page_context);
    _jspx_th_s_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_if_6.setTest("#activityStreamCommentVar.username == #currentUsernameVar || #attr.browserIsSuperUser");
    int _jspx_eval_s_if_6 = _jspx_th_s_if_6.doStartTag();
    if (_jspx_eval_s_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"#delete\" data-entando=\"delete-comment-ajax\" class=\"pull-right\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"icon fa fa-icon fa-times-circle-o\"></span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;");
        if (_jspx_meth_s_text_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_6);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_6);
    return false;
  }

  private boolean _jspx_meth_s_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_8 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_8.setPageContext(_jspx_page_context);
    _jspx_th_s_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_6);
    _jspx_th_s_text_8.setName("activity.stream.button.delete");
    int _jspx_eval_s_text_8 = _jspx_th_s_text_8.doStartTag();
    if (_jspx_th_s_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_c_set_2.setVar("STRING_TO_ESCAPE");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_2.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_s_property_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_16 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_16.setPageContext(_jspx_page_context);
    _jspx_th_s_property_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_2);
    _jspx_th_s_property_16.setValue("#activityStreamCommentVar.commentText");
    int _jspx_eval_s_property_16 = _jspx_th_s_property_16.doStartTag();
    if (_jspx_th_s_property_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_c_set_3.setVar("ESCAPED_STRING");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:replace(fn:replace(fn:replace(fn:trim(STRING_TO_ESCAPE), carriageReturn, ' ') , newLine, '<br />'), tabChar, '&emsp;')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_c_set_4.setVar("ESCAPED_STRING");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:replace(ESCAPED_STRING,'<br /><br /><br />','<br />')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ESCAPED_STRING}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_out_0.setEscapeXml(false);
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_s_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_7 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_7.setPageContext(_jspx_page_context);
    _jspx_th_s_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_if_7.setTest("#ajax");
    int _jspx_eval_s_if_7 = _jspx_th_s_if_7.doStartTag();
    if (_jspx_eval_s_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_7.doInitBody();
      }
      do {
        out.write(" hide hidden ");
        int evalDoAfterBody = _jspx_th_s_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_7);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_7);
    return false;
  }

  private boolean _jspx_meth_s_url_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_7.setAction("avatarStream");
    _jspx_th_s_url_7.setNamespace("/do/user/avatar");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_eval_s_url_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_7.doInitBody();
      }
      do {
        if (_jspx_meth_s_param_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_7, _jspx_page_context))
          return true;
        if (_jspx_meth_s_param_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_url_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_param_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_8 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_8.setPageContext(_jspx_page_context);
    _jspx_th_s_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_7);
    _jspx_th_s_param_8.setName("gravatarSize");
    int _jspx_eval_s_param_8 = _jspx_th_s_param_8.doStartTag();
    if (_jspx_eval_s_param_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_8.doInitBody();
      }
      do {
        out.write('5');
        out.write('6');
        int evalDoAfterBody = _jspx_th_s_param_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_8);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_8);
    return false;
  }

  private boolean _jspx_meth_s_param_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_9 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_9.setPageContext(_jspx_page_context);
    _jspx_th_s_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_7);
    _jspx_th_s_param_9.setName("username");
    _jspx_th_s_param_9.setValue("#currentUsernameVar");
    int _jspx_eval_s_param_9 = _jspx_th_s_param_9.doStartTag();
    if (_jspx_th_s_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_9);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_9);
    return false;
  }

  private boolean _jspx_meth_s_url_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_8.setAction("addComment");
    _jspx_th_s_url_8.setNamespace("/do/ActivityStream");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_namespace_action_nobody.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_wpsf_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:hidden
    com.agiletec.apsadmin.tags.form.HiddenTag _jspx_th_wpsf_hidden_0 = (com.agiletec.apsadmin.tags.form.HiddenTag) _jspx_tagPool_wpsf_hidden_value_name_nobody.get(com.agiletec.apsadmin.tags.form.HiddenTag.class);
    _jspx_th_wpsf_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsf_hidden_0.setName("streamRecordId");
    _jspx_th_wpsf_hidden_0.setValue("%{#actionLogRecordIdVar}");
    int _jspx_eval_wpsf_hidden_0 = _jspx_th_wpsf_hidden_0.doStartTag();
    if (_jspx_th_wpsf_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_hidden_value_name_nobody.reuse(_jspx_th_wpsf_hidden_0);
      return true;
    }
    _jspx_tagPool_wpsf_hidden_value_name_nobody.reuse(_jspx_th_wpsf_hidden_0);
    return false;
  }

  private boolean _jspx_meth_s_property_17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_17 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_17.setPageContext(_jspx_page_context);
    _jspx_th_s_property_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_17.setValue("#actionLogRecordIdVar");
    int _jspx_eval_s_property_17 = _jspx_th_s_property_17.doStartTag();
    if (_jspx_th_s_property_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
    return false;
  }

  private boolean _jspx_meth_s_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_9 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_9.setPageContext(_jspx_page_context);
    _jspx_th_s_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_text_9.setName("activity.stream.comment.insert.tip");
    int _jspx_eval_s_text_9 = _jspx_th_s_text_9.doStartTag();
    if (_jspx_th_s_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
    return false;
  }

  private boolean _jspx_meth_s_property_18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_18 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_18.setPageContext(_jspx_page_context);
    _jspx_th_s_property_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_18.setValue("#actionLogRecordIdVar");
    int _jspx_eval_s_property_18 = _jspx_th_s_property_18.doStartTag();
    if (_jspx_th_s_property_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
    return false;
  }

  private boolean _jspx_meth_s_property_19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_19 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_19.setPageContext(_jspx_page_context);
    _jspx_th_s_property_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_19.setValue("%{getText('activity.stream.comment.insert.tip')}");
    int _jspx_eval_s_property_19 = _jspx_th_s_property_19.doStartTag();
    if (_jspx_th_s_property_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
    return false;
  }

  private boolean _jspx_meth_s_property_20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_20 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_20.setPageContext(_jspx_page_context);
    _jspx_th_s_property_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_20.setValue("%{getText('activity.stream.comment.insert.tip')}");
    int _jspx_eval_s_property_20 = _jspx_th_s_property_20.doStartTag();
    if (_jspx_th_s_property_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
    return false;
  }

  private boolean _jspx_meth_wpsf_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:submit
    com.agiletec.apsadmin.tags.form.SubmitTag _jspx_th_wpsf_submit_0 = (com.agiletec.apsadmin.tags.form.SubmitTag) _jspx_tagPool_wpsf_submit_value_type_data$1loading$1text_data$1entando_cssClass.get(com.agiletec.apsadmin.tags.form.SubmitTag.class);
    _jspx_th_wpsf_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_wpsf_submit_0.setType("button");
    _jspx_th_wpsf_submit_0.setDynamicAttribute(null, "data-entando", new String("add-comment-button"));
    _jspx_th_wpsf_submit_0.setDynamicAttribute(null, "data-loading-text", new String("%{getText('activity.stream.note.loading')}"));
    _jspx_th_wpsf_submit_0.setValue("%{getText('activity.stream.button.submit.comment')}");
    _jspx_th_wpsf_submit_0.setCssClass("margin-small-top pull-right btn btn-sm btn-default");
    int _jspx_eval_wpsf_submit_0 = _jspx_th_wpsf_submit_0.doStartTag();
    if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsf_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsf_submit_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon fa fa-comment\"></span>&#32;");
        if (_jspx_meth_s_text_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsf_submit_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wpsf_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsf_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_submit_value_type_data$1loading$1text_data$1entando_cssClass.reuse(_jspx_th_wpsf_submit_0);
      return true;
    }
    _jspx_tagPool_wpsf_submit_value_type_data$1loading$1text_data$1entando_cssClass.reuse(_jspx_th_wpsf_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsf_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_10 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_10.setPageContext(_jspx_page_context);
    _jspx_th_s_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsf_submit_0);
    _jspx_th_s_text_10.setName("activity.stream.button.submit.comment");
    int _jspx_eval_s_text_10 = _jspx_th_s_text_10.doStartTag();
    if (_jspx_th_s_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
    return false;
  }
}
