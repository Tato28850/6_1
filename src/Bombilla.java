/** clase donde definimos las opciones de las bombillas y su estado
 *  
 * @author al037397
 * @version 	1.0
 * @since		25/01/2019
 */
public class Bombilla {
	private static boolean interruptorG = false;
	private boolean interruptorB;
	
	public Bombilla () {
		interruptorB = false;
	}
	public static void apagarIG() {
		interruptorG = false;
	}
	public static void encenderIG() {
		interruptorG = true;
	}
	public void apagarIB() {
		interruptorG = false;
	}
	public void encenderIB() {
		interruptorB = true;
	}
	public boolean estado() {
		boolean sw = false;
		if(interruptorG && interruptorB)
			sw = true;
		return sw;
	}
	public static boolean estadoIG() {
		return interruptorG;
	}
}
