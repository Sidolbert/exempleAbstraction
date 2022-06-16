package exempleAbstraction;

public class Crayon extends OutilEcriture {
	
	//le crayon non plus ne peut pas écrire au tableau

	public Crayon() {
		super("grise");
	}

	public Crayon(String couleur) {
		super(couleur);
		// TODO Auto-generated constructor stub
	}

	
	//on surcharge la méthode abstraite d'OutilEcriture
	@Override
	public boolean canWriteOnBoard() {
		
		return false;
	}

}
