public class poly1 {
    static int add(int a,int b){
        int c=a+b;
        return c;
    }
    static int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    public static void main(String args[ ]){
        System.out.println(poly1.add(30,60));
        System.out.println(poly1.add(30,60,10));

    }


}
