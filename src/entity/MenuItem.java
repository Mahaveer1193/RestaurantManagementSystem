package entity;

public class MenuItem {
	private int itemId;
	private String name;
	private double price;
	private boolean isAvailable;

	public MenuItem(int itemId, String name, double price) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.isAvailable = true;
	}

	public int getItemId() {
		return itemId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
