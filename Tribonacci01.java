public class Tribonacci01 {
  //トリボッチ数
  // 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149
  public static void main(String[] args) throws Exception {
    int number = 50;
    for (int i = 0; i <= number; i++) {
        System.out.println(i + ": " + tribonacci(i));
    }
  }
  // 指定番のトリボナッチ数を求める
  public static long tribonacci(int num) {
    if (num == 0) { // numが0ならば ...
        return 0; // ここを修正
    }
    if (num == 1) { // numが1ならば ...
        return 0; // ここを修正
    }
    if (num == 2) { // numが2ならば ...
        return 1; // ここを修正
    }

    long tri = 0; // 答えを保存する変数
    long tri_0 = 0; // 三つ前のトリボナッチ数を保存する変数
    long tri_1 = 0; // 二つ前のトリボナッチ数を保存する変数
    long tri_2 = 1; // 一つ前のトリボナッチ数を保存する変数

    for (int i = 3; i <= num; i++) {
        // (ここに追記)  i番目のトリボナッチ数を計算してtriに代入する
        // (ここに追記) tri_0, tri_1, tir_2の値を更新する
        tri = tri_0 + tri_1 + tri_2;
        tri_0 = tri_1;
        tri_1 = tri_2;
        tri_2 = tri;
    }
    return tri;
  }
}