import java.util.*;

//Merwe van der Vyver 30651212
public class TestCars  
{
	public static void main(String[]args)
	{
		Audi A1 = new Audi(4,2905500,"V10","98763733",570,"Audi R8 Spyder", 2018 ,"DJP776NW",9000);
		Audi A2 = new Audi(3,2800000,"V10","12348784",550,"Audi R8", 2019,"AJD954GP",7000);
		Audi A3 = new Audi(6,3336000,"V10","98763735",600,"Audi R8 Coupe", 2017,"TRE336NC",10000);
		Audi A4 = new Audi(7,2399900,"V10","12348444",500,"Audi R8 Spyder quattro Auto", 2011 ,"YRS087NW",6500);
		Audi A5 = new Audi(9,4365000,"V12","12345648",650,"Audi R8", 2022,"JHT264GP",12000);
		
		Lamborghini L1 = new Lamborghini(7,5760000,"V10","86048531",602,"Lamborghini Huracan",2016,413,220000);
		Lamborghini L2 = new Lamborghini(5,3995000,"V9","98556324",570,"Lamborghini Urus",2012,400,130000);
		Lamborghini L3 = new Lamborghini(8,2143147,"V12","98426124",825,"Lamborghini Countach",2018,500,10000);
		Lamborghini L4 = new Lamborghini(5,4138492,"V12","98426124",485,"Lamborghini Diablo",2000,470,18000);
		Lamborghini L5 = new Lamborghini(7,59137952,"V12","98426124",750,"Lamborghini Veneno",2020,456,50000);
		
		CarObject Cars[] = new CarObject[10];
		Cars[0] = A1;
		Cars[1] = A2;
		Cars[2] = L2;
		Cars[3] = A5;
		Cars[4] = L3;
		Cars[5] = L5;
		Cars[6] = A3;
		Cars[7] = A4;
		Cars[8] = L1;
		Cars[9] = L4;
		
		for(int i =0 ; i< Cars.length;i++)
		{
			System.out.println("Car " + i + " is a " + Cars[i] + " and has a Depreciation value of " + Cars[i].CarDepreciation() + " and is useable for " + Cars[i].Useable() + " years");
		}
		
		
	}
}