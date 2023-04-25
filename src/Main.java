public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int age1 = 17;
        int age2 = 30;

        System.out.print("Если возраст человека равен " + age1);
        if (age1 >= 18) {
            System.out.println(", он совершеннолетний");
        } else {
            System.out.println(", он несовершеннолетний, нужно немного подождать");
        }

        System.out.print("Если возраст человека равен " + age2);
        if (age2 >= 18) {
            System.out.println(", он совершеннолетний");
        } else {
            System.out.println(", он несовершеннолетний, нужно немного подождать");
        }

        System.out.println("Task 2");

        int temp1 = 8;
        int temp2 = 3;

        if (temp1 >= 5) {
            System.out.println("На улице " + temp1 + " градусов, тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp1 + " градусов, холодно, лучше надеть шапку");
        }

        if (temp2 >= 5) {
            System.out.println("На улице " + temp2 + " градусов, тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp2 + " градусов, холодно, лучше надеть шапку");
        }

        System.out.println("Task 3");
        int v = 65;
        if (v > 60) {
            System.out.println("Скорость " + v + " превышает 60 км/ч, ждите штраф");
        } else {
            System.out.println("Скорость " + v + " не превышает 60 км/ч, все ок");
        }

        v = 50;
        if (v > 60) {
            System.out.println("Скорость " + v + " превышает 60 км/ч, ждите штраф");
        } else {
            System.out.println("Скорость " + v + " не превышает 60 км/ч, все ок");
        }

        System.out.println("Task 4");
        int age = 3;
//        age = 9;
        age = 19;
//        age = 25;
//        age = 99;
        if (age>=2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            if (age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                if (age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то пора уже на работу");
                }
            }
        }


        System.out.println("Task 5");
//        age = 5;
        age = 16;
//        age = 12;
        if (age <=5) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
        } else if (age <=14) {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если ребенку больше 14 лет, то он может кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Task 6");
        int capacity = 102;
        int capacitySit = 60;

        int loading;
//        loading = 13;
//        loading = 30;
        loading = 100;
//        loading = 102;

        if (loading < capacitySit) {
            System.out.println("В вагоне есть сидячие места");
        } else if (loading > capacitySit && loading < capacity) {
            System.out.println("В вагоне есть свободные стоячие места");
        } else System.out.println("В вагоне нет свободных мест");

        System.out.println("Task 7");

        int one = 32;
        int two = 65;
        int three = 124;
        int max = 0;

        if (one > two) {
            if (one > three) {
                System.out.println("Большее число one " + one);
            } else {
                System.out.println("Большее число three " + three);
            }
        } else {
            if (two > three) {
                System.out.println("Большее число two " + two);
            } else {
                System.out.println("Большее число three " + three);
            }
        }


    }

}