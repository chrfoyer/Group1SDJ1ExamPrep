public class CoronaPassport
{
  private String reason;
  private Date date;

  public CoronaPassport(String reason, Date date)
  {
    if (reason.equals("Vaccinated") || reason.equals("Tested") || reason.equals(
        "Infected"))
    {
      this.reason = reason;
      this.date = date.copy();
    }
    else
    {
      throw new IllegalArgumentException(
          "Reason must be one of the following: Vaccinated, Tested or Infected.");
    }
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

