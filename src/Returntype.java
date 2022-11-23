public class Returntype {
    static int myMethod(int x, int y,int z) {
        return x + y + z;
    }
    public static void main(String[] args){

        int v = myMethod(3,6,8);
        System.out.println(v);

    }
}
