package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int Fieldsize = 50, cef1X = 2500, cef1Y = 20, cef2X = 20,cef2Y = 20, cef3X = 20, cef3Y = 10, firstCollSize = 20, secondCollSize = 20, finalCollSize = 10;

    public static void main(String[] args) throws IOException {

        String[] path_to_imajes = {
                "C:\\Users\\Den\\Desktop\\num\\Без имени-1.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-2.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-3.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-4.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-5.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-6.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-7.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-8.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-9.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-10.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-11.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-12.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-13.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-14.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-15.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-16.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-17.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-18.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-19.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-20.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-21.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-22.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-23.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-24.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-25.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-26.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-27.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-28.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-29.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-30.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-31.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-32.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-33.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-34.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-35.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-36.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-37.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-38.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-39.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-40.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-41.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-42.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-43.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-44.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-45.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-46.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-47.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-48.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-49.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-50.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-51.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-52.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-53.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-54.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-55.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-56.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-57.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-58.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-59.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-60.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-61.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-62.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-63.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-64.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-65.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-66.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-67.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-68.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-69.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-70.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-71.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-72.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-73.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-74.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-75.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-76.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-77.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-78.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-79.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-80.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-81.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-82.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-83.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-84.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-85.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-86.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-87.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-88.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-89.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-90.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-91.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-92.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-93.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-94.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-95.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-96.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-97.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-98.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-99.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-100.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-101.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-102.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-103.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-104.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-105.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-106.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-107.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-108.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-109.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-110.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-111.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-112.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-113.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-114.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-115.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-116.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-117.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-118.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-119.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-120.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-121.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-122.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-123.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-124.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-125.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-126.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-127.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-128.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-129.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-130.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-131.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-132.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-133.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-134.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-135.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-136.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-137.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-138.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-139.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-140.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-141.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-142.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-143.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-144.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-145.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-146.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-147.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-148.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-149.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-150.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-151.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-152.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-153.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-154.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-155.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-156.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-157.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-158.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-159.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-160.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-161.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-162.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-163.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-164.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-165.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-166.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-167.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-168.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-169.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-170.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-171.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-172.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-173.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-174.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-175.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-176.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-177.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-178.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-179.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-180.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-181.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-182.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-183.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-184.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-185.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-186.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-187.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-188.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-189.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-190.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-191.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-192.png\\",
                "C:\\Users\\Den\\Desktop\\num\\Без имени-193.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-194.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-195.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-196.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-197.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-198.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-199.png\\", "C:\\Users\\Den\\Desktop\\num\\Без имени-200.png\\"};

        int field[][] = new int[50][50];
        double cef1[][] = new double[2500][20];
        double cef2[][] = new double[20][20];
        double cef3[][] = new double[20][10];
        double firstCol[] = new double[20];
        double secondCol[] = new double[20];
        double finalCol[] = new double[10];
        int predictedValue[] = new int[10];

       for (int i = 0; i < 2500; i++) {
            for (int j = 0; j < 20; j++) {
                cef1[i][j] = Math.random()*0.7;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                cef2[i][j] = Math.random()*0.7;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                cef3[i][j] = Math.random()*0.7;
            }
        }

        for (int k = 0; k < 1; k++) {
            int i =  (int)(Math.random() * 200);
            File file = new File(path_to_imajes[i]);
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < Fieldsize; x++) {
                for (int y = 0; y < Fieldsize; y++) {
                    if (image.getRGB(x, y) != -1) {
                        field[x][y] = 1;
                    } else {
                        field[x][y] = 0;
                    }
                }
            }
            int pv = (int) Math.floor(i / 20);
            for (int t = 0; t < 10; t++) {
                if (t == pv) {
                    predictedValue[t] = 1;
                } else {
                    predictedValue[t] = 0;
                }
            }

            clear(firstCol, secondCol, finalCol);
            firstCalculate(field, cef1, firstCol);
            secondCalculate(firstCol, cef2, secondCol);
            thirdCalculate(secondCol, cef3, finalCol);

            Learning(field, predictedValue, firstCol, secondCol, finalCol, cef1, cef2, cef3);
        }


        Screen screen = new Screen();

        Timer timer1 = new Timer( 20000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear(firstCol, secondCol, finalCol);
                firstCalculate(screen.getField(), cef1, firstCol);
                secondCalculate(firstCol, cef2, secondCol);
                thirdCalculate(secondCol, cef3, finalCol);

                //for (int r = 0;r < 20; r++){System.out.print(firstCol[r] + " ");}


                for(int i = 0; i <10; i++){ System.out.print(finalCol[i] + " ");}
                System.out.println();
                screen.reloadData(finalCol);
            }
        });

    timer1.start();
    }


    static void firstCalculate(int field[][], double cef1[][], double firstCol[]){

        for (int i = 0; i < cef1Y;i++){
            int counter = 0;
                for (int j = 0; j < cef1X; j++) {
                    firstCol[i] += field[counter][j % 50] * cef1[j][i];
                    if(1+j % 50 == 50) {
                        counter++;
                    }
                }
        }

        sigmoid(firstCol, firstCollSize);

    }

    static void secondCalculate(double firstCol[], double cef2[][], double secondCol[]){
        for (int i = 0; i < cef2Y;i++){
            for(int j = 0; j < cef2X; j++) {
                secondCol[i] += firstCol[j]*cef2[i][j];
            }
        }
        sigmoid(secondCol, secondCollSize);
    }

    static void thirdCalculate(double secondCol[], double cef3[][], double finalcol[]){
        for (int i = 0; i < cef3Y;i++) {
            for (int j = 0; j < cef3X; j++) {
                finalcol[i] += secondCol[j] * cef3[j][i];//?
            }
        }
        sigmoid(finalcol, finalCollSize);
    }

    static double learning_rate = 0.001;

    static void Learning(int field[][], int predictedValue[], double firstCol[],double secondCol[],  double finalCol[], double cef1[][], double cef2[][],double cef3[][]){
        double finalWeightDeltas[] = new double[finalCollSize];
        double secondWeightDeltas[] = new double[secondCollSize];
        double firstWeightDeltas[] = new double[firstCollSize];

        for(int i = 0; i <cef3Y; i++) {
            double error = finalCol[i] - predictedValue[i];
            finalWeightDeltas[i] = error * ((4*Math.pow(2.71828,2*finalCol[i])) / (Math.pow(2.71828,2*finalCol[i])+1)*(Math.pow(2.71828,2*finalCol[i])+1));
            for (int j = 0; j < cef3X; j++) {
                cef3[j][i] =  cef3[j][i]- secondCol[j]*learning_rate * finalWeightDeltas[i];
            }
        }

        for (int i = 0; i < cef3X; i++){
            for (int j = 0; j < cef3Y; j++){
                secondWeightDeltas[i] = secondWeightDeltas[i] + finalWeightDeltas[j] * cef3[i][j];
            }
            secondWeightDeltas[i] = secondWeightDeltas[i] * ((4*Math.pow(2.71828,2*secondCol[i])) / (Math.pow(2.71828,2*secondCol[i])+1)*(Math.pow(2.71828,2*secondCol[i])+1));
        }
        for(int i = 0; i < cef2X; i++) {
            for(int j = 0; j <cef2Y;j++) {
                cef2[i][j] = cef2[i][j] - firstCol[i]*learning_rate * secondWeightDeltas[j];
            }
        }

        for(int i = 0; i < cef2X; i++) {
            for(int j = 0; j <cef2Y;j++) {
                firstWeightDeltas[i] = firstWeightDeltas[i]+ secondWeightDeltas[j]*cef2[i][j];
            }
            firstWeightDeltas[i] = firstWeightDeltas[i]*((4*Math.pow(2.71828,2*firstCol[i])) / (Math.pow(2.71828,2*firstCol[i])+1)*(Math.pow(2.71828,2*firstCol[i])+1));
        }
        int counterX = 0,counterY =0;

        for(int i = 0; i < cef1X; i++) {
            for(int j = 0; j <cef1Y;j++) {
                cef1[i][j] = cef1[i][j] - field[counterX][counterY]*learning_rate * secondWeightDeltas[j];
                }
            counterY++;
            if(counterY == 50){
                counterY = 0;
                counterX++;
            }
        }
    }

    static void clear(double firstCol[],double secondCol[],double finalcol[]){
        for(int i = 0; i < cef1Y; i++) {
            firstCol[i] = 0;
        }
        for(int i = 0; i < cef2Y; i++) {
            secondCol[i] = 0;
        }
        for(int i = 0; i < cef3Y; i++) {
            finalcol[i] = 0;
        }
    }

    static void sigmoid(double array[], int size) {
        double sigm;
        for (int i = 0; i < size; i++) {
            if (array[i]>100){array[i] = 100;}
            if (array[i]<-100){array[i] = -100;}
            sigm = (Math.pow(2.71828,array[i]) -Math.pow(2.71828,- array[i]))/(Math.pow(2.71828,array[i]) + Math.pow(2.71828,- array[i]));
            array[i] = sigm;
        }
    }
}
