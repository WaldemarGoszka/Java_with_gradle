package zajavka.Enum.Ex2;

import java.util.Arrays;

public enum Dance {
    HIPHOP(new String[]{"12:00", "13:00"}, new Day[]{Day.FRIDAY,Day.MONDAY} ){
        @Override
        public Dance ifMissing() {
            return Dance.BALLET;
        }
    },
    IRISH(new String[]{"9:00", "10:00"}, new Day[]{Day.SATURDAY,Day.SUNDAY} ) {
        @Override
        public Dance ifMissing() {
            return Dance.BALLET;
        }
    },
    BALLET(new String[]{"8:00", "18:00"}, new Day[]{Day.THURSDAY,Day.TUESDAY} ) {
        @Override
        public Dance ifMissing() {
            return null;
        }
    };
    private String[] hours;
    private Day[] days;
    public abstract Dance ifMissing();

    Dance(String[] hours, Day[] days) {
        this.hours = hours;
        this.days = days;
    }

    public String getHours() {
        return Arrays.toString(hours);
    }

    public String getDays() {
        return Arrays.toString(days);
    }


}
