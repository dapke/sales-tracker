<%@page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-render name="/jsp/default.jsp">
    <stripes:layout-component name="contents">

        <p>this is my dashboard page,I haven't actually wrote anything yet just testing some shiz</p>

        <p>


            <c:forEach var="prospect" items="${actionBean.prospects}">
            <tr>
                <td>${prospect.name}</td>
            </tr>
        </c:forEach>

    </p>


</stripes:layout-component>
</stripes:layout-render>


