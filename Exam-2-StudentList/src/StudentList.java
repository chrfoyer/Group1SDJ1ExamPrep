import java.util.ArrayList;

public class StudentList
{
  private int size;
  private ArrayList<Student> students;

  public StudentList()
  {
    this.students= new ArrayList<>();
    this.size=0;
  }

  public void addStudent(Student student)
  {
    students.add(student);
    size++;
  }

  public void removeStudent(Student student)
  {
    if(size<0)
    {
      students.remove(student);
      size--;
    }
  }

  public Student getStudent(int index)
  {
    if(index<size)
    {
      return students.get(index);
    }
    return null;
  }

  public int getNumberOfStudents()
  {
    return size;
  }

  public int getNumberOfStudentsByEducation(Education education)
  {
    int c=0;
    for(int i=0; i<students.size(); i++)
    {
      if(students.get(i).getEducation().equals(education))
      {
        c++;
      }
    }
    return c;
  }

  public Student[] getStudentsByEducation(Education education)
  {
    Student[] studentsEducation = new Student[getNumberOfStudentsByEducation(education)];
    int index = 0;
    for(int i=0; i<students.size(); i++)
    {
      if(students.get(i).getEducation().equals(education))
      {
        studentsEducation[index] = students.get(i);
        index++;
      }
    }
    return studentsEducation;
  }

  public int getNumberOfHighSchoolStudents()
  {
    int c=0;
    for(int i=0; i<students.size(); i++)
    {
      if(students.get(i).getEducation() instanceof School)
      {
        if(((School) students.get(i).getEducation()).getSchoolType().equals(School.HIGH_SCHOOL))
        {
          c++;
        }
      }
    }
    return c;
  }

  public void doubleTheCapacity()
  {
    size=size*2;
  }


}
