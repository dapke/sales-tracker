<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewProspectAction" >
                <s:hidden name="prospectId" />
                <jsp:include page="/jsp/common/menuProspect.jsp"/>
            </s:form>
        </p>
        <p>

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
                            <td>County : </td>
                            <td>${actionBean.prospect.county}</td>
                        </tr>
                        <tr>
                            <td>Postcode : </td>
                            <td>${actionBean.prospect.postcode}</td>
                        </tr>
                        <tr>
                            <td>Main Phone Number : </td>
                            <td>${actionBean.prospect.mainPhoneNumber}</td>
                        </tr>

                    </table>


              
                    <p>
                        <d:table name="${actionBean.prospect.contacts}" id="contact" requestURI=""
                                 defaultsort="1" >
                            <d:column title="Last name" property="lastName"
                                      sortable="true" />
                            <d:column title="First name" property="firstName"
                                      sortable="true" />
                        </d:table>
                    </p>

                    <p>
                        List of projects on the boards, quick overview of important details/scoring
                    </p>

                    <p>
                        Quick overview of recent contacts, so when you view the prospect you can see straight
                        away the most recent conversations etc
                    </p>
    </stripes:layout-component>
</stripes:layout-render>


