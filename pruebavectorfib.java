package lab111;
import java.util.*;
public class pruebavectorfib {
	static public int v[]=new int [20];
	static public void llenar(int n) {
		Scanner sc= new Scanner(System.in);	
		for(int i=1;i<=n;i++) {
			System.out.print("a["+i+"]= ");
			int c=sc.nextInt();
			v[i]=c;
		}
	}
	static public void sumarfibo(int n) {
		int i,c=2,x=fibo(c),k=1;
		for(i=1;i<=n;i++){
			
			if(k==x) {
				v[i]=v[i]+x;
				c=c+1;
				k=1;
				x=fibo(c);
			}else {
				k=k+1;
			}
		}
	}
	static public int fibo(int w) {
		int a=-1,b=1,i,k=0,d;
		for(i=1;i<=w;i++) {
			d=a+b;
			k=d;
			a=b;b=d;
		}
		return k;
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
		sumarfibo(n);
		mostrar(n);

	}

}
