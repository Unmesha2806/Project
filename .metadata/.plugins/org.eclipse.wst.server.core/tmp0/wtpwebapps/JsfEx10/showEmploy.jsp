<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

 

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

 

<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h:form>
<center>
<h2><h:outputText value="Employ Records"/></h2>
</center>
<center>
<h:dataTable value="#{employController.showEmploy()}" var="e" border="5">
<h:column>
<f:facet name="header">
<h:outputText value="Empno" />
</f:facet>
<h:outputText value="#{e.empno}"/>
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="Name" />
</f:facet>
<h:outputText value="#{e.name}"/>
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="Gender" />
</f:facet>
<h:outputText value="#{e.gender}"/>
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="Dept" />
</f:facet>
<h:outputText value="#{e.dept}"/>
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="Desig" />
</f:facet>
<h:outputText value="#{e.desig}"/>
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="Basic" />
</f:facet>
<h:outputText value="#{e.basic}"/>
</h:column>
<h:column>
<f:facet name="header">
<h:outputText value="Search Employ" />
</f:facet>
<h:commandButton action = "#{employController.searchEmploy(e.empno)}"
                        value = "Search Employ"/>
</h:column>
</h:dataTable>
</h:form>
</center>
</body>
</html>
</f:view>