package com.java.thr;

import java.util.Scanner;

public class MainInput {
	public void show(Dummy dummy) {
			System.out.println(dummy.getEmpno());
			System.out.println(dummy.getEmpno());
			System.out.println(dummy.getEmpno());
			dummy.getName();
			dummy.getCity();
	}
	public static void main(String[] args) {
		MainInput obj = new MainInput();
		Dummy dummy = new Dummy();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number");
		dummy.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Your Name  ");
		dummy.setName(sc.nextLine());
		System.out.println("Enter City  ");
		dummy.setCity(sc.nextLine());
		System.out.println("Enter Basic  ");
		dummy.setBasic(Double.parseDouble(sc.nextLine()));
		obj.show(dummy);
	}
}