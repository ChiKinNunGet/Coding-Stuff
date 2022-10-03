/*
    Name:       Jake Wang
    Date:       9/29/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
public class P1_Wang_Jake_Fibonacci
{
    public static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    
    public static int multUnsigned(int a, int b){
        if (b==0){
            return 0;
        }else{
            return multUnsigned(a, b-1)+a;
        }
    }
    
    public static int multSigned(int a, int b){
        if (b==0){
            return 0;
        }else if (b<0) {
            return multSigned(a, b+1)-a;
        }else{
            return multSigned(a, b-1)+a;
        }
    }
}
