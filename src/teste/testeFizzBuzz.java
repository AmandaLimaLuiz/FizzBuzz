package teste;
import java.util.*;
public class testeFizzBuzz {

	public static void main(String[] args) {
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de vezes que deseja consultar: ");
		n =  teclado.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int div3 = i % 3;
			int div5 = i % 5;
			 if ((div3 == 0) && (div5 == 0)){
				 System.out.println("FizzBuzz"); 	
			 }else if (div3 == 0 ) {
				 System.out.println("Fizz");
			 }else if (div5 == 0 ) {
				 System.out.println("Buzz");
			 }else {
				 System.out.println(i);
			 }
			 
		 }
		
		
	teclado.close();	
	}

}
