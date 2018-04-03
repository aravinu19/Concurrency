public class JoinThread {
    public static void main(String[] ivara){
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
