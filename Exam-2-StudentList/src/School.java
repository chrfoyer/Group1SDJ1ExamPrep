import java.util.Objects;

public class School extends Education
{
  private String type;
  public static final String INFANT_SCHOOL = "Infant school";
  public static final String JUNIOR_SCHOOL = "Junior school";
  public static final String SECONDARY_SCHOOL = "Secondary school";
  public static final String HIGH_SCHOOL = "High school";

  public School(String code, String title, String type)
  {
    super(code, title);
    if(!(type.equals(INFANT_SCHOOL) || type.equals(JUNIOR_SCHOOL) || type.equals(SECONDARY_SCHOOL) || type.equals(HIGH_SCHOOL)))
    {
      throw new IllegalArgumentException("School type has to be a given school.");
    }
    this.type=type;
  }

  public String getSchoolType()
  {
    return type;
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (!(o instanceof School))
      return false;
    if (!super.equals(o))
      return false;
    School school = (School) o;
    return type.equals(school.type);
  }

  @Override public String toString()
  {
    return super.toString() +", type: " + type;
  }
}
