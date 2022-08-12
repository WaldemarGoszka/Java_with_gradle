package innerClass;

import java.math.BigDecimal;
import java.util.List;

public class BlockOfFlats {
    private List<Flat> flats;

    public BlockOfFlats(List<Flat> flats) {
        this.flats = flats;
    }

    public class Flat {
        private BigDecimal aera;

        public Flat(BigDecimal aera) {
            this.aera = aera;
        }
    }
}
