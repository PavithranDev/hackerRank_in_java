import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

class Solution {
    public String finalday(int month, int day, int year) {
      
        LocalDate loc = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = loc.getDayOfWeek(); 
        return dayOfWeek.toString(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); 
        int month = obj.nextInt(); // Input month
        int day = obj.nextInt();   // Input day
        int year = obj.nextInt();  // Input year

    
        Solution solution = new Solution();
        System.out.println(solution.finalday(month, day, year));
    }
}
