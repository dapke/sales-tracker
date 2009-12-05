<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >
                <s:hidden name="clientId" />
                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>

        <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction">
        <table>
            <tr>
                <td>Name : </td>
                <td><s:text name="client.name"/></td>
            </tr>
            <tr>
                <td>Sector : </td>
                <td><s:text name="client.sector"/></td>
            </tr>
            <tr>
                <td>Address Line 1 : </td>
                <td><s:text name="client.address1"/></td>
            </tr>
            <tr>
                <td>Address Line 2 : </td>
                <td><s:text name="client.address2"/></td>
            </tr>
            <tr>
                <td>Town : </td>
                <td><s:text name="client.town"/></td>
            </tr>
            <tr>
                <td>County : </td>
                <td><s:text name="client.county"/></td>
            </tr>
            <tr>
                <td>Postcode : </td>
                <td><s:text name="client.postcode"/></td>
            </tr>
            <tr>
                <td>Country : </td>
                <td><s:text name="client.country"/></td>
            </tr>
            <tr>
                <td>Website : </td>
                <td><s:text name="client.websiteURL"/></td>
            </tr>
            <tr>
                <td>Main Phone Number : </td>
                <td><s:text name="client.mainPhoneNumber"/></td>
            </tr>
            <tr>
                <td>
                    <s:submit name="save" value="save"/>
                </td>
            </tr>
        </table>
            <s:hidden name="clientId" />
        </s:form>
            <p>
                I'll put some more info here about the client, probably market research info. Hopefully
                I'll be able to integrate google maps and have a map showing the location by using the postcode
            </p>

</stripes:layout-component>
</stripes:layout-render>


