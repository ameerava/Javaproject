package inheritance;




		class Member
		{
			String name;
			 int age;
			long phoneno;
			String address;
			int salary;
			
			
			public void details()
			{
				System.out.println("name:"+name);
				System.out.println("age:"+age);
				System.out.println("phoneno:"+phoneno);
				System.out.println("address:"+address);
				System.out.println("salary:"+salary);
			}
		}
		class Employee extends Member
		{
			String specialisation;
		}
		class Manager extends Member
		{
			String departmnent;
		}
		public class Inheritancepgm {

			public static void main(String[] args) {
				Employee emp=new Employee();
				emp.name="ameera";
				emp.age=27;
				emp.phoneno=9876543210l;
				emp.address="valiyakath";
				emp.salary=50000;
				emp.details();
				System.out.println(emp.specialisation="testing");
				Manager emp1=new Manager();
				System.out.println(emp1.departmnent="qa");

									
	}

}
