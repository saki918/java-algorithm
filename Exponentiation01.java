public class Exponentiation01 {
  // Exponentiationは累乗の意味
  // Nが、0から10まで増える時、2のN乗を計算する。Math.powは使わない
  // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
  public static void main(String[] args) throws Exception {
    int number = 10;
    for (int i = 0; i <= number; i++) {
      System.out.println(i + ": " + power(i));
    }
  }
  // 2のnum乗を求める
  public static int power(int num) {
    // num = 0 だと繰り返し処理が行われないので、pow = 1 を返す。
    int pow = 1;
    // (ここに追記) powの値を2倍する操作をnum回繰り返す
    // for (int i = 0; i < num ; i++) {
    //     pow *= 2;
    // }
    // 模範解答
    for (int i = 1; i <= num; i++) {
      pow = pow * 2; // powの値を2倍する
    }
    return pow;
  }
}