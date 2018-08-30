<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/header.jspf" %>

<h1>There has been an issue.</h1>
<h2>Your status code is ${pageContext.errorData.statusCode}</h2>

<c:if test="${not empty requestScope.messages}">
    <h2>Messages passed back from the controller layer in request scope: </h2>
    <ul>
        <c:forEach items="${requestScope.messages}" var="message" >
            <li>
                <strong><c:out value="${message.key}" />: ${message.value}</strong>
            </li>
        </c:forEach>
    </ul>
</c:if>

<p>We have dispatched a team of highly trained monkeys to investigate the problem. Yes I actually read that on YouTube!</p>

<c:choose>
    <c:when test="${pageContext.errorData.statusCode eq 404}">
        <p>Sorry, we can not find the page you are looking for. Please check the sitemap for:</p>
        <p>${pageContext.request.requestURL}</p>
    </c:when>
    <c:otherwise>
        <c:if test="${not empty pageContext.exception}">
            <p>${pageContext.exception}</p>
            ${pageContext.exception.stackTrace}
        </c:if>
    </c:otherwise>
</c:choose>

<%@include file="/WEB-INF/footer.jspf" %>
    