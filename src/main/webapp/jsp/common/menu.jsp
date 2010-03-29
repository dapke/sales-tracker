<%@include file="/jsp/common/taglibs.jsp" %>

<p>
    <s:link beanclass="com.jameselsey.salestracker.action.DashboardAction" class="navLink">
        <fmt:message key="mainMenu.dashboard"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ClientSearchAction" class="navLink">
        <fmt:message key="mainMenu.clientSearch"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.MarketResearchAction" class="navLink">
        <fmt:message key="mainMenu.marketResearch"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ReportsAction" class="navLink">
        <fmt:message key="mainMenu.reports"/>
    </s:link>
</p>

