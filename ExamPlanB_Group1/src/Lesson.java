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


  public String getTopic(){
    return topic;
  }

  public Date getDate(){
    return date.copy();
  }

  //returning all variables from arrayList in array
  public Resource[] getResources(){
    Resource[] resourcesArray = new Resource[resources.size()];
    for(int i = 0; i<resources.size();i++){
      resourcesArray[i] = resources.get(i);
    }
    return resourcesArray;
    //return (Resource[]) resources.toArray();
  }

  //creates a new array and loops through all resources
  //returns only those resources which are PDFs
  public ArrayList<Resource> getAllPDFs(){
    ArrayList<Resource> allPDFs = new ArrayList<>();

    for(int i = 0; i < resources.size(); i++){
      if(resources.get(i).isPDF()){
        allPDFs.add(resources.get(i));
      }
    }

    return allPDFs;
  }

  //this method converts end and start time of the lesson to seconds
  //then we store this variable int "subtraction" and we use it to create a new Time object, which is returned
  public Time getDuration(){
    int subtraction = end.convertToSeconds() - start.convertToSeconds();
    Time time = new Time(subtraction);
    return time;
  }

  //this method checks if startTime is after 8.20 and before endTime
  //and if endTime is before 21.10
  public boolean hasValidTime(Time startTime, Time endTime){
    if(startTime.isBefore(new Time(8, 20, 00)) || endTime.isBefore(startTime)){
      return false;
    }
    if(!(endTime.isBefore(new Time(21, 10, 00)))){
      return false;
    }
    return true;
  }

  public String getDateTimeString(){
    return date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + " " + start.copy() + "-" + end.copy();
  }

  public boolean equals(Object obj){
    if(!(obj instanceof Lesson)){
      return false;
    }

    Lesson other = (Lesson)obj;
    return other.getTopic().equals(topic) && other.getResources().equals(resources) &&
            other.getAllPDFs().equals(getAllPDFs())
            && other.getDateTimeString().equals(getDateTimeString());
  }

  public String toString(){
    return "Lesson: " + getTopic() + "\n" + getDateTimeString() + "\n";
  }
}
