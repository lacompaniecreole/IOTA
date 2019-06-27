package ma.exelib.projet.classes;

public class Etudiant extends Personne {
	
	private String Cne;

	public Etudiant( String nom, String prenom,String cne) {
		super( nom, prenom);
		Cne = cne;
	}

	public String getCne() {
		return Cne;
	}

	public void setCne(String cne) {
		Cne = cne;
	}

	@Override
	public String toString() {
		return super.toString() + "Cne=" + Cne ;
	}
	
	

}
