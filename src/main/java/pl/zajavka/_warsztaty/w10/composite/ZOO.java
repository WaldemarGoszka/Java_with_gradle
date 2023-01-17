package pl.zajavka._warsztaty.w10.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ZOO implements Animal{
    private final List<Animal> animals = new ArrayList<>();

    @Override
    public void eat(Food food) {
        animals.forEach(animal -> animal.eat(food));
    }
    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public void remove(Animal animal) {
        this.animals.remove(animal);
    }

    public void clear() {
        System.out.println("Removing all animals");
        this.animals.clear();
    }

}
