package org.apache.jsp.WEB_002dINF.apsadmin.jsp.common.layouts.assets_002dmore.inc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class js_005ftrees_005fcontext_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("//for each elements 'form.action-form'\n");
      out.write("jQuery.each($('form.action-form'), function(index, currentForm){\n");
      out.write("\n");
      out.write("\t//current form\n");
      out.write("\tvar currentForm = $(currentForm);\n");
      out.write("\n");
      out.write("\t//the inputs type[radio]\n");
      out.write("\tvar currentFormInputs = $('li.tree_node_flag input[type=\"radio\"]', currentForm);\n");
      out.write("\t\tcurrentFormInputs.each(function() {\n");
      out.write("\t\t\t$(this).css('position', 'absolute');\n");
      out.write("\t\t\t$(this).css('left', '-9999px');\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t//the fieldset\n");
      out.write("\tvar fieldset = $('[data-toggle=\"tree-toolbar\"]', currentForm).first();\n");
      out.write("\n");
      out.write("\t//the actions\n");
      out.write("\tvar myActionMenu = $('[data-toggle=\"tree-toolbar-actions\"]', fieldset).first();\n");
      out.write("\n");
      out.write("\tfieldset.remove();\n");
      out.write("\tmyActionMenu.removeClass('margin-small-vertical');\n");
      out.write("\n");
      out.write("\t//the labels\n");
      out.write("\tvar labels = $('li.tree_node_flag label', currentForm);\n");
      out.write("\n");
      out.write("\t//for each label if checked just show the menu\n");
      out.write("\tjQuery.each(labels, function(index, myLabel){\n");
      out.write("\t\tvar myLabel = $(myLabel);\n");
      out.write("\t\tvar myInput = $(document.getElementById(myLabel.attr('for')));\n");
      out.write("\t\tif (myInput.attr('checked') == 'checked') {\n");
      out.write("\t\t\t$(myLabel).addClass('text-info');\n");
      out.write("\n");
      out.write("\t\t\t//prepare and attach popover to selected label\n");
      out.write("\t\t\t$(myLabel).popover({\n");
      out.write("\t\t\t\thtml: true,\n");
      out.write("\t\t\t\tcontent: myActionMenu,\n");
      out.write("\t\t\t\tplacement: \"right\",\n");
      out.write("\t\t\t\tanimation: false,\n");
      out.write("\t\t\t\tcontainer: currentForm\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(myLabel).popover(\"show\");\n");
      out.write("\n");
      out.write("\t\t\t//prepare and attach tooltips to action buttons\n");
      out.write("\t\t\t$(myActionMenu).tooltip({\n");
      out.write("\t\t\t\tcontainer: myActionMenu,\n");
      out.write("\t\t\t\tselector: \"[data-toggle=tooltip]\"\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\tmyLabel.css(\"cursor\",\"pointer\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\t//onclick event delegation for the labels\n");
      out.write("\t$(currentForm).delegate('li.tree_node_flag label', 'click touchstart', function() {\n");
      out.write("\t\t//e.stop();\n");
      out.write("\t\tvar clickedLabel = this;\n");
      out.write("\n");
      out.write("\t\t//prepare and attach popover to selected label\n");
      out.write("\t\t$(clickedLabel).popover({\n");
      out.write("\t\t\thtml: true,\n");
      out.write("\t\t\tcontent: myActionMenu,\n");
      out.write("\t\t\tplacement: \"right\",\n");
      out.write("\t\t\tanimation: false,\n");
      out.write("\t\t\tcontainer: currentForm\n");
      out.write("\t\t});\n");
      out.write("\t\t$(clickedLabel).popover(\"show\");\n");
      out.write("\n");
      out.write("\t\t//destroy any popover except for the one of the clicked label\n");
      out.write("\t\t//destroy proved to be asynchronous, that's why we are excluding the\n");
      out.write("\t\t//unwanted label using .not()\n");
      out.write("\t\tlabels.not(clickedLabel).popover('destroy');\n");
      out.write("\n");
      out.write("\t\t//prepare and attach tooltips to action buttons\n");
      out.write("\t\t$(myActionMenu).tooltip({\n");
      out.write("\t\t\tcontainer: myActionMenu,\n");
      out.write("\t\t\tselector: \"[data-toggle=tooltip]\"\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t//remove the class text-info from the other labels\n");
      out.write("\t\tlabels.removeClass('text-info');\n");
      out.write("\t\t//add the class to the clicked label\n");
      out.write("\t\t$(clickedLabel).addClass('text-info');\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("});\n");
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
}
