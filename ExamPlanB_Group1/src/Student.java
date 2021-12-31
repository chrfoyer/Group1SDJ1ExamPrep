import java.util.ArrayList;

// todo check all classes to see all methods are present from diagram
public class Student
{
  private int studentNumber;
  private String name;
  private ArrayList<Grade> grades;
  private ArrayList<Course> courses;
  private CoronaPassport coronaPassport;

  public Student(int studentNumber, String name)
  {
    if (studentNumber < 0)//Just to write some exception.
    {
      throw new IllegalArgumentException(
          "The student number cannot be a negative number.");
    }
    if (name == null || name.equals(""))
    {
      throw new IllegalArgumentException(
          "Name cannot be neither null or empty String object.");
    }
    this.name = name;
    this.studentNumber = studentNumber;
    this.grades = new ArrayList<>();
    this.courses = new ArrayList<>();
    this.coronaPassport = null;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String getName()
  {
    return name;
  }

  public void addCourse(Course course)
  {
    if (course == null)
    {
      throw new NullPointerException("The course to be added cannot be null.");
    }
    courses.add(course);
  }

  public void addGrade(Grade grade)
  {
    boolean missing = true;

      for (int i = 0; i < courses.size(); i++)
      {
        if (courses.get(i).equals(grade.getCourse()))
        {
          grades.add(grade.copy());
          missing = false;
        }
      }
      if (missing){
        System.out.println("There is no course for that grade");
      }

  }

  public void addCoronaPassport(CoronaPassport passport)
  {
    //if(hasValidCoronaPassport)
    if (passport == null)
    {
      throw new NullPointerException("Corona passport cannot be null.");
    }
    this.coronaPassport = passport;
    if (!hasValidCoronaPassport())
    {
      removeCoronaPassport();
      throw new IllegalStateException(
          "The given corona passport is not legal!");
    }
  }

  public void removeCoronaPassport()
  {
    if (coronaPassport != null)
    {
      this.coronaPassport = null;
    }
    else
    {
      throw new IllegalCallerException("There is no corona passport.");
    }
  }

  public CoronaPassport getCoronaPassport()
  {
    return coronaPassport;
  }

  public boolean hasValidCoronaPassport()
  {
    if (!(Date.today().isBefore(coronaPassport.getDate())))
    {
      if (coronaPassport.getReason().equals("Vaccinated"))
      {
        return true;
      }
      else if (coronaPassport.getReason().equals("Tested")
          && coronaPassport.getDate().numberOfDaysUntil(Date.today()) <= 3)
      {
        return true;
      }
      else if (coronaPassport.getReason().equals("Infected")
          && coronaPassport.getDate().numberOfDaysUntil(Date.today()) > 14
          && coronaPassport.getDate().numberOfDaysUntil(Date.today()) <= 180)
      {
        return true;
      }
    }
    return false;
  }

  public double getGradeAverage()
  {
    double numberOfGrades = grades.size();
    double sumOfGrades = 0;
    for (int i = 0; i < numberOfGrades; i++)
    {
      sumOfGrades += grades.get(i).getGrade();
    }
    return (sumOfGrades) / numberOfGrades;
  }

  public Grade[] getAllGrades()
  {
    Grade[] allGrades = new Grade[grades.size()];

    for (int i = 0; i < grades.size(); i++)
    {
      allGrades[i] = grades.get(i);
    }
    return allGrades;
  }

  public Course[] getAllCourses()
  {
    Course[] allCourses = new Course[courses.size()];

    for (int i = 0; i < courses.size(); i++)
    {
      allCourses[i] = courses.get(i);
    }
    return allCourses;
  }

  public String toString()
  {
    return "Name: " + getName() + ", Student number: " + getStudentNumber();
  }

}


