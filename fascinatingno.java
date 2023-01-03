import java.util.Scanner;
public class fascinatingno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		int n2=n1*2;
		int n3=n1*3;
		int count=0;
		String n=String.valueOf(n1)+String.valueOf(n2)+String.valueOf(n3);
		char b[]=n.toCharArray();
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>=b[j]) {
					char temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			System.out.println(b[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			if(i+1>=b.length) {
				break;
			}
			if(b[i]==b[i+1]) {
				break;	
			}
			else {
				count++;
			}
		}
		if(count==b.length-1) {
			System.out.println("Fascinating no");
		}
		else {
			System.out.println("not Fascinating no");

		}
	}

}
