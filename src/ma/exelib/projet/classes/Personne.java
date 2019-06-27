package ma.exelib.projet.classes;

public class Personne {

	protected int Id;
	protected String Nom;
	protected String Prenom;
	
	public int count; 
	public Personne( String nom, String prenom) {
		super();
		Id = ++count;
		Nom = nom;
		Prenom = prenom;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	@Override
	public String toString() {
		return "Nom=" + Nom + ", Prenom=" + Prenom ;
	}
	
	
}
