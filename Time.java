import java.util.*;
public class Time{
	/***  Return random number*/
	public static int[] TimeInterval(int n,int WindowSize,int d)
	{

		int a[] = new int[n];
		int	IndexEntry,i;
		    i = 0;
		Random rand = new Random( System.currentTimeMillis());

		for( IndexEntry = 0; IndexEntry < n; )
		{
			int r = rand.nextInt( WindowSize );
			int diff;
			boolean Duplicate;

			Duplicate = false;

			for(int j = 0; j < IndexEntry; ++j)
			{
				if( r > a[j])
				{
					diff = r - a[j];
				}
				else
				{
					diff = a[j] - r;
				}

				if (diff < d)
					{
					Duplicate = true;

			break;
					}
			}

			if (!Duplicate)
				{
				a[IndexEntry] = r;
				++IndexEntry;
				//System.out.println(IndexEntry+"  "+r);
				}
				else{
					//System.out.println(r);
					i++;
					if(i>n*4)
					{

					 System.out.println("error in generating time");
					System.exit(0);
				     }
				    }
		        }

            return a;

	 }
	public static void main(String args[])
	{
		    int m, s, h;
			int total;
			total = 10;
			m = 0;
			s = 0;
			h = 0;
	System.out.println("Enter the starting time HH:MM:SS");
	Scanner in = new Scanner(System.in);
	int H=in.nextInt();
	int M=in.nextInt();
	int S=in.nextInt();
	int [] b = TimeInterval(total, 60, 4);
	for(int i = 0; i < total; ++i)
			{
				h = H + b[i] / 3600;
				m = M + (b[i] % 3600) / 60;
				s = S +	(b[i] % 60);

				if (s > 59)
				{
				s = s % 60;
				++m;
				}

				if (m > 59)
				{
				m = m % 60;
				++h;
				}

				System.out.println(h+":"+m+":"+s);
		}

}

}