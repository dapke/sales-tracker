<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-definition>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
            <link rel="stylesheet" type="text/css" href="jsp/css/salestracker.css" />
            <title>Sales Tracker</title>
        </head>
        <body>

            <div id="siteWrap">
                <div id="header">
                    <!-- Logo Begins -->
                    <stripes:layout-component name="header">
                        <jsp:include page="/jsp/common/header.jsp"/>
                    </stripes:layout-component>
                    <!-- Logo Ends -->
                </div>
                <div id="navBar">
                    <!-- Navigation Begins -->
                    <stripes:layout-component name="menu">
                        <jsp:include page="/jsp/common/menu.jsp"/>
                    </stripes:layout-component>
                    <!-- Navigation Ends -->
                </div>
                <div id="content">
                    <!-- Content Begins -->
                    <p>
                        <stripes:layout-component name="contents"/>
                    </p>
                    <!-- Content Ends -->
                </div>
                <div id="footer">
                    <!-- Footer Text Begins -->
                    <stripes:layout-component name="footer">
                        <jsp:include page="/jsp/common/footer.jsp"/>
                    </stripes:layout-component>
                    <!-- Footer Text Ends -->
                </div>
            </div>
        </body>
    </html>
</stripes:layout-definition>