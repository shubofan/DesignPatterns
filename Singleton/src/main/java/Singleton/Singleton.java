package Singleton;

//A thread-safe Singleton
public class Singleton {
    /* Declaring a volatile Java variable means:
    1. The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
    2. Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
    */
    private static volatile Singleton instance;

    private Singleton () {
        System.out.println("Instantiate a singleton class");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
