package algorithm;

import java.util.Scanner;

/**
 * @description: 求最小公倍数
 * @author: lingjian
 * @create: 2020/7/30 9:19
 */
public class LeastCommonMultiple {

  /**
   * a * b = (a, b) * [a, b] (a,b) 是求两个数的最大公约数 辗转相除法：大的数取余小的数，直到取余为0，那个数就是最大公约数 [a,b] 是求两个数的最小公倍数
   */
  public static void main(String[] args) {
    // 输入两个整数
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入两个整数A和B");
    int a = sc.nextInt();
    int b = sc.nextInt();

    // 求出两个数的最大公约数
    int max = max(a, b);
    // 求出两个数的最小公倍数
    int result = a * b / max;
    // 输出两个整数的最小公倍数
    System.out.println("两个整数的最小公倍数：" + result);
  }

  public static int max(int a, int b) {
    if (a < b) {
      int temp = a;
      a = b;
      b = temp;
    }

    while (b != 0) {
      if (a == b) {
        return a;
      } else {
        int k = b;
        b = a % b;
        a = k;
      }
    }

    return a;
  }
}
