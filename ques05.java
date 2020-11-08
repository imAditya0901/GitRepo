
public class ques05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lp=0;  //lp is largestPalindrome initially taken zero
		for(int i=999; i>=0; i--)  //coz max 3-digit num can be 999
		{
			for(int j=999; j>=0; j--)
			{
				long prod= i*j;
				if(prod== reverse(prod) && prod>lp) {
					lp=prod;
				}
			}
		}
		System.out.println(lp);
	}

	private static long reverse(long prod) {
		// TODO Auto-generated method stub
		long reverse=0;
		while(prod!=0) {
			long unitDigit= (prod)%10;
			reverse= reverse*10 + unitDigit;
			prod=prod/10;
		}
		return reverse;
	}

}
