import java.util.ArrayList;

// TODO: 19/12/2021 FINISH 
public class Course
{
  private ArrayList<Lesson> schedule;
  private String name;

  public Course(String name)
  {
    schedule = new ArrayList<>();
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfLessons()
  {
    return schedule.size();
  }

  public void addLesson(Lesson lesson)
  {
    schedule.add(lesson);
  }

  public void removeLesson(Lesson lesson)
  {
    schedule.remove(lesson);
  }

  public boolean hasLessonOnDate(Date date)
  {
    //Looping and comparing
    for(int i = 0; i<schedule.size(); i++)
    {
      if(schedule.get(i).getDate().equals(date))
      {
        return true;
      }
    }
    return false;
  }

  public ArrayList<Lesson> getAllLessons()
  {
    return schedule;
  }

  public ArrayList<String> getAllTopics()
  {
    //There might be a checker if a list already contains this topic
    //so we don't have two same topics, just a suggestion
    ArrayList<String> allTopics = new ArrayList<>();
    for(int i = 0; i<schedule.size(); i++)
    {
      allTopics.add(schedule.get(i).getTopic());
    }
    return allTopics;
  }

  public ArrayList<OnlineLesson> getAllOnlineLessons()
  {
    ArrayList<OnlineLesson> allOnlineLessons = new ArrayList<>();
    for(int i = 0; i<schedule.size(); i++)
    {
      if(schedule.get(i) instanceof OnlineLesson)
      {
        //We need to cast the lesson to the Online Lesson object
        //In order to add it to ArrayList of Online Lesson.
        allOnlineLessons.add((OnlineLesson)schedule.get(i));
      }
    }
    return allOnlineLessons;
  }

  public ArrayList<OnlineLesson> getAllOnlineLessonsWithCameraRequired()
  {
    ArrayList<OnlineLesson> allOnlineLessonsWithCameraRequired = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof OnlineLesson)
      {
        if(((OnlineLesson) schedule.get(i)).isCameraRequired())
        {
          allOnlineLessonsWithCameraRequired.add((OnlineLesson)schedule.get(i));
        }
      }
    }
    return allOnlineLessonsWithCameraRequired;
  }

  public ArrayList<DiscordLesson> getDiscordLessons()
  {
    ArrayList<DiscordLesson> discordLessons = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if(schedule.get(i) instanceof DiscordLesson)
      {
        discordLessons.add((DiscordLesson)schedule.get(i));
      }
    }
    return discordLessons;
  }

  public ArrayList<ZoomLesson> getZoomLessonWithBreakoutRooms()
  {
    ArrayList<ZoomLesson> zoomLessonWithBreakoutRooms = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof ZoomLesson)
      {
        if(((ZoomLesson) schedule.get(i)).usesBreakoutRooms())
        {
          zoomLessonWithBreakoutRooms.add((ZoomLesson)schedule.get(i));
        }
      }
    }
    return zoomLessonWithBreakoutRooms;
  }

  public ArrayList<Resource> getAllResources()
  {
    //Loop and add multiple resources for each lesson.
    ArrayList<Resource> allResources = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      //Some faster way
      //allResources.addAll(Arrays.asList(schedule.get(i).getResources()));
      for(int j = 0; j< schedule.get(i).getResources().length; j++)
      {
        allResources.add(schedule.get(i).getResources()[j]);
      }
    }
    return allResources;
  }

  public String toString()
  {
    String s= name + "\nLessons:\n";
    for (int i = 0; i < schedule.size(); i++)
    {
      s+= (i+1) +". " + schedule.get(i) + "\n";
    }
    return s;
  }

}
