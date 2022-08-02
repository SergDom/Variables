public class Main {
    public static void main(String[] args) {
        // Задание 1
           //Цельночисленные
        byte apple = 5;
        short pearl = 11;
        int orange = 21;
        long grapes = 45L;

           //С плавующей точкой
        float sand = 2.1F;
        double pound = 0.454;

           //Символы
        char star = 42;
        System.out.println(star);

           //Логические
        int child = 1;
        boolean schoolClass = child > 19;
        System.out.println(schoolClass);


          //задание 2

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        System.out.println(boxer1 + boxer2 + " Общий вес боксеров, кг");
        System.out.println(boxer2 - boxer1 + " Разница в весе боксеров, кг");

          //задание 3

        int banana = 5;
        int bananaWeight = 80;
        int bananaTotalWeight = banana*bananaWeight;

        int milk = 2;
        int milkWeight = 105;
        int milkTotalWeight = milk*milkWeight;

        int iceCream = 2;
        int iceCreamWeight = 100;
        int iceCreamTotalWeight = iceCream*iceCreamWeight;

        int eggs = 4;
        int eggWeight = 70;
        int eggsTotalWeight = eggs*eggWeight;

        int totalWeight = (bananaTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight);
        float totalWeightKg = (bananaTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight)/1000f;

        System.out.println("Cмузи СуперПамп " + totalWeight + " грамм");
        System.out.println("Cмузи СуперПамп " + totalWeightKg + " кг");

        //задание 4

        int kgToGram = 7*1000;
        int loosingWeightPer250 = 250;
        int loosingWeightPer500 = 500;

        float weightLossPlan1 = (kgToGram/loosingWeightPer250);
        float weightLossPlan2 = (kgToGram/loosingWeightPer500);
        System.out.println("Количество дней " + weightLossPlan1 + " при потере 250 грамм в день");
        System.out.println("Количество дней " + weightLossPlan2 + " при потере 250 грамм в день");

        float averageDays = (weightLossPlan1 + weightLossPlan2)/2;

        System.out.println("Среднее количество дней на диете " + averageDays + " дней/день");

        //задание 5
        System.out.println("Задание 5");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        float salaryRise = 0.1f;

        float mashaRise = (mashaSalary + mashaSalary*salaryRise);
        float denisRise = (denisSalary + denisSalary*salaryRise);
        float kristinaRise = (kristinaSalary + kristinaSalary*salaryRise);

        System.out.println("Зарплата Маши после повышения " + mashaRise + " рублей");
        System.out.println("Годовой доход Маши вырос на " + (mashaRise - mashaSalary)*12 + " рублей");
        System.out.println("Зарплата Дениса после повышения " + denisRise + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + (denisRise - denisSalary)*12 + " рублей");
        System.out.println("Зарплата Кристины после повышения " + kristinaRise + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + (kristinaRise - kristinaSalary)*12 + " рублей");


    }
}