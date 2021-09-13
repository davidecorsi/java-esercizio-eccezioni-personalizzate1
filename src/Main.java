/*
 * L'applicazione deve contare e restituire il numero di valori dispari presenti nell'array. Qualora il
 * riferimento sia null, il metodo deve sollevare un eccezione di tipo EccezioneArray. Nel caso venga
 * sollevata l'eccezione il metodo main deve visualizzare un messaggio di errore.
 */
public class Main {
	public static void main(String[] args) {
		int[] x = leggi();
		try {
			int y = nDispari(x);
			System.out.println(y);
		} catch(EccezioneArray e) {
			System.out.println(e.getMessage());
		}
	}

	private static int nDispari(int[] x) {
		int c = 0;
		try {
			for(int n: x) {
				if(n % 2 == 1) {
					c++;
				}
			}
		} catch(NullPointerException e) {
			throw new EccezioneArray("La variabile non ha nessun riferimento");
		}
		return c;
	}

	private static int[] leggi() {
//		return new int[] {3, 5, 8, 15, 20};
		return null;
	}
}
