public class Order {
	//reference variables
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	static double taxRate = 0.05; //TODO make this a static initialization block
	//constructor for purchase orders
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = p;
		quantity = q;
	}
	//constructor for purchasing a single Anvil
	public Order(MyDate d, double amt, String c) { //TODO is this the correct usage of this.
		this.orderDate = d;
		this.orderAmount = amt;
		this.customer = c;
		this.product = "Anvil";
		this.quantity = 1;
	}
	
	public String toString(){ return quantity + " ea. " + product + " for " + customer;
	}

	public static void setTaxRate(double newRate){
		taxRate = newRate;
	}

	//static method  to  compute the tax on an amount provided as a parameter
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}
	//method for computing the Tax for an Order object
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

}
