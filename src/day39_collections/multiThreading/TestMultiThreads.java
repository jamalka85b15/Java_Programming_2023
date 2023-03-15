package day39_collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {
        HelloWorld h1=new HelloWorld(11);
        h1.start();
        HelloWorld h2=new HelloWorld(22);
        h2.start();
        HelloWorld h3=new HelloWorld(33);
        h3.start();
        HelloWorld h4=new HelloWorld(44);
        h4.start();

    }
}
