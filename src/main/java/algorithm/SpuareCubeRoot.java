package algorithm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @description: 求解平方根，立方根
 * @author: lingjian
 * @create: 2020/7/30 10:03
 */
public class SpuareCubeRoot {

  /**
   * 求平方根、立方根 使用牛顿迭代法 xk+1 = xk - f(xk)/f`(xk) k = 0,1,2,3... 平方根 f(xk) = x^2 - a f`(xk) = 2 * x 立方根
   * f(xk) = x^3 - a f`(xk) = 3 * x
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个数");
    double input = sc.nextDouble();

    // 求平方根
    double square = getSquareRoot(input);
    System.out.printf("%.1f\n", square);
    // 求立方根
    double cube = getCubeRoot(input);
    System.out.printf("%.1f\n", cube);
  }

  public static double getSquareRoot(double input) {
    double x = 1;
    double x1 = x - (x * x - input) / (2 * x);
    // double有精度损失
    while (x - x1 > 0.00000001 || x - x1 < -0.00000001) {
      x = x1;
      x1 = x - (x * x - input) / (2 * x);
    }
    return x1;
  }

  public static double getCubeRoot(double input) {
    double x = 1;
    double x1 = x - (x * x * x - input) / (3 * x * x);
    // double有精度损失
    while (x - x1 > 0.00000001 || x - x1 < -0.00000001) {
      x = x1;
      x1 = x - (x * x * x - input) / (3 * x * x);
    }
    return x1;
  }
}
