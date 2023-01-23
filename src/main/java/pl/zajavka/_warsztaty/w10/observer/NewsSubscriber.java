package pl.zajavka._warsztaty.w10.observer;

public class NewsSubscriber implements Observer{
    private final String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(final String message) {
        if (message == null) {
            System.out.printf("%s - Message null%n", name);
        } else {
            System.out.printf("%s - Message received - %s%n", name, message);
        }
    }

}
