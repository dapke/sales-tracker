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
                <td>currentDMS : </td>
                <td>${actionBean.client.marketResearch.currentDMS}</td>
            </tr>


        </table>



    </stripes:layout-component>
</stripes:layout-render>