<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>

        <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction">
            <s:hidden name="client" value="${actionBean.client}"/>


            <table>
                <tr>
                    <td><fmt:message key="label.name"/> : </td>
                    <td><s:text name="client.name"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.sector"/> : </td>
                    <td><s:text name="client.sector"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.addressLine1"/> : </td>
                    <td><s:text name="client.addressLine1"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.addressLine2"/> : </td>
                    <td><s:text name="client.addressLine2"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.town"/> : </td>
                    <td><s:text name="client.town"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.county"/> : </td>
                    <td><s:text name="client.county"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.postcode"/> : </td>
                    <td><s:text name="client.postcode"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.country"/> : </td>
                    <td><s:text name="client.country"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.website"/> : </td>
                    <td><s:text name="client.websiteURL"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.mainPhoneNumber"/> : </td>
                    <td><s:text name="client.mainPhoneNumber"/></td>
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


