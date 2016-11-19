<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
    <head>
        <tiles:insertAttribute name="meta" />
    </head>
    <body>
        <div id="header" class="header">
            <tiles:insertAttribute name="header" />
        </div>
        <div id="body" class="body">
            <tiles:insertAttribute name="body" />
        </div>
        <div id="footer" class="footer">
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>