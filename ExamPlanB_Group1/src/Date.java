import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
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
    if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month
        == 8) || (month == 10) || (month == 12))
    {
      return 31;
    }
    else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
    {
      return 30;
    }
    else if (isLeapYear())
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
    if (day > daysInMonth())
    {
      month++;
      day = 1;
      if (month == 13)
      {
        year++;
        month = 1;
      }
    }

  }

  public int numberOfDaysUntil(Date date2)
  {
    // This will be used to find the days in a month, because the days in a month method
    // Does not have a parameter
    Date dateHolder;

    // Not true for leap years
    //int date1inDays = year * 365 + day;

    int date1InDays = 0;
    // Add days up to year but not including year of date1 (instance)
    // Starts at year 0 (Merry Christmas and all)
    for (int i = 0; i < year; i++)
    {
      dateHolder = new Date(1, 1, i);
      if (dateHolder.isLeapYear())
      {
        date1InDays += 366;
      }
      else
      {
        date1InDays += 365;
      }

    }

    // Add days up to month not including instance month
    // Starts in January (1)
    for (int i = 1; i < month; i++)
    {
      dateHolder = new Date(1, i, year);
      date1InDays += dateHolder.daysInMonth();
    }

    // Add day of the month to total days
    date1InDays += day;

    // Do the same as above but for date 2
    // Because we are working in the same class, we can pull the instance variables directly (not use getters)
    // Just like how we do in some equals methods
    Date date2Holder;

    int date2InDays = 0;

    for (int i = 0; i < date2.year; i++)
    {
      date2Holder = new Date(1, 1, i);
      if (date2Holder.isLeapYear())
      {
        date2InDays += 366;
      }
      else
      {
        date2InDays += 365;
      }
    }

    for (int i = 1; i < date2.month; i++)
    {
      date2Holder = new Date(1, i, date2.year);
      date2InDays += date2Holder.daysInMonth();
    }

    date2InDays += date2.day;

    // Throw an exception is the date in the parameter is before the date in the instance
    if (date2InDays - date1InDays < 0)
    {
      throw new InvalidParameterException(
          "The date entered in the parameter is before the date in the object");
    }
    else
    {
      return date2InDays - date1InDays;
    }
  }

  public static Date today()
  {
    LocalDate today = LocalDate.now();
    return new Date(today.getDayOfMonth(), today.getMonthValue(),
        today.getYear());

  }

  public Date copy()
  {

    return new Date(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
    {
      return false;
    }

    Date other = (Date) obj;
    return year == other.year && month == other.month && day == other.day;
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

  // Short test of methods
  public static void main(String[] args)
  {
    Date beastSpawn = new Date(3, 3, 1997);
    System.out.println("The spawn of the Beast From the East:");
    System.out.println(beastSpawn);
    System.out.println("Today:");
    System.out.println(Date.today());
    System.out.println("Age of the Beast From the East in days");
    System.out.println(beastSpawn.numberOfDaysUntil(Date.today()));
    // This will only return true on the day of writing
    Date nowish = new Date (20, 12, 2021);
    System.out.println("Are " + nowish + " and today the same?");
    System.out.println(nowish.equals(Date.today()));
  }
}
