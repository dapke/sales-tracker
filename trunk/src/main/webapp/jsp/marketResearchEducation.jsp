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
                <td>numberOfStudents : </td>
                <td>${actionBean.client.marketResearch.numberOfStudents}</td>
            </tr>
            <tr>
                <td>numberOfCampuses : </td>
                <td>${actionBean.client.marketResearch.numberOfCampuses}</td>
            </tr>
            <tr>
                <td>numberOfCoursesOffered : </td>
                <td>${actionBean.client.marketResearch.numberOfCoursesOffered}</td>
            </tr>
            <tr>
                <td>currentDMS : </td>
                <td>${actionBean.client.marketResearch.currentDMS}</td>
            </tr>
            <tr>
                <td>currentStudentRegistrySystem : </td>
                <td>${actionBean.client.marketResearch.currentStudentRegistrySystem}</td>
            </tr>
            <tr>
                <td>currentAccountsSystem : </td>
                <td>${actionBean.client.marketResearch.currentAccountsSystem}</td>
            </tr>


        </table>



    </stripes:layout-component>
</stripes:layout-render>