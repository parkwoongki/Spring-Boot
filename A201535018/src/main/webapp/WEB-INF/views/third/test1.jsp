<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>�й�</th>
			<th>�̸�</th>
			<th>�̸���</th>
		</tr>
		<tr>
			<td>${ student.id }</td>
			<td>${ student.studentNumber}</td>
			<td>${ student.studentName }</td>
			<td>${ student.email }</td>
		</tr>
	</table>

</body>
</html>