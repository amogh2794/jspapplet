<%-- 
    Document   : appletjsp
    Created on : Jan 6, 2017, 11:34:51 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:plugin type="applet" code="hello.class" height="500" width="500">
            <jsp:fallback>
                <<p>unable to load the applet file</p>
            </jsp:fallback>
        </jsp:plugin>
    </body>
</html>
