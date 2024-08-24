//package com.prabha.restapp.model;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "trips")
//public class Trip {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String location;
//	private String tripName;
//	private String startDate;
//	private String endDate;
//	private int numberOfDays;
//	@OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
//	private List<Place> places;
//
//	@OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
//	private List<TopPortal> hotels;
//
//	public Trip() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Trip(Long id, String location, String tripName, String startDate, String endDate, int numberOfDays,
//			List<Place> places, List<TopPortal> hotels) {
//		super();
//		this.id = id;
//		this.location = location;
//		this.tripName = tripName;
//		this.startDate = startDate;
//		this.endDate = endDate;
//		this.numberOfDays = numberOfDays;
//		this.places = places;
//		this.hotels = hotels;
//	}
//
//	@Override
//	public String toString() {
//		return "Trip [id=" + id + ", location=" + location + ", tripName=" + tripName + ", startDate=" + startDate
//				+ ", endDate=" + endDate + ", numberOfDays=" + numberOfDays + ", places=" + places + ", hotels="
//				+ hotels + "]";
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public String getTripName() {
//		return tripName;
//	}
//
//	public void setTripName(String tripName) {
//		this.tripName = tripName;
//	}
//
//	public String getStartDate() {
//		return startDate;
//	}
//
//	public void setStartDate(String startDate) {
//		this.startDate = startDate;
//	}
//
//	public String getEndDate() {
//		return endDate;
//	}
//
//	public void setEndDate(String endDate) {
//		this.endDate = endDate;
//	}
//
//	public int getNumberOfDays() {
//		return numberOfDays;
//	}
//
//	public void setNumberOfDays(int numberOfDays) {
//		this.numberOfDays = numberOfDays;
//	}
//
//	public List<Place> getPlaces() {
//		return places;
//	}
//
//	public void setPlaces(List<Place> places) {
//		this.places = places;
//	}
//
//	public List<TopPortal> getHotels() {
//		return hotels;
//	}
//
//	public void setHotels(List<TopPortal> hotels) {
//		this.hotels = hotels;
//	}
//
//}




package com.prabha.restapp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "trips")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String location;
	private String tripName;
	private String startDate;
	private String endDate;
	private int numberOfDays;


	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Trip(Long id, String location, String tripName, String startDate, String endDate, int numberOfDays) {
		super();
		this.id = id;
		this.location = location;
		this.tripName = tripName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfDays = numberOfDays;
	}


	@Override
	public String toString() {
		return "Trip [id=" + id + ", location=" + location + ", tripName=" + tripName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", numberOfDays=" + numberOfDays + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getTripName() {
		return tripName;
	}


	public void setTripName(String tripName) {
		this.tripName = tripName;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public int getNumberOfDays() {
		return numberOfDays;
	}


	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}


}
