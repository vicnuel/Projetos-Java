public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio, area;
		System.out.print("Informe o raio da circunferencia: ");
		raio = Double.parseDouble(System.console().readLine());
		area = 3.14159 * raio * raio;
		System.out.printf("Area da circunferencia = %f\n", area);
	}
}