package controlstatements;

public class Nestedif {

	public static void main(String[] args) {
		int age=18,weight=50;
		if (age>=18)
		{
			if(weight>50)
			{
				System.out.println("he can donate blood");
			}
				else
				{
					System.out.println("he cannot donate blood");
			}
		}
		else
		{
			System.out.println("he cannot donate blood");
		}
	}

}
