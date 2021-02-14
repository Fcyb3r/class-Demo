package main;

public class Main {

	public static void main(String[] args) {
		Omer custom = new Omer(); // custom yerine herhangi bir sey yazabilirsiniz (custom kısmına) new denn
		// sonraki kısım obje oluşturuyor knk

		Omer custom2 = new Omer(); // ben de ne oldugunu anlamadım

		custom = custom2;
		/*
		 * classlar referance type'tir
		 */
		Omer.add();
		Omer.remove();
		Omer.update();

		// claslar bu kadardı
	}

}
