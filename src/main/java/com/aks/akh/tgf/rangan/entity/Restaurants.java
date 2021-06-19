package com.aks.akh.tgf.rangan.entity;

import java.sql.Blob;

public class Restaurants {

	
	private String restaurantName;
	private String phoneNo;
	private String city;
	private Blob fullMenu;
	private String restaurantSpecial;
	private String comments;
	private String user;
	private String address;
	private String website;
	private String rating;
	private String ranking;
	private String numReviews;
	
	
	
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Blob getFullMenu() {
		return fullMenu;
	}
	public void setFullMenu(Blob fullMenu) {
		this.fullMenu = fullMenu;
	}
	public String getRestaurantSpecial() {
		return restaurantSpecial;
	}
	public void setRestaurantSpecial(String restaurantSpecial) {
		this.restaurantSpecial = restaurantSpecial;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getNumReviews() {
		return numReviews;
	}
	public void setNumReviews(String numReviews) {
		this.numReviews = numReviews;
	}
	
	
	
	
}
