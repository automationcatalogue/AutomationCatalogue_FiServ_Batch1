package JavaTeachings.MultiThreading;

public class TDemo3 extends Thread{
    public static void main(String[] args) throws InterruptedException{
        TDemo3 ob = new TDemo3();
        ob.start();

        for(int i=1;i<=10;++i){
            System.out.println("Main Thread task code :"+i);
            Thread.sleep(1000);
            if(i==5){
                ob.suspend();
            }

            if(i==10){
                ob.resume();
            }
        }
    }

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
}
