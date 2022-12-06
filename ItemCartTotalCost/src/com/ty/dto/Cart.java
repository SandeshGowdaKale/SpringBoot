package com.ty.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Cart {

	private int id;
	private String status;
	private double totalcost;
	private LocalDateTime time;

//	public Cart(int id, String status, double totalcost, LocalDateTime time, List<Item> items) {
//		super();
//		this.id = id;
//		this.status = status;
//		this.totalcost = totalcost;
//		this.time = time;
//		this.items = items;
//	}

	private List<Item> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", status=" + status + ", totalcost=" + totalcost + ", time=" + time + ", items="
				+ items + "]";
	}

}
