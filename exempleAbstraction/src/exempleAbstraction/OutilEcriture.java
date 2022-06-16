package exempleAbstraction;

//la classe OutilEcriture est abstraite :
//on ne crée pas directement d'objet OutilEcriture
//on ne l'instanciera pas

public abstract class OutilEcriture {
	protected String couleur;
	
	public OutilEcriture() {
		couleur = "noir";
	}
	
	public OutilEcriture(String couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		// affiche le nom de la classe qui a réellement fabriqué l'objet
		return this.getClass().getSimpleName() + " de couleur " + this.couleur;
	}
	
	//l'outil écrit
	public void write(String texte) {
		System.out.println(this + " ecrit : \n" + texte);
	}
	
	//méthode abstraite : elle n'est pas implémentée, seulement définie
	public abstract boolean canWriteOnBoard();


}
