import java.util.Scanner;

public class Main {
  static class LineFunction {
    double k;
    double b;

    public LineFunction(double k, double b) {
      this.k = k;
      this.b = b;
    }
  }

  public static void main(String[] args) {
    MessageUtil.startMessage();
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
    String symbol = "#";

    for (int i = 0; i < height; i++) {
      StringBuilder line = new StringBuilder(preLine);
      LineFunction leftFunc = i <= centerPos(height)
              ? findEqFunction(centerPos(width), 0, 0, centerPos(height))
              : findEqFunction(0, centerPos(width), centerPos(height), height);
      LineFunction rightFunc = i <= centerPos(height)
              ? findEqFunction(centerPos(width), width, 0, centerPos(height))
              : findEqFunction(width, centerPos(width), centerPos(height), height);
      if (i == 0 || i == height - 1) {
        line.replace(centerPos(width), centerPos(width) + 1, symbol);
      } else {
        int index = getXFromY(i, leftFunc);
        line.replace(index, index + 1, symbol);
        index = getXFromY(i, rightFunc);
        if (index == width) {
          --index;
        }
        line.replace(index, index + 1, symbol);
      }
      System.out.println(line);
    }
  }

  private static LineFunction findEqFunction(double x1, double x2, double y1, double y2) {
    double k = (y1 - y2) / (x1 - x2);
    double b = y2 - k * x2;
    return new LineFunction(k, b);
  }

  private static int centerPos(int pos) {
    return pos % 2 == 0 ? pos / 2 - 1 : pos / 2;
  }

  private static int getXFromY(int y, LineFunction func) {
    return (int) ((y - func.b) / func.k);
  }
}
