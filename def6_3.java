package lab111;
import java.util.*;
public class def6_3 {
	static public int a[][]=new int [20][20];
	static public void llenar(int n) {
		int c=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j]=c;
				c=c+1;
			}
		}
	}
	public static void mostrar(int n) {
		System.out.println("");
		for(int i=1;i<=n;i++) {
			System.out.println("");
			for(int j=1;j<=n;j++) {
				System.out.print(" "+a[i][j]);	
			}
		}
	}
	public static void intercambio(int n) {
		int li=1;
		for(int k=1;k<=n;k++) {
			for(int i=li;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					int x=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=x;
					
				}
				li=li+1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.print("intro n: ");
		int n=sc.nextInt();
		llenar(n);
		mostrar(n);
		intercambio(n);
		mostrar(n);
	}

}
