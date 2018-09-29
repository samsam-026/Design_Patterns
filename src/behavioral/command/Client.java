package behavioral.command;

public class Client {

	public static void main(String[] args) {

		Chef chef = new Chef();

		Order order = new Order(chef, "Pasta");

		Waiter waiter = new Waiter(order);

		waiter.execute();

		order = new Order(chef, "Cake");

		waiter = new Waiter(order);

		waiter.execute();

	}

}
