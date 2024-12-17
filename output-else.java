import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
               int count=0;
               int n=x;
                while(n>0){
                    int l=n%10;
                    n=n/10;
                    count++;
                }
                if(count==3){
                   System.out.printf("%-15s%03d%n", s1, x);   
            } else {
               
                System.out.printf("%-15s%03d%n", s1, x); 
                }
               
            
            }
            System.out.println("================================");

    }
}



