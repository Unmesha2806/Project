package com.infinite.cms;

public class Menu {
		
	private int menuid;
	
	private String menuItem;
	private	double	menuPrice;
	private	int restaurantId;
	private	double menuCalories;
	private	String	menuSpeciality;
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
	public double getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public double getMenuCalories() {
		return menuCalories;
	}
	public void setMenuCalories(double menuCalories) {
		this.menuCalories = menuCalories;
	}
	public String getMenuSpeciality() {
		return menuSpeciality;
	}
	public void setMenuSpeciality(String menuSpeciality) {
		this.menuSpeciality = menuSpeciality;
	}
	public Menu(int menuid, String menuItem, double menuPrice, int restaurantId, double menuCalories,
			String menuSpeciality) {
		super();
		this.menuid = menuid;
		this.menuItem = menuItem;
		this.menuPrice = menuPrice;
		this.restaurantId = restaurantId;
		this.menuCalories = menuCalories;
		this.menuSpeciality = menuSpeciality;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", menuItem=" + menuItem + ", menuPrice=" + menuPrice + ", restaurantId="
				+ restaurantId + ", menuCalories=" + menuCalories + ", menuSpeciality=" + menuSpeciality + "]";
	}
	


	
	
}
