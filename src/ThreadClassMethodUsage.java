
/**
 * @author Abhishek Jain
 */

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("\nInside MyThread class run method...");
        System.out.println("Thread name is " + Thread.currentThread().getName());
        System.out.println("Thread isAlive is " + Thread.currentThread().isAlive());
        System.out.println("Thread priority is " + Thread.currentThread().getPriority());
        System.out.println("Thread active count is " + Thread.activeCount());
        System.out.println("Thread getContextClassLoader is " + Thread.currentThread().getContextClassLoader());
        System.out.println("Thread getState is " + Thread.currentThread().getState());
        System.out.println("Thread getClass is " + Thread.currentThread().getClass());
        System.out.println("Thread hashCode is " + Thread.currentThread().hashCode());
    }
}
public class ThreadClassMethodUsage {
    public static void main(String[] args) {
        MyThread myThread = null;
        try {
            myThread = new MyThread();
            //we are not passing thread name here, so it will take default name
            Thread t1 = new Thread(myThread);

            //second param is thread name
            Thread t2 = new Thread(myThread, "TestThread_1");

            //we can set thread name using setName method also.
            Thread t3 = new Thread(myThread);
            t3.setName("TestThread_2");
            t3.setPriority(6);

            //start method is use to start thread execution
            t1.start();

            //sleep method is use to pause thread execution
            Thread.sleep(200);
            t2.start();

            Thread.sleep(200);
            t3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
