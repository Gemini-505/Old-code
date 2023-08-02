import java.util.*;

//Merwe van der Vyver 30651212
public abstract class CarObject
{
	private int lifeSpan = 5;
	private int price = 1000000;
	private String engineType = "V12";
	private String serialNumber = "XXXXXXXX";
	private int HP = 600;
	private String carType = "Audi R8";
	private int year = 2020;
	
	protected CarObject() {}
	
	protected CarObject(int lifeSpan, int price, String engineType, String serialNumber, int HP, String carType, int year)
	{
		setLifeSpan(lifeSpan);
		setPrice(price);
		setEngineType(engineType);
		setSerialNumber(serialNumber);
		setHP(HP);
		setCarType(carType);
		setYear(year);
	}
	
	public int getLifeSpan()
	{
		return lifeSpan;
	}
	
	public void setLifeSpan(int newLifespan)
	{
		this.lifeSpan = newLifespan;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int newPrice)
	{
		this.price = newPrice;
	}
	
	public String getEngineType()
	{
		return engineType;
	}
	
	public void setEngineType(String newEngineType)
	{
		this.engineType = newEngineType;
	}
	
	public String getSerialNumber()
	{
		return serialNumber;
	}
	
	public void setSerialNumber(String newSerialNumber)
	{
		this.serialNumber = newSerialNumber;
	}
	
	public int getHP()
	{
		return HP;
	}
	
	public void setHP(int newHP)
	{
		this.HP = newHP;
	}
	
	public String getCarType()
	{
		return carType;
	}
	
	public void setCarType(String newCarType)
	{
		this.carType = newCarType;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int newYear)
	{
		this.year = newYear;
	}
	
	
	public abstract double CarDepreciation();
	public abstract int Useable();
}