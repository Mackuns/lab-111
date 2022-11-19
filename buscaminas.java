package lab111;

import java.util.*;

public class buscaminas {
	static public int a[][]=new int [20][20];
	static public int b[][]=new int [20][20];
	
	static public void llenarMaA(int w) {
		for(int i=1;i<=w;i++) {
			for(int j=1;j<=w;j++) {
				a[i][j]=0;
			}
		}
	}
	static public void llenarMaB(int w) {
		for(int i=1;i<=w;i++) {
			for(int j=1;j<=w;j++) {
				b[i][j]=9;
			}
		}
	}
	static public void mostrarMa(int w) {
		int q=w;
		System.out.println("");
		for(int i=1;i<=w;i++) {
			System.out.println("");
			for(int j=1;j<=q;j++) {
				System.out.print(" "+a[i][j]);
			}
			
		}
	}
	static public void mostrarMaB(int w) {
		int q=w;
		System.out.println("");
		for(int i=1;i<=w;i++) {
			System.out.println("");
			for(int j=1;j<=q;j++) {
				System.out.print(" "+b[i][j]);
			}
			
		}
	}
	static public void minas(int n) {
		int c = 0;
		while(c<n) {
			double x = Math.random()*n; 
			double y = Math.random()*n;
			if (x!=0 && y!=0 && x!=n-1 && y!=n-1){
				a[(int)x] [(int)y] = 9;
				c= c+1;
			}
		}
	}
	
	static public void llenar2(int n, int m) {
		int i=n, j=m;
		a[i-1][j-1]++;
		a[i-1][j]++;
		a[i-1][j+1]++;
		a[i][j-1]++;
		a[i][j]=9;
		a[i][j+1]++;
		a[i+1][j-1]++;
		a[i+1][j]++;
		a[i+1][j+1]++;
	}
	static public void busc( int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(a[i][j]>=9) {
					llenar2(i,j);
					a[i][j]=9;
				}
			}
		}
	}
	static public void mostrar1(int i,int j) {
		b[i][j]=a[i][j];
	}
	static public void mostrar8(int i,int j) {
		b[i-1][j-1]=a[i-1][j-1];
		b[i-1][j]=a[i-1][j];
		b[i-1][j+1]=a[i-1][j+1];
		b[i][j-1]=a[i][j-1];
		b[i][j]=a[i][j];
		b[i][j+1]=a[i][j+1];
		b[i+1][j-1]=a[i+1][j-1];
		b[i+1][j]=a[i+1][j];
		b[i+1][j+1]=a[i+1][j+1];
	}
	static public void busn(int n, int m) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(a[i][j]>=9) {
					a[i][j]=9;
				}
			}
		}
	}	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sw=0,o=1;
		System.out.print("recuerda ganas si pasas 10 intentos sin equivocarte y pierdes si tocas una mina");
		System.out.print("n: ");
		int n=sc.nextInt();
		llenarMaA(n);
		mostrarMa(n);
		minas(n);
		busc(n);
		busn(n,n);
		mostrarMa(n);
		llenarMaB(n);
		mostrarMaB(n);
		while(sw==0) {
			if(o!=10) {
				o=o+1;
				System.out.print("\n posicion i: ");
				int i=sc.nextInt();
				System.out.print(" posicion j: ");
				int j=sc.nextInt();
				if(a[i][j]!=0) {
					if(a[i][j]>=9){
						sw=sw+2;
						System.out.print("tocaste una mina :'(");
						mostrarMa(n);
					}else {
						mostrar1(i,j);
						mostrarMaB(n);
					}
				}else {
					mostrar8(i,j);
					mostrarMaB(n);
				}
			}else{
				sw=sw+1;
				System.out.print("\n ganaste!");
			}
		}

	}

}
