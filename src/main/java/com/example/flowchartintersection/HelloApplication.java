package com.example.flowchartintersection;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner sets=new Scanner(System.in);
        System.out.println("Please introduce your number of sets: ");
        int numberOfSets=sets.nextInt();
        Scanner elements=new Scanner(System.in);
        System.out.println("Introduce your number of elements: ");
        int numberOfElements=elements.nextInt();
        String[][] matrix = new String[numberOfSets][numberOfElements];
        for(int i=0;i<=numberOfSets-1;i++){
            System.out.println("Set number "+(i+1));
            for(int j=0;j<=numberOfElements-1;j++){
                Scanner elementsOfTheMatrix=new Scanner(System.in);
                System.out.println("Please introduce your element number "+j+" :");
                matrix[i][j]=elementsOfTheMatrix.nextLine();
            }
        }
        String[] intersectionArray = new String[numberOfElements];
        int intersectionCount = 0;
        for (int i = 0; i <=numberOfElements-1; i++) {
            String element = matrix[0][i];
            boolean isCommon = true;
            for (int j = 1; j <=numberOfSets-1; j++) {
                boolean found = false;
                for (int k = 0; k < numberOfElements; k++) {
                    if (element.equals(matrix[j][k])) {
                        found = true;
                    }
                }
                if (!found) {
                    isCommon = false;
                }
            }
            if (isCommon) {
                intersectionArray[intersectionCount++] = element;
            }
        }
        System.out.println("Intersection of all sets:");
        if (intersectionCount == 0) {
            System.out.println("No common elements found.");
        } else {
            for (int i = 0; i < intersectionCount; i++) {
                System.out.println(intersectionArray[i]);
            }
        }
    }
}