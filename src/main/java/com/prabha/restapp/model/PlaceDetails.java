package com.prabha.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PlaceDetails")
public class PlaceDetails {

    @Id
    private Long id;
    private String placeName;
    private String description;
    private String placeImageUrl;
    private String climaticCondition;
	public PlaceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlaceDetails(Long id, String placeName, String description, String placeImageUrl, String climaticCondition) {
		super();
		this.id = id;
		this.placeName = placeName;
		this.description = description;
		this.placeImageUrl = placeImageUrl;
		this.climaticCondition = climaticCondition;
	}
	@Override
	public String toString() {
		return "PlaceDetails [id=" + id + ", placeName=" + placeName + ", description=" + description
				+ ", placeImageUrl=" + placeImageUrl + ", climaticCondition=" + climaticCondition + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlaceImageUrl() {
		return placeImageUrl;
	}
	public void setPlaceImageUrl(String placeImageUrl) {
		this.placeImageUrl = placeImageUrl;
	}
	public String getClimaticCondition() {
		return climaticCondition;
	}
	public void setClimaticCondition(String climaticCondition) {
		this.climaticCondition = climaticCondition;
	}

    // Getters and setters
}
