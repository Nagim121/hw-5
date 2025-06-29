//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

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
            System.out.println("Значение переменной a с типом int равно " + a);
            System.out.println("Значение переменной b с типом byte равно " + b);
            System.out.println("Значение переменной c с типом short равно " + c);
            System.out.println("Значение переменной d с типом long равно " + d);
            System.out.println("Значение переменной f с типом float равно " + f);
            System.out.println("Значение переменной r с типом double равно " + r);

            System.out.println("Задание 2");
            float o = 27.12f;
            long q = 987678965549L;
            double w = 2.786;
            short e = 569;
            short t = -159;
            int y = 27897;
            byte u = 67;
            System.out.println("Значение переменной o с типом float равно " + o);

            System.out.println("Значение переменной q с типом long равно " + q);

            System.out.println("Значение переменной w с типом double равно " + w);

            System.out.println("Значение переменной e с типом short равно " + e);

            System.out.println("Значение переменной t с типом short равно " + t);

            System.out.println("Значение переменной y с типом int равно " + y);

            System.out.println("Значение переменной u с типом byte равно " + u);

            System.out.println("Задание 3");
            byte numberOfStudentLudmilaPavlovna = 23;
            byte numberOfStudentAnnaSergeevna = 27;
            byte numberOfStudentEkaterinaAndreevna = 30;
            int totalStudent = numberOfStudentEkaterinaAndreevna + numberOfStudentLudmilaPavlovna + numberOfStudentAnnaSergeevna;
            System.out.println("Всего в школе обучаются " + totalStudent + " студентов");
            short totalSheets = 480;
            System.out.println("Всего администрацией школы закуплено  " + totalSheets + " листов бумаги");
            int sheetsOfPaperPerStudent = totalSheets / totalStudent;
            System.out.println("На каждого ученика рассчитано " + sheetsOfPaperPerStudent + " листов бумаги");


            System.out.println("Задание 4");
            byte productivityIn2Minutes = 16;
            int machinePerformance = productivityIn2Minutes / 2;
            byte t1 = 20;
            short t2 = 1440;
            short t3 = 1440 * 3;
            int t4 = 1440 * 30;
            System.out.println("Производительность машины составляет " + machinePerformance + " бутылок в минуту");
            int productivityIn20Minutes = machinePerformance * t1;
            int productivityIn24Hours = machinePerformance * t2;
            int productivityIn3days = machinePerformance * t3;
            int productivityIn1months = machinePerformance * t4;
            System.out.println("Следовательно,");
            System.out.println("За 20 минут машина произведёт " + productivityIn20Minutes + " штук бутылок");
            System.out.println("За сутки машина произведёт " + productivityIn24Hours + " штук бутылок");
            System.out.println("За 3 дня машина произведёт " + productivityIn3days + " штук бутылок");
            System.out.println("За месяц  машина произведёт " + productivityIn1months + " штук бутылок");

            System.out.println("Задание 5");
            byte totalAmountOfPaintForRepairs = 120;
            byte amountOfWhitePaintForClass1Repairs = 2;
            byte amountOfBrownPaintForClass1Repairs = 4;
            int totalAmountOfPaintForRepairsOfOneClass = amountOfWhitePaintForClass1Repairs + amountOfBrownPaintForClass1Repairs;
            System.out.println("Общее количество краски, необходимой для покраски одного класса, составляет  " + totalAmountOfPaintForRepairsOfOneClass + " банок краски");
            int totalNumberOfClasses = totalAmountOfPaintForRepairs / totalAmountOfPaintForRepairsOfOneClass;
            System.out.println("Общее количество классов которые необходимо покрасить составляет " + totalNumberOfClasses + " классов");
            int totalNumberWhitePaintForClass1Repairs = totalNumberOfClasses * amountOfWhitePaintForClass1Repairs;
            System.out.println("Общее количество белой краски, которой необходимо для покраски всех классов составляет " + totalNumberWhitePaintForClass1Repairs + " банок краски");
            int totalNumberBrownPaintForClass1Repairs = totalNumberOfClasses * amountOfBrownPaintForClass1Repairs;
            System.out.println("Общее количество коричневой краски, которой необходимо для покраски всех классов составляет " + totalNumberBrownPaintForClass1Repairs + " банок краски");
            System.out.println("В школе, где " + totalNumberOfClasses + " классов, нужно " + totalNumberWhitePaintForClass1Repairs + " банок белой краски и " + totalNumberBrownPaintForClass1Repairs + " банок коричневой краски");

            System.out.println("Задание 6");
            byte bananas = 5;
            byte theWeightOfOneBanana = 80;
            int theWeightOf5Bananas = bananas * theWeightOfOneBanana;
            System.out.println("Общий вес банана, необходимого для приготовления завтрака составляет " + theWeightOf5Bananas + " грамм");
            short milk = 200;
            byte gramsIn100MillilitersOfMilk = 105;
            int gramsIn200MillilitersOfMilk = milk / 100 * gramsIn100MillilitersOfMilk;
            System.out.println("Общий вес молока, необходимой для приготовления завтрака составляет " + gramsIn200MillilitersOfMilk + " грамм");
            byte iceCream = 2;
            byte theWeightOfOneIceCream = 100;
            int theWeightOfTwoIceCream = theWeightOfOneIceCream * iceCream;
            System.out.println("Общий вес мороженого, необходимого для приготовления завтрака составляет " + theWeightOfTwoIceCream + " грамм");
            byte eggs = 4;
            byte theWeightOfOneEggs = 70;
            int theWeightOf4Eggs = eggs * theWeightOfOneEggs;
            System.out.println("Общий вес яиц, необходимых для приготовления завтрака составляет " + theWeightOf4Eggs + " грамм");
            int totalBreakfastWeightInGrams = theWeightOf4Eggs + theWeightOf5Bananas + theWeightOfTwoIceCream + gramsIn200MillilitersOfMilk;
            float totalGramInKg = 1000f;
            float totalBreakfastWeightInKg = totalBreakfastWeightInGrams / totalGramInKg;

            System.out.println("Вес завтрака спортсмена в граммах составит " + totalBreakfastWeightInGrams + " грамм, а вес завтрака спортсмена в килограммах составит " + totalBreakfastWeightInKg + " килограмм");

            System.out.println("Задание 7");
            byte totalKgForWeightLoss = 7;
            int totalGrammForWeightLoss = 1000 * totalKgForWeightLoss;
            System.out.println("Общее количество веса в граммах, которое необходимо скинуть спортсмену, составляет " + totalGrammForWeightLoss + " грамм");
            int dietForWeightLoss1 = 250;
            int dietForWeightLoss2 = 500;
            System.out.println("Спортсмен теряет " + dietForWeightLoss1 + " грамм веса при первом рационе питания и " + dietForWeightLoss2 + " грамм при втором рационе питания");
            int daysAtTheFirstRation = totalGrammForWeightLoss / dietForWeightLoss1;
            System.out.println("" + daysAtTheFirstRation + " дней уйдет если спортсмен будет терять каждый день по 250 грамм");
            int daysAtTheSecondRation = totalGrammForWeightLoss / dietForWeightLoss2;
            System.out.println("" + daysAtTheSecondRation + " дней уйдет если спортсмен будет терять каждый день по 500 грамм");
            int dietForWeightLossAverage = (dietForWeightLoss1 + dietForWeightLoss2) / 2;
            System.out.println("" + dietForWeightLossAverage + " грамм будет терять спортсмен в среднем при, использовании обоих рационов питания");
            int daysAtTheRation1And2 = totalGrammForWeightLoss / dietForWeightLossAverage;
            System.out.println("" + daysAtTheRation1And2 + " дней уйдет если спортсмен будет терять каждый день по " + dietForWeightLossAverage + " грамм");

            System.out.println("Задание 8");
            int wagesMasha = 67760;
            int wagesDenis = 83690;
            int wagesKristina = 76230;
            System.out.println("Заработная плата Маши, Дениса и Кристины составляет " + wagesMasha + " рублей, " + wagesDenis + " рублей " + wagesKristina + " рублей соответственно");
            int totalAnnualSalaryMasha = wagesMasha * 12;
            int totalAnnualSalaryDenis = wagesDenis * 12;
            int totalAnnualSalaryKristina = wagesKristina * 12;
            System.out.println("Общая годовая заработная плата Маши составляет - " + totalAnnualSalaryMasha + " рублей, Дениса " + totalAnnualSalaryDenis + " рублей, Кристины " + totalAnnualSalaryKristina + " рублей");
            float salaryIncreasePercentage = 10 / 100f;
            float wagesMasha1 = (wagesMasha * salaryIncreasePercentage) + wagesMasha;
            float wagesDenis1 = (wagesDenis * salaryIncreasePercentage) + wagesDenis;
            float wagesKristina1 = (wagesKristina * salaryIncreasePercentage) + wagesKristina;
            System.out.println("После повышения зарплаты на 10 % Маша, Денис и Кристина будут получать следующие зарплаты соответственно:");
            System.out.println(wagesMasha1 + " рублей в месяц \n" +
                    "" + wagesDenis1 + " рублей в месяц \n" +
                    "" + wagesKristina1 + " рублей в месяц");

            float totalAnnualSalaryMasha1 = wagesMasha1 * 12;
            float totalAnnualSalaryDenis1 = wagesDenis1 * 12;
            float totalAnnualSalaryKristina1 = wagesKristina1 * 12;
            System.out.println("Годовая заработная плата Маши, Дениса и Кристины после повышения на 10 % составит: \n"+ totalAnnualSalaryMasha1 + " рублей,\n"+ totalAnnualSalaryDenis1 + " рублей,\n"+ totalAnnualSalaryKristina1 + " рублей соответственно");

            float salaryGrowthPerYearMasha = totalAnnualSalaryMasha1 - totalAnnualSalaryMasha;
            float salaryGrowthPerYearDenis = totalAnnualSalaryDenis1 - totalAnnualSalaryDenis;
            float salaryGrowthPerYearKristina = totalAnnualSalaryKristina1 - totalAnnualSalaryKristina;
            System.out.println("Таким образом, годовой доход Маши вырос на " + salaryGrowthPerYearMasha + " рублей Дениса на " + salaryGrowthPerYearDenis + " рублей, Кристины на " + salaryGrowthPerYearKristina + " рублей");


        }
    }
}