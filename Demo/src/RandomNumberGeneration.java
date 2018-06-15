public class RandomNumberGeneration {

	public static short randomNumber() {
		short n =  (short) (Math.random()*(9999) + 1);
		return n;
	}

}
