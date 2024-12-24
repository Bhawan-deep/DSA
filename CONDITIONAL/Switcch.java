import java.util.*;

public class Switcch {
    public static void main(String args[]) {
        int number = 6;
        switch (number) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
        }
        Scanner sc = new Scanner(System.in);
        // making calculator
        System.out.println("please enter number");
        int A = sc.nextInt();
        System.out.println("please enter operator");
        char Z = sc.next().charAt(0);
        System.out.println("please enter number");
        int B = sc.nextInt();
        switch (Z) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;

        }
        System.out.println("please add week number");
        int weeknumber = sc.nextInt();
        switch (weeknumber) {
            case 2:System.out.println("tuesday");

                break;
            case 1:System.out.println("tuesday");

                break;
            case 3:System.out.println("wednesday");

                break;
            case 4:System.out.println("thursday");

                break;
            case 5:System.out.println("friday");

                break;
            case 6:System.out.println("saturdAY");

                break;
            case 7:System.out.println("sunday");
              break;
            default:System.out.println("");
                break;
        }

    }

}
