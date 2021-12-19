import java.util.ArrayList;

// TODO: 19/12/2021 FINISH 
public class Course
{
  private ArrayList<Lesson> schedule;
  private String name;

  public Course(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }
  public int getNumberOfLessons(){
    return schedule.size();
  }

  public void addLesson(Lesson lesson){
    schedule.add(lesson);
  }
  public void removeLesson(Lesson lesson){
    schedule.remove(lesson);
  }
  public boolean hasLessonOnDate(Date date){
    
  }

}
