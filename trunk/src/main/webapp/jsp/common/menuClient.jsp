<%@include file="/jsp/common/taglibs.jsp" %>

<p>
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="quickView" class="navLink">
        Quick View
        <stripes:param name="clientId" value="${actionBean.client.id}"/>
        <stripes:param name="clientA" value="${actionBean.clientA}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientInfo" class="navLink">
        Client
        <stripes:param name="clientId" value="${actionBean.client.id}"/>
        <stripes:param name="clientA" value="${actionBean.clientA}"/>
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientContacts" class="navLink">
        Contacts
        <stripes:param name="clientId" value="${actionBean.client.id}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientMarketResearch" class="navLink">
        Market Research
        <stripes:param name="clientId" value="${actionBean.client.id}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientProjects" class="navLink">
        Projects
        <stripes:param name="clientId" value="${actionBean.client.id}"/>
    </s:link>
</p>
