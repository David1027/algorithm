package algorithm;

import java.util.Scanner;

/**
 * @description: 字符逆序
 * @author: lingjian
 * @create: 2020/7/30 10:43
 */
public class CharacterRecerse {

  /** 通过toCharArray()方法将字符串转换为字符数组，将字符数组逆序，在转为字符串输出即可 */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入字符串");
    String input = sc.nextLine();

    char[] chars = input.toCharArray();
    char[] reverse = reverse(chars);

    System.out.println(String.valueOf(reverse));
  }

  public static char[] reverse(char[] input) {
    char[] result = new char[input.length];
    for (int i = 0; i < input.length; i++) {
      result[i] = input[input.length - 1 - i];
    }
    return result;
  }
}
