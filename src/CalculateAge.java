//Question 4

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Date of birth in the format yyyy-mm-dd");
        String input=scanner.next();
        LocalDate dob = LocalDate.parse(input);
        LocalDate currentDate =LocalDate.now();
        Period age =Period.between(dob,currentDate);
        System.out.println("Your age is "+age.getYears()+" years , "+age.getMonths()+" months, and "+age.getDays() +" days");

    }
}
