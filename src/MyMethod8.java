public class MyMethod8{
    static void myMethod(int age) {

        if (age < 18) {
            System.out.println("it is not eligible");
        } else if (age > 18) {
            System.out.println("it is eligible");
        } else {
            System.out.println("enter the age");
        }

    }

    public static void main(String[] args) {
        myMethod(20);
    }
}






