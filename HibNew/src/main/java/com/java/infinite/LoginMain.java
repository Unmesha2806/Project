package com.java.infinite;

import java.util.Scanner;

public class LoginMain {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
			int choice;
			do {
				System.out.println("O P T I O N S");
				System.out.println("-------------");
				System.out.println("1. Add Agent Details ");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				
				choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					addAgentMain();
					break;
				case 2:
					validateLoginMain();
					break;
				case 3:
					System.out.println("Exiting....");
					return;
				default:
					System.out.println("Enter a Valid Option...");
					return;		
				}
			}while(choice!=3);

	}

		private static void addAgentMain() {
			
			Login login = new Login();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username : ");
			login.setUserName(sc.next());
			System.out.println("Enter Password : ");
			String pass = sc.next();
			String pwd = EncryptPassword.getCode(pass);
			login.setPassCode(pwd);
			LoginDAO dao = new LoginDAOImpl();
			System.out.println(dao.addUser(login));
			}
		public static void validateLoginMain() {
			Login login = new Login();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username : ");
			login.setUserName(sc.next());
			System.out.println("Enter Password : ");
			login.setPassCode(sc.next());
			
			LoginDAO dao = new LoginDAOImpl();
			Login log = dao.authenticate(login);
			if(log!=null) {
				System.out.println("Login Sucessfull");
			}else {
				System.out.println("Invaid Credential");
			}
			
		}
}