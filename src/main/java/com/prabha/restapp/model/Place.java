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
@Table(name = "places")
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String imageUrl;
	@Column(nullable = false)
	private String Timespend;

	@ManyToOne
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;

	@ManyToOne
	@JoinColumn(name = "trip_id")
	private Trip trip;

	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Place(Long id, String name, String description, String imageUrl, String timespend, Location location,
			Trip trip) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		Timespend = timespend;
		this.location = location;
		this.trip = trip;
	}

	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl
				+ ", Timespend=" + Timespend + ", location=" + location + ", trip=" + trip + "]";
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTimespend() {
		return Timespend;
	}

	public void setTimespend(String timespend) {
		Timespend = timespend;
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