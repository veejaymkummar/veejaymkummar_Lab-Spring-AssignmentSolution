<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		<span style="color: #ff0000;">Enter Student Details</span>
	</p>
	<hr />
	<form action="./StudSave" method="post">
		<table
			style="width: 100%; border-collapse: collapse; border-color: black; background-color: blue; height: 72px;"
			border="1">
			<tbody>
				<tr style="height: 18px;">
					<td style="width: 21.9608%; height: 18px;"><span
						style="color: #ffffff;">Name</span></td>
					<td style="width: 77.8431%; height: 18px;"><input type="text"
						name="name" value="${student.name}" placeholder="Name" /></td>
				</tr>
				<tr style="height: 18px;">
					<td style="width: 21.9608%; height: 18px;"><span
						style="color: #ffffff;">Department</span></td>
					<td style="width: 77.8431%; height: 18px;"><input type="text"
						name="department" value="${student.department}"
						placeholder="Department" /></td>
				</tr>
				<tr style="height: 18px;">
					<td style="width: 21.9608%; height: 18px;"><span
						style="color: #ffffff;">Country</span></td>
					<td style="width: 77.8431%; height: 18px;"><input type="text"
						name="country" value="${student.country}" placeholder="Country" /></td>
				</tr>
				<tr style="height: 18px;">
					<td style="width: 21.9608%; height: 18px;"><input
						type="submit" name="s" value="Register Student" /></td>
					<td style="width: 77.8431%; height: 18px;">&nbsp;</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>