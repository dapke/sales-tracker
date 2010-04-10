<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">
        <p>
            <jsp:include page="/jsp/common/menuDashboard.jsp"/>
        </p>

        <table>
            <tr><th><fmt:message key="label.summary"/></th>
                <th><fmt:message key="label.status"/></th>
                <th><fmt:message key="label.assignedTo"/></th>
                <th><fmt:message key="label.client"/></th>
                <th></th>
            </tr>
            <c:forEach var="task" items="${actionBean.tasks}">
                <tr>
                    <td>${task.summary}</td>
                    <td>${task.status}</td>
                    <td>${task.assignedTo}</td>
                    <td>${task.client.name}</td>
                </tr>
            </c:forEach>
        </table>
    </stripes:layout-component>
</stripes:layout-render>


