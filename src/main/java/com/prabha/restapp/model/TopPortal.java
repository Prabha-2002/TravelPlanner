package com.prabha.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "top_portalsfinal")
public class TopPortal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private double rate;

	@Column(nullable = false)
	private double rating;


	@Column(nullable = false)
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;

	@ManyToOne
	@JoinColumn(name = "trip_id")
	private Trip trip;

	public TopPortal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TopPortal(Long id, String name, double rate, double rating, String imageUrl, Location location, Trip trip) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.rating = rating;
		this.imageUrl = imageUrl;
		this.location = location;
		this.trip = trip;
	}

	@Override
	public String toString() {
		return "TopPortal [id=" + id + ", name=" + name + ", rate=" + rate + ", rating=" + rating + ", imageUrl="
				+ imageUrl + ", location=" + location + ", trip=" + trip + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}


}