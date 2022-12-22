package zajavka.innerClass;

import java.math.BigDecimal;
import java.util.List;

public class BlockOfFlats  {
    private List<Flat> flats;

    public BlockOfFlats() {
    }



    public class Flat {
        private BigDecimal aera;

        @Override
        public String toString() {
            return "Flat{" +
                    "aera=" + aera +
                    '}';
        }

        public Flat(BigDecimal aera) {
            this.aera = aera;
        }
    }
//    klasa statyczna wewnętrzna
    public static class StaticClass{

        public StaticClass() {
        }
    }
    ////////////////////////////////////////////////////////////////
    // interfejs wewnęrtrzy
    private interface IFlat{
        String getString();
    }
    //klasa implementująca interfejs
    private class ClassImplementsInterface implements IFlat{

        @Override
        public String getString() {
            return null;
        }
    }


}
