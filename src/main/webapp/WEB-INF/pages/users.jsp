<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <form method="POST" action="${pageContext.request.contextPath}/Users">
        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
            <a class="w-100 btn btn-primary btn-lg" href="${pageContext.request.contextPath}/AddUser">Add User</a>
            <button class="btn btn-danger" type="submit">Delete User</button>
        </c:if>
        <div class="container text-center">
            <c:forEach var="user" items="${users}">
                <div class="row">
                    <div class="col">
                        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
                            <input type="checkbox" name="car_ids" value="${user.id}" />
                        </c:if>
                    </div>
                    <div class="col">
                            ${user.username}
                    </div>
                    <div class="col">
                            ${user.email}
                    </div>
                    <div class="col">
                        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
                            <a class="btn btn-success" href="${pageContext.request.contextPath}/EditUser?id=${user.id}">Edit User</a>
                        </c:if>
                    </div>
                </div>
            </c:forEach>
        </div>
    </form>
</t:pageTemplate>