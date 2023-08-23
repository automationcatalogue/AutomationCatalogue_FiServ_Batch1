package Assessment_4;

public class Demo1 {
    public static void main(String[] args) {
        String str="1ax2y34z-yfg45";

        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(Character.isDigit(ch)){
                sb.append(ch);
            }else{
                if(sb.length()>0){
                  int x=Integer.parseInt(sb.toString());
                  sum=sum+x;
                  sb.setLength(0);
                }
            }
        }
        if(sb.length()>0){
            int x=Integer.parseInt(sb.toString());
            sum=sum+x;
        }
        System.out.println("Sum of the numbers from given String is :"+sum);
    }
}
