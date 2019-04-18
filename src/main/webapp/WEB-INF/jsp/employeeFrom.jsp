<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>
<h2>Employee Details</h2>
<form method="post" action="saveDetails">
        
    <table style="with: 50%">
				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="employeeName" /></td>
				</tr>
				<tr>
					<td>employeeEmail</td>
					<td><input type="text" name="employeeEmail" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
								<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				</tr></table>
    <input type="submit" value="Submit">
</form>
</body>
</html>
