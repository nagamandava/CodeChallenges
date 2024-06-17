public class MultiThreadingExample implements Runnable {

    @Override
    public void run() {
        System.out.println("this is run method coming from Runnable interface: " + Thread.currentThread().getName());
        System.out.println("thread not started yet");
    }

    public static void main(String[] args) {
        MultiThreadingExample example=new MultiThreadingExample();
        System.out.println("before starting thread: " + Thread.currentThread().getName());
        Thread t=new Thread(example);
        t.start();
        System.out.println("after starting thread: " + Thread.currentThread().getName());
    }
}
