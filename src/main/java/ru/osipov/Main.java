package ru.osipov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет. Начало работы программы\n");

        Complex c1 = new Complex(1,1);
        Complex c2 = new Complex(2,2);

        //Сложение комплексных чисел
        System.out.println("Cложение комплексного числа "+ c1+ " с "+ c2);
        System.out.println(c1.add(c2));
        System.out.println();

        //Умножение комплексных чисел
        System.out.println("Умножение комплексного числа "+ c1+ " на "+ c2);
        System.out.println(c1.mul(c2));
        System.out.println();

        //Вычинтание комплексных чисел
        System.out.println("Вычитание комплексного числа "+ c2+ " из "+ c1);
        System.out.println(c1.sub(c2));
        System.out.println();

        //Деление комплексных чисел
        System.out.println("Деление комплексного числа "+ c2+ " на "+ c1);
        System.out.println(c1.div(c2));
        System.out.println();

        //Деление комплексных чисел
        System.out.println("Радиус комплексного числа "+ c1);
        System.out.println(c1.abs());
        System.out.println();



    }
}