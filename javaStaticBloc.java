import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int H;
static int B;
static boolean flag;
static{
    Scanner obj=new Scanner(System.in);
    H=obj.nextInt();
    B=obj.nextInt();
     if(H>0 &&B>0){
        flag=true;
     }
     else if(H<=0 || B<=0){
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
     }
} 

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

