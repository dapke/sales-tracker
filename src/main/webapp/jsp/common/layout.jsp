<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-definition>
    <html>
        <head>
            <title>Sales Tracker</title>

        </head>
        <body>

            <stripes:layout-component name="header">
                <jsp:include page="/jsp/common/header.jsp"/>
            </stripes:layout-component>

                <jsp:include page="/jsp/common/menu.jsp"/>


            <div class="pageContent">
                <stripes:layout-component name="contents"/>
            </div>

            <stripes:layout-component name="footer">
                <jsp:include page="/jsp/common/footer.jsp"/>
            </stripes:layout-component>
        </body>
    </html>
</stripes:layout-definition>
