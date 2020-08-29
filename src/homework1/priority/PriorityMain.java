package homework1.priority;

public class PriorityMain {
    public static void main (String[] arg){
        double a=5, b=2, c=8;
        //2.1
        System.out.println("Результат 5+2/8 = " + (5 + 2/8));   // Результат 2/8=0 т.к используется целочисленное деление
        System.out.println("Результат 5+2/8 = " + (a + b/c));   //Результат 2/8=0,25 т.к используется уже тип double
        //2.2
        System.out.println("Результат (5+2)/8 = " + ((5 + 2) / 8));// Результат 7/8=0 т.к используется целочисленное деление
        System.out.println("Результат (5+2)/8 = " + (a + b) / c);//Результат 7/8=0,875 т.к используется уже тип double
        //2.3
        int d = 2; // введем переменную int т.к 2++ дает ошибку компиляции
        System.out.println("Результат (5+2++)/8 ="+((5 + d++)/8)); //Результат 5 + 2++=7(при этом значение переменной d станет равным 3)
        System.out.println("Результат (5+2++)/8 ="+((a + b++)/c));//Результат 7/8=0,875 т.к используется уже тип double(при этом значение переменной b станет равным 3)
        //2.4
        d--;       // возвращаем значение переменной до 2
        int e = 8; // введем переменную int т.к --8 дает ошибку компиляции
        System.out.println("Результат (5+2++)/--8 ="+((5 + d++)/--e)); //Результат 7/--8=1, т.к в первую очередь выполнится декремент
        //2.5
        d--; //возвращаем значение переменной до 2
        e++; //возвращаем значение переменной до 8
        System.out.println("Результат (5*2>>2++)/--8 ="+((5 * 2 >> d++) / --e)); //
        //2.6
        d--; //возвращаем значение переменной до 2
        e++; //возвращаем значение переменной до 8
        System.out.println("Результат (5+7>20?68:22*2>>2++)/--8) ="+(5+7>20 ? 68 : 22*2>>d++)/--e); //  В тернарной условной операции(12>20 -> false значит переходит к правой части 44>>2/7 = 11/7=1
        //2.7
        d--;
        e++;
        //System.out.println( ((5+7>20?68>=68:22*2>>d++)/--e);Ошибка компиляии из-за использования >= в выражении 1(форма записи должна быть "условие" ? "выражение 1" : "выражение 2")  В тернарной условной операции 12>20 false соответсвенно переходим к 44>>2/7 = 11/7 = 1.
        //2.8
        System.out.println ("Результат 6-2>3 && 12*12 <= 119 равен "+ ( 6-2 > 3 && 12*12 <= 119 ));// 6-2= 4 > 3 true и 12*12 <= 119 false -> true && false = false
        //2.9
        System.out.println("Результат true&&false равен "+ (true&&false)); //true && false = false
    }
}
