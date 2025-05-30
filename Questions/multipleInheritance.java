package Questions;
interface A {
    void hello();
}
interface B {
    void welcome();
}
class C implements A, B {
    public void hello() {
        System.out.println("Hello this this from interface A");
    }

    public void welcome() {
        System.out.println("And this from interface B");
    }
}
public class multipleInheritance{
    public static void main(String[] args) {
        C obj = new C();
        obj.hello();
        obj.welcome();
    }
}
