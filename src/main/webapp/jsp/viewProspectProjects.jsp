<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewProspectAction" >
                <s:hidden name="prospectId" />
                <jsp:include page="/jsp/common/menuProspect.jsp"/>
            </s:form>
        </p>

       Projects here

       <p>
           I'll put a list of the projects here so we can see a heads-up on whats going on.

       </p>

       <p>
           I'll also use this page for work with existing customers. Say for example you've won a client
           years ago, and they want to do a big upgrade project, you can log it here so it adds onto your
           sales-tracker activity scores/income projections
       </p>

</stripes:layout-component>
</stripes:layout-render>


