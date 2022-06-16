package exempleAbstraction;

public class Stylo extends OutilEcriture implements Debouchable {
	//le stylo est un outil d'écriture qui peut écrire sur le papier
	//le stylo est débouchable
	
	private boolean debouche;
	
	public Stylo() {
		super(); //je peux appeler le constructeur du parent comme d'habitude vu que c'est un objet Stylo que je crée
		this.debouche = false;
	}

	public Stylo(String couleur) {
		super(couleur);
		this.debouche = false;
	}
	
	//méthode qui renvoie si l'outil peut écrire au tableau
	//implémentation de la méthode abstraite présente dans OutilEcriture
	public boolean canWriteOnBoard() {
		return false;
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
	
	//le stylo ne peut écrire que s'il est débouché
	@Override
	public void write(String texte) {
		if(isDebouche()) {
			super.write(texte);
		}else {
			System.out.println("erreur : le stylo est bouché");
		}
		
	}
}
