import javax.swing.JOptionPane;

public class ConvertidorDivisaAPP {

	public static void main(String[] args) {

		String valorTexto = JOptionPane.showInputDialog("Introduce un valor en Euros");
		double valor = Double.parseDouble(valorTexto);
		String moneda = JOptionPane.showInputDialog("¿A qué moneda quieres convertir el valor?");
		convertidor(valor, moneda);
	}
	
	public static void convertidor(double valor, String moneda) {
		
		double resultado = 0;
		boolean acierto = true;
		
		switch(moneda) {
			case "Libras":
				resultado = valor * 0.86;
				break;
			case "Dolares":
				resultado = valor * 1.28611;
				break;
			case "Yenes":
				resultado = valor * 129.852;
				break;
			default:
				System.out.println("No has introducido la moneda correcta");
				acierto = false;
		}
		
		if(acierto) {
			System.out.println(valor + " Euros en " + moneda + " son " + resultado + " " + moneda);
		}
	}
}
