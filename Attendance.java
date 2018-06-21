import java.util.Random;
import java.util.*;
public class Attendance{
	public static void main(String args[])
	{
	int m, s, h;
	int n;
    int[] a = new int[10];
	m = 0;
	s = 0;
	h = 0;
	n = 10;


	System.out.println("Enter the starting time HH:MM:SS");
	Scanner in = new Scanner(System.in);
	int H=in.nextInt();
	int M=in.nextInt();
	int S=in.nextInt();
	int	IndexEntry;

	Random rand = new Random(System.currentTimeMillis());

	for(IndexEntry = 0; IndexEntry < n; )
	{
		int r = rand.nextInt(600);
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

			if (diff < 4)
				{
				Duplicate = true;

		break;
				}
		}

		if (!Duplicate)
			{
			a[IndexEntry] = r;
			++IndexEntry;
			System.out.println(IndexEntry+"  "+r);
			}
			else{
				System.out.println(r);
			}
	}

	for(int i = 0; i < n; ++i)
	{
		h = H + a[i] / 3600;
		m = M + (a[i] % 3600) / 60;
		s = S +	(a[i] % 60);

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