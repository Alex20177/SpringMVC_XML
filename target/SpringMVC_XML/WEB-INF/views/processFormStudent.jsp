<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body>
		The student confirmed : ${student.firstName } ${student.lastName }
		<br><br>
		Country: ${student.country}
		<br><br>
		Language: ${student.language}
		<br><br>
		<ul>
			<c:forEach var="temp" items="${student.operatingSystem}">
				<li> ${temp} </li>
			</c:forEach>
		</ul>
	</body>
</html>