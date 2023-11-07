package week_08;

import java.util.Scanner;

public class Exercise_RotationOfCube {
    public static void main(String[] args) {
        displayTheRotatedCube();


    }
    public static void displayTheRotatedCube(){
        int [][] cube = getTheCubeFromUSer();
        displayTheGİvenMethod(cube);
        rotateCube(cube);
        printRotatedCube(cube);


    }
    public static int [][] getTheCubeFromUSer(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the cube's side long = ");
        int sideLongOfCube = input.nextInt();

        int [][] cubeIs = new int[sideLongOfCube][sideLongOfCube];
        for (int i = 0; i < cubeIs.length; i++) {
            for (int j = 0; j < cubeIs.length; j++) {
                cubeIs [i][j] =input.nextInt();

            }

        }
        return cubeIs;
    }
    public static void displayTheGİvenMethod(int [][] cube){
        System.out.print("The original Cube is : ");

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                System.out.print(cube[i][j] + " ");

            }
            System.out.println();

        }
    }
    public static int [][] rotateCube(int [][] cube ){
        for (int i = 0; i < cube.length; i++) {
            for (int j = i+1; j <cube.length ; j++) {
                int temp = cube[i][j];
                cube[i][j]=cube[j][i];
                cube[j][i]=temp;

            }

        }
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length/2; j++) {
                int temp = cube [i][j];
                cube[i][j]=cube[i][cube.length-j-1];
                cube[i][cube.length-j-1]=temp;

            }

        }
        return cube;
    }
    public static void printRotatedCube(int [][]cube){
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                System.out.print(cube[i][j] + " ");

            }
            System.out.println();

        }
    }
    }

