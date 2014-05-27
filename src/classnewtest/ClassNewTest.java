package classnewtest;
public class ClassNewTest {
    int i =20;
    static int a = 200;
    public static void main(String[] args) {
        ClassNewTest t1 = new ClassNewTest();
        System.out.println(t1.i);
        t1.aMethod();
        System.out.println(t1.a);
    }
    void aMethod(){
        int i = 10;
        System.out.println(i);
    }
}
