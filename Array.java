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
  }
}