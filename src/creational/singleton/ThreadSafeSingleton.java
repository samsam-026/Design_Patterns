package creational.singleton;

public class ThreadSafeSingleton {

	// initialize the instance as null.
	private static ThreadSafeSingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private ThreadSafeSingleton() {
	}

	// check if the instance is null, within a synchronized block
	// if so, create the object.
	public static ThreadSafeSingleton getInstance() {
		synchronized (ThreadSafeSingleton.class) {
			if (instance == null) {
				instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}

	// double locking is used, to reduce the overhead of the synchronized method.
	public static ThreadSafeSingleton getInstanceDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

}
