package pl.zajavka._warsztaty.m;

public class Main {
    public static void main(String[] args) {
        int Fullcircle = (100 % 6);

        int Counter = 0;
        String LastMarker;
        if ( ++Counter <= Fullcircle  ){
            LastMarker = " red";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = " g reen";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = " b lue";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = "bl ack";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = "yellow";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = "brown";
            System.out.println(LastMarker);
        }
    }
}
