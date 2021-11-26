public abstract class Item
{
  private String name;
  private double price;

  public Item(String name, double price)
  {
    this.name = name;
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public double getPrice()
  {
    return price;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Item))
    {
      return false;
    }
    Item other = (Item)obj;
    return name.equals(other.name) && price == other.price;
  }

  public abstract String getInfo();
}
