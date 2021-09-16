/*

 *********************************************************************
* This sole owner of this program is RONALD BENJAMIN                  *
* School management System.                                           *
 *********************************************************************

*/


import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;
class Admin
{
  private int admin_id;
  private String admin_name;
  public static String admin_Susername="null";
  public static String admin_Spass="null";

  private String admin_username;
  private String admin_pass; 
  private String admin_mail;
  private long admin_phno;
  private String admin_addr;
  private static int static_admin_id=2020;
 public static String cAdminName,cAdminPass;
 public static String admin_Cusername,admin_Cpass;



public Admin(){

	admin_id=++static_admin_id;
	
}

public Admin(String name){
	admin_id=++static_admin_id;
	admin_name=name;
}

public int getAdminId(){

	return admin_id;
}

public String getUsername(){

	return admin_username;
}
public String getPassword(){

	return admin_pass;
}

static
{
	admin_Susername="admin";
	admin_Spass="admin";
}



public void addAdmin()
{
	Scanner sc = new Scanner(System.in);
System.out.println("******************");
System.out.println("* Register Admin *");
System.out.println("******************");
System.out.println("Enter Admin Name");
admin_name=sc.nextLine();
System.out.println("Enter Admin Username");
admin_username=sc.nextLine();
System.out.println("Enter Admin Password");
admin_pass=sc.nextLine();
System.out.println("Enter Admin Mail");
admin_mail=sc.nextLine();
System.out.println("Enter Admin Phone Number");
admin_phno=sc.nextLong();
System.out.println("Enter Admin Address");
sc.nextLine();
admin_addr=sc.nextLine();



}
public void displayAdmin()
{
System.out.println(" ++++++++++++++++++++++++++++++++++++");
System.out.println(" +Admin Id      : "+admin_id+  " +");
System.out.println(" +Admin Name    : "+admin_name+"    +");
System.out.println(" +Admin Username: "+admin_username+"+");
System.out.println(" +Admin Password: "+admin_pass+"    +");
System.out.println(" +Admin Email   : "+admin_mail+"    +");
System.out.println(" +Admin Contact : "+admin_phno+"    +");
System.out.println(" +Admin Address : "+admin_addr+"    +");
System.out.println(" ++++++++++++++++++++++++++++++++++++");

}

public void updateAdmin()
{
Scanner sc = new Scanner(System.in);
System.out.println("****************");
System.out.println("* Update Admin *");
System.out.println("****************");
System.out.println("Enter Admin Name || Existing Admin Name: "+ admin_name);
admin_name=sc.nextLine();
System.out.println("Enter Admin Username || Existing Admin Username: "+ admin_username);
admin_username=sc.nextLine();
System.out.println("Enter Admin Password || Existing Admin Password: "+ admin_name);
admin_pass=sc.nextLine();
System.out.println("Enter Admin Mail || Existing Admin Email: "+ admin_mail);
admin_mail=sc.nextLine();
System.out.println("Enter Admin Phone Number || Existing Admin Contact: "+ admin_phno);
admin_phno=sc.nextLong();
System.out.println("Enter Admin Address || Existing Admin Name: "+ admin_addr);
admin_addr=sc.nextLine();
}



}



 class  Student{
    private int std_id;
  private int std_regno;
  private String std_name;
  private String std_username;
  private String std_pass;
  private String std_sex;
  private String std_dob;
  private String std_doj;
  private String std_class;
  private String std_sec;
  private String std_mail;
  private long std_phno;
  private String std_addr;
  private static int static_std_id=100;
  private static  int static_std_regno=500; 

  public int getStudId(){

  return std_id;
}


public Student(){

  std_id=++static_std_id;
  std_regno=++static_std_regno;
}
public static void abc(){
  System.out.println("Welcome Admin.");
}


public void displayStudent()
{

System.out.println(" ++++++++++++++++++++++++++++++++++++");
System.out.println(" + Student Id       : "+std_id+  " +");
System.out.println(" + Student RegNo    : "+std_regno+"  +");
System.out.println(" + Student Name     : "+std_name+"+");
System.out.println(" + Student Username : "+std_username+"+");
System.out.println(" + Student Password : "+std_pass+"    +");
System.out.println(" + Student Gender   : "+std_sex+"    +");
System.out.println(" + Student Class    : "+std_class+"    +");
System.out.println(" + Student Section  : "+std_sec+"    +");
System.out.println(" + Student DOB      : "+std_dob+"    +");
System.out.println(" + Student DOJ      : "+std_doj+"    +");
System.out.println(" + Student Contact  : "+std_phno+"    +");
System.out.println(" + Student Email    : "+std_mail+"    +");
System.out.println(" + Student Address  : "+std_addr+"    +");
System.out.println(" ++++++++++++++++++++++++++++++++++++");
  


}


public void addStudent()
{
Scanner sc = new Scanner(System.in);
System.out.println("******************");
System.out.println("* Register Student *");
System.out.println("******************");
System.out.println("Enter Student Name");
std_name=sc.nextLine();
System.out.println("Enter Student Username");
std_username=sc.nextLine();
System.out.println("Enter Student Password");
std_pass=sc.nextLine();
System.out.println("Enter Student Mail");
std_mail=sc.nextLine();
System.out.println("Enter Student Phone Number");
std_phno=sc.nextLong();
System.out.println("Enter Studnet Address");
sc.nextLine();
std_addr=sc.nextLine();
System.out.println("Enter Student Gender(M/F)");
std_sex=sc.nextLine();
System.out.println("Enter Student Date of Birth(DD-MM-YYYY)");
std_dob=sc.nextLine();
System.out.println("Enter Student Date of Joining(DD-MM-YYYY)");
std_doj=sc.nextLine();
System.out.println("Enter Student Class");
std_class=sc.nextLine();
System.out.println("Enter Student Section");
std_sec=sc.nextLine();

}
public void updateStudent()
{
  Scanner sc = new Scanner(System.in);
System.out.println("******************");
System.out.println("* Register Student *");
System.out.println("******************");
System.out.println("Enter Student Name || Existing Name: " +std_name);
std_name=sc.nextLine();
System.out.println("Enter Student Username || Existing Username: " +std_username);
std_username=sc.nextLine();
System.out.println("Enter Student Password || Existing Password: " +std_pass);
std_pass=sc.nextLine();
System.out.println("Enter Student Mail || Existing Email: " +std_mail);
std_mail=sc.nextLine();
System.out.println("Enter Student Phone Number || Existing Contact: " +std_phno);
std_phno=sc.nextLong();
System.out.println("Enter Studnet Address || Existing Address: " +std_addr);
sc.nextLine();
std_addr=sc.nextLine();
System.out.println("Enter Student Gender(M/F) || Existing Gender: " +std_sex);
std_sex=sc.nextLine();
System.out.println("Enter Student Date of Birth(DD-MM-YYYY) || Existing DOB: " +std_dob);
std_dob=sc.nextLine();
System.out.println("Enter Student Date of Joining(DD-MM-YYYY) || Existing DOJ: " +std_doj);
std_doj=sc.nextLine();
System.out.println("Enter Student Class || Existing Class: " +std_class);
std_class=sc.nextLine();
System.out.println("Enter Student Section || Existing Section: " +std_sec);
std_sec=sc.nextLine();
}

static class NestedDemo{

  public void my_method()
  {
    System.out.println("This is my nested class");
  }
}

}




class School1 extends Admin
{
	
  public static void main(String[] args) 
  {
  	
  	int ch,ch1,ch2,searchId=0;
     Scanner sc = new Scanner(System.in);
        Admin obj[] = new Admin[10];
        Student  obj1[] = new Student[10];
		int c= 0;
		int c1=0;

  	System.out.println(" ***************************************");
  	System.out.println(" * Welcome To School Management System *");
  	System.out.println(" ***************************************");
    do{

    System.out.println(" +++++++++++++++++++++");
    System.out.println(" + 1: Register Admin  +");
  	System.out.println(" + 2: Display Admin   +");
  	System.out.println(" + 3: Update Admin    +");
  	System.out.println(" + 4: Add Student     +");
    System.out.println(" + 5: Display Student +");
    System.out.println(" + 6: Update Student  +");
    System.out.println(" + 7:Call Static Class+");
  	System.out.println(" ++++++++++++++++++++++");
  	ch=sc.nextInt();
  	switch(ch)
  	{
    case 1:
    System.out.println("Enter Admin Username"+Admin.admin_Susername);
	System.out.println("Enter Admin Username"+Admin.admin_Spass);
	Student.abc();

	System.out.println("Enter Admin Username");
	sc.nextLine();
cAdminName=sc.nextLine();
System.out.println("Enter Admin Password");
cAdminPass=sc.nextLine();
    
    if(cAdminName.equals(admin_Susername) && cAdminPass.equals(admin_Spass))
{
				obj[c] = new Admin();
				obj[c].addAdmin();
				c++;
			}else{
System.out.println("Wrong Credentials");

}
    break;

    case 2:
    System.out.println(" ++++++++++++++++++++++++");
    System.out.println(" +1: Display Admin List +");
  	System.out.println(" +2: Display Admin by ID+");
  	System.out.println(" ++++++++++++++++++++++++");
  	ch1=sc.nextInt();
  	switch(ch1)
  	{
  		case 1:
          for (int i=0;i<c;i++){
					obj[i].displayAdmin();
				}
  		break;
  		case 2:
        
				System.out.println("Enter Admin id");
				searchId = sc.nextInt();
				for (int i=0;i<c;i++){
					if(obj[i].getAdminId() == searchId) {
						obj[i].displayAdmin();
					}
				}

  		break;

  		default:
  		System.out.println("Wrong Choice!!!!");

  	}


    break;

    case 3:
    
				System.out.println("Enter Admin id");
				searchId = sc.nextInt();
				for (int i=0;i<c;i++){
					if(obj[i].getAdminId() == searchId) {
						obj[i].updateAdmin();
					}
				}

   break;

   case 4:
       System.out.println("Enter Admin Username");
       sc.nextLine();
       Admin.admin_Cusername=sc.nextLine(); 
       System.out.println("Enter Admin Password");
       Admin.admin_Cpass=sc.nextLine();

       for (int i=0;i<c;i++){
					if(obj[i].getUsername().equals(admin_Cusername)  && obj[i].getPassword().equals(admin_Cpass) ||
						Admin.admin_Cusername.equals(admin_Susername) && Admin.admin_Cpass.equals(admin_Spass)) {
            
                        System.out.println("Enter choice \n 1:Enter Record \n 2:Exit");
                        ch2=sc.nextInt();
                        switch(ch2)
                        {
                        	case 1:
                          obj1[c1] = new Student();
				          obj1[c1].addStudent();
				          c1++;
                        	break;

                        	case 2:
                                  //exit from this statement
                        	break;

                        	default:

                           System.out.println("Wrong Input");
                        }
						 
					}else{
						System.out.println("Wrong Credentials");
					
				
      }
}


              
   break;

   case 5:
   System.out.println("  ++++++++++++++++++++++++++++");
   System.out.println("  + 1: Display Student List  +");
  	System.out.println(" + 2: Display Student by ID +");
  	System.out.println(" ++++++++++++++++++++++++++++");
  	ch2=sc.nextInt();
  	switch(ch2)
  	{
  		case 1:
          for (int i=0;i<c1;i++){
					obj1[i].displayStudent();
				}
  		break;
  		case 2:
        
				System.out.println("Enter Student id");
				searchId = sc.nextInt();
				for (int i=0;i<c1;i++){
					if(obj1[i].getStudId() == searchId) {
						obj1[i].displayStudent();
					}
				}

  		break;

  		default:
  		System.out.println("Wrong Choice!!!!");

  	}


    break;

    case 6:
 
				System.out.println("Enter Student id");
				searchId = sc.nextInt();
				for (int i=0;i<c1;i++){
					if(obj1[i].getStudId() == searchId) {
						obj1[i].updateStudent();
					}
				}


    break;
    case 7:

    Student.NestedDemo n = new Student.NestedDemo();
    n.my_method();

   default:
   System.out.println("Wrong choice!!!");

}
    } while(true);

  	




  }
}

