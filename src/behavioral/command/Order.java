package behavioral.command;

public class Order implements Command {

	private Chef chef;
	private String food;

	public Order(Chef chef, String food) {
		this.chef = chef;
		this.food = food;
	}

	@Override
	public void execute() {

		if (this.food.equals("Pasta")) {
			this.chef.cookPasta();
		} else {
			this.chef.bakeCake();
		}

	}

}
