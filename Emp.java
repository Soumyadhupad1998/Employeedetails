import java.util.Scanner;
class Emp

{
	static int choices=0;
 	static String name,designation;
	static int age,salary;



	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);



	while(true)
	{
		System.out.println("1.Create\n2.Display\n3.RaiseSalary\n4.Exit");
		choices =s.nextInt();
		if(choices>=4)
		break;
		switch(choices)
		{
		case 1 : System.out.println("Enter your name..");
			name = s.next();
			System.out.println("Enter your age..");
			age = s.nextInt();
			System.out.println("Enter your salary..");
			salary = s.nextInt();
			System.out.println("Enter your Designation..");
			designation = s.next();
			break;
		case 2 :System.out.println("My name is :"+name);
			System.out.println("My age is :"+age);
			System.out.println("Salary is :"+salary);
			System.out.println("Designation is :"+designation);
			break;
		case 3 :System.out.println(salary+100);
			break;
		}
	}
}
}