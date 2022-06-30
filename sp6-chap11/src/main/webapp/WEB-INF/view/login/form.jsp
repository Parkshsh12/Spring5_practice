<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="login">
		<p>
			<label for="loginType">로그인 타입</label>
			<form:select path="loginType">
				<option value="">--- 선택하세요 ---</option>
				<form:options items="${loginTypes }" itemLabel="loginType" itemValue="일반회원"/>
			</form:select>
		</p>
	</form:form>
</body>
</html>