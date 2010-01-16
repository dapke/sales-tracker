<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>
        <s:messages/>
        <p>

        <table>

            <tr>
                <td>socialHousingStock : </td>
                <td>${actionBean.client.marketResearch.socialHousingStock}</td>
            </tr>
            <tr>
                <td>numberOfTenants : </td>
                <td>${actionBean.client.marketResearch.numberOfTenants}</td>
            </tr>
            <tr>
                <td>starRating : </td>
                <td>${actionBean.client.marketResearch.starRating}</td>
            </tr>
            <tr>
                <td>currentDMS : </td>
                <td>${actionBean.client.marketResearch.currentDMS}</td>
            </tr>
            <tr>
                <td>currentCRM : </td>
                <td>${actionBean.client.marketResearch.currentCRM}</td>
            </tr>

        </table>



    </stripes:layout-component>
</stripes:layout-render>