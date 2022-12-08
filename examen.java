package lab111;
import java.util.*;
public class examen {
	static public int v[]=new int [40];
	static public void llenar(int n) {
		Scanner sc= new Scanner(System.in);	
		for(int i=1;i<=n;i++) {
			System.out.print("a["+i+"]= ");
			int c=sc.nextInt();
			v[i]=c;
		}
	}
	static public void fibX(int x) {
		int i,a=0,d=1,b=1,c=0;
		for(i=1;i<=x;i++){
			c=c+1;
			if(c==d) {
				c=0;
				v[i]=v[i]+d;
				d=a+b;
				a=b;
				b=d;
			}
		}
	}
	public static void mostrar(int n) {
		System.out.println(" ");
		for(int i=1;i<=n;i++) {
			System.out.print(" "+v[i]);	
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.print("intro n: ");
		int n=sc.nextInt();
		llenar(n);
		mostrar(n);
		fibX(n);
		mostrar(n);
	}

}
