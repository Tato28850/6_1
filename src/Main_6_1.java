/** Programa para conmutar una serio de 20 bombillas con un interruptor general 
 *  y con un menu de salida de las opciones a eleguir
 * @author 		al037397
 * @version 	1.0
 * @since		25/01/2019
 */
import java.util.Scanner;

public class Main_6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Bombilla array[]= new Bombilla[20];
		int i,pos,op ;
		for (i = 0;i < 20 ; i++) {
			array[i] = new Bombilla();
		}
		do { //menu de salida
			System.out.println("1. Encender el interruptor general");
			System.out.println("2. Apagar el interruptor general");
			System.out.println("3. Encender el interruptor de una bombilla");
			System.out.println("4. Apagar el interruptor de una bombilla");
			System.out.println("5. Mostrar estado bombillas");
			System.out.println("6. Fin");
			System.out.println("Introduce una opción");
			op= sc.nextInt();
			switch (op) {
				case 1: Bombilla.encenderIG();
						break;
				case 2: Bombilla.apagarIG();
						break;
				case 3: System.out.println("¿Que bombilla quieres encender?");
						pos = sc.nextInt();
						//encendemos el interruptor de una bombilla
						array[pos-1].encenderIB();
						break;
				case 4: System.out.println("¿Que bombilla quieres apagar?");		
						pos = sc.nextInt();
						//encendemos le interruptor de una bombilla
						array[pos-1].apagarIB();
						break;
				case 5: System.out.print("El interruptor General esta "); //estado del interruptor general
							if (Bombilla.estadoIG()) {
								System.out.print("encendido");
						} 
							else {
								System.out.print("apagado");
						}
						System.out.println();//estado de las bombillas
						for (i = 0 ;i < 20 ; i++) {	
							if(array[i].estado())
								System.out.println("Bombilla " + (i+1) + " encendida");
							else
								System.out.println("Bombilla " + (i+1) + " apagada");									
						}
						break;
				case 6: if (Bombilla.estadoIG()) {
							System.out.println("El interruptor general está encendido");
						}
						else {
							System.out.println("Elinterruptor general general está apagado");
						}
				case 7: System.out.println("Fin");
						break;
				default: System.out.println("opcion erronea");
			}
		}while (op != 6);
		
		
	sc.close();
	}	
	
	
}


