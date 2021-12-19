import java.util.ArrayList;
import java.util.Arrays;

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
    if(topic==null || topic.equals(""))
    {
      throw new IllegalArgumentException("Topic cannot be null or empty.");
    }
    if(date.isBefore(Date.today()))
    {
      throw new IllegalArgumentException("Lesson cannot be in the past.");
    }
    if(res==null || res.length==0)
    {
      throw new IllegalArgumentException("Resources cannot be null or empty.");
    }
    if(start==null || end==null)
    {
      throw new IllegalArgumentException("Time cannot be null");
    }

    this.topic=topic;
    this.date=date.copy();
    this.start=start.copy();
    this.end=end.copy();

    //resources.addAll(Arrays.asList(res));
    for (int i = 0; i < res.length; i++)
    {
      resources.add(res[i]);
    }
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public Resource[] getResources()
  {//Casting to Resource[]
    return (Resource[]) resources.toArray();
  }

  public ArrayList<Resource> getAllPDFs()
  {
    ArrayList<Resource> pdfs = new ArrayList<>();
    for (int i = 0; i < resources.size(); i++)
    {
      if(resources.get(i).isPDF())
      {
        pdfs.add(resources.get(i));
      }
    }
    return pdfs;
  }
  
}
