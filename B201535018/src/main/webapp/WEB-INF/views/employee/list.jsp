<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="${R}common.js"></script>
  <link rel="stylesheet" href="${R}common.css">
  <style>
    a.btn { float: right; margin: -20px 0 5px 0; }
    td:nth-child(1), td:nth-child(5) { text-align: center; }
  </style>
</head>
<body>
<div class="container">
  <h1>직원목록</h1>
  <a href="create" class="btn">직원등록</a>
  <table class="list">
    <thead>
      <tr>
        <th>id</th>
        <th>직원번호</th>
        <th>이름</th>
        <th>부서</th>
        <th>월급</th>
        <th>성별</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="employee" items="${ employees }">
        <tr>
          <td>${ employee.id }</td>
          <td>${ employee.employeeNo }</td>
          <td>${ employee.name }</td>
          <td>${ employee.departmentName }</td>
          <td>${ employee.salary }</td>
          <td>${ employee.sex }</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
