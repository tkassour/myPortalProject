INSERT INTO pagemodels (code, descr, frames, plugincode, templategui) VALUES ('service', 'Service Page', '<frames>
	<frame pos="0">
		<descr>Sample Frame</descr>
	</frame>
</frames>', NULL, '<#assign wp=JspTaglibs["/aps-core"]>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<title><@wp.currentPage param="title" /></title>
</head>
<body>
<h1><@wp.currentPage param="title" /></h1>
<a href="<@wp.url page="homepage" />" >Home</a><br>
<div><@wp.show frame=0 /></div>
</body>
</html>');
INSERT INTO pagemodels (code, descr, frames, plugincode, templategui) VALUES ('entando-page-bootstrap-hero', 'Bootstrap - Hero Unit', '<frames>
	<frame pos="0">
		<descr>Navbar 1</descr>
		<defaultWidget code="entando-widget-language_choose" />
	</frame>
	<frame pos="1">
		<descr>Navbar 2</descr>
		<defaultWidget code="entando-widget-navigation_bar">
			<properties>
				<property key="navSpec">code(homepage)</property>
			</properties>
		</defaultWidget>
	</frame>
	<frame pos="2">
		<descr>Navbar 3</descr>
		<defaultWidget code="entando-widget-search_form" />
	</frame>
	<frame pos="3">
		<descr>Navbar 4</descr>
		<defaultWidget code="entando-widget-login_form" />
	</frame>
	<frame pos="4">
		<descr>Toolbar 1</descr>
	</frame>
	<frame pos="5">
		<descr>Hero Unit</descr>
	</frame>
	<frame pos="6">
		<descr>Toolbar 2</descr>
	</frame>
	<frame pos="7" main="true">
		<descr>Top Story</descr>
	</frame>
	<frame pos="8">
		<descr>Box 1</descr>
	</frame>
	<frame pos="9">
		<descr>Box 2</descr>
	</frame>
	<frame pos="10">
		<descr>Box 3</descr>
	</frame>
	<frame pos="11">
		<descr>Side 1</descr>
	</frame>
	<frame pos="12">
		<descr>Side 2</descr>
	</frame>
	<frame pos="13">
		<descr>Side 3</descr>
	</frame>
	<frame pos="14">
		<descr>Side 4</descr>
	</frame>
	<frame pos="15">
		<descr>Content 1</descr>
	</frame>
	<frame pos="16">
		<descr>Content 2</descr>
	</frame>
	<frame pos="17">
		<descr>Content 3</descr>
	</frame>
	<frame pos="18">
		<descr>Content 4</descr>
	</frame>
	<frame pos="19">
		<descr>Content 5</descr>
	</frame>
	<frame pos="20">
		<descr>Side 5</descr>
	</frame>
	<frame pos="21">
		<descr>Side 6</descr>
	</frame>
	<frame pos="22">
		<descr>Side 7</descr>
	</frame>
	<frame pos="23">
		<descr>Side 8</descr>
	</frame>
	<frame pos="24">
		<descr>Footer 1</descr>
	</frame>
	<frame pos="25">
		<descr>Footer 2</descr>
	</frame>
	<frame pos="26">
		<descr>Footer 3</descr>
	</frame>
	<frame pos="27">
		<descr>Footer 4</descr>
	</frame>
	<frame pos="28">
		<descr>Footer 5</descr>
	</frame>
</frames>', NULL, NULL);
INSERT INTO pagemodels (code, descr, frames, plugincode, templategui) VALUES ('home', 'Home Page', '<?xml version="1.0" encoding="UTF-8"?>
<frames />

', NULL, NULL);
INSERT INTO pagemodels (code, descr, frames, plugincode, templategui) VALUES ('entando-page-myportalplus-basic', 'My Portal - Basic', '<frames>
  <frame pos="0">
    <descr>Navbar 1</descr>
    <defaultWidget code="entando-widget-language_choose" />
  </frame>
  <frame pos="1">
    <descr>Navbar 2</descr>
    <defaultWidget code="entando-widget-navigation_bar">
      <properties>
        <property key="navSpec">code(homepage)</property>
      </properties>
    </defaultWidget>
  </frame>
  <frame pos="2">
    <descr>Navbar 3</descr>
    <defaultWidget code="entando-widget-search_form" />
  </frame>
  <frame pos="3">
    <descr>Navbar 4</descr>
    <defaultWidget code="entando-widget-login_form" />
  </frame>
  <frame pos="4">
    <descr>Toolbar 1</descr>
  </frame>
  <frame pos="5"><descr>First Column I</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="6"><descr>First Column II</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="7"><descr>First Column II</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="8"><descr>Second Column I</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="9"><descr>Second Column II</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="10"><descr>Second Column II</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="11"><descr>Third Column I</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="12"><descr>Third Column II</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="13"><descr>Third Column II</descr><defaultWidget code="jpmyportalplus_void" /></frame>
  <frame pos="14">
    <descr>Footer 1</descr>
  </frame>
  <frame pos="15">
    <descr>Footer 2</descr>
  </frame>
  <frame pos="16">
    <descr>Footer 3</descr>
  </frame>
  <frame pos="17">
    <descr>Footer 4</descr>
  </frame>
  <frame pos="18">
    <descr>Footer 5</descr>
  </frame>
</frames>', 'jpmyportalplus', NULL);
