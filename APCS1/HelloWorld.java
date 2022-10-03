public class HelloWorld {
   public static void main(String[] args) {
       for (int i = 1; i!=0;i++){
           double x = 0.0001*Math.random();
           if (x<=0.00000000001){
               System.out.println(x + "      try " + i);
           }
           if (x==0.0){
               System.out.println(x + "      try " + i);
               break;
           }
       }
   }
}