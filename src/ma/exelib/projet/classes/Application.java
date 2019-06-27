package ma.exelib.projet.classes;

public class Application {

	public static void main(String[] args) {

		Personne[] personnes = new Personne[6];
	///	personnes[0]= new Etudiant ("Durant","Clement", " Bougarel sur iseudre");
	////	personnes[1]= new Etudiant ("Durand","Marc", " Bougarel sur iseudre");
		personnes[2]= new Employe ("DEEDD","Julius",  1000);
		personnes[3]= new Employe ("AZAZS","Jerome",  8000);
		personnes[4]= new Professeur ("DEEDD","Julius", 5, "Bio");
		personnes[5]= new Professeur ("DEEDD","JCIzeur",1.5, "Poterie");

		for (Personne p : personnes) {
			System.out.println(p);
		}

	}

}

//un commentaire pour tester github
