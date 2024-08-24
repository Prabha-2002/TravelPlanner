
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
@Table(name = "Userplacesedit1")
public class UserPlace {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String Timespend;
	public UserPlace() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPlace(Long id, String name, String description, String imageUrl, String timespend) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		Timespend = timespend;
	}
	

	@Override
	public String toString() {
		return "UserPlace [id=" + id + ", name=" + name + ", description=" + description + ", Timespend=" + Timespend
				+ "]";
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

	public String getTimespend() {
		return Timespend;
	}
	public void setTimespend(String timespend) {
		Timespend = timespend;
	}


}