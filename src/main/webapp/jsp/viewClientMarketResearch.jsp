<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>



        <c:if test="${!empty actionBean.client.marketResearch.marketResearchHousing}">
            <h2>Market Research - <i>Housing</i></h2>
            <p>Systems</p>
            <p>
            <table>
                <tr>
                    <td>Current DMS</td>
                    <td>${actionBean.client.marketResearch.marketResearchHousing.currentDMS}</td>
                </tr>
                <tr>
                    <td>Current CRM</td>                
                    <td>${actionBean.client.marketResearch.marketResearchHousing.currentCRM}</td>
                </tr>
            </table>
        </p>

        <p>Client Info</p>

        <p>
        <table>
            <tr>
                <td>Social Housing Stock</td>
                <td>${actionBean.client.marketResearch.marketResearchHousing.socialHousingStock}</td>
            </tr>
            <tr>
                <td>Number of Tenants</td>
                <td>${actionBean.client.marketResearch.marketResearchHousing.numberOfTenants}</td>
            </tr>
            <tr>
                <td>Star Rating</td>
                <td>${actionBean.client.marketResearch.marketResearchHousing.starRating}</td>
            </tr>
        </table>
    </p>
</c:if>
<c:if test="${!empty actionBean.client.marketResearch.marketResearchEducation}">
    <h2>Market Research - <i>Education</i></h2>
    <p>Systems</p>
    <p>
    <table>
        <tr>
            <td>Current DMS</td>
            <td>${actionBean.client.marketResearch.marketResearchEducation.currentDMS}</td>
        </tr>
        <tr>
            <td>Current Student Registry System</td>
            <td>${actionBean.client.marketResearch.marketResearchEducation.currentStudentRegistrySystem}</td>
        </tr>
    </table>
</p>
<p>Client Info</p>
<p>
<table>
    <tr>
        <td>Number of Students</td>
        <td>${actionBean.client.marketResearch.marketResearchEducation.numberOfStudents}</td>
    </tr>
    <tr>
        <td>Number of Campuses</td>
        <td>${actionBean.client.marketResearch.marketResearchEducation.numberOfCampuses}</td>
    </tr>
    <tr>
        <td>Courses Offered</td>
        <td>${actionBean.client.marketResearch.marketResearchEducation.numberOfCoursesOffered}</td>
    </tr>
</table>
</p>
</c:if>
<c:if test="${!empty actionBean.client.marketResearch.marketResearchLocalGovernment}">
    <h2>Market Research - <i>Local Government</i></h2>
    <p>Systems</p>
    <p>
    <table>
        <tr>
            <td>Current DMS</td>
            <td>${actionBean.client.marketResearch.marketResearchLocalGovernment.currentDMS}</td>
        </tr>
    </table>
</p>
</c:if>


</stripes:layout-component>
</stripes:layout-render>


