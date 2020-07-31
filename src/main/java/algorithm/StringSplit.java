package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 字符串分割
 * @author: lingjian
 * @create: 2020/7/30 13:44
 */
public class StringSplit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("输入字符串个数");
    while (sc.hasNext()) {
        int count = Integer.parseInt(sc.nextLine());

        List<String> result = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            String s = sc.nextLine();
            result.addAll(temp(s));
        }
        print(result);
    }
  }

  public static List<String> temp(String s) {
    List<String> result = new ArrayList<String>();
    if (s.length() % 8 != 0) {
      s += "0000000";
    }

    // 判断长度大于8
    while (s.length() >= 8) {
      result.add(s.substring(0, 8));
      s = s.substring(8);
    }
    return result;
  }

  public static void print(List<String> list) {
    for (String s : list) {
      System.out.println(s);
    }
  }
}
