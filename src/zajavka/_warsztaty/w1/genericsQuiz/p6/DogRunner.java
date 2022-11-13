package zajavka._warsztaty.w1.genericsQuiz.p6;

import java.util.ArrayList;
import java.util.List;

public class DogRunner {
    public static void main(String[] args) {
        List<? super Dog> weirdDogs = new ArrayList<>();
//        weirdDogs.add(new Aminal()); // bad
        weirdDogs.add(new Dog());
        weirdDogs.add(new FlyingDog());
    }
}
