package test03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int up, down, height;
        up = sc.nextInt();
        down = sc.nextInt();
        height = sc.nextInt();

        int day = (height - up) / (up - down);
        int reg = height - day * (up - down);
        System.out.println(day);
        System.out.println(reg);
        if(reg <= up){
            System.out.println(day + 1);
        }else{
            System.out.println(day + 2);
        }

    }
}
