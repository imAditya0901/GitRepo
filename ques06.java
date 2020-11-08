
public class ques06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, n=1; int i;
		while(count<10001) {
			n+=1;
			for( i=2; i<=n; i++) {
				if(n%i==0) {
					break;
				}
			}
			if(i==n) {
				count+=1;
			}
		}
		System.out.println("The 10001st prime num is "+n);
	}

}
