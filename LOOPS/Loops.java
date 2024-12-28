import java.util.*;
public class Loops {
    public static void main(String[] args) {
       for(int i=0 ;i<5;i++){
        System.out.println(" hw " + i);
       }
    //    while () {
    //     // something
        
    //    }
       Scanner SC= new Scanner(System.in);
       System.out.println("enter ur number");
       int inp=SC.nextInt();
       while (inp!=10) {
        System.out.println("retry");
        inp=SC.nextInt();
        
       }

      
    }
}
