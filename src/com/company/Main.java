package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            var box=5;
            System. out.println(box);
            box=box+2;
            System.out.println(box);
            box=box-3;
            System.out.println(box);
            box=box*3;
            System.out.println(box);
            box=box/4;
            System.out.println(box);

            var liftingCapacity=50;
            var stuffWeight=20;
            var capacityLeft=liftingCapacity-stuffWeight;
            System.out.println("Еще можно положить "+capacityLeft+" кг вещей");

            var applesWeight=2;
            var orangesWeight=3;
            var fruitWeight = applesWeight + orangesWeight;
            System.out.println("Общий вес фруктов" + fruitWeight);


            var meatWeight=4;
            var waterWeight=5;
            var cucumbersWeight=2;
            var tomatoesWeight=2;
            var peppersWeight=2;
            var zucchiniWeight=2;
            var vegetablesWeight=cucumbersWeight+tomatoesWeight+peppersWeight+zucchiniWeight;
            var productsWeight=fruitWeight+vegetablesWeight+meatWeight+waterWeight;
            System.out.println("Общий вес продуктов"+productsWeight+"кг!");


            var leftWeight=liftingCapacity-productsWeight-stuffWeight;
            System.out.println("места осталось"+leftWeight+"кг!");

            productsWeight=productsWeight * 2;
            System.out.println("теперь вес продуктов"+productsWeight);


            leftWeight=liftingCapacity - productsWeight - stuffWeight;
            System.out.println("Теперь места осталось"+leftWeight+"кг!");

            var overload =( stuffWeight + productsWeight) % liftingCapacity;
            System.out.println("Перегруз на "+ overload + "кг!");

            var productsInOneCar = productsWeight/2;
            System.out.println("Продуктов в одной машине"+productsInOneCar+"кг!");

            byte bananas = 100;
            System.out.println( "Бананов" + bananas + " кг!");


            int x = 1;
            int y = 3;
            int result = x + y;
            System.out.println(" x + y = " + result )












    }
}

