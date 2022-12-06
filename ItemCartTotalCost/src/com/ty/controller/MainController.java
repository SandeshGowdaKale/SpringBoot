package com.ty.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ty.dto.Cart;
import com.ty.dto.Item;

public class MainController {

	public static void main(String[] args) {

		double sum = 0;

		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Maggi", 13, 2));
		items.add(new Item(2, "Panner", 600, 2));
		items.add(new Item(3, "Smart Phone", 17500, 1));

		Cart cart = new Cart();
		cart.setItems(items);
		cart.setStatus("Active");
		cart.setTime(LocalDateTime.now());

		double tc = cart.getItems().stream().map(item -> item.getCost() * item.getQuantity())
				.collect(Collectors.summarizingDouble(Double::doubleValue)).getSum();

//		for (Item item : items) {
//			sum += item.getCost() * item.getQuantity();
//			cart.setItems(items);
//		}

		cart.setTotalcost(sum);
		System.out.println(cart);

	}
}
