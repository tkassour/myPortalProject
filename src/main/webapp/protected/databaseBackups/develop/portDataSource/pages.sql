INSERT INTO pages (code, parentcode, pos, modelcode, titles, groupcode, showinmenu, extraconfig) VALUES ('service', 'homepage', 5, 'service', '<?xml version="1.0" encoding="UTF-8"?>
<properties>
<property key="it">Pagine di Servizio</property>
<property key="en">Service</property>
</properties>', 'free', 0, NULL);
INSERT INTO pages (code, parentcode, pos, modelcode, titles, groupcode, showinmenu, extraconfig) VALUES ('login', 'service', 6, 'service', '<?xml version="1.0" encoding="UTF-8"?>
<properties>
<property key="it">Pagina di login</property>
<property key="en">Login</property>
</properties>', 'free', 1, NULL);
INSERT INTO pages (code, parentcode, pos, modelcode, titles, groupcode, showinmenu, extraconfig) VALUES ('notfound', 'service', 4, 'service', '<?xml version="1.0" encoding="UTF-8"?>
<properties>
<property key="en">Page not found</property>
<property key="it">Pagina non trovata</property>
</properties>

', 'free', 1, NULL);
INSERT INTO pages (code, parentcode, pos, modelcode, titles, groupcode, showinmenu, extraconfig) VALUES ('errorpage', 'service', 5, 'service', '<?xml version="1.0" encoding="UTF-8"?>
<properties>
<property key="en">Error page</property>
<property key="it">Pagina di errore</property>
</properties>

', 'free', 1, NULL);
INSERT INTO pages (code, parentcode, pos, modelcode, titles, groupcode, showinmenu, extraconfig) VALUES ('homepage', 'homepage', -1, 'entando-page-myportalplus-basic', '<?xml version="1.0" encoding="UTF-8"?>
<properties>
<property key="en">Home</property>
<property key="it">Home</property>
</properties>

', 'free', 1, '<?xml version="1.0" encoding="UTF-8"?>
<config>
  <useextratitles>true</useextratitles>
</config>

');
