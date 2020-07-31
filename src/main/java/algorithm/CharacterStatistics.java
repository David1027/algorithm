package algorithm;

import java.util.Scanner;

/**
 * @description: 字符统计
 * @author: lingjian
 * @create: 2020/7/30 15:50
 */
public class CharacterStatistics {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String s = sc.nextLine();
      System.out.println(statistics(s));
    }
  }

  public static String statistics(String s) {
    // 将字符串转换为字符数组
    char[] str = s.toCharArray();
    // 创建ascll码对应的字符串组
    int[] ch = new int[129];
    // 将字符对应ascll码值下标元素自增来统计数量
    for (int i = 0; i < str.length; i++) {
      ch[str[i]]++;
    }
    int max = 0;
    // 找出字符数量最多的ascll码值
    for (int j = 0; j < ch.length; j++) {
      if (max < ch[j]) {
        max = ch[j];
      }
    }
    StringBuilder result = new StringBuilder();
    // 按数量从大到小添加到字符串中
    while (max != 0) {
      for (int j = 0; j < ch.length; j++) {
        if (ch[j] == max) {
          result.append((char) j);
        }
      }
      max--;
    }
    return result.toString();
  }
}
