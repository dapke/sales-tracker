<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">

        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewProspectAction" >
                <s:hidden name="prospectId" />
                <jsp:include page="/jsp/common/menuProspect.jsp"/>
            </s:form>
        </p>

       Contacts here

       <p>
           I'll have a list of contacts here, past and present, that way if you call Steve you could say
           "Hey you've taken over the project from Dave?"
       </p>



</stripes:layout-component>
</stripes:layout-render>


