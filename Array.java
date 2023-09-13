public class Array {
  public static void main(String[] args) {
    int [] scores ={20, 30, 40, 50, 80};
    int sum = 0;
    for (int i = 0; i < scores.length; i ++) {
      sum += scores[i];
    }
    int avg = sum / scores.length;
    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avg);

    int count = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目数は" + count);


    int[] seq = new int [10];

    for (int j = 0; j < seq.length; j++) {
      seq[j] = new java.util.Random().nextInt(4);
    }

    for (int j = 0; j < seq.length; j++) {
      char[] base = {'A', 'T', 'G', 'C'};
      System.out.print(base[seq[j]] + " ");
    }

    //拡張for文
    int[] scores2 = {20, 30, 40, 50, 80};
    for (int value : scores2) {
      System.out.println(value);
    }

    //二次元配列
    int[][] scores3 = new int[2][3];
    scores3[0][0] = 40;
    scores3[0][1] = 50;
    scores3[0][2] = 60;
    scores3[1][0] = 80;
    scores3[1][1] = 100;
    scores3[1][2] = 70;
    System.out.println(scores3[1][1]);

    int[][] scores4 ={{40, 50, 60},{80, 60, 70}};
    System.out.println(scores4.length);
    System.out.println(scores4[0].length);
  }
}