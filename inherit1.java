class bike
        {
    void ride()
        {
        System.out.println("Bikes");
        }
}
class honda extends bike{
    void milage(){
        System.out.println("Honda");
        }
}
public class inherit1 {

    public static void main(String[] args){
    honda b1= new honda();
    b1.milage();
    b1.ride();

     }
}






