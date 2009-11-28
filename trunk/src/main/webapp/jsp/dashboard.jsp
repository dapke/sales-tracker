<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>this is my dashboard page,I haven't actually wrote anything yet just testing </p>

        <table>
            <tr><th>Oppurtunity</th>
                <th>Sector</th>
                <th></th>
            </tr>
            <c:forEach var="prospect" items="${actionBean.prospects}">
                <tr>
                    <td>${prospect.name}</td>
                    <td>${prospect.sector}</td>
                    <td><stripes:link beanclass="com.jameselsey.salestracker.action.ViewProspectAction">
                             View
                            <stripes:param name="prospectId" value="${prospect.id}"/>
                        </stripes:link>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </stripes:layout-component>
</stripes:layout-render>


