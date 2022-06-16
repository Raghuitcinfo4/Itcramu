public class cons {
    int id;
    String name;
     cons(int a,String s){
         id=a;
          name =s;
        System.out.println("it is constructor");
    }
    void bike(){
         System.out.println(id+ " "+name);


    }
    public static void main(String[] args) {
        cons obj1= new cons(40,"raghu");
        obj1.bike();


    }
}

