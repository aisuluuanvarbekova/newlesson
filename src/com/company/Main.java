package com.company;

public class Main {

    public static void main(String[] args) {

                additional(33, 10);
                {

                    System.out.println("One");
                }

                additional(46, 21);
                {

                    System.out.println("two");
                }

                additional(12, 23);
                {

                    System.out.println("three");
                }

                additional(19, 18);
                {

                    System.out.println("four");
                }
                additional(34, 7);
                {

                    System.out.println("five");
                }


            }

            public static String additional(int age, int temperature) {

                if (age > 20 && age < 45 && temperature > -20 && temperature > 30) {
                    System.out.println(" Можно идти гулять !!! ");
                } else if (age < 20 && temperature > 0 && temperature < 28) {
                    System.out.println("Можно гулять!");
                } else if (age > 45 && temperature > -10 && temperature < 25) {
                    System.out.println(" Можно гулять!");


                } else {
                    System.out.println(" Осьавайтесь дома ");

                }


                return " " + temperature + " " + age;
            }


        }




