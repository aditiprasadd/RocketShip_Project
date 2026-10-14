//Aditi Prasad
//Period 6
//AP CSA
//Rocketship Project

/*The purpose of this project is to print out a picture of a rocket in different sizes
by using methods, a class constant, loops, and variables.*/

/*Disclaimer: If size is set to a large integer value or a negative value,
the program might break. Those edge cases weren't handled in this program.*/

public class RocketShip {

    //Class constant that changes the size of the rocket
    public static final int SIZE = 3;

    //Prints out the the picture of the whole rocket
    public static void main(String[] args) {
        top();
        separator();
        upperBox();
        bottomBox();
        separator();
        bottomBox();
        upperBox();
        separator();
        top();
    }

    //Prints out the triangle/cone part of the rocket
    public static void top() {

        for (int row = 1; row <= 2 * SIZE - 1; row++) {

            for (int space = 0; space < 2 * SIZE - row - 1; space++) {
                System.out.print(" ");
            }

            System.out.print("*/");

            for (int i = 1; i < row; i++) {
                System.out.print("*");
            }

            System.out.print("||");

            for (int i = 1; i < row; i++) {
                System.out.print("*");
            }

            System.out.println("\\*");
        }
    }

    //Prints out the separator lines between each part of the rocket
    public static void separator() {
        System.out.print("+");

        for (int i = 0; i < SIZE * 2; i++) {
            System.out.print("=*");
        }

        System.out.println("=+");
    }

    //Prints out the first/upper segment of the body of the rocket
    public static void upperBox() {

        for (int row = 1; row <= SIZE; row++) {

            System.out.print("|");

            for (int i = 0; i < row - 1; i++) {
                System.out.print(".");
            }

            for (int i = 0; i < SIZE - row + 1; i++) {
                System.out.print("/\\");
            }

            for (int i = 0; i < 2 * row - 2; i++) {
                System.out.print(".");
            }

            for (int i = 0; i < SIZE - row + 1; i++) {
                System.out.print("/\\");
            }

            for (int i = 0; i < row - 1; i++) {
                System.out.print(".");
            }

            System.out.println("|");
        }
    }

    //Prints out the second/lower segment of the body of the rocket
    public static void bottomBox() {

        for (int row = 1; row <= SIZE; row++) {

            System.out.print("|");

            for (int i = 0; i < SIZE - row; i++) {
                System.out.print(".");
            }

            for (int i = 0; i < row; i++) {
                System.out.print("\\/");
            }

            for (int i = 0; i < 2 * (SIZE - row); i++) {
                System.out.print(".");
            }

            for (int i = 0; i < row; i++) {
                System.out.print("\\/");
            }

            for (int i = 0; i < SIZE - row; i++) {
                System.out.print(".");
            }

            System.out.println("|");
        }
    }
}
