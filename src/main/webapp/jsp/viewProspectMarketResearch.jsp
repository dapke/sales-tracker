<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewProspectAction" >
                <s:hidden name="prospectId" />
                <jsp:include page="/jsp/common/menuProspect.jsp"/>
            </s:form>
        </p>

        Market Research

        <p>
            ${actionBean.prospect.marketResearch.currentDMS}<br>
            ${actionBean.prospect.marketResearch.currentCRM}
        </p>
        <p>
            Some info here about market research, gathering some information for that client so you
            can best position your product and offer them the highest services
        </p>

    </stripes:layout-component>
</stripes:layout-render>


