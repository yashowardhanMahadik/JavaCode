import java.util.*;
 class CHEFSIGHN 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		int t,ctr1,ctr2,max;
		String s;
		char ch;
		t=in.nextInt();
		while(--t>=0)
		{
			max=0;
			ctr1=0;
			ctr2=0;
			s=in.next();
			int l=s.length();
			for(int i=0;i<l;i++)
			{
				ch=s.charAt(i);
				if(ch=='<')
				{
					ctr1++;
					ctr2=0;
				}
				else if(ch=='>')
				{
					ctr1=0;
					ctr2++;
				}
				
				max=Math.max(max,Math.max(ctr1, ctr2));
			}
			System.out.println(max+1);
		}
	}
}
