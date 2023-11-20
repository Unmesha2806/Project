<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>

	<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP Page</title>
		<link rel="stylesheet" href="style.css">
<style>
body {

				font-family: 'Arial', sans-serif;
				margin: 0;
				padding: 0;
				background-image: url(sign-up_image.png);
				background-repeat: no-repeat;
				background-size: cover;
				background-position: center; /* Center the background image */
				text-align: center; /* Center the content within the body */
			}

			.container {
				margin: 0 auto; /* Center the container horizontally */
				width: 50%; /* Adjust the width as needed */
				background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white background */
				padding: 20px;
				border-radius: 10px;
				box-shadow: 0 0 10px rgba(0, 0, 0, 0.3); /* Add a slight shadow */
			}

			/* Add your datepicker styles here */
			.datepicker {
				padding: 5px;
				border: 1px solid #ccc;
				border-radius: 3px;
				margin-bottom: 10px;
			}

		</style>
		<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
 
	$(document).ready(function() {
		$( ".datepicker" ).datepicker({
			dateFormat: 'yy-mm-dd',
			changeMonth: true,
			changeYear: true,
			yearRange: "1960:2037"
		});
	});
	</script>
	</head>
	<body>

		<h:form>
			<h2>Add Provider</h2>		
			<label>First Name</label>
			<h:inputText id="firstName" value="#{provider.firstName}" />
			<br />
			<br />
			 <h:message for="form:firstName"></h:message>

			<label>Last Name</label>
			<h:inputText id="lastName" value="#{provider.lastName}" />
			<span> <h:message for="form:lastName"/></span>
			<br />
			<br />
			

			<label>Date of Birth</label>
			<h:inputText id="dateOfBirth" value="#{provider.dateOfBirth}" styleClass="form-control datepicker">
			<f:convertDateTime pattern="yy-MM-dd" />
			</h:inputText>
			<br />
			<br />
			
			<label>Enrollment Date</label>
            <h:inputText id="enrollmentDate" value="#{provider.enrollmentDate}" styleClass="form-control datepicker">
            <f:convertDateTime pattern="yy-MM-dd" />
            </h:inputText>
            <br />
            <br />

			<label>Email</label>
			<h:inputText id="email" value="#{provider.email}" />
			<br />
			<br />
			 <h:message for="form:email"></h:message>

			<label>License Number</label>
			<h:inputText id="licenseNumber" value="#{provider.licenseNumber}" />
			<br />
			<br />

			<label>Qualification</label>
			<h:inputText id="qualification" value="#{provider.qualification}" />
			<br />
			<br />

			<label>User Name</label>
			<h:inputText id="userName" value="#{provider.userName}" />
			<br />
			<br />
			<h:message for="form:userName" /><br/>
			 
			 
			<label>Password</label>
			<h:inputText id="Password" value="#{provider.password}" />
			<br />
			<br />

			<label>Phone Number</label>
			<h:inputText id="phoneno" value="#{provider.phoneno}" />
			<br />
			<br />
			<h:message for="form:phoneno"></h:message>

			<label>Gender:</label>
			<h:selectOneMenu id="gender" value="#{provider.gender}">
				<f:selectItem itemLabel="Select Gender" />
				<f:selectItem itemLabel="MALE" itemValue="MALE" />
				<f:selectItem itemLabel="FEMALE" itemValue="FEMALE" />
			</h:selectOneMenu>

			<label>Specialty</label>
			<h:inputText id="speciality" value="#{provider.speciality}" />
			<br />
			<br />

			<label>Address</label>
			<h:inputText id="address" value="#{provider.address}" />
			<br />
			<br />
         
           <h:commandButton action="#{providerController.addProviderValid(provider)}" value="Provider Enroll" />
	       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	       <input type="reset" value="Reset">
			
		</h:form>
	</body>
	</html>
</f:view>










