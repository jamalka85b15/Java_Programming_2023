package day39_collections.multiThreading;

public class HelloWorld extends Thread{
 int threadNumber;

    public HelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+" Hello World thread"+threadNumber);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
