import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("______________________");
    System.out.println("Входные параметры");
    Scanner sc = new Scanner(System.in);

    int height = scannerIntInput(sc, MessageUtil.heightTextString());
    int width = scannerIntInput(sc, MessageUtil.widthTextString());

    printDiamond(height, width);
  }

  private static int scannerIntInput(Scanner sc, String param) {
    int number;
    do {
      System.out.print(param);
      while (!sc.hasNextInt()) {
        MessageUtil.inputError();
        sc.next();
      }
      number = sc.nextInt();
    } while (number < 1);
    return number;
  }

  private static void printDiamond(int height, int width) {
    MessageUtil.workingText();
    final StringBuilder preLine = new StringBuilder(width).append(" ".repeat(width));
    boolean edgeDec = false;
    int delta = 0;
    int oneEdge = 0;
    String symbol = "#";

    for (int i = 0; i < height; i++) {
      StringBuilder line = new StringBuilder(preLine);
      int index = centerPos(width) + delta + oneEdge;
      line.replace(index, index + 1, symbol);
      index = centerPos(width) - delta;
      line.replace(index, index + 1, symbol);
      System.out.println(line);

      if (i < centerPos(height) && delta < (width - centerPos(width) - 1) && !edgeDec) {
        if (width % 2 == 0 && (width - centerPos(width) - 2 - delta) == 0) {
          oneEdge = 1;
        } else {
          delta++;
        }
      }
      if (height - i <= (width - centerPos(width)) && delta > 0) {
        edgeDec = true;
        delta--;
      }
      if (i == height - 2) {
        oneEdge = 0;
      }
    }
  }

  private static int centerPos(int pos) {
    return pos % 2 == 0 ? pos / 2 - 1 : pos / 2;
  }
}
