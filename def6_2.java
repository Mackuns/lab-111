package lab111;
import java.util.*;
public class def6_2 {
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
	static public void rombo(int n) {
		int li=(n/2)+1,ls=li,c=1,j,i;
		for(i=n;i>=1;i--) {
			for(j=li;j<=ls;j++) {
				a[i][j]=c;
				c=c+1;
				}
			if(i<=(n/2)+1) {
				li=li+1;
				ls=ls-1;
			}else {
				li=li-1;
				ls=ls+1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.print("intro n: ");
		int n=sc.nextInt();
		rombo(n);
		mostrar(n);
	}

}
