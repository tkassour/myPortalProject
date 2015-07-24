package org.apache.jsp.WEB_002dINF.plugins.jacms.apsadmin.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class entryContent_002dactions_002djack_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_submit_type_title_id_data$1loading$1text_data$1button$1type_cssClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_select_value_name_listValue_listKey_list_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsf_submit_type_title_cssClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_ifauthorized_permission;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_wpsf_submit_type_title_id_data$1loading$1text_data$1button$1type_cssClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsf_select_value_name_listValue_listKey_list_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsf_submit_type_title_cssClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_ifauthorized_permission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_wpsf_submit_type_title_id_data$1loading$1text_data$1button$1type_cssClass_action.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_wpsf_select_value_name_listValue_listKey_list_id_cssClass_nobody.release();
    _jspx_tagPool_wpsf_submit_type_title_cssClass_action.release();
    _jspx_tagPool_wp_ifauthorized_permission.release();
    _jspx_tagPool_s_if_test.release();
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
      out.write("<div class=\"row margin-none margin-large-top\">\n");
      out.write("\t<div class=\"col-xs-12 col-sm-4 col-md-3 margin-small-vertical\">\n");
      out.write("\t\t");
      if (_jspx_meth_wpsf_submit_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"input-group col-xs-12 col-sm-4 col-md-3 margin-small-vertical\">\n");
      out.write("\t\t<label for=\"status\" class=\"sr-only\">");
      if (_jspx_meth_s_text_1(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("\t\t");
      if (_jspx_meth_wpsf_select_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_wpsf_submit_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_wp_ifauthorized_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row margin-none margin-large-bottom\">\n");
      out.write("\t<div class=\"col-xs-12 col-sm-4 col-md-3 margin-none\">\n");
      out.write("\t\t<small class=\"help help-block text-muted text-center\">\n");
      out.write("\t\t\t<span class=\"hide\">\n");
      out.write("\t\t\t\t<span class=\"icon fa fa-check-square-o\"></span>&#32;");
      if (_jspx_meth_s_text_4(_jspx_page_context))
        return;
      out.write(": <span data-autosave=\"last-save-time\"></span>\n");
      out.write("\t\t\t</span>&nbsp;");
      out.write("\n");
      out.write("\t\t</small>\n");
      out.write("\t</div>\n");
      out.write("</div>");
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

  private boolean _jspx_meth_wpsf_submit_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:submit
    com.agiletec.apsadmin.tags.form.SubmitTag _jspx_th_wpsf_submit_0 = (com.agiletec.apsadmin.tags.form.SubmitTag) _jspx_tagPool_wpsf_submit_type_title_id_data$1loading$1text_data$1button$1type_cssClass_action.get(com.agiletec.apsadmin.tags.form.SubmitTag.class);
    _jspx_th_wpsf_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_submit_0.setParent(null);
    _jspx_th_wpsf_submit_0.setId("edit-saveAndContinue");
    _jspx_th_wpsf_submit_0.setDynamicAttribute(null, "data-loading-text", new String("%{getText('label.autosaving.button.text')}"));
    _jspx_th_wpsf_submit_0.setDynamicAttribute(null, "data-button-type", new String("autosave"));
    _jspx_th_wpsf_submit_0.setAction("saveAndContinue");
    _jspx_th_wpsf_submit_0.setType("button");
    _jspx_th_wpsf_submit_0.setCssClass("btn btn-default btn-block");
    _jspx_th_wpsf_submit_0.setTitle("%{getText('note.button.saveAndContinue')}");
    int _jspx_eval_wpsf_submit_0 = _jspx_th_wpsf_submit_0.doStartTag();
    if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsf_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsf_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsf_submit_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<span class=\"icon fa fa-play-circle-o\"></span>&#32;\n");
        out.write("\t\t\t\t");
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
      _jspx_tagPool_wpsf_submit_type_title_id_data$1loading$1text_data$1button$1type_cssClass_action.reuse(_jspx_th_wpsf_submit_0);
      return true;
    }
    _jspx_tagPool_wpsf_submit_type_title_id_data$1loading$1text_data$1button$1type_cssClass_action.reuse(_jspx_th_wpsf_submit_0);
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
    _jspx_th_s_text_0.setName("label.saveAndContinue");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
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
    _jspx_th_s_text_1.setName("label.state");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_wpsf_select_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:select
    com.agiletec.apsadmin.tags.form.SelectTag _jspx_th_wpsf_select_0 = (com.agiletec.apsadmin.tags.form.SelectTag) _jspx_tagPool_wpsf_select_value_name_listValue_listKey_list_id_cssClass_nobody.get(com.agiletec.apsadmin.tags.form.SelectTag.class);
    _jspx_th_wpsf_select_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_select_0.setParent(null);
    _jspx_th_wpsf_select_0.setName("status");
    _jspx_th_wpsf_select_0.setId("status");
    _jspx_th_wpsf_select_0.setList("avalaibleStatus");
    _jspx_th_wpsf_select_0.setValue("%{content.status}");
    _jspx_th_wpsf_select_0.setListKey("key");
    _jspx_th_wpsf_select_0.setListValue("%{getText(value)}");
    _jspx_th_wpsf_select_0.setCssClass("form-control");
    int _jspx_eval_wpsf_select_0 = _jspx_th_wpsf_select_0.doStartTag();
    if (_jspx_th_wpsf_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_select_value_name_listValue_listKey_list_id_cssClass_nobody.reuse(_jspx_th_wpsf_select_0);
      return true;
    }
    _jspx_tagPool_wpsf_select_value_name_listValue_listKey_list_id_cssClass_nobody.reuse(_jspx_th_wpsf_select_0);
    return false;
  }

  private boolean _jspx_meth_wpsf_submit_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:submit
    com.agiletec.apsadmin.tags.form.SubmitTag _jspx_th_wpsf_submit_1 = (com.agiletec.apsadmin.tags.form.SubmitTag) _jspx_tagPool_wpsf_submit_type_title_cssClass_action.get(com.agiletec.apsadmin.tags.form.SubmitTag.class);
    _jspx_th_wpsf_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_submit_1.setParent(null);
    _jspx_th_wpsf_submit_1.setAction("save");
    _jspx_th_wpsf_submit_1.setType("button");
    _jspx_th_wpsf_submit_1.setCssClass("btn btn-default");
    _jspx_th_wpsf_submit_1.setTitle("%{getText('note.button.saveContent')}");
    int _jspx_eval_wpsf_submit_1 = _jspx_th_wpsf_submit_1.doStartTag();
    if (_jspx_eval_wpsf_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsf_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsf_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsf_submit_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<span class=\"icon fa fa-floppy-o\"></span>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_wpsf_submit_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsf_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsf_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_submit_type_title_cssClass_action.reuse(_jspx_th_wpsf_submit_1);
      return true;
    }
    _jspx_tagPool_wpsf_submit_type_title_cssClass_action.reuse(_jspx_th_wpsf_submit_1);
    return false;
  }

  private boolean _jspx_meth_wp_ifauthorized_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:ifauthorized
    com.agiletec.aps.tags.CheckPermissionTag _jspx_th_wp_ifauthorized_0 = (com.agiletec.aps.tags.CheckPermissionTag) _jspx_tagPool_wp_ifauthorized_permission.get(com.agiletec.aps.tags.CheckPermissionTag.class);
    _jspx_th_wp_ifauthorized_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_ifauthorized_0.setParent(null);
    _jspx_th_wp_ifauthorized_0.setPermission("validateContents");
    int _jspx_eval_wp_ifauthorized_0 = _jspx_th_wp_ifauthorized_0.doStartTag();
    if (_jspx_eval_wp_ifauthorized_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<div class=\"col-xs-12 col-sm-4 col-md-3 margin-small-vertical\">\n");
        out.write("\t\t\t");
        if (_jspx_meth_wpsf_submit_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t</div>\n");
        out.write("\t\t");
        if (_jspx_meth_s_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wp_ifauthorized_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_wpsf_submit_2(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:submit
    com.agiletec.apsadmin.tags.form.SubmitTag _jspx_th_wpsf_submit_2 = (com.agiletec.apsadmin.tags.form.SubmitTag) _jspx_tagPool_wpsf_submit_type_title_cssClass_action.get(com.agiletec.apsadmin.tags.form.SubmitTag.class);
    _jspx_th_wpsf_submit_2.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_submit_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_0);
    _jspx_th_wpsf_submit_2.setAction("saveAndApprove");
    _jspx_th_wpsf_submit_2.setType("button");
    _jspx_th_wpsf_submit_2.setCssClass("btn btn-success btn-block");
    _jspx_th_wpsf_submit_2.setTitle("%{getText('note.button.saveAndApprove')}");
    int _jspx_eval_wpsf_submit_2 = _jspx_th_wpsf_submit_2.doStartTag();
    if (_jspx_eval_wpsf_submit_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsf_submit_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsf_submit_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsf_submit_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<span class=\"icon fa fa-check\"></span>&#32;\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsf_submit_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wpsf_submit_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsf_submit_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsf_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_submit_type_title_cssClass_action.reuse(_jspx_th_wpsf_submit_2);
      return true;
    }
    _jspx_tagPool_wpsf_submit_type_title_cssClass_action.reuse(_jspx_th_wpsf_submit_2);
    return false;
  }

  private boolean _jspx_meth_s_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsf_submit_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsf_submit_2);
    _jspx_th_s_text_2.setName("label.saveAndApprove");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_s_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wp_ifauthorized_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wp_ifauthorized_0);
    _jspx_th_s_if_0.setTest("content.onLine");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-3 margin-small-vertical\">\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_wpsf_submit_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_wpsf_submit_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsf:submit
    com.agiletec.apsadmin.tags.form.SubmitTag _jspx_th_wpsf_submit_3 = (com.agiletec.apsadmin.tags.form.SubmitTag) _jspx_tagPool_wpsf_submit_type_title_cssClass_action.get(com.agiletec.apsadmin.tags.form.SubmitTag.class);
    _jspx_th_wpsf_submit_3.setPageContext(_jspx_page_context);
    _jspx_th_wpsf_submit_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_wpsf_submit_3.setAction("suspend");
    _jspx_th_wpsf_submit_3.setType("button");
    _jspx_th_wpsf_submit_3.setCssClass("btn btn-warning btn-block");
    _jspx_th_wpsf_submit_3.setTitle("%{getText('note.button.suspend')}");
    int _jspx_eval_wpsf_submit_3 = _jspx_th_wpsf_submit_3.doStartTag();
    if (_jspx_eval_wpsf_submit_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsf_submit_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsf_submit_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsf_submit_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<span class=\"icon fa fa-pause\"></span>&#32;\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsf_submit_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wpsf_submit_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsf_submit_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsf_submit_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsf_submit_type_title_cssClass_action.reuse(_jspx_th_wpsf_submit_3);
      return true;
    }
    _jspx_tagPool_wpsf_submit_type_title_cssClass_action.reuse(_jspx_th_wpsf_submit_3);
    return false;
  }

  private boolean _jspx_meth_s_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsf_submit_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsf_submit_3);
    _jspx_th_s_text_3.setName("label.suspend");
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
    _jspx_th_s_text_4.setName("note.autosaved.at");
    int _jspx_eval_s_text_4 = _jspx_th_s_text_4.doStartTag();
    if (_jspx_th_s_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
    return false;
  }
}
