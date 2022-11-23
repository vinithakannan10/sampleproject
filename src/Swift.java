public class Swift {
    private String name="tata";
    private int qty=22;
    private String place="ond";

    public Swift(String name, int qty, String place) {
        this.name = name;
        this.qty = qty;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    Swift(){

    }

//    Swift(String name,int qty,String place){
//        this.name=name;
//        this.qty=qty;
//        this.place=place;
//    }

//    public static void main(String[] args) {
//        Swift sw=new Swift("car",1,"ond");
//        System.out.println(sw.name);
//        System.out.println(sw.place);
//    }
}
