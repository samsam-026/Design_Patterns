package structural.decorator;

public class CoffeeShop {

	public static void main(String[] args) {
		
		HouseBlend houseblend = new HouseBlend();
		System.out.println(houseblend.getDescription() + ": Rs. " + houseblend.cost());

		Milk milkAddOn = new Milk(houseblend);
		System.out.println(milkAddOn.getDescription() + ": Rs. " + milkAddOn.cost());

		Sugar sugarAddOn = new Sugar(milkAddOn);
		System.out.println(sugarAddOn.getDescription() + ": Rs. " + sugarAddOn.cost());

	}

}
