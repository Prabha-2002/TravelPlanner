package com.prabha.restapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Tripdays")
public class Tripdays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int noofdays;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")
    private List<HotelDetails> hotelDetails;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id")
    private List<PlaceDetails> placeDetails;

	public Tripdays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tripdays(Long id, int noofdays, List<HotelDetails> hotelDetails, List<PlaceDetails> placeDetails) {
		super();
		this.id = id;
		this.noofdays = noofdays;
		this.hotelDetails = hotelDetails;
		this.placeDetails = placeDetails;
	}

	@Override
	public String toString() {
		return "Tripdays [id=" + id + ", noofdays=" + noofdays + ", hotelDetails=" + hotelDetails + ", placeDetails="
				+ placeDetails + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}

	public List<HotelDetails> getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(List<HotelDetails> hotelDetails) {
		this.hotelDetails = hotelDetails;
	}

	public List<PlaceDetails> getPlaceDetails() {
		return placeDetails;
	}

	public void setPlaceDetails(List<PlaceDetails> placeDetails) {
		this.placeDetails = placeDetails;
	}
    

}
