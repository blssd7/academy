package classwork.lesson19;

import java.util.ArrayList;
import java.util.List;

public class Customer extends PrivilegedCustomer {

	private String name;
	private List<Adress> addresses;
	private List<Order> orders;

	public void addOrder(Order order) {
		if (orders == null) {
			orders = new ArrayList<>();
		}
		orders.add(order);

	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> ordersd) {
		this.orders = orders;
	}

	public void addAdress(Adress adress) {
		if (addresses == null) {
			addresses = new ArrayList<>();
		}
		addresses.addAll(addresses);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

}
