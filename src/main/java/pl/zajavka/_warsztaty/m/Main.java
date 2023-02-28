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
            LastMarker = " green";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = " blue";
            System.out.println(LastMarker);
        }
        if ( ++Counter <= Fullcircle  ){
            LastMarker = "black";
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
