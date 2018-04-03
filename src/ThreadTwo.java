public class ThreadTwo extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Two");
        try {
            for (int i = 0; i < 10; i++){
                System.out.print("Running Two");
                Thread.sleep(100);
                System.out.print(".");
                Thread.sleep(100);
                System.out.print(".");
                Thread.sleep(100);
                System.out.print(". ");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println();
            System.out.println("Interrupted the thread Two");
        }

        System.err.println("Thread Two Done");

    }

}
