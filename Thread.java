class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 56; i++) {
                System.out.println("Thread 1 " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e) {}
    }
}
class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 56; i++) {
                System.out.println("Thread 2 " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {}
    }
}

class Multithread {
    public static void main(String[] args) throws Exception {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}


