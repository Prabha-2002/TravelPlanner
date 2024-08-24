package com.prabha.restapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FieldForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String time;
    private String place;
    private String hotel;

    @ManyToOne
    @JoinColumn(name = "day_form_id")
    private DayForm dayForm;

	public FieldForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FieldForm(Long id, String time, String place, String hotel, DayForm dayForm) {
		super();
		this.id = id;
		this.time = time;
		this.place = place;
		this.hotel = hotel;
		this.dayForm = dayForm;
	}

	@Override
	public String toString() {
		return "FieldForm [id=" + id + ", time=" + time + ", place=" + place + ", hotel=" + hotel + ", dayForm="
				+ dayForm + "]";
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

	public DayForm getDayForm() {
		return dayForm;
	}

	public void setDayForm(DayForm dayForm) {
		this.dayForm = dayForm;
	}

    // Getters and Setters
}
