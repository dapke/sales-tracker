<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/default.jsp">
    <stripes:layout-component name="menu">
        <p>
            <s:link beanclass="com.jameselsey.salestracker.action.DashboardAction">
                Dashboard
            </s:link> |
            <s:link beanclass="com.jameselsey.salestracker.action.CustomerSearchAction">
                Customer Search
            </s:link> |
            <s:link beanclass="com.jameselsey.salestracker.action.MarketResearchAction">
                Market Research
            </s:link> |
            <s:link beanclass="com.jameselsey.salestracker.action.ReportsAction">
                Reports
            </s:link>
        </p>
    </stripes:layout-component>
</stripes:layout-render>
