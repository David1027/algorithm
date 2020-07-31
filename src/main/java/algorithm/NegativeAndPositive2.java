package algorithm;

import java.util.Scanner;

/**
 * @description: 记负均正2
 * @author: lingjian
 * @create: 2020/7/30 11:05
 */
public class NegativeAndPositive2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 记录负数的个数
    int count1 = 0;
    // 记录正数的个数
    int count2 = 0;
    // 记录正数的总和
    double sum = 0.0;
    // 记录正数的平均值
    double avg = 0.0;
    while (sc.hasNextInt()) {
      int input = sc.nextInt();
      if (input < 0) {
        count1++;
      } else {
        count2++;
        sum += input;
      }
    }
    // 判断如果没有非负数，平均值为0.0
    if (count2 > 0) {
      avg = sum / count2;
    }

    System.out.println(count1);
    System.out.printf("%.1f\n", avg);
  }
}
