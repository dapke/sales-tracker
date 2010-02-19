<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <table>
            <tr><th>Oppurtunity</th>
                <th>Sector</th>
                <th>County</th>
                <th>Country</th>
                <th></th>
            </tr>
            <c:forEach var="client" items="${actionBean.clients}">
                <tr>
                    <td>${client.name}</td>
                    <td>${client.sector}</td>
                    <td>${client.county}</td>
                    <td>${client.country}</td>
                    <td><stripes:link beanclass="com.jameselsey.salestracker.action.ViewClientAction">
                             View
                            <stripes:param name="client" value="${client}"/>
                            
                        </stripes:link>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </stripes:layout-component>
</stripes:layout-render>


