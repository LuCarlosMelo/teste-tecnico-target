import java.util.Locale;

public class Questao4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		final double TOTAL = sp + rj + mg + es + outros;
		
		
		System.out.println("SP: " + percentual(sp,TOTAL) + "%");
		System.out.println("RJ: " + percentual(rj,TOTAL) + "%");
		System.out.println("MG: " + percentual(mg,TOTAL) + "%");
		System.out.println("ES: " + percentual(es,TOTAL) + "%");
		System.out.println("Outros: " + percentual(outros,TOTAL) + "%");
	}
	
	public static String percentual(double local, double total) {
		double percentual = local / total * 100;
		return String.format("%.2f", percentual);
	}
	
}
