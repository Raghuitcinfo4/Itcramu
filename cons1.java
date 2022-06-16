public class cons1 {
    public void cons1(){
        int a=10;
        int b=20;
                int c=a*b;
        System.out.println(c);

    }
    public void cons1(int a,int b){
        int d=a+b;
        System.out.println(d);

    }
    public static void main(String args[ ])
    {
        cons1 r1=new cons1();
        r1.cons1();
        r1.cons1(10,20);
    }
}
