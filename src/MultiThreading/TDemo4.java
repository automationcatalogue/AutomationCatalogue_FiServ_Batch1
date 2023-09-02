package MultiThreading;

public class TDemo4 implements Runnable{

    public void run() {
        String empNames[]={"Deepanshu","Muklesh","Sagar","Sudharson","Sunil","Trinath","Raj","Sunitha"};
        for(String name:empNames){
            System.out.println("Child Thread task code :"+name);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){

            }

        }
    }
    public static void main(String[] args) throws InterruptedException{
        Runnable r =  new TDemo4();
        Thread t = new Thread(r);
        t.start();

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread task code :"+i);
            Thread.sleep(1000);
        }
    }
}
