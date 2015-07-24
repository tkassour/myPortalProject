package org.apache.jsp.WEB_002dINF.apsadmin.jsp.entity.modules.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dateAttributeInputField_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_textfield_value_name_maxlength_id_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsf_textfield_value_name_maxlength_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_set_var_value_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_else.release();
    _jspx_tagPool_wpsf_textfield_value_name_maxlength_id_cssClass_nobody.release();
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

      if (_jspx_meth_s_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      if (_jspx_meth_wpsf_textfield_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<span class=\"help help-block\">dd/MM/yyyy</span>");
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

  private boolean _jspx_meth_s_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent(null);
    _jspx_th_s_set_0.setVar("currentDateAttributeName");
    _jspx_th_s_set_0.setValue("%{#attributeTracer.getFormFieldName(#attribute)}");
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
    _jspx_th_s_if_0.setTest("#attribute.failedDateString == null");
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
    _jspx_th_s_set_1.setVar("dateAttributeValue");
    _jspx_th_s_set_1.setValue("#attribute.getFormattedDate('dd/MM/yyyy')");
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
        if (_jspx_meth_s_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_s_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_2 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_2.setPageContext(_jspx_page_context);
    _jspx_th_s_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_0);
    _jspx_th_s_set_2.setVar("dateAttributeValue");
    _jspx_th_s_set_2.setValue("#attribute.failedDateString");
    int _jspx_eval_s_set_2 = _jspx_th_s_set_2.doStartTag();
    if (_jspx_th_s_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_2);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_2);
    return false;
  }

  private boolean _jspx_meth_wpsf_textfield_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:textfield
    com.agiletec.apsadmin.tags.form.TextFieldTag _jspx_th_wpsf_textfield_0 = (com.agiletec.apsadmin.tags.form.TextFieldTag) _jspx_tagPool_wpsf_textfield_value_name_maxlength_id_cssClass_nobody.get(com.agiletec.apsadmin.tags.form.TextFieldTag.class);
    _jspx_th_wpsf_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_textfield_0.setParent(null);
    _jspx_th_wpsf_textfield_0.setId("%{#currentDateAttributeName}");
    _jspx_th_wpsf_textfield_0.setName("%{#currentDateAttributeName}");
    _jspx_th_wpsf_textfield_0.setValue("%{#dateAttributeValue}");
    _jspx_th_wpsf_textfield_0.setMaxlength("254");
    _jspx_th_wpsf_textfield_0.setCssClass("form-control datepicker");
    int _jspx_eval_wpsf_textfield_0 = _jspx_th_wpsf_textfield_0.doStartTag();
    if (_jspx_th_wpsf_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_textfield_value_name_maxlength_id_cssClass_nobody.reuse(_jspx_th_wpsf_textfield_0);
      return true;
    }
    _jspx_tagPool_wpsf_textfield_value_name_maxlength_id_cssClass_nobody.reuse(_jspx_th_wpsf_textfield_0);
    return false;
  }
}
