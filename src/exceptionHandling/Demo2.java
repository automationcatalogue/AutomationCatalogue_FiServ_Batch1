package exceptionHandling;

public class Demo2 {
    String s1="200";
    String s2="0";
    public static void main(String[] args) {
       Demo2 ob= new Demo2();

        try{
            int x = Integer.parseInt(ob.s1);
            int y = Integer.parseInt(ob.s2);
            int z=x/y;
            System.out.println("Sum of the X& Y are :"+z);
        } catch (NumberFormatException ob1 ){
            System.out.println("NumberFormat Exception is came");
            ob.s1=ob.s1.substring(1);
            ob.s2=ob.s2.substring(1);
            int x = Integer.parseInt(ob.s1);
            int y = Integer.parseInt(ob.s2);
            int z=x/y;
        }catch(ArithmeticException ob2){
            System.out.println("Arithmetic Exception is occurred");
            int x = Integer.parseInt(ob.s1);
            int y = 2;
            int z=x/y;
        }
        catch(Exception ob3){
            System.out.println("Exception is occurred");
        }

    }
}
