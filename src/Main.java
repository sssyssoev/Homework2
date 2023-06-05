public class Main{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        System.out.println(" Домашнее задание №2 ");
        }
     public static void task1() {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("Задача 1");
         System.out.println("Значение переменной dog= " + dog);
         System.out.println("Значение переменной cat = " + cat);
         System.out.println("Значение переменной paper= " + paper);

     }

    public static void task2() {
        var dog=8.0+4;
        var cat=3.6+4;
        var paper=763789+4;
        System.out.println("Задача 2");
        System.out.println("Значение переменной dog= " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper= " + paper);
    }
    public static void task3() {
        var dog=8.0+4-3.5;
        var cat=3.6+4-1.6;
        var paper=763789+4-7639;
        System.out.println("Задача 3");
        System.out.println("Значение переменной dog= " + dog);
        System.out.println("Значение перемнной cat = " + cat);
        System.out.println("Значение переменной paper= " + paper);
    }



    public static void task4() {
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println(" Начальное значение переменной friend = " + friend);
        friend = friend + 2;
        System.out.println(" Значение переменной friend после операции +2= " + friend);
        friend = friend / 7;
        System.out.println(" Значение переменной friend после операции /7= " + friend);
    }

    public static void task5() {
        var frog=3.5;
        System.out.println("Задача 5");
        System.out.println(" Начальное значение переменной frog = " + frog);
        frog = frog * 10;
        System.out.println(" Значение переменной frog после операции * 10= " + frog);
        frog = frog / 3.5;
        System.out.println(" Значение переменной frog после операции / 3.5= " + frog);
        frog = frog +4;
        System.out.println(" Значение переменной frog после операции + 4= " + frog);

    }
    public static void task6() {
        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        var summarizedBoxersWeight=firstBoxerWeight+secondBoxerWeight;
        var boxersWeightDiff=firstBoxerWeight-secondBoxerWeight;
        System.out.println("Задача 6");
        System.out.println(" Вес первого боксера  = " + firstBoxerWeight);
        System.out.println(" Вес второго боксера  = " + secondBoxerWeight);
        System.out.println(" Вес обоих боксеров  = " + summarizedBoxersWeight);
        System.out.println(" Разница в весе боксеров  = " + boxersWeightDiff);

    }
    public static void task7() {
        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        var boxersWeightDiffbySubtr=secondBoxerWeight-firstBoxerWeight;
        var boxersWeightDiffbyDivision=secondBoxerWeight%firstBoxerWeight;

        System.out.println("Задача 6");
        System.out.println(" Вес первого боксера  = " + firstBoxerWeight);
        System.out.println(" Вес второго боксера  = " + secondBoxerWeight);
        System.out.println(" Разница в весе боксеров вычитанием  = " + boxersWeightDiffbySubtr);
        System.out.println(" Разница в весе боксеров целочисленным делением  = " + boxersWeightDiffbyDivision);
    }
    public static void task8() {
        var initialWorkHoursQuantity=640;
        var businessHoursQuantityPerDay=8;
        var initialNumberofEmploees=initialWorkHoursQuantity/businessHoursQuantityPerDay;
        var finalNumberofEmploees=initialNumberofEmploees+94;
        var additionalWorkHoursQuantity=94*8;

        System.out.println("Задача 8");
        System.out.println(" Требуемое количество сотрудников при " + businessHoursQuantityPerDay+ " часовом рабочем дне = " + initialNumberofEmploees);
        System.out.println("Количество сотрудников после добавления 94 человек = " + finalNumberofEmploees);
        initialWorkHoursQuantity=initialWorkHoursQuantity+additionalWorkHoursQuantity;
        System.out.println("Если в компании работает " + finalNumberofEmploees+" человек то всего " +  initialWorkHoursQuantity + "  часов работы может  быть поделено между сотрудниками ");
    }
}