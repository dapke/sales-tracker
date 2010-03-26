<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>
        <s:messages/>
        <p>

        <table>

            <tr>
                <td>currentDMS : </td>
                <td>${actionBean.client.marketResearch.currentDMS}</td>
            </tr>
            <tr>
                <td>currentRevenuesSystem : </td>
                <td>${actionBean.client.marketResearch.currentRevenuesSystem}</td>
            </tr>
            <tr>
                <td>currentBenefitsSystem : </td>
                <td>${actionBean.client.marketResearch.currentBenefitsSystem}</td>
            </tr>
            <tr>
                <td>currentPlanningSystem : </td>
                <td>${actionBean.client.marketResearch.currentPlanningSystem}</td>
            </tr>
            <tr>
                <td>currentLicensingSystem : </td>
                <td>${actionBean.client.marketResearch.currentLicensingSystem}</td>
            </tr>
            <tr>
                <td>currentParkingSystem : </td>
                <td>${actionBean.client.marketResearch.currentParkingSystem}</td>
            </tr>
            <tr>
                <td>currentHRSystem : </td>
                <td>${actionBean.client.marketResearch.currentHRSystem}</td>
            </tr>


        </table>



    </stripes:layout-component>
</stripes:layout-render>