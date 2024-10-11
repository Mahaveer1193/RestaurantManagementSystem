package opeartion;

import java.util.Scanner;

import entity.MenuItem;
import service.RestaurantManagement;

public class RestaurantManagementSystem {
	public static void main(String[] args)throws Exception {
		int choice;
		 Scanner sc = new Scanner(System.in);
		 {
			RestaurantManagement restaurantManagement = new RestaurantManagement();

			restaurantManagement.addMenuItem(new MenuItem(1, "Salad", 100.00));
			restaurantManagement.addMenuItem(new MenuItem(2, "Thali", 800.00));
			restaurantManagement.addMenuItem(new MenuItem(3, "Sweet", 500.00));
			restaurantManagement.addMenuItem(new MenuItem(4, "Juice", 100.00));
			restaurantManagement.addMenuItem(new MenuItem(5, "Soups", 150.00));
			restaurantManagement.addMenuItem(new MenuItem(6, "Rice", 200.00));
			restaurantManagement.addMenuItem(new MenuItem(7, "Desert", 300.00));
			restaurantManagement.addMenuItem(new MenuItem(8, "Ice Cream", 150.00));

			try {
			do  {
				System.out.println("Restaurant Management System");
				System.out.println("1. Display Menu");
				System.out.println("2. Take Order");
				System.out.println("3. Display Orders");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				 choice = sc.nextInt();

				switch (choice) {
				case 1:
					restaurantManagement.displayMenu();
					break;

				case 2:
					System.out.print("Enter menu item ID: ");
					int itemId = sc.nextInt();
					System.out.print("Enter quantity: ");
					int quantity = sc.nextInt();
					restaurantManagement.takeOrder(itemId, quantity);
					break;

				case 3:
					restaurantManagement.displayOrders();
					break;

				case 4:
					System.out.println("Thanks For Visiting us..!!!");
					sc.close();
					return;

				default:
					System.out.println("Wrong Choice ,Select again.");
				}
			}while(choice!=0);
		
			}catch (Exception e) {
				System.out.println("Error wrong choice....!!!  ");
			}
		}
	}
}
