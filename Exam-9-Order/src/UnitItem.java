public class UnitItem extends Item
{
  public UnitItem(String name, double price)
  {
    super(name, price);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof UnitItem))
    {
      return false;
    }

    UnitItem other = (UnitItem) obj;
    return super.equals(other);
  }

  public String getInfo()
  {
    return "Unit Item:\n" + super.toString();
  }
}
