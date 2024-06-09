package lecture02.Additional_materials.Ex000;

public class Program {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 111;
        System.out.println(f1.value);

        f1.printCount();

        // Foo.count = 100555;

        Foo f2 = new Foo();
        f2.value = 222;
        System.out.println(f2.value);

        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 333;
        System.out.println(f3.value);
        f3.printCount();
    }
}
