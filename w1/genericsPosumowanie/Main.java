package w1.genericsPosumowanie;

public class Main {
    public static void main(String[] args) {
        Sock<Fish> sock = new Sock<>();
        System.out.println(sock.put(new Fish("name of fish")));
        System.out.println(sock.getItem());
        System.out.println(sock);
    }
}
class Fish implements Swimmable{
    private String name;

    Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {

    }
}
