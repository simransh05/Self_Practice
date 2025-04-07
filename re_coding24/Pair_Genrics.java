package re_coding24;

public class Pair_Genrics<k, v> {
	k val;
	v key;

	public static void main(String[] args) {
		Pair_Genrics<Integer, Integer> pg = new Pair_Genrics<>();
		pg.key = 10;

		Pair_Genrics<Integer, Boolean> pg1 = new Pair_Genrics<>();
		pg1.val = 10;
		pg1.key = true;
	}

}
