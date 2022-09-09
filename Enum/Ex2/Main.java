package Enum.Ex2;

public class Main {
    public static void main(String[] args) {
        Dance hiphop = Dance.HIPHOP;
        System.out.println(hiphop + ": possible hours: "
                + hiphop.getHours() + ", days: "
                + hiphop.getDays() + ", alternative: "
                + hiphop.ifMissing());
        Dance irish = Dance.IRISH;
        System.out.println(irish + ": possible hours: "
                + irish.getHours() + ", days: "
                + irish.getDays() + ", alternative: "
                + irish.ifMissing());
    }
}
