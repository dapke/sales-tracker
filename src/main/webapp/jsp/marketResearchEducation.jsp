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
                    <td>numberOfStudents : </td>
                    <td><s:text name ="client.marketResearch.numberOfStudents"/></td>
                </tr>
                <tr>
                    <td>numberOfCampuses : </td>
                    <td><s:text name ="client.marketResearch.numberOfCampuses"/></td>
                </tr>
                <tr>
                    <td>numberOfCoursesOffered : </td>
                    <td><s:text name ="client.marketResearch.numberOfCoursesOffered"/></td>
                </tr>
                <tr>
                    <td>currentDMS : </td>
                    <td><s:text name ="client.marketResearch.currentDMS"/></td>
                </tr>
                <tr>
                    <td>currentStudentRegistrySystem : </td>
                    <td><s:text name ="client.marketResearch.currentStudentRegistrySystem"/></td>
                </tr>
                <tr>
                    <td>currentAccountsSystem : </td>
                    <td><s:text name ="client.marketResearch.currentAccountsSystem"/></td>
                </tr>


            </table>

            <s:submit name="save" value="save"/>
        </s:form>

    </stripes:layout-component>
</stripes:layout-render>