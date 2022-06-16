package exempleAbstraction;

//classe qui représente des feutres
public class Feutre extends OutilEcriture implements Debouchable {
	
	private boolean debouche;
	
	//le feutre est un outil d'écriture qui peut écrire au tableau
	public Feutre() {
		super();//je peux appeler le constructeur du parent comme d'habitude vu que c'est un objet Feutre que je crée
		debouche = false;
	}
	
	public Feutre(String couleur) {
		super(couleur);
		debouche = false;
	}
	
	//méthode qui renvoie si l'outil peut écrire au tableau
	//implémentation de la méthode abstraite présente dans OutilEcriture
	public boolean canWriteOnBoard() {
		return true;
	}
	
	//j'implémente TOUTES les méthodes abstraites de l'interface Debouchable
		@Override
		public void deboucher() {
			this.debouche = true;
			
		}

		@Override
		public void boucher() {
			this.debouche = false;
			
		}

		@Override
		public boolean isDebouche() {
			return this.debouche;
		}
	
		//le feutre ne peut écrire que s'il est débouché
		@Override
		public void write(String texte) {
			if(isDebouche()) {
				super.write(texte);
			}else {
				System.out.println("erreur : le feutre est bouché");
			}
			
		}
}
