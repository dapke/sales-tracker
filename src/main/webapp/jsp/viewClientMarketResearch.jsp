<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >
                <s:hidden name="clientId" />
                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>

        Market Research

        <p>
            ${actionBean.client.marketResearch.currentDMS}<br>
            ${actionBean.client.marketResearch.currentCRM}
        </p>
        <p>
            Some info here about market research, gathering some information for that client so you
            can best position your product and offer them the highest services
        </p>

    </stripes:layout-component>
</stripes:layout-render>


