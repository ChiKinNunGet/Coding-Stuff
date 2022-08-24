/*
    Name:       Jake Wang
    Date:       8/23/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/

public class P1_Wang_Jake_Conditionals{
    public static void main(String[] args) {
        int Students = 37;
        int Computers = 32;
        int Teachers = 0; 
        int Tables = 5;
        
        if ((Teachers == 1)&(Computers >= Students)&((double) Students/Tables <=6)&(Students%2 == 0)) {
            System.out.println("The classroom is valid");
        }
        else {
            System.out.println("The classroom is invalid");
        }
    }
}