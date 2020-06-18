public class FizzBuzz01 {
  public static void main(String[] args) {
    // パターン１
    String result;
    for (int i = 1; i <= 30; i++){
      if (i % 15 == 0) {
        result = i + ": FizzBuzz";
      } else if (i % 5 == 0) {
        result = i + ": Buzz";
      } else if (i % 3 == 0) {
        result = i + ": Fizz";
      } else {
        // valueOf()は数値を文字列に変換する
        result = String.valueOf(i);
      }
      System.out.println(result);
    }
    // パターン２
    // String output;
    // for (int i = 1; i <= 30; i++){
    //     // output = ""; がないと後の文字列で値が空の場合エラーが起きてしまうので、記述する。
    //     output = "";
    //     if (i % 3 == 0) {
    //         output = "fizz";
    //     }
    //     if (i % 5 == 0) {
    //         output = output + "Buzz";
    //     }
    //     // valueOf()は数値を文字列に変換する
    //     output = String.valueOf(i) + ":" + output;
    //     System.out.println(output);
    // }
  }
}