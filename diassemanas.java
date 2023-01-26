

import java.util.Random;
import java.util.Scanner;

public class diassemanas {
  public static void main(String[] args) {
    String[] palabras = {"Homofobia", "Racismo", "Machismo", "Xenofobia", "Gordofobia","Depresion","Perroflauta","Angelo","Facha","Autismo","Peruano","Ludopaita"};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un dia de la semana:");
    String dia = scanner.nextLine();
    Random random = new Random();
    int index = random.nextInt(palabras.length);
    System.out.println("Hoy es " +dia+" de: " + palabras[index]);
  }
}
