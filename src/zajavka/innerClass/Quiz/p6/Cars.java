package zajavka.innerClass.Quiz.p6;

public class Cars {
    static class Car{

    }
    static class Cabriolet extends Car{

    }
    class SUV extends Car{

    }

    public static void main(String[] args) {
        Car car = new Cabriolet();
        Car nextCar = car;
        Cabriolet cabriolet = (Cabriolet) car;
        Car anotherCar = null;
        Integer numb = 10;
        if(car instanceof Car){
            System.out.println("one");
        }
        if(cabriolet instanceof Cabriolet){
            System.out.println("two");
        }
//        if(numb instanceof SUV){
//            System.out.println("three");
//        }
        if(anotherCar instanceof SUV){
            System.out.println("four");
        }
    }
}
