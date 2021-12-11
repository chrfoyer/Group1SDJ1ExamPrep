public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isBefore(Date date2)
    {
        // todo
        return true; // holder
    }

    private boolean isLeapyear()
    {
        // todo
        return true; // holder
    }

    private int daysInMonth()
    {
        // todo
        return 42; // holder
    }

    private void nextDay()
    {
        // todo
    }

    public int numberOfDaysUntil(Date date2)
    {
        // todo
        return 42; // holder
    }

    public static Date today()
    {
        // todo
        return new Date(1, 1, 1); // holder
    }

    public Date copy()
    {
        // todo
        return new Date(1, 1, 1); // holder
    }
}
