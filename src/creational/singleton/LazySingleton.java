package creational.singleton;

public class LazySingleton {

	// initialize the instance as null.
	private static LazySingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private LazySingleton() {
	}

	// check if the instance is null, and if so, create the object.
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
}
