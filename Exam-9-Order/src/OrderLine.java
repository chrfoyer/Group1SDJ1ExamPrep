public class OrderLine
{
  private Item item;
  private int amount;

  public OrderLine(Item item, int amount)
  {
    this.item = item;
    this.amount = amount;
  }

  public Item getItem()
  {
    return item;
  }

  public int getAmount()
  {
    return amount;
  }

  public void setAmount(int amount)
  {
    this.amount = amount;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof OrderLine))
    {
      return false;
    }

    OrderLine other = (OrderLine)obj;
    return item.equals(other.item) && amount == other.amount;
  }

  @Override public String toString()
  {
    return item.getInfo() + "Quantity: " + amount;
  }

  // This copy method is not on the UML, but is needed for the composition
  public OrderLine copy()
  {
    OrderLine other = new OrderLine(item, amount);
    return other;
  }
}
