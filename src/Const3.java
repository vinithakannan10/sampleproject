public class Const3 {
    int id;
    int time;
    String name1;
    String name2;
Const3(int i,int t,String n,String n2){
id=i;
time=t;
    name1 = n;
    name2 = n2;
}
Const3() {

}
void display(){System.out.println(id+""+time+""+name1+""+name2);}
    public static void main(String[] args){    Const3 m1 = new Const3(44,5,"vini","sibi");
    Const3 m2 = new Const3();
    m2.display();
    m1.display();

        }
}
