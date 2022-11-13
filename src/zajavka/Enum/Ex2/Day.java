package zajavka.Enum.Ex2;


public enum Day{
    MONDAY("MON",true),
    TUESDAY("THE",true),
    THURSDAY("THU",true),
    WENESDAY("WEN",true),
    FRIDAY("FRI",true),
    SATURDAY("SAT",false),
    SUNDAY("SUN",false);

    private String shortName;
    private boolean isWorkingDay;

    Day(String shortName, boolean isWorkingDay) {
        this.shortName = shortName;
        this.isWorkingDay = isWorkingDay;
    }


    public String getShortName() {
        return shortName;
    }
}

