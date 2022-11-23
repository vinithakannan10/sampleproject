public class Const1 {
    int id;
    String name;

    Const1(int i,String n) {
        id = i;
        name = n;
    }
    void display(){System.out.println(id+""+name);}
public static void main(String[] args){
        Const1 a = new Const1(333,"vini");
        Const1 a1 = new Const1(666,"vino");
        a.display();
        a1.display();
}
}
