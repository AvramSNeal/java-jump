package main;
// vvv PUT CODE BELOW THIS vvv

import java.io.*;
import java.util.*;

public class SolutionOld {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long q = input.nextInt();
		long n = 0;

		while (q-- > 0) {
			int count = 0;
			n = input.nextInt();

			if (n % Math.sqrt(n) != 0 || n<25) {
				System.out.println(0);
			} else {
				long[] arr = rightAngles(n);
				for (long b : arr) {
					long a = (long) Math.sqrt(Math.pow(n, 2) - Math.pow(b, 2));
					long p = ((a + b + n) / 2), area = (long) Math.sqrt(p * (p - a) * (p - b) * (p - n));
					if (gcd(a, b) == 1 && gcd(b, n) == 1 && (area % 6 != 0 || area % 28 != 0)) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
		input.close();
	}

	public static long gcd(long a, long b) {
		int gcd = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) { gcd = i;}
		}
		return gcd;
	}

	public static long[] rightAngles(long c) {
		long[] rAngles = new long[(int) (c - 1)];
		long aCheck = 1;

		for (int b = 1; b < c; b++) {
			double bcDif = Math.pow(c, 2) - Math.pow(b, 2);
			aCheck = (long) (bcDif % Math.sqrt(bcDif));
			if (aCheck == 0) {
				for (long bnum : rAngles) {
					if (bnum != b) {
						rAngles[b - 1] = b;
					} else {
						rAngles[b - 1] = 0;
					}
				}

			} else {
				rAngles[b - 1] = 0;
			}
		}

		return rAngles;
	}
}
