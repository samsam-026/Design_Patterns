package behavioral.command;

public class Waiter {
	
	private Order order;
	
	public Waiter(Order ord) {
		this.order = ord;
	}
	
	public void execute() {
		this.order.execute();
	}
	
}
