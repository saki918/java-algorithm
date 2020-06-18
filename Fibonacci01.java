public class Fibonacci01 {
// フィボナッチ数 - シンプル
// 前の2つの数値を足したものを記述する
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
  public static void main(String[] args) throws Exception {
      int number = 50;
      // 1 から int number に記述された数字までのフィボナッチ数列
      for(int i = 0; i <= number; i++) {
      System.out.println(i + ":" + fibonacci(i));
      }
  }

  // 指定番のフィボナッチ数を求める
  public static long fibonacci(int num) {
      if (num == 0) {
          return 0;
      }
      if (num == 1) {
          return 1;
      }
      long fibo = 0;
      // 最初の2つのフィボナッチ数
      long fibo_0 = 0;
      long fibo_1 = 1;
  
      for (int i = 1; i < num; i++) {
          // 中の三つの数式がnumの数値になる一つ手前まで繰り返し計算される
          fibo = fibo_0 + fibo_1;
          fibo_0 = fibo_1;
          fibo_1 = fibo;
      }
    return fibo;
  }
}
/* num = 2 の場合(ループの処理 1回)
  fibo = 0 + 1
  fibo_0 = 1
  fibo_1 = 1
  num = 3 の場合(ループの処理 2回)
  fibo = 1 + 1
  fibo_0 = 1
  fibo_1 = 2
  num = 4 の場合(ループの処理 3回)
  fibo = 1 + 2
  fibo_0 = 2
  fibo_1 = 3
  num = 5 の場合(ループの処理 4回)
  fibo = 2 + 3
  fibo_0 = 3
  fibo_1 = 5
  num = 6 の場合(ループの処理 5回)
  fibo = 3 + 5
  fibo_0 = 5
  fibo_1 = 8
  と計算が繰り返されてフィボナッチ数列が作成されていく。 */