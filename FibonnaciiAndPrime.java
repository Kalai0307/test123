package com.surprise;

public class FibonnaciiAndPrime {

	public static void main(String[] args) {
		int count = 5;
		FibonnaciiAndPrime();	

	}

	private static void FibonnaciiAndPrime() {
		// TODO Auto-generated method stub
		
				int n1 = 0, n2 = 1, n3;
				int count = 10, i = 0;
				while (true) {
					int nextTerm = n1 + n2;
					n1 = n2;
					n2 = nextTerm;
					if (isPrime(nextTerm)) {
						System.out.println(n2);
						i++;
					}
					if (i == count)
						break;
				}
			}

			static boolean isPrime(int n) {
				if (n <= 1)
					return false;
				for (int i = 2; i < n; i++)
					if (n % i == 0)
					{
						return false;
					}
				return true;
			
	}

}
