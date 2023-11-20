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
     	<h2><h:outputText value="Restaurant Records"/></h2>		
     		</center>
 <h:dataTable value="#{restaurantDao.showRestaurantDao()}" var="r" border="5">

			<h:column>
				<f:facet name="header">
					<h:outputText value="RestaurantID" />
				</f:facet>
				<h:outputText value="#{r.restaurant_ID}" />
			</h:column>

			<h:column>
  	<f:facet name="header">
  		<h:outputText value="Restaurant Name"/>
  	</f:facet>
  	<h:outputText value="#{r.restaurant_Name}" />
  </h:column>
  
  <h:column>
  	<f:facet name="header">
  		<h:outputText value="Branch"/>
  	</f:facet>
  	<h:outputText value="#{r.branch}" />
  </h:column>
  
   <h:column>
  	<f:facet name="header">
  		<h:outputText value="City"/>
  	</f:facet>
  	<h:outputText value="#{r.city}" />
  </h:column>
  
   <h:column>
  	<f:facet name="header">
  		<h:outputText value="MobileNo"/>
  	</f:facet>
  	<h:outputText value="#{r.mobileNo}" />
  </h:column>
  
     <h:column>
  	<f:facet name="header">
  		<h:outputText value="Email"/>
  	</f:facet>
  	<h:outputText value="#{r.email}" />
  </h:column>
  
       <h:column>
  	<f:facet name="header">
  		<h:outputText value="Rating"/>
  	</f:facet>
  	<h:outputText value="#{r.rating}" />
  </h:column>
  
  <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Show Menu" />
                    	
                    </f:facet>
                    
                    <h:commandButton action="#{menuDao.showMenu(r.restaurant_ID)}" value="Show"/>
                    
                </h:column>
                           
  
  </h:dataTable>
     </h:form>
        

    </body>
</html>
</f:view>