package animal;

public class testAnimal extends animal {

	public testAnimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		testAnimal an1 = new testAnimal();
		an1.setAge(12);
		an1.setNom("anne");
		an1.setPoid(156);
		an1.setSpeed(120);
		an1.setId(animal.getNbranimal());
		an1.afficher();
		new animal("homar",20,150,60,3).afficher();


		new chat().parler();
		new chien().parler();
	}

}
