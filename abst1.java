abstract class language{
    abstract void c();
}

public class abst1 extends language {
    void c() {
        System.out.println("abstract class");
    }

    public class abst2 extends language {
        void c() {
            System.out.println("abstract class 2");
        }
    }


    public static void main(String[] args) {
        language ob = new abst1();
        language ob1 = new abst1();
        ob.c();
        ob1.c();
        ob =new abst1();
        ob.c();

    }
}








