package com.mav.DesignPattern;

class Singleton {
    // Volatile instance to ensure proper visibility in multithreaded environments
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Method to return the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {  // First check (without synchronization)
            synchronized (Singleton.class) {  // Thread safety
                if (instance == null) {  // Second check (ensures only one instance)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Created!");
    }
}

// Test Singleton Class
public class SingletonExample {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Get another reference to the Singleton instance
        Singleton obj2 = Singleton.getInstance();

        // Verify that both references point to the same instance
        System.out.println("Are obj1 and obj2 the same? " + (obj1 == obj2)); // Should print true
    }
}

