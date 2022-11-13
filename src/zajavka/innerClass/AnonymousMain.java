package zajavka.innerClass;

public class AnonymousMain {
    public static void main(String[] args) {
        AnonymousMain main = new AnonymousMain();
        //System.out.println(main.callInnerInterface());
        System.out.println(main.callInnerAbstractClass());
    }

    private String callInnerAbstractClass() {
        System.out.println("++++++++++++++++");
        return sing("My song name", new Singable() {
            @Override
            public String singASong(String songName) {
                return "I'm singing a song, name: " + songName;
            }
        });


//        Animal animal = new Animal() {
//            @Override
//            String whatsYourName() {
//                return "my name is Abstract Class";
//            }
//        };
//        return animal.whatsYourName();
    }

    private String callInnerInterface() {
        Singable singable = songName -> "I'm sing a song with name: " + songName;
        return singable.singASong("We are the champion");
    }

    public String sing(String songName, Singable singable) {
        return singable.singASong(songName);
    }

    interface Voiceable {
        String silentVoice();

        String loudVoice();
    }

    interface Singable {
        String singASong(String songName);
    }

    abstract class Animal {
        abstract String whatsYourName();
    }
}
