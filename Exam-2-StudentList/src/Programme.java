import java.util.Objects;

public class Programme extends Education
{
  private String level;

  public Programme(String code, String title, String level)
  {
    super(code, title);
    this.level=level;
  }

  public String getLevel()
  {
    return level;
  }

  @Override public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (!(obj instanceof Programme))
      return false;
    if (!super.equals(obj))
      return false;
    Programme programme = (Programme) obj;
    return level.equals(programme.level);
  }

  @Override public String toString()
  {
    return super.toString() + "level: " + level;
  }
}
