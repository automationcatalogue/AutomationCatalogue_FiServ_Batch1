package JavaTeachings.oops.abstraction1;

public class C implements A{
    public void show(){
        int x=11;
        int count=0;
        for(int i=1;i<=x;++i){
            if(x%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime!!!");
        }else{
            System.out.println("Given number is Not prime!!!");
        }
    }

    void print(){
        System.out.println("Advanced Java!!!");
    }
}
