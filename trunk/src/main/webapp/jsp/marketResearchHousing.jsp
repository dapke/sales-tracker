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
                <fmt:message key="label.corporateInfo"/>
            <table>
                <tr>
                    <td><fmt:message key="label.socialHousingStock"/> : </td>
                    <td><s:text name ="client.marketResearch.socialHousingStock"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.numberOfTenants"/> : </td>
                    <td><s:text name ="client.marketResearch.numberOfTenants"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.starRating"/> : </td>
                    <td><s:text name ="client.marketResearch.starRating"/></td>
                </tr>
            </table>

            <fmt:message key="label.systems"/>
            <table>
                <tr>
                    <td><fmt:message key="label.dms"/> : </td>
                    <td><s:text name ="client.marketResearch.currentDMS"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.crm"/> : </td>
                    <td><s:text name ="client.marketResearch.currentCRM"/></td>
                </tr>

            </table>

            <fmt:message key="label.timescalesAndProcurements"/>
            <table>
                <tr>
                    <td><fmt:message key="label.crmProcurementDate"/></td>
                    <td><s:text name ="client.marketResearch.crmProcurementDate"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="label.dmsProcurementDate"/></td>
                    <td><s:text name ="client.marketResearch.dmsProcurementDate"/></td>
                </tr>
            </table>

            <s:submit name="save" value="save"/>
        </s:form>
    </stripes:layout-component>
</stripes:layout-render>