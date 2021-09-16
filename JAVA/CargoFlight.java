import java.io.*;
import java.text.Format;
import java.lang.*;

class Flight
{
 final public String airportName="KIA";
String airlineName;
private int flightid;
private float nextSchdeule;
private long commenceyear;
Flight()
{
airlineName="";
flightid=1;
commenceyear=2000;
}


public void read()
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
try
{
System.out.println("Enter the Airline Name");
airlineName=br.readLine();
System.out.println("Enter the Flight Number");
flightid=Integer.parseInt(br.readLine());
System.out.println("Enter the Next Schedule");
nextSchdeule=Float.parseFloat(br.readLine());
 }
  catch(Exception e)
  {
  System.out.println(e.toString());
  }

}
public void disp()
{
System.out.println("Airline Name = "+airlineName);
System.out.println("Flight Number = "+flightid);
//System.out.println("Next Schdule at  ="+nextSchdeule);

}

}

 class CommericalFlight extends Flight
{
int seats;
int bookingAllowed;
CommericalFlight()
{  
   seats=0;
bookingAllowed=0;
}

public void read()
{    
       super.read();
         InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
      try
{
System.out.println("Enter the Number of seats");
seats=Integer.parseInt(br.readLine());
System.out.println("Enter the maximum allowed bookings");
bookingAllowed=Integer.parseInt(br.readLine());

}
catch(Exception e)
  {
  System.out.println(e.toString());
  }
 
  }

public void disp()
{

super.disp();
//accesss specifiers
System.out.println("Number of seats : "+seats);
//System.out.println("Flight Number : "+flightid);
System.out.println("Maximum allowed booking : "+bookingAllowed);
}
}
class  Cargo extends CommericalFlight
{
String cargoCustname;
String carType;
int carCost;

public void read()
{    
      InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
      try
{
super.read();
System.out.println("Enter the Cargo Customer name");
cargoCustname=br.readLine();
System.out.println("Enter the Cargo Type");
carType=br.readLine();
System.out.println("Enter the Cargo cost");
carCost=Integer.parseInt(br.readLine());
}
catch(Exception e)
  {
  System.out.println(e.toString());
  }
  }
public void disp()
{
super.disp();
 System.out.println("Cargo Customer Name : "+cargoCustname);
System.out.println("Cargo Type : "+carType);
System.out.println("Cargo cost : "+carCost);
System.out.println("\n");

}

}

public class CargoFlight
{
public static void main(String []args)
{
Cargo c[]=new Cargo[2];

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    boolean choice=true;
		byte res;
while(choice)
		{
			try{
			System.out.println("\n KIA \n");
			System.out.println("1. Enter Cargo data");
			System.out.println("2. Display Cargo data");
			System.out.println("3. Exit");
			System.out.println("\n Enter your choice");
			res = Byte.parseByte(br.readLine());
			
			switch(res)
			{
				case 1:
		               for(byte i=0;i<2;i++)
					   {
						   c[i]=new Cargo();
						   c[i].read();
					   }	
						break;	

				   
                case 2 :
					try{					
						for(byte i=0;i<2;i++)
					   {					
						c[i].disp();						
					   }
					
					}
					catch(Exception e)
					{
						System.out.println("\n You have not entered the details\n");
					}
						break;	
						
                case 3 :
						
						choice=false;
						
			  }//end of outer switchoice
			}
			catch(Exception e)
						{
						System.out.println("\n error \n");
						}
			
		}// end of while */

}
}