package creational.singleton;

public class EagerSingleton {
	
	// create an instance of the class.
	private static EagerSingleton instance = new EagerSingleton();

	// private constructor, so it cannot be instantiated outside this class.
	private EagerSingleton() {
	}

	// get the only instance of the object created.
	public static EagerSingleton getInstance() {
		return instance;
	}

}
