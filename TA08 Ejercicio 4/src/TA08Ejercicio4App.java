
public class TA08Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Serie[] series = new Serie[4];

		series[0] = new Serie("El señor de los anillos", 5, "Aventuras", "Peterson");
		series[1] = new Serie("Máquinas", 7, "Acción", "Fajardo");
		series[2] = new Serie("Edificios chulos", 3, "Aventuras", "Josseppe");
		series[3] = new Serie("Pluto", 9, "Aventuras", "Peterson");


		// Contar y publicados y hacer print
		System.out.println("Listado de series \n ");
		for (int i=0; i < series.length; i++) {
			System.out.println("Serie " + (i+1) + "\n" + series[i].toString());
		}
	}
}
