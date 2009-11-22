<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-definition>
    <html>
        <head>
            <title>Layout Example</title>

            <%--<stripes:layout-component name="html_head"/>--%>
        </head>
        <body>
            <%--<stripes:layout-component name="header">
                <jsp:include page="/layout/_header.jsp"/>
            </stripes:layout-component>--%>

            <stripes:layout-component name="menu">
                <jsp:include page="/jsp/menu.jsp"/>
            </stripes:layout-component>


            <div class="pageContent">
                <stripes:layout-component name="contents"/>
            </div>

            <%--<stripes:layout-component name="footer">
                <jsp:include page="/layout/_footer.jsp"/>
            </stripes:layout-component>--%>
        </body>
    </html>
</stripes:layout-definition>

