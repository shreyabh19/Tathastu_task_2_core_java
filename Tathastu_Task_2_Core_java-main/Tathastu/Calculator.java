import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Syste m.out.println("enter the number:");
        int a  = s .ne xtI nt( );         
        int b =  s.n extI nt() ;          

        System.out.println("enter your choice ");
        System.out.println("1.Addition \n 2.subtraction \n 3.multiplication \n 4.division");
        int ch = s.nextInt();
        int c;
        switch (ch) {
            case 1:
                c = a + b;
                System.out.println("the sum is: " + c);
               

    break;
            case 2:
                c = a - b;
                System.out.println("the sub is: " + c);
               

    break;
            case 3:
                c = a * b;
                System.out.println("the mul is: " + c);
                break;
            case 4:
                float e = (float) a / b;
                System.out.println("the div is: " + e);
                break;
            default:
                System.out.println("wrong choice!!");
        }
    }
}

    
        
    