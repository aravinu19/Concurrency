public class ThreadOne implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread One");
        try {
            for (int i = 0; i < 5; i++){
                System.out.print("Running One");
                Thread.sleep(50);
                System.out.print(".");
                Thread.sleep(50);
                System.out.print(".");
                Thread.sleep(50);
                System.out.print(". ");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println();
            System.out.println("Interrupted the thread one");
        }

        System.err.println("Thread One Done");

    }
}
