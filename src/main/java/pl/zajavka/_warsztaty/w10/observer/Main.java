package pl.zajavka._warsztaty.w10.observer;

public class Main {
    public static void main(String[] args) {
        NewsTopic subject = new NewsTopic();

        Observer observer1 = new NewsSubscriber("NewsSubscriber1");
        Observer observer2 = new NewsSubscriber("NewsSubscriber2");
        Observer observer3 = new NewsSubscriber("NewsSubscriber3");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        subject.setNews("News Arrived!");

    }

}
