import java.util.*;
public class elseif {
 public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    double in=sc.nextDouble();
    if(in<500000){
        System.out.println("TAX=0%");
    }
    else if(in>500000 && in <1000000){
        System.out.println("Tax = 20%");

    }
    else{
        System.out.println("tax is 30%");
    }
    int A=1,B=3,C=6,X,Y;
    
    if(A>B){
        X=A;

    }
    else{
        X=B;
    }
    if(B>C){
        Y=B;

    }
    else{
        Y=C;
    }
    if(X>Y){
        System.out.println("largest is X=" + X);

    }
    else{
        System.out.println("largest is " + Y);
    }

 }
   
}

