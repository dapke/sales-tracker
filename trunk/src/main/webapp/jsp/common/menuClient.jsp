<%@include file="/jsp/common/taglibs.jsp" %>

<p>
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="quickView" class="navLink">
        Quick View
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientAction"
            event="viewClientInfo" class="navLink">
        Client
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.EditContactAction"
             class="navLink">
        Contacts
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.MarketResearchAction"
            event="viewClientMarketResearch" class="navLink">
        Market Research
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewClientProjectAction"
              class="navLink">
        Projects
        <stripes:param name="client" value="${actionBean.client}"/>
    </s:link>
</p>
