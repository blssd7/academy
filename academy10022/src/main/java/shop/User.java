package shop;
 
 public class User {
 	protected String name;
 	protected int age;
 	protected double money;

 	public User() {
 		super();
 	}
 
 	public User(int age, double money, String name) {
 		this.age = age;
 		this.money = money;
		this.name = name;
 	}
 
 	@Override
 	public String toString() {
 		// TODO Auto-generated method stub
 		return super.toString();
 	}
 
 	public String getName() {
 		return name;
 	}
 
 	public void setName(String name) {
 		this.name = name;
 	}

 	public int getAge() {
 		return age;
 	}

 	public void setAge(int age) {
		this.age = age;
	}
 
 	public double getMoney() {
 		return money;
 	}
 
 	public void setMoney(double money) {
 		this.money = money;
 	}
 
 }