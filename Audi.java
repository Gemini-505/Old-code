import java.util.*;

//Merwe van der Vyver 30651212
public class Audi extends CarObject
{
	private String licensePlatenr = "XXXXXXXX";
	private int ResVal = 5000;
	
	public Audi()
	{
		this(0, 2905500, "V12", "XXXXXXXX", 570, "Audi R8", 2020, "XXXXXXXX", 3000);
	}
	
	public Audi(int lifeSpan, int price, String engineType, String serialNumber, int HP, String carType, int year, String licensePlatenr, int ResVal)
	{
		super(lifeSpan, price, engineType, serialNumber, HP, carType, year);
		setLicensePlatenr(licensePlatenr);
		setResVal(ResVal);
	}
	
		public String getLicensePlatenr()
	{
		return licensePlatenr;
	}
	
	public void setLicensePlatenr(String newLPN)
	{
		this.licensePlatenr = newLPN;
	}
	
	public int getResVal()
	{
		return ResVal;
	}
	
	public void setResVal(int newResVal)
	{
		this.ResVal = newResVal;
	}
	
	public double CarDepreciation()
	{
		return (getPrice() - this.ResVal) /  getLifeSpan();
	}
	
	public int Useable()
	{
		return (2020 - (getYear() - 10));
	}
	
	public String toString()
	{
		return ("An Audi with " + this.ResVal + " residual value and it's license plate number is " + this.licensePlatenr);
	}
	
}