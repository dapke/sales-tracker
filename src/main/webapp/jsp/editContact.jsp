<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >
                <s:hidden name="clientId" />
                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>

        <s:form beanclass="com.jameselsey.salestracker.action.EditContactAction">
            <s:hidden name="clientBeforeChanges" value="${actionBean.clientBeforeChanges}"/>
            <s:hidden name="clientId" value="${actionBean.clientId}"/>
            <s:hidden name="client.id"/>
            <s:hidden name="contact"/>

            <table>
                <tr>
                    <td>First Name : </td>
                    <td><s:text name="contact.firstName"/></td>
                </tr>
                <tr>
                    <td>Last Name : </td>
                    <td><s:text name="contact.contact"/></td>
                </tr>
                <tr>
                    <td>
                        <s:submit name="save" value="save"/>
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


