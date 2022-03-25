import java.util.Scanner;
class Company{
	public int year;
	Scanner s1=new Scanner(System.in);
	int year1;
	Company(){
	System.out.println("Enter the year of joining:");
	year1=s1.nextInt();
	}
void ex1() throws CompanyYearEx{
if(year1<2005)
{
throw new CompanyYearEx();
}
}
}

class Employee extends Company{
 public int age1;
Employee(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter the Age of Employee:");
age1=s1.nextInt();
}
void ex2() throws EmployeeAgeEx{
if((age1<18) || (age1>60))
throw new EmployeeAgeEx(age1);
}
}

class CompanyYearEx extends Exception{
public String toString(){
return ("Not Possible");
}
}

class EmployeeAgeEx extends Exception{
int a;
EmployeeAgeEx(int age){
a=age;
}
public String toString(){
//if((a<18) || (a>60))
if(a<0)
return ("Employee's Age not suitable");
else
return ("EmployeeAge not between 18 and 60");
}
}

class Main{
public static void main(String args[]){
//for(int i=0;i<2;i++)
//{
//Company c=new Company();
Employee em=new Employee();{
try{
  em.ex1();

}
catch(CompanyYearEx e){
System.out.println(e);
}

try{
  em.ex2();
}
catch(EmployeeAgeEx e){
System.out.println(e);
}
}
}
}
