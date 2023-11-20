package com.java.ejb;

import javax.ejb.Remote;

import javax.ejb.Stateless;

import java.util.Date;

/**
 * Session Bean implementation class HelloWorld
 */
@Stateless
@Remote(HelloWorldRemote.class)
public class HelloWorld implements HelloWorldRemote {

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to Infinite...EJB 3 going on...";
	}

	@Override
	public String greeting(String name) {
		Date obj = new Date();
		int hr = obj.getHours();
		if (hr < 12 ) {
			return "Good Morning..." +name;
		}
		return "Good Evening..." +name;
	}

}
