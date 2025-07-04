package fr.sciam.workshop.javase.importmodule;

//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
import module java.base;

//import java.sql.Connection;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
import module java.sql;

public class MainImportModule {

  public static void main(String[] args) {
    List<Integer> nombres = IntStream.of(1, 2, 3, 4, 5)
        .boxed()
        .collect(Collectors.toList());
    nombres.forEach(System.out::println);

    List<String> langages = Arrays.asList("Java", "Perl", "Javascript", "C#");

    langages.stream()
        .filter(s -> s.startsWith("J"))
        .forEach(System.out::println);

    Connection conn = null;

    try {
      SAXParserFactory factory = SAXParserFactory.newInstance();
      SAXParser saxParser = factory.newSAXParser();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
