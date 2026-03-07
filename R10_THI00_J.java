public final class R10_THI00_J implements Runnable {
    @Override
    public void run() {
        System.out.println("Running task");
    }

    public static void main(String[] args) {
        R10_THI00_J foo = new R10_THI00_J();
        new Thread(foo).start();
    }
}