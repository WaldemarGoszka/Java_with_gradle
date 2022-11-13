package zajavka.Static.Ex5;

public class Main {
    public static void main(String[] args) {
        IParent iParent = new IParent() {
            @Override
            public String getName() {
                return IParent.super.getName();
            }
        };
        IParent iParent1 = new AnotherChild();
        System.out.println(iParent1.getName());
        System.out.println(IParent.getClassName());
    }
}
