import java.util.Scanner;
public class BinToDec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos bits tem seu numero binário: ");
		// int bits = sc.nextInt();   
		int bits = Integer.parseInt(sc.nextLine());
		 
		long[] bin = new long[bits];
		
		for (int i = 0; i < bin.length; i++) {
		
			System.out.print("Escreva o " + (i+1) + "° bit do seu número: ");
			bin[i] = sc.nextInt();
		}
			
		int decimal = 0;
		for(int i = 0; i < bin.length; i++) {
			
			decimal += bin[i] * Math.pow(2, bits - 1 - i);
			
		}
			
			
		StringBuilder r = new StringBuilder();
		for (long b : bin) {
			r.append(b);
		}
		
		System.out.print("O número binário " + r + " em decimal equivale a " + decimal);
	
		sc.close();
	}

}
           