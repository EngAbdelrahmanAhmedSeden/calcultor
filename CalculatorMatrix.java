/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 *
 * @author New 1000 Meeza
 */
public class CalculatorMatrix {

    public static int[][] add(int[][] SumMatrix, int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                SumMatrix[i][j] += Matrix[i][j];
            }
        }
        return SumMatrix;
    }

    public static int[][] subtraction(int[][] Matrix1, int numbers) {
        int SubMatrix[][] = new int[Matrix1.length][Matrix1[0].length];
        for (int a = 0; a < numbers; a++) {
            for (int i = 0; i < Matrix1.length; i++) {
                for (int j = 0; j < Matrix1[i].length; j++) {
                    SubMatrix[i][j] -= Matrix1[i][j];
                }
            }
        }
        return SubMatrix;
    }

    public static int[][] multiply(int[][] Matrix1, int[][] Matrix2) {
        int RowMatrix1 = Matrix1.length, ColumnMatrix1 = Matrix1[0].length;
        int RowMatrix2 = Matrix2.length, ColumnMatrix2 = Matrix2[0].length;
        int SumMatrix[][] = new int[RowMatrix1][ColumnMatrix2];
        for (int i = 0; i < RowMatrix1; i++) {
            for (int j = 0; j < ColumnMatrix2; j++) {
                for (int k = 0; k < ColumnMatrix1; k++) {
                    SumMatrix[i][j] += Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }
        return SumMatrix;
    }
}
