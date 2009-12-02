<%@include file="/jsp/common/taglibs.jsp" %>

<p>
    <s:link beanclass="com.jameselsey.salestracker.action.ViewProspectAction"
            event="quickView" class="navLink">
        Quick View
        <stripes:param name="prospectId" value="${actionBean.prospect.id}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewProspectAction"
            event="viewProspectInfo" class="navLink">
        Prospect
        <stripes:param name="prospectId" value="${actionBean.prospect.id}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewProspectAction"
            event="viewProspectContacts" class="navLink">
        Contacts
        <stripes:param name="prospectId" value="${actionBean.prospect.id}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewProspectAction"
            event="viewProspectMarketResearch" class="navLink">
        Market Research
        <stripes:param name="prospectId" value="${actionBean.prospect.id}"/>
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.ViewProspectAction"
            event="viewProspectProjects" class="navLink">
        Projects
        <stripes:param name="prospectId" value="${actionBean.prospect.id}"/>
    </s:link>
</p>
