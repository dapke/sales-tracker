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
                    <td>currentDMS : </td>
                    <td><s:text name = "client.marketResearch.currentDMS" /></td>
                </tr>
                <tr>
                    <td>currentRevenuesSystem : </td>
                    <td><s:text name = "client.marketResearch.currentRevenuesSystem" /></td>
                </tr>
                <tr>
                    <td>currentBenefitsSystem : </td>
                    <td><s:text name = "client.marketResearch.currentBenefitsSystem"/></td>
                </tr>
                <tr>
                    <td>currentPlanningSystem : </td>
                    <td><s:text name = "client.marketResearch.currentPlanningSystem"/></td>
                </tr>
                <tr>
                    <td>currentLicensingSystem : </td>
                    <td><s:text name = "client.marketResearch.currentLicensingSystem"/></td>
                </tr>
                <tr>
                    <td>currentParkingSystem : </td>
                    <td><s:text name = "client.marketResearch.currentParkingSystem"/></td>
                </tr>
                <tr>
                    <td>currentHRSystem : </td>
                    <td><s:text name = "client.marketResearch.currentHRSystem"/></td>
                </tr>


            </table>
                    <s:submit name="save" value="save"/>
        </s:form>

    </stripes:layout-component>
</stripes:layout-render>