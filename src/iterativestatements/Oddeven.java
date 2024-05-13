package iterativestatements;

public class Oddeven {

	public static void main(String[] args) {
		
		int oddcount=0,evencount=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				evencount++;
			
			}
			else
				oddcount++;
		}
		System.out.print("evencount="+evencount+" oddcount="+oddcount);

	}

}
