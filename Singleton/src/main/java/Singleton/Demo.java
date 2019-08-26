package Singleton;

/**
 * Demo for the thread-safe singleton class implementation
 */
public class Demo implements Runnable
{
    private String name;

    public Demo (String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Demo demo = new Demo(String.format("Thread %d", i));
            System.out.println("Thread names are following:" + demo.name);
            new Thread(demo).start();
        }
    }

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
