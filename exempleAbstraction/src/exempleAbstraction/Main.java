package exempleAbstraction;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Feutre f = new Feutre("rouge");
		System.out.println(f);
		Stylo s = new Stylo("vert");
		System.out.println(s);
		Crayon c = new Crayon();
		System.out.println(c);
		
		//on peut utiliser la classe abstraite comme type générique autant qu'une classe concrète
		ArrayList<OutilEcriture> trousse = new ArrayList<OutilEcriture>();
		trousse.add(f);
		trousse.add(s);
		trousse.add(c);
		System.out.println(trousse);
		for (OutilEcriture oe : trousse) {
			oe.write("Bonjour");
		}
		f.deboucher();
		f.write("le feutre peut écrire, il est débouché !");
		f.boucher();
		
		
//		//la ligne suivante cause un bug : on ne peut pas instancier une classe abstraite
//		OutilEcriture ou = new OutilEcriture();
	}

}
