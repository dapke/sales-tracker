<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >
                <s:hidden name="clientId" />
                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>

 <table>
            <tr>
                <td>Name : </td>
                <td>${actionBean.client.name}</td>
            </tr>
            <tr>
                <td>Sector : </td>
                <td>${actionBean.client.sector}</td>
            </tr>
            <tr>
                <td>Address Line 1 : </td>
                <td>${actionBean.client.address1}</td>
            </tr>
            <tr>
                <td>Address Line 2 : </td>
                <td>${actionBean.client.address2}</td>
            </tr>
            <tr>
                <td>Town : </td>
                <td>${actionBean.client.town}</td>
            </tr>
            <tr>
                <td>County : </td>
                <td>${actionBean.client.county}</td>
            </tr>
            <tr>
                <td>Postcode : </td>
                <td>${actionBean.client.postcode}</td>
            </tr>
            <tr>
                <td>Country : </td>
                <td>${actionBean.client.country}</td>
            </tr>
            <tr>
                <td>Website : </td>
                <td>${actionBean.client.websiteURL}</td>
            </tr>
            <tr>
                <td>Main Phone Number : </td>
                <td>${actionBean.client.mainPhoneNumber}</td>
            </tr>

        </table>

            <p>
                I'll put some more info here about the client, probably market research info. Hopefully
                I'll be able to integrate google maps and have a map showing the location by using the postcode
            </p>

</stripes:layout-component>
</stripes:layout-render>


