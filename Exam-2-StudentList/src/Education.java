import java.util.Objects;

public class Education
{
  private String title;
  private String code;

  public Education(String code, String title)
  {
    this.title = title;
    this.code = code;
  }

  public String getCode()
  {
    return code;
  }

  public String getTitle()
  {
    return title;
  }

  @Override public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (!(obj instanceof Education))
      return false;
    Education education = (Education) obj;
    return title.equals(education.title) && code.equals(education.code);
  }

  @Override public String toString()
  {
    return "Education: " + title + ", " + code;
  }
}