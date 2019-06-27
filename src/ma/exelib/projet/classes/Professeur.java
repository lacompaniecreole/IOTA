package ma.exelib.projet.classes;

public class Professeur extends Employe{
	
	private String Specialite;

	public Professeur( String nom, String prenom, double salaire,String specialite) {
		super(nom, prenom, salaire);
		Specialite = specialite;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	@Override
	public String toString() {
		return super.toString() + "Specialite=" + Specialite ;
	}

}
