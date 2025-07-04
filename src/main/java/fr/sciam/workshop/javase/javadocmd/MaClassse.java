package fr.sciam.workshop.javase.javadocmd;

public class MaClassse {

  public static void saluer(String prenom) throws Exception {
    if (prenom == null) {
      System.out.println("Bonjour");
    } else {
      System.out.println("Bonjour " + prenom.toUpperCase());
    }
  }
}
