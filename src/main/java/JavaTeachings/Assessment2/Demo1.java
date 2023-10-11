package JavaTeachings.Assessment2;

class NonPrime {
    public static void main(String[] args) {
        int count=0, n=0, i=1, j=1;
        while(n<10){
            j=1;
            count=0;
            while(j<=i) {
                if(i%j==0)
                    count++;
                j++;
            }
            if(count!=2){
                System.out.print(i + " ");
                n++;
            }
            i++;
        }
    }
}