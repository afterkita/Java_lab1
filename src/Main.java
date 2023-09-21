import java.util.Scanner;

public class Main {
    public static void sirakuz(int n){
        int s = 0;
        int m = n;

        while (n>1){
            //System.out.println(n);
            if (n%2 == 1){
                n = (n*3)+1;
            }
            else {
                n = n/2;
            }
            s += 1;
            if (m >= n){
                m = m;
            }
            else {
                m = n;
            }
        }

        System.out.println("Шагов: "+s);

    }
    public static void sum_riad(int n){
        int k = n;
        int sum = 0;

        Scanner SCN = new Scanner(System.in);
        for (int i = 0;i< k ; i++){
            int val = SCN.nextInt();
            if (i%2 == 0){
                sum +=val;
            }
            else {
                sum -= val;
            }
        }
        System.out.println("Результат: " + sum);
    }

    public static void poisk_klada(){
        Scanner SCN = new Scanner(System.in);
        int x_final = SCN.nextInt();
        int y_final = SCN.nextInt();


        int x = 0;
        int y = 0;
        int step = 0;

        boolean stoper = false;
        System.out.printf("Введите начальные точки: \n");
        while (stoper == false){
            String line = SCN.nextLine();
            if (line.equals("стоп")){
                stoper = true;
            } else if (line.equals("север")) {
                int val = SCN.nextInt();
                x += val;
                step++;
            }else if (line.equals("юг")) {
                int val = SCN.nextInt();
                x -= val;
                step++;
            }else if (line.equals("восток")) {
                int val = SCN.nextInt();
                y += val;
                step++;
            }else if (line.equals("запад")) {
                int val = SCN.nextInt();
                y -= val;
                step++;
            } else {
                stoper = false;
            }
            if ((x == x_final) &&(y == y_final)){
                stoper = true;
            }
            //System.out.println("x-"+x+" y-"+y);
        }
        System.out.println("Ответ: "+step);
    }
    public static void poisk_dorogi(){
        Scanner SCN = new Scanner(System.in);

        int which_way = 1;
        int stratig = 1;

        int val = SCN.nextInt();
        for (int i=0;i<val;i++){


            int way_count = SCN.nextInt();
            //System.out.println("---"+way_count);
            int min_hight = 1000000;

            for (int j =0;j<way_count;j++){
                int way_hight = SCN.nextInt();
                if (way_hight < min_hight){
                    min_hight = way_hight;
                }
            }
            if (min_hight > stratig){
                which_way = i+1;
                stratig = min_hight;
            }
        }
        System.out.println(which_way+" "+stratig);
    }
    public static void dvachet(){
        Scanner SCN = new Scanner(System.in);
        String line = SCN.nextLine();

        int val1 = 0;
        int val2 = 1;
        for (int i =0;i<line.length();i++){
            char c = line.charAt(i);
            String c1 = String.valueOf(c);
            int gir = Integer.parseInt(c1);
            val2 = val2*gir;
            val1 = val1+gir;
        }
        if ((val1%2==0)&&(val2%2==0)){
            System.out.println("Является дважды чётным");
        }
        else {
            System.out.println("Не является дважды чётным");
        }
    }
    public static void main(String[] args) {
        Scanner SCN = new Scanner(System.in);
        int val;

        System.out.printf("Задача 1 'Сиракузкая последовательность' \nВведите число: ");
        val = SCN.nextInt();
        sirakuz(val); // Задача 1

        System.out.printf("Задача 2 'Сумма ряда' \nВведите количество, а затем сами числа: ");
        val = SCN.nextInt();
        sum_riad(val); // Задача 2

        System.out.printf("Задача 3 'Поиск клада'");
        poisk_klada(); // Задача 3

        System.out.printf("Задача 4 'Логистический максимум'");
        poisk_dorogi(); // Задача 4

        System.out.printf("Задача 5 'Дваждычётное число'");
        dvachet(); // Задача 5
    }
}