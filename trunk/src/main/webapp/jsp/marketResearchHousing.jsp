<%@include file="/jsp/common/taglibs.jsp" %>

<stripes:layout-render name="/jsp/common/layout.jsp">
    <stripes:layout-component name="contents">


        <p>
            <jsp:include page="/jsp/common/menuClient.jsp"/>
        </p>
        <s:messages/>
        <p>
            <s:form beanclass="com.jameselsey.salestracker.action.ViewClientAction">
                <s:hidden name="client" value="${actionBean.client}"/>
                Corporate Info
            <table>
                <tr>
                    <td>socialHousingStock : </td>
                    <td><s:text name ="client.marketResearch.socialHousingStock"/></td>
                </tr>
                <tr>
                    <td>numberOfTenants : </td>
                    <td><s:text name ="client.marketResearch.numberOfTenants"/></td>
                </tr>
                <tr>
                    <td>starRating : </td>
                    <td><s:text name ="client.marketResearch.starRating"/></td>
                </tr>
            </table>

            Systems
            <table>
                <tr>
                    <td>currentDMS : </td>
                    <td><s:text name ="client.marketResearch.currentDMS"/></td>
                </tr>
                <tr>
                    <td>currentCRM : </td>
                    <td><s:text name ="client.marketResearch.currentCRM"/></td>
                </tr>

            </table>

            Timescales and Procurements
            <table>
                <tr>
                    <td>CRM Procurement Date</td>
                    <td><s:text name ="client.marketResearch.crmProcurementDate"/></td>
                </tr>
                <tr>
                    <td>DMS Procurement Date</td>
                    <td><s:text name ="client.marketResearch.dmsProcurementDate"/></td>
                </tr>
            </table>

            <s:submit name="save" value="save"/>
        </s:form>
    </stripes:layout-component>
</stripes:layout-render>