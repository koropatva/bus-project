package com.bus.service.dao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "Station")
public class Station {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int busId;

	private String name;

	private String phone;

	private String address;

	private DateTime lastBusModification;

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

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DateTime getLastBusModification() {
		return lastBusModification;
	}

	public void setLastBusModification(DateTime lastBusModification) {
		this.lastBusModification = lastBusModification;
	}

	@Override
	public String toString() {
		return "Station [id=" + id + ", busId=" + busId + ", name=" + name
				+ ", phone=" + phone + ", address=" + address
				+ ", lastBusModification=" + lastBusModification + "]";
	}

}