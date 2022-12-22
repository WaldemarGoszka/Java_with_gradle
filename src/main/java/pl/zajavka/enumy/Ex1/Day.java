package zajavka.enumy.Ex1;

public enum Day implements Weekend, WorkingDay {
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

    @Override
    public boolean isWeekend() {
        return !this.isWorkingDay;
    }

    @Override
    public boolean isWorkingDay() {
        return  this.isWorkingDay;
    }

    public String getShortName() {
        return shortName;
    }
}
