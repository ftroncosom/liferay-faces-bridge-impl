<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>JSR 378 Single Request TCK Test</title>
	</head>
	<body>
	<h:form>
		<h:outputLink value="#{nonJSFView.url}">
			<h:outputText value="Run Test"/>
		</h:outputLink>
	</h:form>
	</body>
	</html>
</f:view>