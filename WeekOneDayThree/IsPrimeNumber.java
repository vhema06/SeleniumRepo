package WeekOneDayThree;

public class IsPrimeNumber {
	
	public static boolean isPrime(int num)
	{
		if (num <=1)
			return false;
		
		for (int i=2; i<num/2;i++)
		{
			if (num% i==0)
				
		
		return false;
		}
		return true;
		
}	

public static void main(String[] args) {
	int number=13;
	if(isPrime(number))
	
		System.out.println(number+ "is prime number");
	else 
		System.out.println(number + "is not primenumber");
	

	
}
}