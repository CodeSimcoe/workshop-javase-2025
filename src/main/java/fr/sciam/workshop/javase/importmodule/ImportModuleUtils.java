package fr.sciam.workshop.javase.importmodule;

import module java.base;
import module java.desktop;

import java.util.*;

public class ImportModuleUtils {
  public static void afficher(List<String> liste, Dimension taille) {
    Console console = System.console();
    if (console != null) {
      System.out.println(liste + " " + taille);
    }
  }
}
