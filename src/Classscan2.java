import java.util.Scanner;
public class Classscan2 {
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);
        System.out.println("enter the name is");
        String n= h.nextLine();
        System.out.println("enter the address is");
        String m= h.nextLine();
        System.out.println("enter the company is");
        String v= h.nextLine();
        System.out.println("enter the phoneNumber is");
        int x= h.nextInt();

        Test3 obj= new Test3();
        obj.name=n;
        System.out.println("enter the name:"+obj.name);

        obj.Address=m;
        System.out.println("enter the Address:"+obj.Address);
        obj.name = v;
        System.out.println("enter the company:"+obj.company);
        obj.phoneNumber = x;
        System.out.println("enter the phoneNumber:"+obj.phoneNumber);


    }
}

class Test3{
    String name;
    String Address;
    String company;
    int phoneNumber;
}