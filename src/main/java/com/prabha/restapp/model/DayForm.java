package com.prabha.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class DayForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String time;
    private String place;
    private String hotel;
	public DayForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DayForm(Long id, String time, String place, String hotel) {
		super();
		this.id = id;
		this.time = time;
		this.place = place;
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "DayForm [id=" + id + ", time=" + time + ", place=" + place + ", hotel=" + hotel + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
    
}
