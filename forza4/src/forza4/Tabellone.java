package forza4;

/*
 * 
 * 
 */

public class Tabellone implements Griglia {
	 private Gettone[][] tabellone;

	public Tabellone() {
		tabellone = new Gettone[6][7];
	}

	@Override
	public void insert(int colonna) {
		// TODO Auto-generated method stub
		
	}

	/*public void insert(int colonna, Umano p) {
		for (int i = 0; i < 6; i++) {
			if ((tabellone[i][colonna].getColore() == null)) {
				tabellone[i][colonna] = new Gettone(p.getColore);
			}

		}
		

	}*/

}
