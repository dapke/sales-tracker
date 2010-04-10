<%@include file="/jsp/common/taglibs.jsp" %>

<p>
    <s:link beanclass="com.jameselsey.salestracker.action.DashboardAction" class="navLink">
        <fmt:message key="dashboardMenu.dashboard"/>
        <%--<stripes:param name="client" value="${actionBean.client}"/>--%>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.DashboardAction"
            event="showMyTasks" class="navLink">
        <fmt:message key="dashboardMenu.myTasks"/>
        <%--<stripes:param name="client" value="${actionBean.client}"/>--%>
    </s:link> 
</p>
