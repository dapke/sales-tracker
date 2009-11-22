<%@page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>





<stripes:layout-render name="/jsp/default.jsp">
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
