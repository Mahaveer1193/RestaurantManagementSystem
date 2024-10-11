package service;

import java.util.ArrayList;

import entity.MenuItem;
import entity.Order;

public class RestaurantManagement {
	private ArrayList<MenuItem> menuItems;
	private ArrayList<Order> orders;

	public RestaurantManagement() {
		menuItems = new ArrayList<>();
		orders = new ArrayList<>();
	}

	public void addMenuItem(MenuItem menuItem) {
		menuItems.add(menuItem);

	}

	public void takeOrder(int itemId, int quantity) {
		MenuItem menuItem = null;

		for (MenuItem item : menuItems) {
			if (item.getItemId() == itemId && item.isAvailable()) {
				menuItem = item;

			}
		}

		if (menuItem == null) {
			System.out.println("Menu item not available.");
			return;
		}

		Order order = new Order(menuItem, quantity);
		orders.add(order);
		System.out.println("Order placed: " + quantity + " x " + menuItem.getName() + " for Rs." + order.getTotalPrice());
	}

	public void displayMenu() {
		System.out.println("Menu Items:");
		for (MenuItem item : menuItems) {
			if (item.isAvailable()) {
				System.out.println("ID: " + item.getItemId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
						
			}
		}
	}

	public void displayOrders() {
		System.out.println("Orders:");
		for (Order order : orders) {
			System.out.println(order.getQuantity() + " x " + order.getMenuItem().getName() + " for Rs." + order.getTotalPrice());
		}
	}
}
