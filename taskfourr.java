package assignments;

public class taskfourr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =14;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j<n/2-i||j-2+n/2<i) 
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
