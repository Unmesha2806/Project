package com.java.jsp;








import java.security.SecureRandom;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;




public class ProviderDAOImpl implements ProviderDAO{
	
	SessionFactory sf;
	Session session;
	
	
//	public String addProviderDao(Provider provider) {
//		sf = SessionHelper.getConnection();
//		session = sf.openSession();
//		Transaction trans = session.beginTransaction();
//		session.save(provider);
//		trans.commit();
//		return "Record Inserted";
//		return "UpdateAgent.jsp?faces-redirect=true";
	
	
	 @Override
	    public String addProviderDao(Provider provider) {
		 
		 System.out.println("Provider Id i 40789 " +provider.getFirstName());
	    	String providerid = generateProviderID();
	    	System.out.println("Provider Id i 40 " +providerid);
	    	provider.setProviderid(providerid);
	        sf = SessionHelper.getConnection();
	        session = sf.openSession();
	        Transaction trans = session.beginTransaction();
	       
	       

	        
	        // Set the status to "Pending" by default
	        provider.setStatus("Pending");

	        // Save the Patient entity
	        session.save(provider);
	        trans.commit();
	        session.close();

	        String otp = generateOtp(8); 

	        String body = "Welcome to Mr/Miss " + provider.getFirstName() + "\r\n" + "Your OTP Generated Successfully"
	                + "\r\n" + "OTP is " + otp;

	        MailSend.mailOtp(provider.getEmail(), "Otp Sent Successfully...", body); 
	       
	       
	        session = sf.openSession();
	        Transaction trans2 = session.beginTransaction();

	        Login login = new Login();
	        login.setProviderid(provider.getProviderid()); 
	        login.setUsername(provider.getUserName());
	        login.setOtp(otp);
	        login.setEmail(provider.getEmail());

	        session.save(login);

	        trans2.commit();
	        session.close();

	        return "Welcome.jsp?faces-redirect=true";
			}
	    

//	    public static String generateOtp(int length) {
//	        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//	        SecureRandom secureRandom = new SecureRandom();
//	        StringBuilder otp = new StringBuilder(length);
	//
//	        for (int i = 0; i < length; i++) {
//	            int randomIndex = secureRandom.nextInt(characters.length());
//	            char randomChar = characters.charAt(randomIndex);
//	            otp.append(randomChar);
//	        }
	//
//	        return otp.toString();
//	    }
	    public static String generateOtp(int length) {
	        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        SecureRandom secureRandom = new SecureRandom();
	        StringBuilder otp = new StringBuilder(6);

	        for (int i = 0; i < 6; i++) {
	            int randomIndex = secureRandom.nextInt(characters.length());
	            char randomChar = characters.charAt(randomIndex);
	            otp.append(randomChar);
	        }

	        return otp.toString();
	    }

	//
//	    private static int provideridCounter = 1;
	//
//	    private static String generateUHID() {
//	        // Generate UHID in the format "IN0001", "IN0002", and so on
//	        String providerid = String.format("IN%04d", uhidCounter);
//	        uhidCounter++;
//	        return providerid;
//	    }
	    
	    public String generateProviderID() {
	        SessionFactory sf;
	        Session session;
	        sf = SessionHelper.getConnection();
	        session = sf.openSession();
	        Transaction trans = session.beginTransaction();

	        // Fetch the last UHID from the table
	        Query query = session.createQuery("SELECT MAX(p.providerid) FROM Provider p");
	        String lastProviderID = (String) query.uniqueResult();
	        System.out.println("lastProviderID"+lastProviderID);

	        if (lastProviderID == null) {
	            lastProviderID = "PROV000"; // Set an initial value if the table is empty
	        }
	        System.out.println("lastProviderID134"+lastProviderID);

	        // Extract the numeric part and increment it
	        int numericPart = Integer.parseInt(lastProviderID.substring(4));
	        numericPart++;

	        // Generate the new UHID with the incremented numeric part
	        String newProviderID = String.format("PROV%03d", numericPart);
	        System.out.println(newProviderID);

	        trans.commit();
	        session.close();

	        return newProviderID;

		
	
	    }

	  

		

	}
	
		
		
		
		
		
		
