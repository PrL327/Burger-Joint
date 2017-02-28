/**
 * Peter Laskai
 */
public class Burger implements Comparable<Burger>
{
	private String burgerType;
	private double burgerPrice;

	/**
	 * Constructor of class with args
	 * @param newOrder
	 * @param newPrice
	 * @return void
	 */
	public Burger(String newOrder,  double newPrice)
	{
		burgerType = newOrder;
		burgerPrice = newPrice;
	}
	/**
	 * returns the attribute burgerType
	 * @return burgerType
	 */
	public String getBurgerType()
	{
		return burgerType;
	}
	/**
	 * 
	 * @return burgerPrice
	 */
	public double getPrice()
	{
		return burgerPrice;
	}
	/**
	 * sets values for burgerType
	 * @param type
	 */
	public void setType(String type)
	{
		this.burgerType = type;
	}
	/**
	 * sets value for price
	 * @param price
	 */
	public void setPrice(double price)
	{
		this.burgerPrice = price;
	}
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Burger))
			throw new ClassCastException("A Burger expected.");

		Burger otherBurger = (Burger) obj;  // cast the Object to a Car

		if (burgerType.equalsIgnoreCase(otherBurger.getBurgerType())
				&& burgerPrice == otherBurger.getPrice())
			return true;
		else
			return false;
	}
	public int compareTo(Burger anotherBurger)
			throws ClassCastException
	{
		if (!(anotherBurger instanceof Burger))
			throw new ClassCastException("A Burger object expected.");

		if (getPrice() < anotherBurger.getPrice())
			return -1;
		else if (getPrice() > anotherBurger.getPrice())
			return 1;
		else
			return burgerType.compareToIgnoreCase(anotherBurger.getBurgerType());
	}
	public String toString()
	{
		return burgerType +"  $"+ burgerPrice;
	}

}
