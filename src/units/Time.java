package units;

public enum Time {

    SECOND(1),
    MINUTE(60),
    HOUR(60 * 60),
    DAY(24 * 60 * 60),
    WEEK(7 * 24 * 60 * 60),
    MONTH(4 * 7 * 24 * 60 * 60),
    YEAR(12 * 4 * 7 * 24 * 60 * 60);

    // Use seconds as the default unit of time
    int seconds;

    Time (int s) {
        this.seconds = s;
    }

    public int getSeconds() {
        return this.seconds;
    }

}
