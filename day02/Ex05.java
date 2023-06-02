class Ex05{
  public static void main(String[] args){
    int kor = 90;
    int eng = 80;
    int math = 80;

    int sum = kor + eng + math;
    int avg = sum / 3;

    double avg2 = (double)(avg); // 소수점 이하 점수가 안나옴
    double avg3 = (double)(sum/3); // 소수점 이하 점수가 안나옴
    double avg4 = (double)(sum)/3;
    double avg5 = sum/3.00;

    double avg6 = (int)(avg5*100) / 100;
    double avg7 = (int)(avg5*100) / 100.0;

    System.out.println(sum);
    System.out.println(avg2);
    System.out.println(avg3);
    System.out.println(avg4);
    System.out.println(avg5);
    System.out.println(avg6);
    System.out.println(avg7);

    int num1 = 1472;
    int num2 = (num1/10)*10;
    System.out.println(num2);
  }
}
