public class TestVolatile {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                
                counter++;
                System.out.println("Writer: counter = " + counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
        }).start();

        while (counter < 5) {

        }

        System.out.println("Reader: counter = " + counter);
    }
}
