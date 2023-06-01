package DemoPackage;

public class MButterFly {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			if(i<=n/2) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=i;k<n/2;k++) {
				System.out.print(" ");
			}
			for(int m=n/2;m>i;m--) {
				System.out.print(" ");
			}
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
			
			}
			else {
				for(int j=i-(n/2);j<n/2;j++) {
				System.out.print("*");
				}
				for(int k=1;k<=i-(n/2);k++) {
					System.out.print(" ");
				}
				for(int m=1;m<=i-(n/2);m++) {
					System.out.print(" ");
				}
				for(int a=n/2;a>i-(n/2);a--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
