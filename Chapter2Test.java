import java.util.Scanner;
public class Chapter2Test {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    System.out.println("Give integer pls");
    int x = scan.nextInt();
    System.out.println("Ok one more");
    int y = scan.nextInt();
  
    double answer = (x + y) / 2.0;

    System.out.println("Ok your average is: " + answer);

  }
}