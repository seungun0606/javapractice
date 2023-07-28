package mission;

public class CuncheonTicket3 {

    public static void main(String[] args){
        final int SENIOR_AGE_STANDARD = 65;
        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean isHalfPriceForAlice = (SENIOR_AGE_STANDARD >= 65) && (countryOfAlice == "Korea");
        boolean isHalfPriceForKim = (SENIOR_AGE_STANDARD >= 65) && (countryOfKim == "Korea");
        boolean isHalfPriceForYoo = (SENIOR_AGE_STANDARD >= 65) && (countryOfYoo == "Korea");

        System.out.println("Alice는 적용 대상인가?");
        System.out.println(isHalfPriceForAlice);
        System.out.println("Kim은 적용 대상인가?");
        System.out.println(isHalfPriceForKim);
        System.out.println("YOO는 적용 대상자인가?");
        System.out.println(isHalfPriceForYoo);


    }
}
