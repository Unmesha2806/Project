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
     	<h2><h:outputText value="Customer Records"/></h2>		
     		</center>
 <h:dataTable value="#{customerdao.showCustomerDao()}" var="c" border="5">
  
  <h:column>
  	<f:facet name="header">
  		<h:outputText value="CustomerID"/>
  	</f:facet>
  	<h:outputText value="#{c.customer_ID}"/>
  </h:column>
  
  <h:column>
  	<f:facet name="header">
  		<h:outputText value="CustomerName"/>
  	</f:facet>
  	<h:outputText value="#{c.customer_Name}" />
  </h:column>
  
  <h:column>
  	<f:facet name="header">
  		<h:outputText value="UserName"/>
  	</f:facet>
  	<h:outputText value="#{c.userName}" />
  </h:column>
  
   <h:column>
  	<f:facet name="header">
  		<h:outputText value="Password"/>
  	</f:facet>
  	<h:outputText value="#{c.password}" />
  </h:column>
  
   <h:column>
  	<f:facet name="header">
  		<h:outputText value="Email"/>
  	</f:facet>
  	<h:outputText value="#{c.email}" />
  </h:column>
  
     <h:column>
  	<f:facet name="header">
  		<h:outputText value="PhoneNo"/>
  	</f:facet>
  	<h:outputText value="#{c.phone_No}" />
  </h:column>
  
       
  
  </h:dataTable>
     </h:form>
        

    </body>
</html>
</f:view>