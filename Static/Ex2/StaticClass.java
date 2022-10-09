package Static.Ex2;

public class StaticClass {
    static {
        System.out.println("Creating Static class!");
    }
    static int counter = 0;
    String name;
    int id;

    public StaticClass(String name) {
        this.name = name;
        counter++;
        this.id = counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass("class1");
        StaticClass staticClass2 = new StaticClass("class2");
        StaticClass staticClass3 = new StaticClass("class3");

        System.out.println(staticClass.name + " id class's: " + staticClass.id);
        System.out.println(staticClass2.name + " id class's: " + staticClass2.id);
        System.out.println(staticClass3.name + " id class's: " + staticClass3.id);

    }

    @Override
    public String toString() {
        return "StaticClass{" +
                "name=" + name +
                '}';
    }
}
