package Java_quests;

public class Frequenecy_of_number_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,4,1,1,1,2};
		
		int count=0;
		int maxelem=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					count++;
				}
				
				
			}
		}

	}

}
