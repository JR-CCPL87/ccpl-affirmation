<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
    <head>
        <tiles:insertAttribute name="meta" />
    </head>
    <body>
        <div id="body" class="body">
            <tiles:insertAttribute name="body" />
        </div>
        <div id="footer" class="footer">
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>