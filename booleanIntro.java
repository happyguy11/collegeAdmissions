import java.util.Scanner;
public class booleanIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was your overall grade percentage?");
        int grade = input.nextInt();

        if (grade >= 60) { // the program checks this first and will not bother to check the other lines of code if the number is 60 or higher
            System.out.println("Admitted");
        } else if(grade > 40) { // the program will only check this line if the grade is lower than a 60 but higher than 40
            System.out.println("You have been put on the wait list");
            } else {
            System.out.println("Please apply again");
        }
    }
}
