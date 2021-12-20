public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(int totalTimeInSeconds)
  {

    this.hour = totalTimeInSeconds / 3600;
    this.minute = (totalTimeInSeconds % 3600) / 60;
    this.second = (totalTimeInSeconds % 3600) % 60;
  }

  public int convertToSeconds()
  {
    // Changed from division to multiplication - CF 20/12
    int result = 0;
    result += hour * 3600;
    result += minute * 60;
    result += second;
    return result;
  }

  public boolean isBefore(Time time2)
  {
    return (this.convertToSeconds() < time2.convertToSeconds());
  }

  public Time timeUntil(Time time2)
  {
    if (this.isBefore(time2))
    {
      return new Time(time2.convertToSeconds() - this.convertToSeconds());
    }
    else
      return new Time(this.convertToSeconds() - time2.convertToSeconds());
  }

  public Time copy(){
    return new Time(hour, minute, second);
  }

  public boolean equals(Object obj){
    if (!(obj instanceof Time)){
      return false;
    }
    Time other=(Time)obj;
    return hour==other.hour&&minute==other.minute&&other.second==second;
  }

  public String toString(){
    // Changed to look like a digital clock readout (hh:mm:ss)
    String str = "";

    if (hour < 10)
    {
      str += 0;
    }
    str += hour + ":";

    if (minute < 10)
    {
      str += 0;
    }
    str += minute + ";";

    if (second < 10)
    {
      str += 0;
    }
    str += second;
    return str;
  }
}
