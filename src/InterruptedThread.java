public class InterruptedThread {

    public static void main(String[] ivara){
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());


        try {
            thread1.start();
            thread2.start();
            thread1.interrupt();
            thread2.interrupt();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
