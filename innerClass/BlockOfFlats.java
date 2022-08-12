package innerClass;

import java.util.List;

public class BlockOfFlats {
    private List<Flat> flats;

    public BlockOfFlats(List<Flat> flats) {
        this.flats = flats;
    }

    public class Flat {
    }
}
