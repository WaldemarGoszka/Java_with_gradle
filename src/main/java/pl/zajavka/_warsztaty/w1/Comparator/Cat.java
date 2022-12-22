package zajavka._warsztaty.w1.Comparator;

public class Cat {
    private Integer id;
    private String name;

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
