<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <table>
            <tr>
                <td>Name : </td>
                <td>${actionBean.prospect.name}</td>
            </tr>
            <tr>
                <td>Sector : </td>
                <td>${actionBean.prospect.sector}</td>
            </tr>
            <tr>
                <td>Address Line 1 : </td>
                <td>${actionBean.prospect.address1}</td>
            </tr>
            <tr>
                <td>Address Line 2 : </td>
                <td>${actionBean.prospect.address2}</td>
            </tr>
            <tr>
                <td>Town : </td>
                <td>${actionBean.prospect.town}</td>
            </tr>
            <tr>
                <td>County : </td>
                <td>${actionBean.prospect.county}</td>
            </tr>
            <tr>
                <td>Postcode : </td>
                <td>${actionBean.prospect.postcode}</td>
            </tr>
            <tr>
                <td>Country : </td>
                <td>${actionBean.prospect.country}</td>
            </tr>
            <tr>
                <td>Website : </td>
                <td>${actionBean.prospect.websiteURL}</td>
            </tr>
            <tr>
                <td>Main Phone Number : </td>
                <td>${actionBean.prospect.mainPhoneNumber}</td>
            </tr>

        </table>

    </stripes:layout-component>
</stripes:layout-render>


