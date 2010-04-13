<%@include file="/jsp/common/taglibs.jsp" %>

<p>
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="quickView" class="navLink">
        <fmt:message key="clientMenu.quickView"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientInfo" class="navLink">
        <fmt:message key="clientMenu.client"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.EditContactAction"
             class="navLink">
        <fmt:message key="clientMenu.contacts"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientMarketResearch" class="navLink">
        <fmt:message key="clientMenu.marketResearch"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
              event="viewClientProjects" class="navLink">
        <fmt:message key="clientMenu.projects"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
              event="raiseTask" class="navLink">
        <fmt:message key="clientMenu.tasks"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link>
</p>
