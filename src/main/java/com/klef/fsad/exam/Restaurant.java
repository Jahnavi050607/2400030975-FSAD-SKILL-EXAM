package com.klef.fsad.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inlab")
public class Restaurant 
{
	@Id
	private int id;
	private String name;
	private String date;
	private String status;
	private String location;

	// Default Constructor
	public Restaurant() 
	{
		
	}

	// Parameterized Constructor
	public Restaurant(int id, String name, String date, String status, String location) 
	{
		this.id = id;
		this.name = name;
		this.date = date;
		this.status = status;
		this.location = location;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// toString() Override
	@Override
	public String toString() 
	{
		return "Restaurant [id=" + id + ", name=" + name + ", date=" + date + 
			   ", status=" + status + ", location=" + location + "]";
	}
}
