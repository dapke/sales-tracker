<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>this is my dashboard page,I haven't actually wrote anything yet just testing </p>


            <c:forEach var="prospect" items="${actionBean.prospects}">
            <tr>
                <td>${prospect.name}</td>
            </tr>
            </c:forEach>


</stripes:layout-component>
</stripes:layout-render>


