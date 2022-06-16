package exempleAbstraction;

//une interface n'est pas une classe
public interface Debouchable {
	
	//décrit ce que doit pouvoir faire un objet débouchable
	//l'objet débouchable doit contenir un attribut booléen debouche
	
	
	//contient des méthodes abstraites
	
	//un objet débouchable doit pouvoir être débouché
	public void deboucher();
	//un objet débouchable doit pouvoir être bouché
	public void boucher();
	//un objet débouchable doit pouvoir dire s'il est bouché ou non
	public boolean isDebouche();

}
