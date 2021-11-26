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
}
