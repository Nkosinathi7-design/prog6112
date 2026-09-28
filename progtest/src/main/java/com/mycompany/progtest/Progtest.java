/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progtest;

/**
 *
 * @author Student
 */
public class Progtest {


    public static void main(String[] args) {

        // Single-dimensional array for city names
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Single-dimensional array for console names
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Two-dimensional array containing sales
        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display report heading
        System.out.println("-----------------------------------------------");
        System.out.println("           GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------");

        // Print column headings
        System.out.printf("%-20s%-12s%-12s%-12s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        System.out.println("----------------------------------------------");

        // Display sales
        for (int i = 0; i < sales.length; i++) {

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-12d", sales[i][j]);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("       CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------");

        // Array to store total sales for each city
        int[] cityTotals = new int[cities.length];

        // Calculate and display totals
        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            cityTotals[i] = total;

            System.out.println(cities[i] + "        " + cityTotals[i]);
        }

        // Find the city with the most sales
        int highestSales = cityTotals[0];
        String cityWithMostSales = cities[0];

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: "
                + cityWithMostSales);
        System.out.println("TOTAL SALES: " + highestSales);
        System.out.println("-------------------------------------------------");
    }
}