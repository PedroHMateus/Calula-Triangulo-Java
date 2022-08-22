package pacote;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//instanciar o objeto
	Triangulo teste = new Triangulo();

	
	Locale.setDefault(Locale.US);	//linguagem usada, US.
	Scanner entrada = new Scanner(System.in); // declaração do scanner.
	
	teste.areaX(0);
	teste.areaY(0);

		
	System.out.println("Digite as medidas do triangulo X:");
		Double xA = entrada.nextDouble();
		Double xB = entrada.nextDouble();
		Double xC = entrada.nextDouble();
		
	System.out.println("Digite as medidas do triangulo Y:");
		Double yA = entrada.nextDouble();
		Double yB = entrada.nextDouble();
		Double yC = entrada.nextDouble();
	
		if (a>p) {
		 System.out.println("O Triangulo Y é maior !");
}
	  else {
		 System.out.println("O triangulo X é maior !");
	  }
	}
	}