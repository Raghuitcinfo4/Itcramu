public class itcp3 {
    int id = 1;
    char name;
    //without parameter
    void main(){
        System.out.println("It is first program");
}
    //with parameter
    void display(int a){
        System.out.println(a);
    }
    public static void main(String[] args){

        itcp3 obj=new itcp3();
         obj.main();
         obj.display(10);


    }

}
