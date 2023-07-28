package exercise;

public class Operator2 {
    public  static  void  main(String[] args){
        String strTicketPrice = "한국";
        String strKim = "한국";
       String strYoo = "한국";
       String strAlice= "미국";


        boolean result=  strTicketPrice == strKim ;
        System.out.println(result);

        boolean condition1 = 5 < 3;
        boolean condition2 = 4 >= 4;

        boolean result2 = condition1 || condition2;
        System.out.println(result2);
    }
}
