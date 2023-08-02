import java.util.*;

//Merwe van der Vyver 30651212
public class Lamborghini extends CarObject
{
	private int LB = 413;
	private int insurance = 5000;
	
	public Lamborghini()
	{
		this(0, 2905500, "V12", "XXXXXXXX", 570, "Lamborghini Huracan", 2020, 10000, 450);
	}
	
		public Lamborghini(int lifeSpan, int price, String engineType, String serialNumber, int HP, String carType, int year, int insurance, int LB)
	{
		super(lifeSpan, price, engineType, serialNumber, HP, carType, year);
		setInsurance(insurance);
		setLB(LB);
	}
	
	public int getInsurance()
	{
		return insurance;
	}
	
	public void setInsurance(int newInsurance)
	{
		this.insurance = newInsurance;
	}
	
		public int getLB()
	{
		return LB;
	}
	
	public void setLB(int newLB)
	{
		this.LB = newLB;
	}
	
	public double CarDepreciation()
	{
		if(LB >= 400)
		{
			return getPrice() * 0.25;
		}
		else
		{
			return getPrice() * 0.30;
		}
	}
	
	public int Useable()
	{
		if (getYear() <= 1999)
		{
			return (2020 - (getYear() - 5));
		}
		else
		{
			return (2020 - (getYear() - 10));
		}
	}	
	
	public String toString()
	{
		return ("Lamborghini with a weight of " + getLB() + " size and has insurance of R" + getInsurance());
	}
}