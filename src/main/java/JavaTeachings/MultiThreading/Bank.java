package JavaTeachings.MultiThreading;

public class Bank {
    float balance = 5000.00f;

    synchronized public void withdraw(float amount) throws InterruptedException{
        System.out.println("Thread1 started to withdraw amount");

        if(balance<amount){
            wait();
        }
        balance = balance-amount;
        System.out.println("Withdraw is completed");
    }

    synchronized void deposit(float amount){
        System.out.println("Thread2 started to deposit");
        balance=balance+amount;
        System.out.println("deposit is completed");
        notify();
    }
}
