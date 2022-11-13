package zajavka.innerClass.Quiz.p4;

public class Animals {
    static class Animal{
        public void introduceYourself(){
            System.out.println("I'm Animal");
        }
    }
    static class Cat extends Animal{
        @Override
        public void introduceYourself() {
            System.out.println("I'm Cat");
        }
    }
    static class Dog extends Animal{
        @Override
        public void introduceYourself() {
            System.out.println("I'm Dog");
        }
    }

    public static void main(String[] args) {
        Animal b = new Cat();
        Dog e = (Dog) b;
        e.introduceYourself();
    }


}
