import java.util.Scanner;

public class Questoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner werike = new Scanner(System.in);
		
		
		double x = werike.nextDouble();
		double y = werike.nextDouble();
		double z = werike.nextDouble();
		double area;
		double preco;
		
		area = x * y;
		preco = x * y * z;
		
		System.out.printf("Área: %.2f %n", area);
		System.out.printf("Preço: %.2f %n", preco);
		
		
		werike.close();

	}

}
