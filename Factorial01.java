public class Factorial01 {
  // Factorial 階乗の意味
  // Nが、0から10まで増える時、Nの階乗を計算する。
  // 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
  public static void main(String[] args) throws Exception {
    int number = 10;
    for (int i = 0; i <= number; i++) {
        System.out.println(i + ": " + permutation(i));
    }
  }

public static int permutation(int num) {
    int perm = 1;
    // (ここに追記) permに1からnumまでの値をかけた値を代入する
    // for (int i = 0; i < num; i++) {
    //     perm *= i + 1;
    // }
    // 模範解答
    for (int i = 1; i < num; i++) {
      perm *= i + 1; 
    }
    return perm;
  }
}