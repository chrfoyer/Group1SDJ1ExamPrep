import java.sql.SQLOutput;

public class ExamTest
{
  // TODO: 30/12/2021 I, Robert, will create a new branch tomorrow without the comments. We can use that branch for the exam.
  public static void main(String[] args)
  {
    //Time class - Test
    {
      Time time1 = new Time(14, 30, 0);//14:30
      Time time2 = new Time(15 * 3600);//15:00
      System.out.println("\nTIME CLASS\nThis is the time1: " + time1);
      System.out.println("This is the time2: " + time2);

      int secondsOfTime1 = time1.convertToSeconds();
      System.out
          .println("This is the number of seconds of time1: " + secondsOfTime1);

      System.out.println("Time1 is before time2: " + time1.isBefore(time2));
      System.out.println("Time2 is before time1: " + time2.isBefore(time1));
      System.out.println("This is time from time1 until time2: " + time1.timeUntil(time2));

      Time timeCopy = time1.copy();
      System.out.println("This is the copy of time1: " + timeCopy);

      System.out.println("Time1 and timeCopy are equal: " + time1.equals(timeCopy));
      System.out.println("Time2 and timeCopy are equal: " + time2.equals(timeCopy));
    }
    //Time class - Test

    //Resource class - Test
    {
      Resource resource1 = new Resource("presentation", "pdf");
      Resource resource2 = new Resource("picture", "jpg");
      Resource resource3 = new Resource("presentation", "pdf");

      System.out.println("\nRESOURCE CLASS\nThis is resource1: " + resource1);
      System.out.println("This is resource2: " + resource2);
      System.out.println("This is resource3: " + resource3);

      System.out.println("Resource1 is PDF: " + resource1.isPDF());
      System.out.println("Resource2 is PDF: " + resource2.isPDF());

      System.out.println("Resource1 is equal to resource2: " + resource1.equals(resource2));
      System.out.println("Resource1 is equal to resource3: " + resource1.equals(resource3));
    }
    //Resource class - Test

    //Date class - Test
    {
      Date date1 = new Date(15, 1, 2022);
      Date date2 = new Date(5, 7, 2024);

      System.out.println("\nDATE CLASS\nThis is date1: " + date1);
      System.out.println("This is date2: " + date2);

      System.out.println("Date1 is before date2: " + date1.isBefore(date2));
      //TODO Find out why both of those are true.
      System.out.println("Date2 is before date1: " + date2.isBefore(date1));

      System.out.println("Date1 is leap year: " + date1.isLeapYear());
      System.out.println("Date2 is leap year: " + date2.isLeapYear());

      System.out.println("Number of day in month of date1: " + date1.daysInMonth());
      System.out.println("Number of day in month of date2: " + date2.daysInMonth());

      date1.nextDay();
      System.out.println("Date1 moved to next day: " + date1);

      System.out.println("Number of days from date1 until date2: " + date1.numberOfDaysUntil(date2));

      System.out.println("This the today's date: " + Date.today());

      Date dateCopy = date1.copy();
      System.out.println("This is the copy of date1: " + dateCopy);

      System.out.println("Date1 is equals to date2: " + date1.equals(date2));
      System.out.println("Date1 is equals to dateCopy: " + date1.equals(dateCopy));
    }
    //Date class - Test


  }
}
