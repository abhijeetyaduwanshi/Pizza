<%-- 
    Document   : customers
    Created on : Aug 1, 2018, 8:44:14 PM
    Author     : ayaduwanshi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/header.jspf" %>

<h1>I am customers.jsp</h1>

<ul>
    <c:forEach items="${requestScope.customers}" var="customer">
        <li>First name: <c:out value="${customer.firstName}"/> Last name: ${customer.lastName}</li>
    </c:forEach>
</ul>

<%@include file="/WEB-INF/footer.jspf" %>
