import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//        String firstName="nandhini";
//        String lastName="D";
//        int price,amt,b,c;
//         price= amt=5;
//        byte value=25;
//        float floatvalue=1.2F;
//        double doublevalue=2.50;


        Scanner scannerObj=new Scanner(System.in);
//        System.out.println("Enter the firstname:");
//        String firstName=scannerObj.nextLine();
//
//        System.out.println("Enter the lastname:");
//        String lastName=scannerObj.nextLine();
//
//
//        System.out.println("Enter the price:");
//        int price=scannerObj.nextInt();

//        System.out.println("HI");
//        System.out.println(price);
        //        System.out.println(price);
//        System.out.println(amt);
//
//        System.out.println(value);
//        System.out.println(floatvalue);
//        System.out.println(doublevalue);
//        b=8;
//        c=a+b;
//        System.out.println(c);
//
//        System.out.println(a+=b);

        System.out.println("Enter the x:");
       int x=scannerObj.nextInt();

        System.out.println("Enter the y:");
        int y=scannerObj.nextInt();


        System.out.println("Enter the z:");
        int z=scannerObj.nextInt();
//
//        System.out.println( "min:"+  Math.min(x,y));
//        System.out.println(   " max:"+Math.max(x,y));
//        System.out.println(  "sqrt:"+ Math.sqrt(z));




        //if codition

//
//        if(x<y){
//            System.out.println( "True");
//        }else{
//            System.out.println( "flase");
//        }
//


        if(x<y){
            System.out.println( "x True");
        }else if(y>z){
            System.out.println( "y True");
        }else{
            System.out.println( "false");
        }

    }
}
