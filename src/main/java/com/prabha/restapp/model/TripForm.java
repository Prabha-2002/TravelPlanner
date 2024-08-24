package com.prabha.restapp.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class TripForm {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Integer numberOfDays;

	    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	    @JoinColumn(name = "trip_form_id")
	    private List<DayForm> days;

		public TripForm() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TripForm(Long id, Integer numberOfDays, List<DayForm> days) {
			super();
			this.id = id;
			this.numberOfDays = numberOfDays;
			this.days = days;
		}

		@Override
		public String toString() {
			return "TripForm [id=" + id + ", numberOfDays=" + numberOfDays + ", days=" + days + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getNumberOfDays() {
			return numberOfDays;
		}

		public void setNumberOfDays(Integer numberOfDays) {
			this.numberOfDays = numberOfDays;
		}

		public List<DayForm> getDays() {
			return days;
		}

		public void setDays(List<DayForm> days) {
			this.days = days;
		}
	    
	    

}