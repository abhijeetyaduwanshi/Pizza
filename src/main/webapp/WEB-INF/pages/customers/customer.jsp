<%-- 
    Document   : customer
    Created on : Aug 21, 2018, 11:24:01 AM
    Author     : ayaduwanshi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/header.jspf" %>

<h1>I am customer.jsp</h1>

<c:if test="${not empty requestScope.customer}">
    <h2>${requestScope.customer.firstName} ${requestScope.customer.lastName}</h2>
</c:if>

<%@include file="/WEB-INF/footer.jspf" %>
