<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,com.rnd.CollegeFest.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Fest registration Portal</title>
</head>
<body>
	<h1 style="color: #5e9ca0;">College Fest Registrtion Portal</h1>
	<h2 style="color: #2e6c80;">List of all the students Registered</h2>
	<hr />
	<br />
	<div
		style="border: 1px solid red; background-color =blue; width: 85%; height: 100%; margin-left: 5%;">
		<a href="./SaveStudent">Add New Student</a>
		<br/>
		<ht/>
            <a href='./logout'>Logout</a>
		<br/>
		<ht/>
		<%
		List<Student> StudentsList = (List<Student>) request.getAttribute("Students");
		%>
		<table
			style="width: 100%; border-collapse: collapse; border-style: solid; border-color: red; background-color: yellow;"
			border="1">
			<tbody>
				<tr>
					<th style="width: 25%;">Student Id</th>
					<th style="width: 25%;">Name</th>
					<th style="width: 25%;">Department</th>
					<th style="width: 25%;">Country</th>
					<th style="width: 25%;">Update</th>
					<th style="width: 25%;">Delete</th>
				</tr>
				<%
				for (Student student : StudentsList) {
					out.println("<tr><td style='width: 25%;'>" + student.getId() + "</td>" + "<td style='width: 25%;'>"
					+ student.getName() + "</td>" + "<td style='width: 25%;'>" + student.getDepartment() + "</td>"
					+ "<td style='width: 25%;'>" + student.getCountry() + "</td>"
					+ "<td style='width: 25%;'><a href='./OneStudent?id=" + student.getId() + "'>Update</a></td>"
					+ "<td style='width: 25%;'><a href='./DeleteStudent?id=" + student.getId() + "'>Delete</a></td>" + "</tr>");
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>