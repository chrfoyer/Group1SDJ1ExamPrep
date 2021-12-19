public class CoronaPassport
{
  private String reason;
  private Date date;

  public CoronaPassport(String reason, Date date)
  {
    if (!(reason.equals("Vaccinated")))
    {
      if (!(reason.equals("Tested")))
      {
        if (!(reason.equals("Infected")))
        {
          throw new IllegalArgumentException(
              "Reason must be one of the following: Vaccinated, Tested or Infected.");
        }
      }
    }
    this.reason = reason;
    this.date = date.copy();
  }

  public String getReason()
  {
    return reason;
  }

  public Date getDate()
  {
    return date;
  }

  public String toString()
  {
    return "Reason: " + reason + ", Date: " + date;
  }
}

