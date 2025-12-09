class BMS extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("BMS College of Engineering");
            try {
                 Thread.sleep(10000);
                 } catch (Exception e) {}
        }
    }
}

class CS extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("CSE");
            try { 
                Thread.sleep(2000); 
            } catch (Exception e) {}
        }
    }
}

public class MULTITHREADING {
    public static void main(String args[]) {
        BMS c1 = new BMS();
        c1.start();

        CS c2 = new CS();
        c2.start();
    }
}
