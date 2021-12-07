package org.o7planning.XOR;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int count = 0;
			int N = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int a[] = new int[N];
			int b[] = new int[N];
			long c[] = new long[1000000];

			for (int i = 0; i < N; ++i)
			{
				a[i] = sc.nextInt();
				c[(a[i] & X) ^ (a[i] & Y)]++;
			}

			for (int i = 0; i < N; ++i)
			{
				b[i] = sc.nextInt();
				count += c[(b[i] & X) ^ (b[i] & Y)];
			}
			System.out.println(count);
		}

		sc.close();

	}
}
