package Static.Ex3;

public class Main {
    public static void main(String[] args) {

        AParent aParent1 = new Child();
        System.out.println(aParent1.getName()); // metoda niestatyczna polimorfizm
        System.out.println(aParent1.getClassName()); // nie powinno się tak wywoływać
        System.out.println(AParent.getClassName()); // tylko  tak
        Child child = new Child();
        System.out.println(child.getName());
        System.out.println(child.getClassName()); // tu następuje hidding
        System.out.println(Child.getClassName());

    }
}
