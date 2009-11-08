<%@page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
    "http://www.w3.org/TR/html4/strict.dtd" >
<html>
    <head>
        <title>Hello, Stripes!</title>
    </head>
    <body>
        <h3>Hello, Stripes!</h3>
        <p>

            <b>
                <fmt:formatDate type="both" dateStyle="full"
                                value="${actionBean.date}" />
            </b>
                                <c:out value="${actionBean.date}" />
        </p>
        <p>
    <s:link beanclass="com.jameselsey.salestracker.action.HelloWorldAction"
            event="currentDate" >
        Show the current date and time
    </s:link> |
    <s:link beanclass="com.jameselsey.salestracker.action.HelloWorldAction"
            event="randomDate" >
        Show a random date and time
    </s:link>
</p>
</body>
</html>
