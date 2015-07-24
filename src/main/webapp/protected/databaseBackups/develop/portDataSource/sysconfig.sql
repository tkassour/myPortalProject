INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'langs', 'Definition of the system languages', '<?xml version="1.0" encoding="UTF-8"?>
<Langs>
	<Lang>
		<code>it</code>
		<descr>Italiano</descr>
	</Lang>
	<Lang>
		<code>en</code>
		<descr>English</descr>
		<default>true</default>
	</Lang>
</Langs>
');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'userProfileTypes', 'User Profile Types Definitions', '<?xml version="1.0" encoding="UTF-8"?>
<profiletypes>
	<profiletype typecode="PFL" typedescr="Default user profile">
		<attributes>
			<attribute name="fullname" attributetype="Monotext" description="Full Name" searchable="true">
				<validations>
					<required>true</required>
				</validations>
				<roles>
					<role>userprofile:fullname</role>
				</roles>
			</attribute>
			<attribute name="email" attributetype="Monotext" description="Email" searchable="true">
				<validations>
					<required>true</required>
					<regexp><![CDATA[.+@.+.[a-z]+]]></regexp>
				</validations>
				<roles>
					<role>userprofile:email</role>
				</roles>
			</attribute>
		</attributes>
	</profiletype>
</profiletypes>');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'contentTypes', 'Definition of the Content Types', '<?xml version="1.0" encoding="UTF-8"?>
<contenttypes>
	<contenttype typecode="CNG" typedescr="Generic Content" viewpage="**NULL**" listmodel="10011" defaultmodel="10001">
		<attributes>
			<attribute name="Title" attributetype="Text" searchable="true" indexingtype="TEXT">
				<validations>
					<required>true</required>
				</validations>
				<roles>
					<role>jacms:title</role>
				</roles>
			</attribute>
			<attribute name="Abstract" attributetype="Hypertext" indexingtype="TEXT" />
			<attribute name="MainBody" attributetype="Hypertext" description="Main Body" indexingtype="TEXT" />
			<attribute name="Picture" attributetype="Image" />
			<attribute name="Caption" attributetype="Text" indexingtype="TEXT" />
			<list name="Links" attributetype="Monolist">
				<nestedtype>
					<attribute name="Links" attributetype="Link" indexingtype="TEXT" />
				</nestedtype>
			</list>
			<list name="Attaches" attributetype="Monolist">
				<nestedtype>
					<attribute name="Attaches" attributetype="Attach" indexingtype="TEXT" />
				</nestedtype>
			</list>
		</attributes>
	</contenttype>
</contenttypes>

');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'imageDimensions', 'Definition of the resized image dimensions', '<Dimensions>
	<Dimension>
		<id>1</id>
		<dimx>90</dimx>
		<dimy>90</dimy>
	</Dimension>
	<Dimension>
		<id>2</id>
		<dimx>130</dimx>
		<dimy>130</dimy>
	</Dimension>
	<Dimension>
		<id>3</id>
		<dimx>150</dimx>
		<dimy>150</dimy>
	</Dimension>
</Dimensions>
');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'subIndexDir', 'Name of the sub-directory containing content indexing files', 'indexdir20150717115704');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'params', 'Configuration params.', '<?xml version="1.0" encoding="UTF-8"?>
<Params>
	<Param name="urlStyle">classic</Param>
	<Param name="hypertextEditor">fckeditor</Param>
	<Param name="treeStyle_page">request</Param>
	<Param name="treeStyle_category">request</Param>
	<Param name="startLangFromBrowser">true</Param>
	<Param name="firstTimeMessages">true</Param>
	<Param name="baseUrl">static</Param>
	<Param name="baseUrlContext">true</Param>
	<Param name="useJsessionId">true</Param>
	<SpecialPages>
		<Param name="notFoundPageCode">notfound</Param>
		<Param name="homePageCode">homepage</Param>
		<Param name="errorPageCode">errorpage</Param>
		<Param name="loginPageCode">login</Param>
	</SpecialPages>
	<FeaturesOnDemand>
		<Param name="groupsOnDemand">false</Param>
		<Param name="categoriesOnDemand">false</Param>
		<Param name="contentTypesOnDemand">false</Param>
		<Param name="contentModelsOnDemand">false</Param>
		<Param name="apisOnDemand">false</Param>
		<Param name="resourceArchivesOnDemand">false</Param>
	</FeaturesOnDemand>
	<ExtendendPrivacyModule>
		<Param name="extendedPrivacyModuleEnabled">false</Param>
		<Param name="maxMonthsSinceLastAccess">6</Param>
		<Param name="maxMonthsSinceLastPasswordChange">3</Param>
	</ExtendendPrivacyModule>
</Params>

');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'jpmyportalplus_config', 'Definizione degli oggetti configurabili di My Portal', '<?xml version="1.0" encoding="UTF-8"?>
<myportalConfig><widgets><widget code="jpmyportalplus_sample_widget" /></widgets></myportalConfig>
');
INSERT INTO sysconfig (version, item, descr, config) VALUES ('production', 'entandoComponentsReport', 'The component installation report', '<?xml version="1.0" encoding="UTF-8"?>
<reports status="OK">
	<creation>2015-07-16 15:59:17</creation>
	<lastupdate>2015-07-17 10:16:21</lastupdate>
	<components>
		<component code="entandoCore" date="2015-07-16 15:59:17" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="OK">
					<table name="authgroups" />
					<table name="authpermissions" />
					<table name="authroles" />
					<table name="authrolepermissions" />
					<table name="authusers" />
					<table name="authusergrouprole" />
					<table name="api_oauth_consumers" />
					<table name="api_oauth_tokens" />
					<table name="apicatalog_methods" />
					<table name="apicatalog_services" />
					<table name="authuserprofiles" />
					<table name="authuserprofilesearch" />
					<table name="authuserprofileattrroles" />
					<table name="actionlogrecords" />
					<table name="actionlogrelations" />
				</datasource>
				<datasource name="portDataSource" status="OK">
					<table name="sysconfig" />
					<table name="categories" />
					<table name="localstrings" />
					<table name="pagemodels" />
					<table name="pages" />
					<table name="widgetcatalog" />
					<table name="guifragment" />
					<table name="widgetconfig" />
					<table name="uniquekeys" />
				</datasource>
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="jacms" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="OK">
					<table name="contentmodels" />
					<table name="contents" />
					<table name="resources" />
					<table name="resourcerelations" />
					<table name="contentrelations" />
					<table name="contentsearch" />
					<table name="contentattributeroles" />
					<table name="workcontentrelations" />
					<table name="workcontentsearch" />
					<table name="workcontentattributeroles" />
				</datasource>
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-misc-html5-essentials" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-widget-login_form" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-misc-less" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-admin-console" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="OK">
					<table name="authusershortcuts" />
					<table name="actionloglikerecords" />
					<table name="actionlogcommentrecords" />
				</datasource>
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-misc-jquery" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-misc-bootstrap" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-widget-language_choose" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-widget-search_form" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-content-generic" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-widget-navigation_bar" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-page-bootstrap-hero" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-portal-ui" date="2015-07-16 15:59:19" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="RESTORE" />
				<datasource name="portDataSource" status="RESTORE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="jpmyportalplus" date="2015-07-16 16:05:51" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="OK">
					<table name="jpmyportalplus_userpageconfig" />
					<table name="jpmyportalplus_modelconfig" />
				</datasource>
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="OK" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
		<component code="entando-page-myportalplus-basic" date="2015-07-17 10:16:18" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="OK" />
			</data>
			<postProcess status="OK" />
		</component>
		<component code="entando-misc-jquery-ui" date="2015-07-17 10:16:18" status="OK">
			<schema status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</schema>
			<data status="OK">
				<datasource name="servDataSource" status="NOT_AVAILABLE" />
				<datasource name="portDataSource" status="NOT_AVAILABLE" />
			</data>
			<postProcess status="NOT_AVAILABLE" />
		</component>
	</components>
</reports>

');
