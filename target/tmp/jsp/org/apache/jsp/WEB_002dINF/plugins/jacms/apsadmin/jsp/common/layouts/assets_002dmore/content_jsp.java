package org.apache.jsp.WEB_002dINF.plugins.jacms.apsadmin.jsp.common.layouts.assets_002dmore;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_include_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_resourceURL_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wp_info_paramName_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_namespace_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_hookPoint_objectName_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_wpsa_include_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_resourceURL_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wp_info_paramName_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_namespace_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_hookPoint_objectName_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_wpsa_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_include_value_nobody.release();
    _jspx_tagPool_wp_resourceURL_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.release();
    _jspx_tagPool_s_set_var.release();
    _jspx_tagPool_wp_info_paramName_key_nobody.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_url_namespace_action.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_wpsa_hookPoint_objectName_key.release();
    _jspx_tagPool_s_iterator_var_value.release();
    _jspx_tagPool_wpsa_include_value_nobody.release();
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
      out.write("<script>\n");
      out.write("\tjQuery(function(){\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\tif (document.location.hash.length > 0) {\n");
      out.write("\t\t\tvar tabContainer = $('#tab-container'); //tab conainer\n");
      out.write("\t\t\tvar tabTogglersContainer = $('#tab-togglers'); //toggler container\n");
      out.write("\t\t\t//find the parent with class .tab-pane inside the tab container (and get its id)\n");
      out.write("\t\t\tvar tabId = $($(document.location.hash).parent('.tab-pane'), tabContainer).first().attr('id');\n");
      out.write("\t\t\tif (tabId == undefined) {\n");
      out.write("\t\t\t\tvar tabId = $(document.location.hash+'.tab-pane', tabContainer).first().attr('id');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (tabId!==undefined) {\n");
      out.write("\t\t\t\t//find the element with [href][data-toggle] matching our hash\n");
      out.write("\t\t\t\tvar toggler = $('[href=\"#'+ tabId +'\"][data-toggle=\"tab\"]', tabTogglersContainer).first();\n");
      out.write("\t\t\t\tif (toggler.length==1) {\n");
      out.write("\t\t\t\t\t$(toggler).tab('show');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t//enable the clickable togglers (as required by bootstrap)\n");
      out.write("\t\t$('.tab-togglers a').click(function (e) {\n");
      out.write("\t\t\te.preventDefault()\n");
      out.write("\t\t\t$(this).tab('show')\n");
      out.write("\t\t});\n");
      out.write("\t})\n");
      out.write("</script>\n");
      if (_jspx_meth_s_include_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script src=\"");
      if (_jspx_meth_wp_resourceURL_0(_jspx_page_context))
        return;
      out.write("administration/js/bootstrap-swapon.js\"></script>\n");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script>\n");
      out.write("//one domready to rule 'em all\n");
      out.write("$(function() {\n");
      out.write("\tvar emtpyText= '");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("\n");
      out.write("\t$('[data-toggle=\"popover\"]').popover();\n");
      out.write("\n");
      out.write("\t/* contentDescription routine //start */\n");
      out.write("\tvar fillText = $( '[data-swapon-role=\"text\"]' , '#contentDescription-readonly' ).text();\n");
      out.write("\t$( '#contentDescription-confirm' ).on('swapon', function(ev, action){\n");
      out.write("\t\tif (action == 'hide') { //when description is filled, update the read only text...\n");
      out.write("\t\t\tvar contentDescriptionReadOnlyEl = $( '#contentDescription-readonly' );\n");
      out.write("\t\t\tvar newValue = $( '#contentDescription' ).val();\n");
      out.write("\t\t\t$('#contentDescription').val(newValue);\n");
      out.write("\t\t\tif (newValue.length<=0) { //if text is an empty string show the default text\n");
      out.write("\t\t\t\tnewValue = fillText;\n");
      out.write("\t\t\t\tcontentDescriptionReadOnlyEl.next( 'span' ).show();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse { //otherwise go ahead and hide the second message\n");
      out.write("\t\t\t\tcontentDescriptionReadOnlyEl.next( 'span' ).hide();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$('[data-swapon-role=\"text\"]', '#contentDescription-readonly' ).text( newValue );\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("\t$('#contentDescription-input').on('swapon', function(ev, action) {\n");
      out.write("\t\tif (action == 'show') {\n");
      out.write("\t\t\tvar newValue = $.trim($( '#contentDescription-readonly' ).text());\n");
      out.write("\t\t\tif (newValue==emtpyText) { newValue = ''; }\n");
      out.write("\t\t\t$('#contentDescription').val();\n");
      out.write("\t\t\t$('#contentDescription').focus();\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("\t/* contentDescription routine //end */\n");
      out.write("\n");
      if (_jspx_meth_s_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("//for content categories\n");
      if (_jspx_meth_s_if_1(_jspx_page_context))
        return;
      if (_jspx_meth_s_include_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("//Hypertext Attribute\n");
      if (_jspx_meth_s_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("//End Hypertext Attribute\n");
      out.write("}); //End domready\n");
      out.write("</script>\n");
      if (_jspx_meth_s_include_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(function(){\n");
      out.write("\t\tvar gatherData = function(form, ignoreSelector) {\n");
      out.write("\t\t\tvar myform = form.serialize();\n");
      out.write("\t\t\tif (ignoreSelector!==undefined) {\n");
      out.write("\t\t\t\tvar ignored = $(ignoreSelector);\n");
      out.write("\t\t\t\t$.each(ignored, function (index, el) {\n");
      out.write("\t\t\t\t\tvar el = $(el);\n");
      out.write("\t\t\t\t\tvar value =  escape(el.attr('name')) + '=' + escape(el.val());\n");
      out.write("\t\t\t\t\tmyform = myform.replace(value, '');\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn myform;\n");
      out.write("\t\t};\n");
      out.write("\t\tvar form = $('[data-form-type=\"autosave\"]');\n");
      out.write("\t\tvar button = $('[data-button-type=\"autosave\"]').first();\n");
      out.write("\t\tvar method = form.attr('method');\n");
      out.write("\t\tvar action = form.attr('data-autosave-action');\n");
      out.write("\t\tvar strutsAction = button.attr('name');\n");
      out.write("\t\tvar savedDataEl = $('[data-autosave=\"last-save-time\"]');\n");
      out.write("\t\tvar messagesContainerEl = $('[data-autosave=\"messages_container\"]');\n");
      out.write("\t\tvar versionEl = $('[data-autosave=\"version\"]');\n");
      out.write("\t\tvar lastEditorEl = $('[data-autosave=\"lastEditor\"]');\n");
      out.write("\t\tvar ignoredSelector = '[data-autosave=\"ignore\"]';\n");
      out.write("\n");
      out.write("\t\tvar oldData = gatherData(form,ignoredSelector);\n");
      out.write("\n");
      out.write("\t\tvar sendSave = function(forceSave) {\n");
      out.write("\t\t\tvar delay = 3000;\n");
      out.write("\t\t\tvar data = gatherData(form,ignoredSelector);\n");
      out.write("\t\t\tif (oldData!=data || forceSave===true) {\n");
      out.write("\t\t\t\t//console.log('data changed');\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\tsentData: data,\n");
      out.write("\t\t\t\t\turl: action,\n");
      out.write("\t\t\t\t\tcache: false,\n");
      out.write("\t\t\t\t\tcrossoDomain: true,\n");
      out.write("\t\t\t\t\tbeforeSend: function() {\n");
      out.write("\t\t\t\t\t\tbutton.button('loading');\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tcomplete: function(resp, status) {\n");
      out.write("\t\t\t\t\t\tif (status == 'success') {\n");
      out.write("\t\t\t\t\t\t\toldData = this.sentData;\n");
      out.write("\t\t\t\t\t\t\tsetTimeout(function(){\n");
      out.write("\t\t\t\t\t\t\t\tresp = $.parseJSON(resp.responseText);\n");
      out.write("\t\t\t\t\t\t\t\tvar date = new Date();\n");
      out.write("\t\t\t\t\t\t\t\tvar text = (date.getHours()<10 ? '0'+date.getHours():date.getHours())+':'+(date.getMinutes()<10?'0'+date.getMinutes():date.getMinutes())+':'+(date.getSeconds()<10?'0'+date.getSeconds():date.getSeconds());\n");
      out.write("\t\t\t\t\t\t\t\tif (resp.hasFieldErrors==true) {\n");
      out.write("\t\t\t\t\t\t\t\t\tif (resp.fieldErrorsKeys==='descr' && resp.id==null) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext = '");
      if (_jspx_meth_s_property_3(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\telse {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmessagesContainerEl.html(resp.fieldErrors);\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\tsavedDataEl.siblings('.icon').addClass('hide');\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\telse {\n");
      out.write("\t\t\t\t\t\t\t\t\tsavedDataEl.siblings('.icon').removeClass('hide');\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\tbutton.button('reset');\n");
      out.write("\t\t\t\t\t\t\t\tsavedDataEl.parent().removeClass('hide');\n");
      out.write("\t\t\t\t\t\t\t\tsavedDataEl.text(text);\n");
      out.write("\t\t\t\t\t\t\t\tversionEl.text(resp.version);\n");
      out.write("\t\t\t\t\t\t\t\tlastEditorEl.html(resp.lastEditor);\n");
      out.write("\t\t\t\t\t\t\t}, 600);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\telse {\n");
      out.write("\t\t\t\t\t\t\tbutton.button('reset');\n");
      out.write("\t\t\t\t\t\t\tsavedDataEl.parent().removeClass('hide');\n");
      out.write("\t\t\t\t\t\t\tsavedDataEl.text('");
      if (_jspx_meth_s_property_4(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror: function(jqXHR, textStatus, errorThrown) {\n");
      out.write("\t\t\t\t\t\twindow.location.reload(true);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tprocessData: false,\n");
      out.write("\t\t\t\t\tdata: data,\n");
      out.write("\t\t\t\t\ttype: method,\n");
      out.write("\t\t\t\t\tdataType: 'json'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse {\n");
      out.write("\t\t\t\t//console.log('data unchanged');\n");
      out.write("\t\t\t\tdelay = 5000;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tsetTimeout(sendSave,delay);\n");
      out.write("\t\t}\n");
      out.write("\t\tsendSave();\n");
      out.write("\t\t$('#edit-saveAndContinue').on('click touchstart', function(ev){\n");
      out.write("\t\t\tev.preventDefault();\n");
      out.write("\t\t\tsendSave(true);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      if (_jspx_meth_wpsa_hookPoint_0(_jspx_page_context))
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

  private boolean _jspx_meth_s_include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_0 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_0.setPageContext(_jspx_page_context);
    _jspx_th_s_include_0.setParent(null);
    _jspx_th_s_include_0.setValue("/WEB-INF/apsadmin/jsp/common/layouts/assets-common.jsp");
    int _jspx_eval_s_include_0 = _jspx_th_s_include_0.doStartTag();
    if (_jspx_th_s_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
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

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("htmlEditorCode == 'fckeditor'");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t<script type=\"text/javascript\" src=\"");
        if (_jspx_meth_wp_resourceURL_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("administration/js/ckeditor/ckeditor.js\"></script>\n");
        out.write("\t<script type=\"text/javascript\" src=\"");
        if (_jspx_meth_wp_resourceURL_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("administration/js/ckeditor/adapters/jquery.js\"></script>\n");
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

  private boolean _jspx_meth_wp_resourceURL_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_1 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_1.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    int _jspx_eval_wp_resourceURL_1 = _jspx_th_wp_resourceURL_1.doStartTag();
    if (_jspx_th_wp_resourceURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_1);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_1);
    return false;
  }

  private boolean _jspx_meth_wp_resourceURL_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_2 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_2.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    int _jspx_eval_wp_resourceURL_2 = _jspx_th_wp_resourceURL_2.doStartTag();
    if (_jspx_th_wp_resourceURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_2);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_2);
    return false;
  }

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("%{getText('note.provide.description')}");
    _jspx_th_s_property_0.setEscapeJavaScript(true);
    _jspx_th_s_property_0.setEscapeHtml(false);
    _jspx_th_s_property_0.setEscapeXml(false);
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.reuse(_jspx_th_s_property_0);
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
    _jspx_th_s_set_0.setVar("categoryTreeStyleVar");
    int _jspx_eval_s_set_0 = _jspx_th_s_set_0.doStartTag();
    if (_jspx_eval_s_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_wp_info_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_set_0, _jspx_page_context))
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

  private boolean _jspx_meth_wp_info_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_set_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:info
    com.agiletec.aps.tags.InfoTag _jspx_th_wp_info_0 = (com.agiletec.aps.tags.InfoTag) _jspx_tagPool_wp_info_paramName_key_nobody.get(com.agiletec.aps.tags.InfoTag.class);
    _jspx_th_wp_info_0.setPageContext(_jspx_page_context);
    _jspx_th_wp_info_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_set_0);
    _jspx_th_wp_info_0.setKey("systemParam");
    _jspx_th_wp_info_0.setParamName("treeStyle_category");
    int _jspx_eval_wp_info_0 = _jspx_th_wp_info_0.doStartTag();
    if (_jspx_th_wp_info_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_info_paramName_key_nobody.reuse(_jspx_th_wp_info_0);
      return true;
    }
    _jspx_tagPool_wp_info_paramName_key_nobody.reuse(_jspx_th_wp_info_0);
    return false;
  }

  private boolean _jspx_meth_s_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent(null);
    _jspx_th_s_if_1.setTest("#categoryTreeStyleVar == 'classic'");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("\tvar catTree = jQuery(\"#categoryTree\").EntandoWoodMenu({\n");
        out.write("\t\tmenuToggler: \"subTreeToggler\",\n");
        out.write("\t\tmenuRetriever: function(toggler) {\n");
        out.write("\t\t\treturn $(toggler).parent().children(\"ul\");\n");
        out.write("\t\t},\n");
        out.write("\t\topenClass: \"node_open\",\n");
        out.write("\t\tclosedClass: \"node_closed\",\n");
        out.write("\t\tshowTools: true,\n");
        out.write("\t\tonStart: function() {\n");
        out.write("\t\t\tthis.collapseAll();\n");
        out.write("\t\t},\n");
        out.write("\t\texpandAllLabel: \"");
        if (_jspx_meth_s_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\",\n");
        out.write("\t\tcollapseAllLabel: \"");
        if (_jspx_meth_s_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\",\n");
        out.write("\t");
        if (_jspx_meth_s_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\ttoolTextIntro: \"");
        if (_jspx_meth_s_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\",\n");
        out.write("\t\ttoolexpandAllLabelTitle: \"");
        if (_jspx_meth_s_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\",\n");
        out.write("\t\ttoolcollapseLabelTitle: \"");
        if (_jspx_meth_s_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\"\n");
        out.write("\t});\n");
        out.write("\n");
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

  private boolean _jspx_meth_s_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_0.setName("label.expandAll");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_1.setName("label.collapseAll");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_s_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_if_2.setTest("%{categoryCode != null && !(categoryCode.equalsIgnoreCase(''))}");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\tstartIndex: \"fagianonode_");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write("\",\n");
        out.write("\t");
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

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_property_1.setValue("categoryCode");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_2.setName("label.introExpandAll");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_s_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_3.setName("label.expandAllTitle");
    int _jspx_eval_s_text_3 = _jspx_th_s_text_3.doStartTag();
    if (_jspx_th_s_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
    return false;
  }

  private boolean _jspx_meth_s_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_4 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_4.setPageContext(_jspx_page_context);
    _jspx_th_s_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_4.setName("label.collapseAllTitle");
    int _jspx_eval_s_text_4 = _jspx_th_s_text_4.doStartTag();
    if (_jspx_th_s_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
    return false;
  }

  private boolean _jspx_meth_s_include_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_1 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_1.setPageContext(_jspx_page_context);
    _jspx_th_s_include_1.setParent(null);
    _jspx_th_s_include_1.setValue("/WEB-INF/apsadmin/jsp/common/layouts/assets-more/inc/js_trees_context_menu.jsp");
    int _jspx_eval_s_include_1 = _jspx_th_s_include_1.doStartTag();
    if (_jspx_th_s_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_1);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_1);
    return false;
  }

  private boolean _jspx_meth_s_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_3 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_3.setPageContext(_jspx_page_context);
    _jspx_th_s_if_3.setParent(null);
    _jspx_th_s_if_3.setTest("htmlEditorCode != 'none'");
    int _jspx_eval_s_if_3 = _jspx_th_s_if_3.doStartTag();
    if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t$('[data-toggle=\"entando-hypertext\"]').ckeditor({\n");
        out.write("\t\tcustomConfig : '");
        if (_jspx_meth_wp_resourceURL_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write("administration/js/ckeditor/entando-ckeditor_config.js',\n");
        out.write("\t\tEntandoLinkActionPath: \"");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write("\",\n");
        out.write("\t\tlanguage: '");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write("'\n");
        out.write("\t});\n");
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

  private boolean _jspx_meth_wp_resourceURL_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wp:resourceURL
    com.agiletec.aps.tags.ResourceURLTag _jspx_th_wp_resourceURL_3 = (com.agiletec.aps.tags.ResourceURLTag) _jspx_tagPool_wp_resourceURL_nobody.get(com.agiletec.aps.tags.ResourceURLTag.class);
    _jspx_th_wp_resourceURL_3.setPageContext(_jspx_page_context);
    _jspx_th_wp_resourceURL_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    int _jspx_eval_wp_resourceURL_3 = _jspx_th_wp_resourceURL_3.doStartTag();
    if (_jspx_th_wp_resourceURL_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_3);
      return true;
    }
    _jspx_tagPool_wp_resourceURL_nobody.reuse(_jspx_th_wp_resourceURL_3);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_namespace_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_url_0.setNamespace("/do/jacms/Content/Hypertext");
    _jspx_th_s_url_0.setAction("entandoInternalLink");
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
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_0);
    _jspx_th_s_param_0.setName("contentOnSessionMarker");
    _jspx_th_s_param_0.setValue("contentOnSessionMarker");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_property_2.setValue("locale");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_include_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_2 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_2.setPageContext(_jspx_page_context);
    _jspx_th_s_include_2.setParent(null);
    _jspx_th_s_include_2.setValue("/WEB-INF/apsadmin/jsp/common/layouts/assets-more/inc/snippet-datepicker.jsp");
    int _jspx_eval_s_include_2 = _jspx_th_s_include_2.doStartTag();
    if (_jspx_th_s_include_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_2);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent(null);
    _jspx_th_s_property_3.setValue("%{getText('note.autosave.skipped')}");
    _jspx_th_s_property_3.setEscapeJavaScript(true);
    _jspx_th_s_property_3.setEscapeHtml(false);
    _jspx_th_s_property_3.setEscapeXml(false);
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent(null);
    _jspx_th_s_property_4.setValue("%{getText('note.autosave.skipped')}");
    _jspx_th_s_property_4.setEscapeJavaScript(true);
    _jspx_th_s_property_4.setEscapeHtml(false);
    _jspx_th_s_property_4.setEscapeXml(false);
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_escapeXml_escapeJavaScript_escapeHtml_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_wpsa_hookPoint_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wpsa:hookPoint
    com.agiletec.apsadmin.tags.HookPointTag _jspx_th_wpsa_hookPoint_0 = (com.agiletec.apsadmin.tags.HookPointTag) _jspx_tagPool_wpsa_hookPoint_objectName_key.get(com.agiletec.apsadmin.tags.HookPointTag.class);
    _jspx_th_wpsa_hookPoint_0.setPageContext(_jspx_page_context);
    _jspx_th_wpsa_hookPoint_0.setParent(null);
    _jspx_th_wpsa_hookPoint_0.setKey("jacms.entryContent.extraResources");
    _jspx_th_wpsa_hookPoint_0.setObjectName("hookPointElements_jacms_entryContent_extraResources");
    int _jspx_eval_wpsa_hookPoint_0 = _jspx_th_wpsa_hookPoint_0.doStartTag();
    if (_jspx_eval_wpsa_hookPoint_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_wpsa_hookPoint_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_wpsa_hookPoint_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_wpsa_hookPoint_0.doInitBody();
      }
      do {
        if (_jspx_meth_s_iterator_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_wpsa_hookPoint_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_wpsa_hookPoint_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_wpsa_hookPoint_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_wpsa_hookPoint_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_hookPoint_objectName_key.reuse(_jspx_th_wpsa_hookPoint_0);
      return true;
    }
    _jspx_tagPool_wpsa_hookPoint_objectName_key.reuse(_jspx_th_wpsa_hookPoint_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(javax.servlet.jsp.tagext.JspTag _jspx_th_wpsa_hookPoint_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wpsa_hookPoint_0);
    _jspx_th_s_iterator_0.setValue("#hookPointElements_jacms_entryContent_extraResources");
    _jspx_th_s_iterator_0.setVar("hookPointElement");
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
      _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_0);
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
    _jspx_th_wpsa_include_0.setValue("%{#hookPointElement.filePath}");
    int _jspx_eval_wpsa_include_0 = _jspx_th_wpsa_include_0.doStartTag();
    if (_jspx_th_wpsa_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_wpsa_include_value_nobody.reuse(_jspx_th_wpsa_include_0);
      return true;
    }
    _jspx_tagPool_wpsa_include_value_nobody.reuse(_jspx_th_wpsa_include_0);
    return false;
  }
}
