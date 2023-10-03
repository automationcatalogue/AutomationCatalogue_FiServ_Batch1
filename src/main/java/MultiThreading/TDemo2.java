package MultiThreading;

public class TDemo2 extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        t.setPriority(MAX_PRIORITY);
        String empNames[]={"Deepanshu","Muklesh","Sagar","Sudharson","Sunil"};
        for(String name:empNames){
            System.out.println("Child Thread task code :"+name);
        }
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setPriority(MIN_PRIORITY);
        TDemo2 ob = new TDemo2();
        ob.start();
        for(int i=1;i<1000;++i){
            System.out.println("Main Thread task code :"+i);
        }
    }
}
