/*

Input:
======
1
20

Output:
=======
2

Explaination:
=============
from the range of prime numbers between n to l from that find the numbers that can be represented as the sum
of two consecutive prime numbers +1

13 is a prime number which can be expressed like 5+7+1=13
19 is a prime number which can be expressed like 7+11+1=19
So, the output is 2
Note: 5,7 are consecutive primes
      7,11 are consecutive primes

*/
import java.util.Scanner;
class CompanyTest_1 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();sa.nextLine();
		int l=sa.nextInt();sa.nextLine();
		int a[];
		int size=0;
		int index=0;
		int ans=0;
		for(int i=n;i<=l;i++)
			size++;
		a=new int[size];
		for(int i=n;i<=l;i++){
			int count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				a[index++]=i;
			}
		}
		size=0;
		index=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				size++;
			}
		}
		int b[]=new int[size];
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				b[index++]=a[i];
			}
		}
		int sum=0;
		for(int i=0;i<b.length-1;i++){
			sum=a[i]+a[i+1]+1;
			for(int j=0;j<b.length;j++){
				if(sum==b[j]){
					ans++;
				}
			}
		}
		System.out.print(ans);
	}
}