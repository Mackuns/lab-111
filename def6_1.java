package lab111;
import java.util.*;
public class def6_1 {
	static public int a[][]=new int [20][20];
	public static void mostrar(int n) {
		System.out.println("");
		for(int i=1;i<=n;i++) {
			System.out.println("");
			for(int j=1;j<=n;j++) {
				System.out.print(" "+a[i][j]);	
			}
		}
	}
	public static void cuatroele(int n) {
		int li=1,ls=n,i,j,c=1;
		for(int k=1;k<=n/2;k++) {
			i=ls;
			for(j=ls;j>=li;j--) {
				a[i][j]=c;
				c=c+1;
			}
			j=li;
			for(i=ls-1;i>=li;i--) {
				a[i][j]=c;
				c=c+1;
			}			
			j=ls;
			for(i=ls-1;i>=li;i--) {
				a[i][j]=c;
				c=c+1;
			}
			i=li;
			for(j=ls-1;j>=li+1;j--) {
				a[i][j]=c;
				c=c+1;
			}
			li=li+1;
			ls=ls-1;
		}
		if(n/2>=1) {
			a[ls][li]=c;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.print("intro n: ");
		int n=sc.nextInt();
		cuatroele(n);
		mostrar(n);

	}

}
