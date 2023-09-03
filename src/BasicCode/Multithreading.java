package BasicCode;

class MyThread extends Thread {

//    public MyThread(String name) {
//        super(name);
//    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running ...");
    }

}

class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running ...");
    }
}

public class Multithreading {
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        mt1.start();
        System.out.println();
        MyThread mt2 = new MyThread();
        mt2.start();

        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        MyRunnableThread run1 = new MyRunnableThread();
        Thread t1 = new Thread(run1);
        t1.start();
        MyRunnableThread run2 = new MyRunnableThread();
        Thread t2 = new Thread(run2);
        t2.start();


        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(mt1.getState());
        System.out.println(mt2.getState());

        System.out.println(Thread.currentThread().getState());


    }
}
