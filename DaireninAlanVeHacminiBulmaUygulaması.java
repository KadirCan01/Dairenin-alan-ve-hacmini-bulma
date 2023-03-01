import java.util.Scanner;

public class DaireninAlanVeHacminiBulmaUygulaması {

	public static void main(String[] args) {
		
		int r;
		double alan , hacim , pi = 3.14;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz : ");
		r=input.nextInt();
		alan = 2 * pi * r;
		hacim = pi * (r*r);
		System.out.println("Dairenin Alanı : " +alan);
		System.out.println("Dairenin Hacmi : " +hacim);
		
				
		

	}

}
