public class Ascending {
    public static void main(String[] args){
        int number[] = {34,77,98,56,29};
        int value;
        for(int i =0;i<number.length;i++){
            for(int j= i;j<number.length;j++){
                if(number[i]>number[j]){
                    value=number[i];
                    number[i]=number[j];
                    number[j]=value;
                }
                }


        }
     for(int a:number){
         System.out.println("the ascending number is:" + a);
     }
    }

}
