public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1.");
        int initialPayment = 15_000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            System.out.println("Месяц " + month + " сумма пополнений равна  " + total);
            total = total + initialPayment;
            month += 1;
        }
        System.out.println("Задача 2.");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }

        System.out.println("Задача 3.");
        float populationOfTheCountry = 12_000_000;
        float birthRate = 17 / 1_000f;
        float mortalityRate = 8 / 1_000f;
        for (int year = 1; year <= 10; year++) {
            System.out.println("Год " + year + " ,численость насиления составит " + (int) populationOfTheCountry);
            populationOfTheCountry = populationOfTheCountry + populationOfTheCountry * birthRate - populationOfTheCountry * mortalityRate;
        }
        System.out.println("Задача 4.");
        float initialAmount = 15_000;
        float bankInterest = 7 / 100f;
        int monthA = 0;
        while (initialAmount < 12_000_000) {
            initialAmount = initialAmount * bankInterest + initialAmount;
            monthA++;

            System.out.println("Месяцев " + monthA + "сумма накоплений " + (int) initialAmount);
        }
        System.out.println("Задача 5");
        float initialAmount1 = 15_000;
        float bankInterest1 = 7 / 100f;
        int monthA1 = 0;

        while (initialAmount1 <12_000_000 ) {
            initialAmount1 = initialAmount1 * bankInterest1 + initialAmount1;
            monthA1++;
            if (monthA1 % 6 == 0) {
                System.out.println("Месяцев " + monthA1 + " сумма накоплений " + (int) initialAmount1);
            }
        }
        System.out.println("Задача 6");
        float initialAmount2 = 15_000;
        float bankInterest2= 7 / 100f;
        int monthA2 = 0;
        int months=12*9;
        while (monthA2 <months ) {
            initialAmount2 = initialAmount2 * bankInterest2 + initialAmount2;
            monthA2++;
            if (monthA2 % 6 == 0) {
                System.out.println("Месяцев " + monthA2 + " сумма накоплений " + (int) initialAmount2);
            }
        }
        int firstFriday=2;
        for (int day=firstFriday;day<=31;day+=7){
            System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет");
        }
        int period =79;
        int startSeeing=0;
        int currentYear=2024;
        int start=currentYear-200;
        int end=currentYear+100;
        for (int year =startSeeing;year<end;year+=period ){
            if (year>start){
                System.out.println(year);
            }
        }

    }
}