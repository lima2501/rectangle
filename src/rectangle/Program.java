package rectangle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com largura e altura do retângulo");
		double width = scan.nextDouble();
		double height = scan.nextDouble();

		Rectangle rectangle = new Rectangle(width, height);

		System.out.println(rectangle);

		scan.close();
	}
}
