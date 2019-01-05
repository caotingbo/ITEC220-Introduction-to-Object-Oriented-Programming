
import java.math.BigInteger;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello, World");
        System.out.println(fib(Integer.parseInt(args[0])));

    }

    public static BigInteger fib(int n){

        if (n == 1)
            return BigInteger.valueOf(0);

        BigInteger t0 = BigInteger.valueOf(0);
        BigInteger t1 = BigInteger.valueOf(1);
        for (int i=2;i<=n;i++){
            BigInteger t = t0.add(t1);
            t0 = t1;
            t1 = t;
        }  
        return t1;
                        
    }
}