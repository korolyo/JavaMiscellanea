public class Program  implements Runnable {

    private int count;
    private String message;

    private static int countNum;
    private static final String USAGE = "Try again:/njava Program --count=[int>0]";

    public static void main(String[] args) throws InterruptedException {

        if (args.length != 1 || !args[0].startsWith("--count=")) {
            System.out.println(USAGE);
            System.exit(-1);
        }

        String[] countStr = args[0].split("=");
        if (countStr.length != 2) {
            System.out.println(USAGE);
            System.exit(-1);
        }

        countNum = Integer.parseInt(countStr[1]);

        Thread thread1 = new Thread(new Program(countNum, "Egg"));
        Thread thread2 = new Thread(new Program(countNum, "Hen"));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        new Program(countNum,"Human").run();
    }

    public Program(int count, String message) {
        this.count = count;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}