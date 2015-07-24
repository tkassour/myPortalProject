package org.apache.jsp.WEB_002dINF.plugins.jacms.apsadmin.jsp.portal.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class referencingContents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_subset_source_pagerId_offset_objectName_count_advanced;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_include_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jacmswpsa_content_var_record_contentId_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_subset_source_pagerId_offset_objectName_count_advanced = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_jacmswpsa_content_var_record_contentId_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_wpsa_subset_source_pagerId_offset_objectName_count_advanced.release();
    _jspx_tagPool_s_set_value_name_nobody.release();
    _jspx_tagPool_s_include_value_nobody.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_s_iterator_var_value.release();
    _jspx_tagPool_jacmswpsa_content_var_record_contentId_nobody.release();
    _jspx_tagPool_s_else.release();
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

      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_s_else_0(_jspx_page_context))
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

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("!#referencingContentsId.empty");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        if (_jspx_meth_wpsa_subset_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
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

  private boolean _jspx_meth_wpsa_subset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:subset
    com.agiletec.apsadmin.tags.AdminPagerTag _jspx_th_wpsa_subset_0 = (com.agiletec.apsadmin.tags.AdminPagerTag) _jspx_tagPool_wpsa_subset_source_pagerId_offset_objectName_count_advanced.get(com.agiletec.apsadmin.tags.AdminPagerTag.class);
    _jspx_th_wpsa_subset_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_subset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_wpsa_subset_0.setSource("#referencingContentsId");
    _jspx_th_wpsa_subset_0.setCount(10);
    _jspx_th_wpsa_subset_0.setObjectName("contentReferencesGroup");
    _jspx_th_wpsa_subset_0.setAdvanced(true);
    _jspx_th_wpsa_subset_0.setOffset(5);
    _jspx_th_wpsa_subset_0.setPagerId("referencingContentsId");
    int _jspx_eval_wpsa_subset_0 = _jspx_th_wpsa_subset_0.doStartTag();
    if (_jspx_eval_wpsa_subset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsa_subset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsa_subset_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsa_subset_0.doInitBody();
      }
      do {
        if (_jspx_meth_s_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<div class=\"text-center\">\n");
        out.write("\t");
        if (_jspx_meth_s_include_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_include_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</div>\n");
        out.write("\n");
        out.write("<div class=\"table-responsive\">\n");
        out.write("\t<table class=\"table table-bordered\" id=\"contentListTable\" summary=\"");
        if (_jspx_meth_s_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t<caption class=\"text-strong margin-base-vertical\">");
        if (_jspx_meth_s_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        out.write("</caption>\n");
        out.write("\t\t");
        if (_jspx_meth_s_include_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_iterator_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t</table>\n");
        out.write("</div>\n");
        out.write("\n");
        out.write("<div class=\"text-center\">\n");
        out.write("\t");
        if (_jspx_meth_s_include_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_subset_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</div>\n");
        int evalDoAfterBody = _jspx_th_wpsa_subset_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsa_subset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsa_subset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_subset_source_pagerId_offset_objectName_count_advanced.reuse(_jspx_th_wpsa_subset_0);
      return true;
    }
    _jspx_tagPool_wpsa_subset_source_pagerId_offset_objectName_count_advanced.reuse(_jspx_th_wpsa_subset_0);
    return false;
  }

  private boolean _jspx_meth_s_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_value_name_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_set_0.setName("group");
    _jspx_th_s_set_0.setValue("#contentReferencesGroup");
    int _jspx_eval_s_set_0 = _jspx_th_s_set_0.doStartTag();
    if (_jspx_th_s_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_value_name_nobody.reuse(_jspx_th_s_set_0);
      return true;
    }
    _jspx_tagPool_s_set_value_name_nobody.reuse(_jspx_th_s_set_0);
    return false;
  }

  private boolean _jspx_meth_s_include_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_0 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_0.setPageContext(_jspx_page_context);
    _jspx_th_s_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_include_0.setValue("/WEB-INF/apsadmin/jsp/common/inc/pagerInfo.jsp");
    int _jspx_eval_s_include_0 = _jspx_th_s_include_0.doStartTag();
    if (_jspx_th_s_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
    return false;
  }

  private boolean _jspx_meth_s_include_1(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_1 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_1.setPageContext(_jspx_page_context);
    _jspx_th_s_include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_include_1.setValue("/WEB-INF/apsadmin/jsp/common/inc/pager_formBlock.jsp");
    int _jspx_eval_s_include_1 = _jspx_th_s_include_1.doStartTag();
    if (_jspx_th_s_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_1);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_1);
    return false;
  }

  private boolean _jspx_meth_s_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_text_0.setName("note.resources.referencingContent.summary");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_text_1.setName("title.referencedContents");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_s_include_2(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_2 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_2.setPageContext(_jspx_page_context);
    _jspx_th_s_include_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_include_2.setValue("/WEB-INF/plugins/jacms/apsadmin/jsp/common/contentReferencesTable_header.jsp");
    int _jspx_eval_s_include_2 = _jspx_th_s_include_2.doStartTag();
    if (_jspx_th_s_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_2);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_2);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_iterator_0.setVar("currentContentIdVar");
    _jspx_th_s_iterator_0.setValue("#referencingContentsId");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        if (_jspx_meth_jacmswpsa_content_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_include_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_jacmswpsa_content_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jacmswpsa:content
    com.agiletec.plugins.jacms.apsadmin.tags.ContentInfoTag _jspx_th_jacmswpsa_content_0 = (com.agiletec.plugins.jacms.apsadmin.tags.ContentInfoTag) _jspx_tagPool_jacmswpsa_content_var_record_contentId_nobody.get(com.agiletec.plugins.jacms.apsadmin.tags.ContentInfoTag.class);
    _jspx_th_jacmswpsa_content_0.setPageContext(_jspx_page_context);
    _jspx_th_jacmswpsa_content_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_jacmswpsa_content_0.setContentId("%{currentContentIdVar}");
    _jspx_th_jacmswpsa_content_0.setRecord(true);
    _jspx_th_jacmswpsa_content_0.setVar("currentContentRecordVar");
    int _jspx_eval_jacmswpsa_content_0 = _jspx_th_jacmswpsa_content_0.doStartTag();
    if (_jspx_th_jacmswpsa_content_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jacmswpsa_content_var_record_contentId_nobody.reuse(_jspx_th_jacmswpsa_content_0);
      return true;
    }
    _jspx_tagPool_jacmswpsa_content_var_record_contentId_nobody.reuse(_jspx_th_jacmswpsa_content_0);
    return false;
  }

  private boolean _jspx_meth_s_include_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_3 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_3.setPageContext(_jspx_page_context);
    _jspx_th_s_include_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_include_3.setValue("/WEB-INF/plugins/jacms/apsadmin/jsp/common/contentReferencesTable_row.jsp");
    int _jspx_eval_s_include_3 = _jspx_th_s_include_3.doStartTag();
    if (_jspx_th_s_include_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_3);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_3);
    return false;
  }

  private boolean _jspx_meth_s_include_4(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_subset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_4 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_4.setPageContext(_jspx_page_context);
    _jspx_th_s_include_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_subset_0);
    _jspx_th_s_include_4.setValue("/WEB-INF/apsadmin/jsp/common/inc/pager_formBlock.jsp");
    int _jspx_eval_s_include_4 = _jspx_th_s_include_4.doStartTag();
    if (_jspx_th_s_include_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_4);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_4);
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
        out.write("<p class=\"alert alert-info\">");
        if (_jspx_meth_s_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
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

  private boolean _jspx_meth_s_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_0);
    _jspx_th_s_text_2.setName("note.referencedContent.empty");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }
}
