<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>

        <p>
            <d:table name="${actionBean.client.contacts}" id="contact" requestURI=""
                     defaultsort="1" >
                <d:column title="Last name" property="lastName"
                          sortable="true" />
                <d:column title="First name" property="firstName"
                          sortable="true" />
                <d:column title="Job Role" property="jobRole"
                          sortable="true" />
                <d:column title="Desk Phone" property="deskPhone"
                          sortable="true" />
                <d:column title="Mobile" property="mobilePhone"
                          sortable="true" />
                <d:column title="Email" property="emailAddress"
                          sortable="true" />
                <d:column title="Edit">
                    <s:link beanclass="com.jameselsey.salestracker.action.EditContactAction"
                            event="editContact">
                        Edit
                        <s:param name="contactId" value="${contact.id}"/>
                        <s:param name="clientId" value="${actionBean.client.id}"/>
                    </s:link>
                </d:column>

            </d:table>

        </p>

        <p>
            I'll have a list of contacts here, past and present, that way if you call Steve you could say
            "Hey you've taken over the project from Dave?"
        </p>



    </stripes:layout-component>
</stripes:layout-render>


