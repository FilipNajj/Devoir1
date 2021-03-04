import java.util.Arrays;

public class Enonce1 {
	
	private boolean [] resultat;//stock le resultat du et
	private boolean r = true;
	
	
	//1
	public void afficher(boolean a[]) { //la methode et de type String et non boolean[] car on ne peut pas retourner un array autre que string
		System.out.println(Arrays.toString(a));//il faut convertir a en string avec toString pour pouvoir afficher le resultat. C'est aussi pourquoi la methode afficher retourne un string
	}
	
	//2
	public String non(boolean a[]) {
		for(int i=0; i<a.length; i++)
		{
			 a[i] = !a[i];
		}
		afficher(a); // résultat de afficher(non(a)).
		return Arrays.toString(a);
	}
	
	//3
		public String et(boolean[] b, boolean[] c) {
			if(b.length==c.length) 
			{
			resultat = new boolean[b.length]; //si les deux tableaux sont égaux, on crée une table pour stocker les résultats
			for(int i=0; i<b.length; i++)
			{
				resultat[i] = (b[i] && c[i]); // on stock les resultats dans la table resultat
			}
			afficher(resultat);//résultat de afficher(et(a,b)) 
			non(resultat); //résultat de afficher(non(et(a,b)))
			} else 
			{
				System.out.println("Erreur! Les deux tableaux n'ont pas une taille égale");
			}
			
			return Arrays.toString(resultat);
		}
	
		//4
		public boolean reduireEt(boolean[] x) {
			for(int i=0; i<x.length; i++)
			{
			r = r && x[i];	
			}
			System.out.println(r);
			return r;
		}
	

}
