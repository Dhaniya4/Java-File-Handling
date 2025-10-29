class A{
    public void a(){
        System.out.println("this is from class A");
}
}
class B{
    public void b(){
        System.out.println("this is from class B");
    }
}
public class Classes{
    public static void main(String[] args) {
        A bak = new A();
        bak.a();
        B bakk = new B();
        bakk.b();
    }
}