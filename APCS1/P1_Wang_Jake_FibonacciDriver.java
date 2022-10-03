/*
    Name:       Jake Wang
    Date:       9/29/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
public class P1_Wang_Jake_FibonacciDriver
{
    public static void main(String[] Args){
        runFib(0);
        runFib(3);
        runFib(11);
        runFib(20);
        System.out.println();
        
        runMultUnsigned(7,8);
        runMultUnsigned(5,1);
        runMultUnsigned(5,0);
        runMultUnsigned(0,9);
        runMultUnsigned(0,0);
        runMultUnsigned(45,11);
        System.out.println();
        
        runMultSigned(-7,8);
        runMultSigned(-7,-8);
        runMultSigned(7,-8);
        runMultSigned(-7,9);
        runMultSigned(-7,-9);
        runMultSigned(7,-9);
        System.out.println();
        
        for (int i=30;i>0;i++){
            runFib(i);
        }
    }
    
    private static void runFib(int n){ //max at 46, fib(47) overflows into negative
        if (n<0){
            System.out.println("Error, value negative");
        }else{System.out.printf("Fib(%d) = %d\n", n, P1_Wang_Jake_Fibonacci.fib(n));}
    }
    
    private static void runMultUnsigned(int a, int b){
        if (a<0&&b<0){System.out.println("Error, negative value found");
        }else{System.out.printf("%d*%d = %d\n", a, b, P1_Wang_Jake_Fibonacci.multUnsigned(a,b));}
    }
    
    private static void runMultSigned(int a, int b){
        System.out.printf("%d*%d = %d\n", a, b, P1_Wang_Jake_Fibonacci.multSigned(a,b));
    }
}
