//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            System.out.println("Задание 1");
            int a = 398;
            byte b = 17;
            short c = 37;
            long d = 7354L;
            float f = 3.23f;
            double r = 34.433;
            System.out.printf("Значение переменной a с типом int равно " + a);
            System.out.printf("Значение переменной a с типом byte равно " + b);
            System.out.printf("Значение переменной a с типом short равно " + c);
            System.out.printf("Значение переменной a с типом long равно " + d);
            System.out.printf("Значение переменной a с типом float равно " + f);
            System.out.printf("Значение переменной a с типом double равно " + r);

            System.out.println("Задание 2");
            float o = 27.12f;
            long q = 987678965549L;
            double w = 2.786;
            short e = 569;
            short t = -159;
            int y = 27897;
            byte u = 67;
            System.out.printf("Значение переменной o с типом float равно" + o);

            System.out.printf("Значение переменной q с типом long равно" + q);

            System.out.printf("Значение переменной w с типом double равно" + w);

            System.out.printf("Значение переменной e с типом short равно" + e);

            System.out.printf("Значение переменной t с типом short равно" + t);

            System.out.printf("Значение переменной y с типом int равно" + y);

            System.out.printf("Значение переменной u с типом byte равно" + u);

        System.out.println("Задание 3");
byte numberOfStudentLudmilaPavlovna  = 23;
byte numberOfStudentAnnaSergeevna = 27;
byte numberOfStudentEkaterinaAndreevna = 30;
short totalSheets = 480;
            int totalStudent = numberOfStudentEkaterinaAndreevna + numberOfStudentLudmilaPavlovna+numberOfStudentAnnaSergeevna;
int sheetsOfPaperPerStudent = totalSheets/totalStudent;
System.out.println("На каждого ученика рассчитано "+sheetsOfPaperPerStudent+" листов бумаги");


System.out.println("Задание 4");
byte productivityIn2Minutes = 16;
int productivityIn1Minutes = productivityIn2Minutes/2;
            int productivityIn20Minutes = productivityIn1Minutes*20;
            int productivityIn24Hours = productivityIn1Minutes*60*24;
            int productivityIn3days = productivityIn24Hours*3;
            int productivityIn1months = productivityIn24Hours*30;
            System.out.println("За 20 минут машина произвела "+productivityIn20Minutes+" штук бутылок");
            System.out.println("За сутки машина произвела "+productivityIn24Hours+" штук бутылок");
            System.out.println("За 3 дня машина произвела "+productivityIn3days+" штук бутылок");
            System.out.println("За месяц  машина произвела "+productivityIn1months+" штук бутылок");

            System.out.println("Задание 5");
            byte totalAmountOfPaintForRepairs = 120;
            byte amountOfWhitePaintForClass1Repairs = 2;
            byte amountOfBrownPaintForClass1Repairs = 4;
            int totalAmountOfPaintForRepairsOfOneClass = amountOfWhitePaintForClass1Repairs + amountOfBrownPaintForClass1Repairs;
            int totalNumberOfClasses = totalAmountOfPaintForRepairs/totalAmountOfPaintForRepairsOfOneClass;
            int totalNumberWhitePaintForClass1Repairs = totalNumberOfClasses*amountOfWhitePaintForClass1Repairs;
            int totalNumberBrownPaintForClass1Repairs = totalNumberOfClasses*amountOfBrownPaintForClass1Repairs;
            System.out.println("В школе, где "+totalNumberOfClasses+" классов, нужно "+totalNumberWhitePaintForClass1Repairs+" банок белой краски и "+totalNumberBrownPaintForClass1Repairs+" банок коричневой краски");

            System.out.println("Задание 6");
            byte bananas = 5 ;
            byte theWeightOfOneBanana = 80;
            int theWeightOf5Bananas = bananas * theWeightOfOneBanana;
            short milk = 200;
            byte gramsIn100MillilitersOfMilk = 105;
            int gramsIn200MillilitersOfMilk = milk / 100*gramsIn100MillilitersOfMilk;
            byte iceCream = 2;
            byte theWeightOfOneIceCream = 100;
            int theWeightOfTwoIceCream = theWeightOfOneIceCream * iceCream;
            byte eggs = 4;
            byte theWeightOfOneEggs = 70;
            int theWeightOf4Eggs = eggs * theWeightOfOneEggs;

            int totalBreakfastWeightInGrams = theWeightOf4Eggs+theWeightOf5Bananas+theWeightOfTwoIceCream+gramsIn200MillilitersOfMilk;
            float totalGramInKg = 1000f;
            float totalBreakfastWeightInKg = totalBreakfastWeightInGrams/totalGramInKg;
            System.out.println("Вес завтрака спортсмена в граммах составит "+totalBreakfastWeightInGrams+" грамм, а вес завтрака спортсмена в килограммах составит "+totalBreakfastWeightInKg+" килограмм");

            System.out.println("Задание 7");
            byte totalKgForWeightLoss = 7;
            int totalGrammForWeightLoss = 1000*totalKgForWeightLoss;
            int dietForWeightLoss1 = 250;
            int dietForWeightLoss2 = 500;
            int daysAtTheFirstRation = totalGrammForWeightLoss/dietForWeightLoss1;
            int daysAtTheSecondRation = totalGrammForWeightLoss/dietForWeightLoss2;
            int dietForWeightLossAverage = (dietForWeightLoss1+dietForWeightLoss2)/2;
            int daysAtTheRation1And2 = totalGrammForWeightLoss/ dietForWeightLossAverage;
            System.out.println(""+daysAtTheFirstRation+" дней уйдет если спортсмен будет терять каждый день по 250 грамм");
            System.out.println(""+daysAtTheSecondRation+" дней уйдет если спортсмен будет терять каждый день по 500 грамм");
            System.out.println(""+daysAtTheRation1And2+" дней уйдет если спортсмен будет терять каждый день по "+dietForWeightLossAverage+" грамм");

            System.out.println("Задание 8");
            int wagesMasha = 67760;
            int wagesDenis = 83690;
            int wagesKristina = 76230;
            int totalAnnualSalaryMasha = wagesMasha * 12;
            int totalAnnualSalaryDenis = wagesDenis * 12;
            int totalAnnualSalaryKristina = wagesKristina * 12;
            float salaryIncreasePercentage=10/100f;

            float wagesMasha1 = (wagesMasha*salaryIncreasePercentage)+wagesMasha;
            float wagesDenis1 = (wagesDenis*salaryIncreasePercentage)+wagesDenis;
            float wagesKristina1 = (wagesKristina*salaryIncreasePercentage)+wagesKristina;
            System.out.println("После повышения зарплаты на 10 % Маша, Денис и Кристина будут получать следующие зарплаты соответственно");
            System.out.println(wagesMasha1 + " рублей в месяц");
            System.out.println (wagesDenis1 + " рублей в месяц");
            System.out.println(wagesKristina1 + " рублей в месяц");

            float totalAnnualSalaryMasha1 = wagesMasha1 * 12;
            float totalAnnualSalaryDenis1 = wagesDenis1* 12;
            float totalAnnualSalaryKristina1 = wagesKristina1 * 12;

            float salaryGrowthPerYearMasha = totalAnnualSalaryMasha1 - totalAnnualSalaryMasha;
            float salaryGrowthPerYearDenis = totalAnnualSalaryDenis1 - totalAnnualSalaryDenis;
            float salaryGrowthPerYearKristina = totalAnnualSalaryKristina1 - totalAnnualSalaryKristina;
            System.out.println("Годовой доход Маши вырос на "+salaryGrowthPerYearMasha+" рублей");
            System.out.println("Годовой доход Дениса вырос на "+salaryGrowthPerYearDenis+" рублей");
            System.out.println("Годовой доход Кристины вырос на "+salaryGrowthPerYearKristina+" рублей");






        }
    }
}