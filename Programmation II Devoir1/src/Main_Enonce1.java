
public class Main_Enonce1 {

	public static void main(String[] args) {
		Enonce1 e1 = new Enonce1();
		e1.afficher(new boolean[]{true, false, true, false});
		e1.non(new boolean[]{true, false, true}); // faire Scanner pour ecrire notre propre liste
		e1.et(new boolean[]{true, false, true}, new boolean[] {true,true,false});
		e1.reduireEt(new boolean[]{true, true, true, false});
	
	}

}
