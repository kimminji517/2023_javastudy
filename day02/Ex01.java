class Ex01{
  public static void main(String[] args){
     // 주석 : 컴파일하지 않는 줄, 보통은 내용을 설명할 때 사용
     // 변수 : 프로그램이 끝날때 까지 언제든지 변할 수 있는 상태
     // 사용법 : 자료형 변수명;
     //            변수명 = 들어갈 데이터;

     // 논리 자료형을 선언
       boolean b1;
       b1 = true;

     // b1을 호출해 보자
     // **이름을 호출하면 데이터가 나온다.
     System.out.println(b1);

     // boolean b1; 선언은 한번만 가능함
     b1 = false;
     System.out.println(b1);

     // 선언과 저장을 한번에
     boolean b2 = true;
     System.out.println(b2);

     b2 = false;
     System.out.println(b2);

     //boolean b3 = 10.0;
     
  }
}