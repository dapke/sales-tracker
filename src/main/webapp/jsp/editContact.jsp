<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >

                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>
        ${actionBean.tempContact.firstName}
        <s:form beanclass="com.jameselsey.salestracker.action.EditContactAction">
            <s:hidden name="clientId" value="${actionBean.clientId}"/>
            <s:hidden name="contactId" value="${actionBean.contactId}"/>
            <s:hidden name="contact.id"/>
            <table>
                <tr>
                    <td>First Name : </td>
                    <td><s:text name="tempContact.firstName"/></td>
                </tr>
                <tr>
                    <td>Last Name : </td>
                    <td><s:text name="tempContact.lastName"/></td>
                </tr>
                <tr>
                    <td>
                        <s:submit name="save" value="saveUpdatedContact"/>
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


