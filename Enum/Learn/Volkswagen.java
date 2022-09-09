package Enum.Learn;

public enum Volkswagen {
    PASSAT("White", 2020),
    GOLF("Black", 2010),
    ;
    private String color;
    private int year;

    Volkswagen(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Volkswagen{" + this.name()+
                "color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
    public String someMethod(){
        return year + "odd";
    }
}
