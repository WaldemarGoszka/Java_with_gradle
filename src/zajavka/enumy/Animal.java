package zajavka.enumy;

public enum Animal implements Voiceable{
    REINDEER("reinder",41123),
    SHARK("shark",232),
    CROCODILE("crocodilw",12312),
    FOROG("frog",232),
    GIRAFFE("girafe",12334);
    private final String zero;
    private final int getMessage;


    Animal(String zero, int getMessage) {
        this.zero = zero;
        this.getMessage = getMessage;
    }

    public int getMessage() {
        return getMessage;
    }

    public String getZero() {
        return zero;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "message=" + getMessage +
                ", zero='" + zero + '\'' +
                '}';
    }

    @Override
    public String makeVoice() {
        return this.zero;
    }

}
