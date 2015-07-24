package org.apache.jsp.WEB_002dINF.apsadmin.jsp.entity.modules.include.listAttributes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allList_005faddElementButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_actionParam_var_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_actionSubParam_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_submit_type_cssClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_wpsa_actionParam_var_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_actionSubParam_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsf_submit_type_cssClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_wpsa_actionParam_var_action.release();
    _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.release();
    _jspx_tagPool_wpsf_submit_type_cssClass_action.release();
    _jspx_tagPool_s_text_name_nobody.release();
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

      if (_jspx_meth_wpsa_actionParam_0(_jspx_page_context))
        return;
      if (_jspx_meth_wpsf_submit_0(_jspx_page_context))
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

  private boolean _jspx_meth_wpsa_actionParam_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:actionParam
    com.agiletec.apsadmin.tags.ApsActionParamTag _jspx_th_wpsa_actionParam_0 = (com.agiletec.apsadmin.tags.ApsActionParamTag) _jspx_tagPool_wpsa_actionParam_var_action.get(com.agiletec.apsadmin.tags.ApsActionParamTag.class);
    _jspx_th_wpsa_actionParam_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_actionParam_0.setParent(null);
    _jspx_th_wpsa_actionParam_0.setAction("addListElement");
    _jspx_th_wpsa_actionParam_0.setVar("actionName");
    int _jspx_eval_wpsa_actionParam_0 = _jspx_th_wpsa_actionParam_0.doStartTag();
    if (_jspx_eval_wpsa_actionParam_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsa_actionParam_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsa_actionParam_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsa_actionParam_0.doInitBody();
      }
      do {
        if (_jspx_meth_wpsa_actionSubParam_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_actionParam_0, _jspx_page_context))
          return true;
        if (_jspx_meth_wpsa_actionSubParam_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_actionParam_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wpsa_actionParam_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsa_actionParam_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsa_actionParam_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_actionParam_var_action.reuse(_jspx_th_wpsa_actionParam_0);
      return true;
    }
    _jspx_tagPool_wpsa_actionParam_var_action.reuse(_jspx_th_wpsa_actionParam_0);
    return false;
  }

  private boolean _jspx_meth_wpsa_actionSubParam_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_actionParam_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:actionSubParam
    com.agiletec.apsadmin.tags.ApsActionParamSubTag _jspx_th_wpsa_actionSubParam_0 = (com.agiletec.apsadmin.tags.ApsActionParamSubTag) _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.get(com.agiletec.apsadmin.tags.ApsActionParamSubTag.class);
    _jspx_th_wpsa_actionSubParam_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_actionSubParam_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_actionParam_0);
    _jspx_th_wpsa_actionSubParam_0.setName("attributeName");
    _jspx_th_wpsa_actionSubParam_0.setValue("%{#attribute.name}");
    int _jspx_eval_wpsa_actionSubParam_0 = _jspx_th_wpsa_actionSubParam_0.doStartTag();
    if (_jspx_th_wpsa_actionSubParam_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.reuse(_jspx_th_wpsa_actionSubParam_0);
      return true;
    }
    _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.reuse(_jspx_th_wpsa_actionSubParam_0);
    return false;
  }

  private boolean _jspx_meth_wpsa_actionSubParam_1(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_actionParam_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:actionSubParam
    com.agiletec.apsadmin.tags.ApsActionParamSubTag _jspx_th_wpsa_actionSubParam_1 = (com.agiletec.apsadmin.tags.ApsActionParamSubTag) _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.get(com.agiletec.apsadmin.tags.ApsActionParamSubTag.class);
    _jspx_th_wpsa_actionSubParam_1.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_actionSubParam_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_actionParam_0);
    _jspx_th_wpsa_actionSubParam_1.setName("listLangCode");
    _jspx_th_wpsa_actionSubParam_1.setValue("%{#lang.code}");
    int _jspx_eval_wpsa_actionSubParam_1 = _jspx_th_wpsa_actionSubParam_1.doStartTag();
    if (_jspx_th_wpsa_actionSubParam_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.reuse(_jspx_th_wpsa_actionSubParam_1);
      return true;
    }
    _jspx_tagPool_wpsa_actionSubParam_value_name_nobody.reuse(_jspx_th_wpsa_actionSubParam_1);
    return false;
  }

  private boolean _jspx_meth_wpsf_submit_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:submit
    com.agiletec.apsadmin.tags.form.SubmitTag _jspx_th_wpsf_submit_0 = (com.agiletec.apsadmin.tags.form.SubmitTag) _jspx_tagPool_wpsf_submit_type_cssClass_action.get(com.agiletec.apsadmin.tags.form.SubmitTag.class);
    _jspx_th_wpsf_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_submit_0.setParent(null);
    _jspx_th_wpsf_submit_0.setType("button");
    _jspx_th_wpsf_submit_0.setAction("%{#actionName}");
    _jspx_th_wpsf_submit_0.setCssClass("btn btn-default");
    int _jspx_eval_wpsf_submit_0 = _jspx_th_wpsf_submit_0.doStartTag();
    if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsf_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsf_submit_0.doInitBody();
      }
      do {
        out.write("<span class=\"icon fa fa-plus-square\"></span>&#32;");
        if (_jspx_meth_s_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsf_submit_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wpsf_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsf_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_submit_type_cssClass_action.reuse(_jspx_th_wpsf_submit_0);
      return true;
    }
    _jspx_tagPool_wpsf_submit_type_cssClass_action.reuse(_jspx_th_wpsf_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsf_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsf_submit_0);
    _jspx_th_s_text_0.setName("label.add");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }
}
