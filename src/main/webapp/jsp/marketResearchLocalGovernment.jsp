<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>
        <s:messages/>
        <p>

            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction">
                <s:hidden name="client" value="${actionBean.client}"/>
            <table>

                <tr>
                    <td><fmt:message key="label.dms"/> : </td>
                    <td><s:text name = "client.marketResearch.currentDMS" /></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.revenuesSystem"/> : </td>
                    <td><s:text name = "client.marketResearch.currentRevenuesSystem" /></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.benefitsSystem"/> : </td>
                    <td><s:text name = "client.marketResearch.currentBenefitsSystem"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.planningSystem"/> : </td>
                    <td><s:text name = "client.marketResearch.currentPlanningSystem"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.licensingSystem"/> : </td>
                    <td><s:text name = "client.marketResearch.currentLicensingSystem"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.parkingSystem"/> : </td>
                    <td><s:text name = "client.marketResearch.currentParkingSystem"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.hrSystem"/> : </td>
                    <td><s:text name = "client.marketResearch.currentHRSystem"/></td>
                </tr>


            </table>
                    <s:submit name="save" value="save"/>
        </s:form>

    </stripes:layout-component>
</stripes:layout-render>