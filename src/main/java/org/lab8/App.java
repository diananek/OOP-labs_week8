package org.lab8;

import java.util.Scanner;

import org.lab8.entity.PermutateArray;
import org.lab8.entity.SharesProfit;
import org.lab8.entity.WaterVolume;


public class App {
    public static void main(String[] args) {
        try (Scanner numberScanner = new Scanner(System.in)) {
            System.out.print("Выберите программу (1 - PermutateArray, 2 - SharesProfit, 3 - WaterVolume): ");
            int option = numberScanner.nextInt();
            if (option == 1) {
                PermutateArray.main(args);
                return;
            } else if (option == 2) {
                SharesProfit.main(args);
                return;
            } else if (option == 3) {
                WaterVolume.main(args);
                return;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Неправильный номер программы");
        }
    }
}
