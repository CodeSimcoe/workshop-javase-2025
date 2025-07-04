package fr.sciam.workshop.javase.primitivepattern;

public class MainPrimitivePattern {

  public static void main(String[] args) {
    System.out.println("Vérifier long avec instanceof");

    long[] longValeurs = { 85L, 999L, -128L, 40_000L, 3_000_000_000L };
    for (long valeur : longValeurs) {
      verifierLongAvecInstanceof(valeur);
      System.out.println();
    }

    System.out.println("Vérifier double avec instanceof");
    double[] doubleValeurs = { 100d, 1e16, 3.14d, -0d, Double.NaN };
    for (double valeur : doubleValeurs) {
      verifierDoubleAvecInstanceof(valeur);
      System.out.println();
    }

    System.out.println("Vérifier flottant avec switch");
    float[] floatValeurs = { 0f, 3.14f, 1.618f, -0.822f, 100f };
    for (float valeur : floatValeurs) {
      verifierFlottantAvecSwitch(valeur);
    }

    System.out.println();
  }

  private static void verifierLongAvecInstanceof(long valeur) {
  }

  private static void verifierDoubleAvecInstanceof(double valeur) {
  }

  private static void verifierFlottantAvecSwitch(float valeur) {
  }
}
