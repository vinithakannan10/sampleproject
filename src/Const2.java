//public class Const2 {
//    int id;
//    int age;
//    String name;
//    Const2(int i,int a,String n) {
//        id = i;
//        age = a;
//        name= n;
//    }
//
//    void display(){System.out.println(id+""+name+""+age);}
//    public static void main(String[] args){
//        Const2 r1= new Const2(77,20,"sabi");
////        Const2 r2=new Const2();
//        r2.id=r1.id;
//        r2.age=r1.age;
//        r2.name=r1.name;
//        r2.display();
//        r1.display();
//    }
//
//}


public  class Const2 {

    public  static  void  main(String[] args){
        Student obj=new Student("nandhini","Dharumaraj");
        System.out.println(obj.firstname);
        System.out.println(obj.lastname);

    }
}

class Student{
    String firstname;

    String lastname;

    public Student(String first,String last){
        this.firstname=first;
        this.lastname=last;
    }
}

