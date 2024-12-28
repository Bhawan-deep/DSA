
public class functions {
    public static void product(int a,int b){
        int product = (a*b);
        System.out.println(product);

    } 
    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;

    }
    public static int binomial(int n,int r){
              int nf=  factorial(n);
              int rf= factorial(r);
              int rmf= factorial(n-r);
              int bc= nf/(rf*rmf);
              return bc;
    }
    public static boolean isPrime(int n){
        boolean prime=true;
        int i=2;
        double sq=Math.sqrt(n);
        while(i<=sq){
            if((n%i)==0){
                prime=false;
            }
            i++;
            
        }
        return prime;
    }
    public static double biToDec(int n){
     int i=0;
     double sum=0;
     
     while(n>0){
        int rem=n%10;
        sum= sum + (rem)*Math.pow(2, i);
        i++;
        n=n/10;
     }
     return sum;


    }


      public static void main(String[] args) {
        product(5, 6);
       System.out.println(factorial(4)); 
       System.out.println(binomial(5, 2));
       System.out.println(isPrime(97));
       System.out.println(biToDec(10100011));
        System.out.println(Math.pow(2, 5));
      }    
}
