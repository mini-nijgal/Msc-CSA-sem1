import java.io.*;

class CandidatePersonalInfo
{
  public String candName;
  public int candId;
  public Long dob;
  public int candAge;
  public long contNumb;
  public String candMail;
  public char gender;
  boolean passport;
  CandidatePersonalInfo(int candId,String candMail,int candAge,boolean passport)
  {
    candId=0;
    candMail="xyz@gmail.com";
    candAge=18;
    passport=false;
  }
  public void read()throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the Candidate Name"); // Name
    candName=br.readLine();
    System.out.println("Enter the Candidate Id");   // Id number only
    candId=Byte.parseByte(br.readLine());
    System.out.println("Enter the DOB"); //dob[26091999]
    dob=Long.parseLong(br.readLine());
    System.out.println("Enter the Candidate age");  //Age
    candAge=Byte.parseByte(br.readLine());
    System.out.println("Enter the Candidate Email");  // Email
    candMail=br.readLine();
    System.out.println("Enter the Contact Number "); // number
    contNumb=Long.parseLong(br.readLine());
    System.out.println("Enter the Candidate Gender"); // Gender
    gender=(char)br.read();
    br.readLine();
    System.out.println("Do you have a Passport"); // passport
    passport=Boolean.parseBoolean(br.readLine());
  }
  public void display()throws IOException
  {   
    System.out.println("CANDIDATE PERSONAL INFORMATION");
    System.out.println("***********************************");
    System.out.println("Candidate Name = "+candName);
    System.out.println("Candidate Id = "+candId);
    System.out.println("Candidate's DOB = "+dob);
    System.out.println("Candidate's Age = "+candAge);
    System.out.println("Candidate's Contact Number = "+contNumb);
    System.out.println("Candidate's E-mail Id = "+candMail);
    System.out.println("Candidate Gender = "+gender);
    System.out.println("Candidate Passport = "+passport);
   }
}
class CandidateProfInfo extends CandidatePersonalInfo
{
  
	private String candEdu;
  private String candCer;
  private String perfLoca;
	private long salary;

  CandidateProfInfo() throws IOException
  {
    super(0,"xyz@gmail.com",18,false);
    super.read();
  }
  public void read() throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the Candidate Highest Education");  // UG or PG
    candEdu=br.readLine();
    System.out.println("Enter the Certification");  // certification
    candCer=br.readLine();
    System.out.println("Enter the prefered location");  // Perffered location
    perfLoca=br.readLine();
    System.out.println("Enter the Expeted salary "); // salary
    salary=Long.parseLong(br.readLine());
  }
  public void display()throws IOException
  {
    super.display();
    System.out.println("CANDIDATE PROFESSIONAL INFORMATION");
    System.out.println("***********************************");
    System.out.println("Candidate's Highest Education = "+candEdu);
    System.out.println("Candidate's Additional Certification = "+candCer);
    System.out.println("Candidate's Prefered Location = "+perfLoca);
    System.out.println("Candidate's salary expectation = "+salary);
    System.out.println("\n");
  }
}

class Candidate
{
  public static void main(String [] args)throws IOException
  {
    CandidateProfInfo professionalInfo=new CandidateProfInfo();
    professionalInfo.read();
    professionalInfo.display();
  }
}