import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        menu();
    }
    public static void menu()
    {
        System.out.println("Задание №1");
        System.out.println("Введите номер задачи(1-7)");
        Scanner in = new Scanner(System.in);
        byte flag_task = in.nextByte();
        switch (flag_task) {
            case 1 : {task_1() ;break;}
            case 2 : {task_2() ;break;}
            case 3 : { task_3();break;}
            case 4 : { task_4();break;}
            case 5 : { task_5();break;}
            case 6 : { task_6();break;}
            case 7 : { task_7();break;}

        }

        }
    public static void task_1()
        {
            System.out.println("Запущена первая задача");
            System.out.println("Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь. ");
            Scanner in = new Scanner(System.in);
            double H=in.nextDouble();
            double L=in.nextDouble();
            double W = in.nextDouble();
            if (H>0 && L>0 && W>0)
                System.out.println("Площадь паралелепипеда равна " + (2*(H*L + H*W + W*L)));
            else System.out.println("Один из пераметров введен неверно ( <0 )");
    }
    public static void task_2()
    {
        System.out.println("Запущена вторая задача");
        System.out.println("На садовом участке площадью 10 соток , разбили грядки 15 на 25 метров. Сколько м2 осталось незанято?" );
        System.out.println("Осталось " + (10_000 - (15*25) ) + " м." );
       // Scanner in = new Scanner(System.in);
    }
    public static void task_3()
    {
        System.out.println("Запущена третья задача");

        Scanner in = new Scanner(System.in);
    }
    public static void task_4()
    {
        System.out.println("Запущена четвертая задача");
        System.out.println("Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n. \n" +
                "Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45. ");
        System.out.println("Ввндите числа");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double min = (Math.abs(10-a)>Math.abs(10-b)? b:a);
        System.out.println("Ближайщее по модулю число " + min);
    }
    public static void task_5()
    {
        System.out.println("Запущена пятая задача");

        Scanner in = new Scanner(System.in);
    }
    public static void task_6()
    {
        System.out.println("Запущена шестая задача");
        System.out.println("В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет. ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if((b*b -4*a*c)>0 )
        {
            System.out.println("Два корня");
            System.out.println("X1 = " + ((-b + Math.sqrt(b*b -4*a*c))/2));
            System.out.println("X2 = " + ((-b - Math.sqrt(b*b -4*a*c))/2));
        }
        else if ((b*b -4*a*c)==0)
        {
            System.out.println("Один корень");
            System.out.println("X2 = " + ((-b) / 2));
        }
        else {
            System.out.println("Корней нет");
        }
    }
    public static void task_7()
    {
        System.out.println("Запущена седьмая задача");
        System.out.println("Создать программу, выводящую в консоль наибольшую цифру любого трехзначного натурального числа.");

        Scanner in = new Scanner(System.in);
        int a = Math.abs(in.nextInt());
        while (!((a<100 || a>999) ^ (a>-100 || a<-999) )) {
            System.out.println("Ввели неправильоне число поторите ввод");
            a = Math.abs(in.nextInt());
        }
        int b=  (int)(a/100);
        a=a-b*100;
        int c = (int)(a/10);
        int d=a-c*10;
        int max = (b>c) ? b:c ;
        max = (a>max) ? a:max ;
        System.out.println("Наибольшая чифра числа " + max);
    }
}
