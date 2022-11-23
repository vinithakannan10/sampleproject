import java.util.Scanner;
public class Classscan {
    public static void main(String[] args){
        Scanner v= new Scanner(System.in);
        System.out.println("enter the name");
        String name= v.nextLine();
        Test2 obj =  new Test2();
        obj.name= name;
        System.out.println("the name is entered:" +obj.name);


    }
}





class test2{
    String name;

}