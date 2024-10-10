package MultiThreadingDemo;

class Bank extends Thread {
    static int bal = 5000; 
    private int withdraw;
    
    Bank(int withdraw) {
        this.withdraw = withdraw;
    }

    // Static synchronized run method to synchronize at the class level
    public static synchronized void withdrawMoney(int withdraw) {
        String name = Thread.currentThread().getName();
        if (withdraw <= bal) {
            System.out.println(name + " withdrawn money");
            bal = bal - withdraw;
            System.out.println("Remaining balance: " + bal);
        } else {
            System.out.println("Insufficient Balance for " + name);
        }
    }

    @Override
    public void run() {
        withdrawMoney(withdraw); 
    }
}

public class StaticSynchronization {

    public static void main(String[] args) {
        Bank b1 = new Bank(5000);
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        
        t1.setName("Ram");
        t2.setName("Syam");
        
        t1.start();
        t2.start();

        Bank b2 = new Bank(5000);
        Thread t3 = new Thread(b2);
        Thread t4 = new Thread(b2);
        
        t3.setName("Sita");
        t4.setName("Geeta");
        
        t3.start();
        t4.start();
    }
}
