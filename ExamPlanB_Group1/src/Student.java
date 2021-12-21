import java.util.ArrayList;

public class Student
{
private int studentNumber;
  private String name;
  private ArrayList<Grade> grades;
  private ArrayList<Course> courses;
  private CoronaPassport coronaPassport;

  public Student(int studentNumber, String name;)
  {
    this.name=name;
    this.studentNumber=studentNumber;
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

  public void addGrade(Course course)
  {
    for(int i = 0; i<courses.size(); i++)
    {
      if(courses.get(i).equals(course))
      {
        grades
      }
    }
  }
}
