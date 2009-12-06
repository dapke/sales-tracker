<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction" >
                <s:hidden name="clientId" />
                <jsp:include page="/jsp/common/menuClient.jsp"/>
            </s:form>
        </p>

        Projects here

        <p>
            <d:table name="${actionBean.client.projects}" id="contact" requestURI=""
                     defaultsort="1" >
                <d:column title="Project Type" property="type"
                          sortable="true" />
                <d:column title="Project Value" property="projectValue"
                          sortable="true" />
            </d:table>
        </p>

        <p>
            I'll also use this page for work with existing customers. Say for example you've won a client
            years ago, and they want to do a big upgrade project, you can log it here so it adds onto your
            sales-tracker activity scores/income projections
        </p>

    </stripes:layout-component>
</stripes:layout-render>


