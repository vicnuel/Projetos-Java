public class SalarioLiquidoProf {
	public static void main(String[] args) {
		double valor_hora, perc_inss;
		double sal_bruto, desc_inss, sal_liq;
		int horas_trab;
		
		System.out.print("Valor da hora-aula: ");
		valor_hora = Double.parseDouble(System.console().readLine());
		System.out.print("Numero de horas trabalhadas: ");
		horas_trab = Integer.parseInt(System.console().readLine());
		System.out.print("Percentual de desconto INSS: ");
		perc_inss = Double.parseDouble(System.console().readLine());
		
		sal_bruto = valor_hora * horas_trab;
		desc_inss = perc_inss / 100 * sal_bruto;
		sal_liq = sal_bruto - desc_inss;
		
		System.out.printf("Salario liquido do professor = R$ %.2f", sal_liq);
	}
}
