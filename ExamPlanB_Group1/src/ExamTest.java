import java.sql.SQLOutput;
import java.util.Arrays;

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
      System.out.println(
          "This is time from time1 until time2: " + time1.timeUntil(time2));

      Time timeCopy = time1.copy();
      System.out.println("This is the copy of time1: " + timeCopy);

      System.out
          .println("Time1 and timeCopy are equal: " + time1.equals(timeCopy));
      System.out
          .println("Time2 and timeCopy are equal: " + time2.equals(timeCopy));
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

      System.out.println(
          "Resource1 is equal to resource2: " + resource1.equals(resource2));
      System.out.println(
          "Resource1 is equal to resource3: " + resource1.equals(resource3));
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

      System.out
          .println("Number of day in month of date1: " + date1.daysInMonth());
      System.out
          .println("Number of day in month of date2: " + date2.daysInMonth());

      date1.nextDay();
      System.out.println("Date1 moved to next day: " + date1);

      System.out.println("Number of days from date1 until date2: " + date1
          .numberOfDaysUntil(date2));

      System.out.println("This the today's date: " + Date.today());

      Date dateCopy = date1.copy();
      System.out.println("This is the copy of date1: " + dateCopy);

      System.out.println("Date1 is equals to date2: " + date1.equals(date2));
      System.out
          .println("Date1 is equals to dateCopy: " + date1.equals(dateCopy));
    }
    //Date class - Test

    //Lesson class - Test
    {
      Resource[] res = new Resource[] {new Resource("presentation", "pdf"),
          new Resource("exercise", "pdf")};

      Lesson lesson0 = new Lesson("Modular Arithmetic", new Date(15, 1, 2022),
          new Time(8, 20, 0), new Time(11, 50, 0), res);

      Lesson lesson1 = new Lesson("Modular Arithmetic", new Date(15, 1, 2022),
          new Time(8, 20, 0), new Time(11, 50, 0), res);

      Lesson lesson1_1 = new Lesson("Logarithms", new Date(15, 1, 2022),
          new Time(8, 20, 0), new Time(11, 50, 0), res);

      System.out.println("\nLESSON CLASS\nThis is the lesson1: " + lesson1 + "\n");
      System.out.println(
          "This is the topic of lesson1: " + lesson1
              .getTopic());
      System.out.println("This is the date of lesson1: " + lesson1.getDate());
      System.out.println("Those are resources of lesson1: " + Arrays
          .toString(lesson1.getResources()));
      System.out.println(
          "Those are the PDF resources of lesson1: " + lesson1.getAllPDFs());
      System.out
          .println("This is the duration of lesson1: " + lesson1.getDuration());
      System.out.println("This is the time and date of lesson1: " + lesson1
          .getDateTimeString());

      System.out.println("This time(8:20-11:50) is valid: " + Lesson
          .hasValidTime(new Time(8, 20, 0), new Time(11, 50, 0)));
      System.out.println("This time(11:50-8:20) is valid: " + Lesson
          .hasValidTime(new Time(11, 50, 0), new Time(8, 20, 0)));
      System.out.println("\nThis is lesson0: " + lesson0 + "\n");
      System.out.println("Lesson1 is equal to lesson0: "+ lesson1.equals(lesson0));
      System.out.println("Lesson1 is equal to lesson2: "+ lesson1.equals(lesson1_1));
    }
    //Lesson class - Test

    //OnlineLesson class, DiscordLesson class, ZoomLesson class - Test
    {
      Resource[] res = new Resource[] {new Resource("presentation", "pdf"),
          new Resource("exercise", "pdf")};

      Lesson lesson2 = new ZoomLesson("Modular Arithmetic",
          new Date(15, 1, 2022), new Time(8, 20, 0), new Time(11, 50, 0), res,
          false, "facebook.com", true);

      Lesson lesson3 = new DiscordLesson("Modular Arithmetic",
          new Date(15, 1, 2022), new Time(8, 20, 0), new Time(11, 50, 0), res,
          false, "1X-DMA");
    }
    //OnlineLesson class, DiscordLesson class, ZoomLesson class - Test
  }
}
