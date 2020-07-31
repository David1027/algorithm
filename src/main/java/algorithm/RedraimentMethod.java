package algorithm;

import java.util.Scanner;

/**
 * @description: Redraiment走法
 * @author: lingjian
 * @create: 2020/7/30 14:59
 */
public class RedraimentMethod {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int count = sc.nextInt();
      int[] a = new int[count];
      for (int i = 0; i < count; i++) {
        a[i] = sc.nextInt();
      }
      System.out.println(redraiment(a));
    }
    sc.close();
  }

  public static int redraiment(int[] data) {
    // 获取原数组的长度
    int n = data.length;
    // 创建一个辅助数组
    int[] dp = new int[n];
    // 以data[1]为末元素的最长递增子序列长度为1
    dp[0] = 1;

    // 循环n-1次
    for (int i = 1; i < n; i++) {
      // dp[i]的最小值为1
      dp[i] = 1;
      // 循环i次
      for (int j = 0; j < i; j++) {
        if (data[j] < data[i]) {
          // 更新dp[i]的值
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    int max = 1;
    for (int i = 0; i < dp.length; i++) {
      if (dp[i] > max) {
        max = dp[i];
      }
    }

    return max;
  }
}
