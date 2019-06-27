package ma.exelib.projet.classes;

public class Employe extends Personne{
	
	///COMMENTAIRE BRANCHES
	
	protected double Salaire;
	
	public Employe( String nom, String prenom, double salaire) {
		super( nom, prenom);
		Salaire = salaire;
	}

	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString() +"Salaire=" + Salaire   ;
	}

	
	
	

}
