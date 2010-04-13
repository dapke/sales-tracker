<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>

        TASKS!!!!!
        <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction">
            <s:hidden name="client" value="${actionBean.client}"/>


            <table>
                <tr>
                    <td><fmt:message key="label.summary"/> : </td>
                    <td><s:text name="task.summary"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.description"/> : </td>
                    <td><s:text name="task.description"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.status"/> : </td>
                    <td><s:text name="task.status"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.assignedTo"/> : </td>
                    <td><s:text name="task.assignedTo"/></td>
                </tr>
                <tr>
                    <td>
                        <s:submit name="saveTask" value="save Task"/>
                    </td>
                </tr>
            </table>

        </s:form>
        <p>
            I'll put some more info here about the client, probably market research info. Hopefully
            I'll be able to integrate google maps and have a map showing the location by using the postcode
        </p>

    </stripes:layout-component>
</stripes:layout-render>


