package com.TcaNqit.Coding;

import java.util.Arrays;
import java.util.Scanner;

//FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button.
public class Question9 {
    static final String ERR_MSG = "INVALID INPUT";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome & Enjoy Your Drink!!!");
        String[] menu = {"Coffee", "Tea", "Soups", "Beverages"};
        System.out.println(Arrays.toString(menu));
        String[] menu_Options = {"C", "T", "S", "B"};
        System.out.println(Arrays.toString(menu_Options));
        System.out.println("Choose Your Menu Options: ");
        String op = sc.nextLine();
        if (op.contains(menu_Options[0]) || op.contains(menu_Options[1]) || op.contains(menu_Options[2]) || op.contains(menu_Options[3])) {
            switch (op) {
                case "C" -> {
                    System.out.println("Coffee Menu: ");
                    String[] coffee_Menu = {"Espresso", "Cappuccino", "Latte"};
                    System.out.println(Arrays.toString(coffee_Menu));
                    int[] coffee_Options = {1, 2, 3};
                    System.out.println(Arrays.toString(coffee_Options));
                    System.out.println("Choose Your Coffee: ");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == coffee_Options[0] || opt == coffee_Options[1] || opt == coffee_Options[2]) {
                        if (opt == coffee_Options[0]) {
                            System.out.println("Enjoy your " + coffee_Menu[0]);
                        } else if (opt == coffee_Options[1]) {
                            System.out.println("Enjoy your " + coffee_Menu[1]);
                        } else if (opt == coffee_Options[2]) {
                            System.out.println("Enjoy your " + coffee_Menu[2]);
                        }
                    } else {
                        System.out.println(ERR_MSG);
                    }
                }

                case "T" -> {
                    System.out.println("Tea Menu: ");
                    String[] tea_Menu = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"};
                    System.out.println(Arrays.toString(tea_Menu));
                    int[] tea_Options = {1, 2, 3, 4, 5, 6, 7, 8};
                    System.out.println(Arrays.toString(tea_Options));
                    System.out.println("Choose Your Tea: ");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == tea_Options[0] || opt == tea_Options[1] || opt == tea_Options[2] ||
                            opt == tea_Options[3] || opt == tea_Options[4] || opt == tea_Options[5] ||
                            opt == tea_Options[6] || opt == tea_Options[7]) {
                        if (opt == tea_Options[0]) {
                            System.out.println("Enjoy your " + tea_Menu[0]);
                        } else if (opt == tea_Options[1]) {
                            System.out.println("Enjoy your " + tea_Menu[1]);
                        } else if (opt == tea_Options[2]) {
                            System.out.println("Enjoy your " + tea_Menu[2]);
                        } else if (opt == tea_Options[3]) {
                            System.out.println("Enjoy your " + tea_Menu[3]);
                        } else if (opt == tea_Options[4]) {
                            System.out.println("Enjoy your " + tea_Menu[4]);
                        } else if (opt == tea_Options[5]) {
                            System.out.println("Enjoy your " + tea_Menu[5]);
                        } else if (opt == tea_Options[6]) {
                            System.out.println("Enjoy your " + tea_Menu[6]);
                        } else if (opt == tea_Options[7]) {
                            System.out.println("Enjoy your " + tea_Menu[7]);
                        }
                    } else {
                        System.out.println(ERR_MSG);
                    }
                }

                case "S" -> {
                    System.out.println("Soup Menu: ");
                    String[] soup_Menu = {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"};
                    System.out.println(Arrays.toString(soup_Menu));
                    int[] soup_Options = {1, 2, 3, 4};
                    System.out.println(Arrays.toString(soup_Options));
                    System.out.println("Choose Your Soup: ");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == soup_Options[0] || opt == soup_Options[1] || opt == soup_Options[2] || opt == soup_Options[3]) {
                        if (opt == soup_Options[0]) {
                            System.out.println("Enjoy your " + soup_Menu[0]);
                        } else if (opt == soup_Options[1]) {
                            System.out.println("Enjoy your " + soup_Menu[1]);
                        } else if (opt == soup_Options[2]) {
                            System.out.println("Enjoy your " + soup_Menu[2]);
                        } else if (opt == soup_Options[3]) {
                            System.out.println("Enjoy your " + soup_Menu[3]);
                        }
                    } else {
                        System.out.println(ERR_MSG);
                    }
                }

                case "B" -> {
                    System.out.println("Beverage Menu: ");
                    String[] bev_Menu = {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"};
                    System.out.println(Arrays.toString(bev_Menu));
                    int[] bev_Options = {1, 2, 3};
                    System.out.println(Arrays.toString(bev_Options));
                    System.out.println("Choose Your Beverage: ");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == bev_Options[0] || opt == bev_Options[1] || opt == bev_Options[2]) {
                        if (opt == bev_Options[0]) {
                            System.out.println("Enjoy your " + bev_Menu[0]);
                        } else if (opt == bev_Options[1]) {
                            System.out.println("Enjoy your " + bev_Menu[1]);
                        } else if (opt == bev_Options[2]) {
                            System.out.println("Enjoy your " + bev_Menu[2]);
                        }
                    } else {
                        System.out.println(ERR_MSG);
                    }
                }

                default -> System.out.println(ERR_MSG);
            }
        }
        sc.close();
    }
}

/*
Welcome & Enjoy Your Drink!!!
[Coffee, Tea, Soups, Beverages]
[C, T, S, B]
Choose Your Menu Options:
C
Coffee Menu:
[Espresso, Cappuccino, Latte]
[1, 2, 3]
Choose Your Coffee:
3
Enjoy your Latte

Welcome & Enjoy Your Drink!!!
[Coffee, Tea, Soups, Beverages]
[C, T, S, B]
Choose Your Menu Options:
T
Tea Menu:
[Plain Tea, Assam Tea, Ginger Tea, Cardamom Tea, Masala Tea, Lemon Tea, Green Tea, Organic Darjeeling Tea]
[1, 2, 3, 4, 5, 6, 7, 8]
Choose Your Tea:
7
Enjoy your Green Tea

Welcome & Enjoy Your Drink!!!
[Coffee, Tea, Soups, Beverages]
[C, T, S, B]
Choose Your Menu Options:
S
Soup Menu:
[Hot and Sour Soup, Veg Corn Soup, Tomato Soup, Spicy Tomato Soup]
[1, 2, 3, 4]
Choose Your Soup:
2
Enjoy your Veg Corn Soup

Welcome & Enjoy Your Drink!!!
[Coffee, Tea, Soups, Beverages]
[C, T, S, B]
Choose Your Menu Options:
B
Beverage Menu:
[Hot Chocolate Drink, Badam Drink, Badam-Pista Drink]
[1, 2, 3]
Choose Your Beverage:
1
Enjoy your Hot Chocolate Drink

*/