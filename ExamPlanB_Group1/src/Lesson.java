import java.util.ArrayList;

public class Lesson
{
  private Date date;
  private ArrayList<Resource> resources;
  private Time start;
  private Time end;
  private String topic;

  public Lesson(String topic, Date date, Time start, Time end, Resource[] res)
  {
    //Maybe some exceptions needed.
    this.topic=topic;
    this.date=date.copy();
    this.start=start.copy();
    this.end=end.copy();
    if(res.length>0)
    {
      for (int i = 0; i < res.length; i++)
      {
        resources.add(res[i]);
      }
    }
  }

  

}
