package thread;

public class MultiThreex extends Thread implements Runnable {

    @Override
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        MultiThreex multiThreex=new MultiThreex();
        Thread t1=new Thread(multiThreex);
        multiThreex.start();
        t1.start();
        System.out.println(t1.getName());
    }
}
