public class Private {
public static void main(String[] args){
Manager obj=new Manager();
obj.setName("vini");
    System.out.println(obj.getName());
    obj.setaddress("ond");
    System.out.println(obj.getaddress());

}
}

class Manager{
private String name;
private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public String getaddress(){
return address;
}
   public void setaddress(String address){
this.address=address;
}
}