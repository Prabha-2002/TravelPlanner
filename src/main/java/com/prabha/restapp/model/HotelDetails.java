package com.prabha.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HotelDetails")
public class HotelDetails {

    @Id
    private Long id;
    private int hotelrating;
    private String location;
    private String hotelAddress;
    private String hotelImageUrl;
    private String hotelName;
    private int hotelrate;
	public HotelDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelDetails(Long id, int hotelrating, String location, String hotelAddress, String hotelImageUrl,
			String hotelName, int hotelrate) {
		super();
		this.id = id;
		this.hotelrating = hotelrating;
		this.location = location;
		this.hotelAddress = hotelAddress;
		this.hotelImageUrl = hotelImageUrl;
		this.hotelName = hotelName;
		this.hotelrate = hotelrate;
	}
	@Override
	public String toString() {
		return "HotelDetails [id=" + id + ", hotelrating=" + hotelrating + ", location=" + location + ", hotelAddress="
				+ hotelAddress + ", hotelImageUrl=" + hotelImageUrl + ", hotelName=" + hotelName + ", hotelrate="
				+ hotelrate + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getHotelrating() {
		return hotelrating;
	}
	public void setHotelrating(int hotelrating) {
		this.hotelrating = hotelrating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getHotelrate() {
		return hotelrate;
	}
	public void setHotelrate(int hotelrate) {
		this.hotelrate = hotelrate;
	}

}
