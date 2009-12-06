<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >
                <s:hidden name="clientId" />
                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>
        <p>

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
                            <td>County : </td>
                            <td>${actionBean.client.county}</td>
                        </tr>
                        <tr>
                            <td>Postcode : </td>
                            <td>${actionBean.client.postcode}</td>
                        </tr>
                        <tr>
                            <td>Main Phone Number : </td>
                            <td>${actionBean.client.mainPhoneNumber}</td>
                        </tr>

                    </table>


              
                    <p>
                        <d:table name="${actionBean.client.contacts}" id="contact" requestURI=""
                                 defaultsort="1" >
                            <d:column title="Last name" property="lastName"
                                      sortable="true" />
                            <d:column title="First name" property="firstName"
                                      sortable="true" />
                        </d:table>
                    </p>
                    <p>
                        <d:table name="${actionBean.client.projects}" id="project" requestURI=""
                                 defaultsort="1" >
                            <d:column title="Project Type" property="type"
                                      sortable="true" />
                            <d:column title="Project Value" property="projectValue"
                                      sortable="true" />
                        </d:table>
                    </p>

                    <p>
                        List of projects on the boards, quick overview of important details/scoring
                    </p>

                    <p>
                        Quick overview of recent contacts, so when you view the client you can see straight
                        away the most recent conversations etc
                    </p>
    </stripes:layout-component>
</stripes:layout-render>


