    public class Main {
        public static void main(String[] args) {

            tasc1();
            tasc2();
            tasc3();
            tasc4();
            tasc5();
            tasc6();
            tasc7();
            tasc8();



        }

        public static void tasc1() {
            System.out.println("Задача 1");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }

        public static void tasc2() {
            System.out.println("Задача 2");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
        }

        public static void tasc3() {
            System.out.println("Задача 3");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
        }

        public static void  tasc4() {
            System.out.println("Задача 4");
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);

        }

        public static void tasc5() {
            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);

        }
        public static void tasc6() {
            System.out.println("Задача 6");
            var boxer1Weigt = 78.2;
            var boxer2Weigt = 82.7;
            var fightersWeigt = boxer1Weigt + boxer2Weigt;
            System.out.println("Общий вес 2ух бойцов " + fightersWeigt + "кг!");
            var defference = boxer2Weigt - boxer1Weigt;
            System.out.println("Разницу между весами бойцов состовляет " + defference + "кг!");
        }
        public static void tasc7() {
            System.out.println("Задача 7");
            var boxer1Weigt = 78.2;
            var boxer2Weigt = 82.7;
            var defferenceWeigt = boxer2Weigt - boxer1Weigt;
            System.out.println("Второй боксёр тяжелее первого на  " + defferenceWeigt + "кг!");
            var athleteWeigt = (boxer1Weigt + boxer2Weigt);
            var differenceWeigt = (boxer2Weigt - boxer1Weigt) % athleteWeigt;
            System.out.println("Разница в весе бойцов равна " + differenceWeigt + "кг!");

        }
        public static void tasc8() {
            System.out.println("Задача 8");
            var clokJob = 640;
            var clokJobEmployee = 8;
            var employeesCompanies = clokJob / clokJobEmployee;
            System.out.println("Всего работников в компании " + employeesCompanies + " человек! ");
            var employeesCompaniesMore = 94;
            var employeesCompaniesBecame = employeesCompaniesMore + employeesCompanies;
            var timeJobEmployees = clokJob / employeesCompaniesBecame;
            System.out.println("Если в компании работает 174 человека " + timeJobEmployees + " часов работы может быть поделено между сотрудниками!");



        }

}