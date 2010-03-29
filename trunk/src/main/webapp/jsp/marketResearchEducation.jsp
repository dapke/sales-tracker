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
                    <td><fmt:message key="label.numberOfStudents"/> : </td>
                    <td><s:text name ="client.marketResearch.numberOfStudents"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.numberOfCampuses"/> : </td>
                    <td><s:text name ="client.marketResearch.numberOfCampuses"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.numberOfCoursesOffered"/> : </td>
                    <td><s:text name ="client.marketResearch.numberOfCoursesOffered"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.dms"/> : </td>
                    <td><s:text name ="client.marketResearch.currentDMS"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.studentRegistrySystem"/> : </td>
                    <td><s:text name ="client.marketResearch.currentStudentRegistrySystem"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.accountsSystem"/> : </td>
                    <td><s:text name ="client.marketResearch.currentAccountsSystem"/></td>
                </tr>


            </table>

            <s:submit name="save" value="save"/>
        </s:form>

    </stripes:layout-component>
</stripes:layout-render>