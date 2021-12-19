import java.time.LocalDate;

// TODO: 19/12/2021 NumberofDaysUntil
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
        if (this.year < date2.year)
        {
            return true;
        }
        else if (this.month < date2.month)
        {
            return true;
        }
        else
            return this.day < date2.day;
    }

    private boolean isLeapYear()
    {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    private int daysInMonth()
    {
        if ((month == 1) || (month == 3) || (month == 5) || (month
            == 7) || (month == 8) || (month == 10) || (month
            == 12))
        {
            return 31;
        }
        else if ((month == 4) || (month == 6) || (month == 9)
            || (month == 11)){
            return 30;
        }else if (isLeapYear())
        {
            return 29;
        }
        else
        {
            return 28;
        }

    }

    private void nextDay()
    {
        day++;
        if (day>daysInMonth()){
            month++;
            day=1;
            if (month==13){
                year++;
                month=1;
            }
        }

    }

    public int numberOfDaysUntil(Date date2)
    {
        // todo
        return 42; // holder
    }

    public static Date today()
    {
        LocalDate today = LocalDate.now();
        return new Date(today.getDayOfMonth(),today.getMonthValue(),
            today().getYear());
    }



    public Date copy()
    {

        return new Date(day,month,year);
    }
}
