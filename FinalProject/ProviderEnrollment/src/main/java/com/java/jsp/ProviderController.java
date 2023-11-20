package com.java.jsp;

import java.util.regex.Pattern;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;








public class ProviderController {

	
	

	private ProviderDAOImpl daoImpl;
	private Provider provider;

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public ProviderDAOImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(ProviderDAOImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	public String addProviderValid(Provider provider) {
		
		System.out.println(provider);
		System.out.println(daoImpl);
		System.out.println("addProviderValid is Hittingggggggggg");
		System.out.println("Provider  " +provider);
		System.out.println(addValid(provider));
		if (addValid(provider)) {
			return daoImpl.addProviderDao(provider);
		}
		return "";

	}

	

	public boolean addValid(Provider provider) {
		FacesContext context = FacesContext.getCurrentInstance();
		String firstName = "^[A-Za-z\\s]+$";
		String lastName = "^[A-Za-z\\s]+$";
		String userName = "^[^\\s]{8,10}$";
		String licenseNumber = "^[A-Z0-9]{8}$";
		String qualification = "^[A-Za-z0-9\\s]{1,100}$";
		String speciality = "^[A-Za-z0-9\\s]{1,100}$";
		String phoneno = "^(\\+91|91|0)?[6789]\\d{9}$";
		String email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String password = "^(?=.*[A-Z])(?=.*[a-z0-9])(?=.*[^a-zA-Z0-9]).{8,18}$";
//		String dateFormatRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";


		

		
		
//FIRSTNAME
		boolean flag=true;
	    System.out.println("FirstName Length is " +provider.getFirstName().length());
	    if (provider.getFirstName().length() <= 0) {
			 context.addMessage("form:firstName", new FacesMessage("FirstName Cannot be Empty..."));
			 System.out.println("FirstName Null Failed...");
			 flag = false;
				}
		
		
		if (!Pattern.matches(firstName, provider.getFirstName())) {
			context.addMessage("form:firstName", new FacesMessage("Invalid FirstName. Only letters are allowed."));
			System.out.println("FirstName Failed...");
			flag = false;
		}
		
//LASTNAME
		if(provider.getLastName().length() <= 0) {
		   context.addMessage("form:lastName", new FacesMessage("LastName Cannot Be Empty."));
		   System.out.println("LastName Failed...");
		   flag = false;
		}  
		
		
		if (!Pattern.matches(lastName, provider.getLastName())) {
			context.addMessage("form:lastName", new FacesMessage("Invalid LastName. Only letters are allowed."));
			System.out.println("LastName Failed...");
			flag = false;
		}
		
//USERNAME			
		
		if (!Pattern.matches(userName, provider.getUserName())) {
		    context.addMessage("form:userName", new FacesMessage("Provider Username Contains min 8 characters"));
			System.out.println("UserName Failed...");
			flag = false;
			
//PASSWORD
			
			if (provider.getPassword().length() <= 0) {
			    context.addMessage("form:Password", new FacesMessage("Password Cannot be Empty..."));
			    System.out.println("Password Null Failed...");
			    flag = false;
			} else if (!Pattern.matches(password, provider.getPassword())) {
			    context.addMessage("form:Password", new FacesMessage("Invalid Password format.Hint: @Abcde1234"));
			    System.out.println("Password failed.");
			    flag = false;
			}
		
//PHONENUMBER
		
		if (provider.getPhoneno().length() <= 0) {
		   context.addMessage("form:phoneno", new FacesMessage("Enter Your Phone Number."));
		   System.out.println("PhoneNo Failed...");
		   flag = false;
		}
		
		if (!Pattern.matches(phoneno, provider.getPhoneno())) {
			context.addMessage("form:phoneno", new FacesMessage("Invalid Phone Number."));
			System.out.println("PhoneNo Failed...");
			flag = false;
		}
		
//ADDRESS
				if (provider.getAddress().length() <= 0) {
					context.addMessage("form:address", new FacesMessage("Please Enter Your Address."));
					System.out.println("Enter Your Address");
					flag = false;
		}
				
				
//LicenseNumber				
				if (provider.getLicenseNumber() == null || provider.getLicenseNumber().isEmpty()) {
				    context.addMessage("form:licenseNumber", new FacesMessage("License Number Cannot Be Empty"));
				    System.out.println("License Number Failed...");
				    flag = false;
				} else if (!Pattern.matches(licenseNumber, provider.getLicenseNumber())) {
				    context.addMessage("form:licenseNumber", new FacesMessage("Invalid License Number. It should be 8 characters long and contain only uppercase letters and digits."));
				    System.out.println("License Number Failed...");
				    flag = false;
				    
				}
				
//Qualification				
				if (provider.getQualification() == null || provider.getQualification().isEmpty()) {
				    context.addMessage("form:qualification", new FacesMessage("Qualification Cannot Be Empty"));
				    System.out.println("Qualification Failed...");
				    flag = false;
				} else if (!Pattern.matches(qualification, provider.getQualification())) {
				    context.addMessage("form:qualification", new FacesMessage("Invalid Qualification. It should be 1 to 100 characters long and may contain letters, digits, and spaces."));
				    System.out.println("Qualification Failed...");
				    flag = false;
				
				}
				
//Specialty				
				if (provider.getSpeciality() == null || provider.getSpeciality().isEmpty()) {
				    context.addMessage("form:speciality", new FacesMessage("Speciality Cannot Be Empty"));
				    System.out.println("Speciality Failed...");
				    flag = false;
				} else if (!Pattern.matches(speciality, provider.getSpeciality())) {
				    context.addMessage("form:speciality", new FacesMessage("Invalid Speciality. It should be 1 to 100 characters long and may contain letters, digits, and spaces."));
				    System.out.println("Speciality Failed...");
				    flag = false;
				}

				
//GENDER
			    if (provider.getGender() == null || provider.getGender().isEmpty()) {
			        context.addMessage("form:gender", new FacesMessage("Select Gender."));
			        System.out.println("Select Gender Failed...");
			        flag = false;
		}

				
////DateOfBirth
			    if (provider.getDateOfBirth()==null || provider.getDateOfBirth().equals("")) {
			    	
		        context.addMessage("form:dob", new FacesMessage("DateOfBirth cannot be empty."));
			        System.out.println("Enter Your DateOfBirth");
			        flag = false;
			    }
			    
//EnrollmentDate
			    if (provider.getEnrollmentDate()==null || provider.getEnrollmentDate().equals("")) {
			        context.addMessage("form:enrollmentdate", new FacesMessage("EnrollmentDate cannot be empty."));
			        System.out.println("Enter Your EnrollmentDate");
			        flag = false;
			    }
		    
			    
			    


				
//GMAIL
		if (provider.getEmail().length() <= 0) {
		    context.addMessage("form:email", new FacesMessage("Email Cannot Be Empty"));
			System.out.println("Email Failed...");
			flag = false;
		}
		
		if (!Pattern.matches(email, provider.getEmail())) {
			context.addMessage("form:email", new FacesMessage("Invalid Email."));
			System.out.println("Email Failed...");
			flag = false;
		}
	
	}
		return flag;
}
	
}