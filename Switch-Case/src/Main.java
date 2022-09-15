
public class Main {

	public static void main(String[] args) {
		int sayi1 = 11;
		int sayi2 = 49;

		char operator = '+';

		switch (operator) {
		case '+':
			System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
			break;
		case '-':
			System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
			break;
		case '*':
			System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
			break;
		case '/':
			System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
			break;
		default:
			System.out.println("Unvalid operator, please enter another operator.");
			break;
		}
	}
}
