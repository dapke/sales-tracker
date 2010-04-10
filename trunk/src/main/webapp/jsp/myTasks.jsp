<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">
        <p>
            <jsp:include page="/jsp/common/menuDashboard.jsp"/>
        </p>

        <table>
            <tr><th>Summary</th>
                <th>Description</th>
                <th>Status</th>
                <th>Assigned To</th>
                <th></th>
            </tr>
            <c:forEach var="task" items="${actionBean.tasks}">
                <tr>
                    <td>${task.summary}</td>
                    <td>${task.description}</td>
                    <td>${task.status}</td>
                    <td>${task.assignedTo}</td>
                </tr>
            </c:forEach>
        </table>
    </stripes:layout-component>
</stripes:layout-render>


