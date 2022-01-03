import java.util.Objects;

public class Student
{
  private String name;
  private Education education;

  public Student(String name, Education education)
  {
    this.name=name;
    this.education=education;
  }

  public String getName()
  {
    return name;
  }

  public Education getEducation()
  {
    return education;
  }

  public void changeEducation(Education education)
  {
    this.education=education;
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (!(o instanceof Student))
      return false;
    Student student = (Student) o;
    return name.equals(student.name) && education.equals(student.education);
  }

  @Override public String toString()
  {
    return "Student: " + name + ", education: " + education;
  }

}
