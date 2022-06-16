public class poly2 {
    static String animal(String a,String b){
        String c=a+b;
        return c;
    }
    static String animal(String a,String b,String c){
        String d=a+b+c;
        return  d;
    }

    public static void main(String[] args){
        System.out.println(poly2.animal("shiv","prasad"));
        System.out.println(poly2.animal("R","R","R"));

    }

}
