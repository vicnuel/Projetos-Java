public class NovoSalarioFunc {
	public static void main(String[] args) {
		double salario_atual, perc_aumento;
		double novo_sal, val_aumento;
		
		System.out.print("Salário atual do funcionário: ");
		salario_atual = Double.parseDouble(System.console().readLine());
		System.out.print("Percentual de aumento: ");
		perc_aumento = Double.parseDouble(System.console().readLine());
		
		val_aumento = salario_atual * perc_aumento / 100;
		novo_sal = salario_atual + val_aumento;
		
		System.out.printf("Valor do aumento = R$ %.2f\n", val_aumento);
		System.out.printf("Novo salário = R$ %.2f", novo_sal);
	}
}
