package shop;

public class Product {
	
	protected String name;
	protected String type;
	protected int quantity;
	protected double price;

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

public Product() {
	super();
}

public Product(int quantity, double price, String name){
	this.quantity = quantity ;
	this.price = price;
	this.name = name;
}

	
}




