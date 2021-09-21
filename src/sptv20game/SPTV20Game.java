
package sptv20game;

import java.util.Random;
import java.util.Scanner;

public class SPTV20Game {

    public static void main(String[] args) {
        // Программа загадывает число и просит пользователя отгадать
        System.out.println("Программа загадала число от 0 до 5, угадай: ");
        int max = 5, min = 0, attempt = 1;
        Random random = new Random();
        int gameNum = random.nextInt(max-min+1)+min;
        if (i==2){
            for(int i=0;i<3;i++){
                Scanner scanner = new Scanner(System.in);
                int userNum = scanner.nextInt();
                if(gameNum == userNum){
                    System.out.println("Ура! Ты выиграл!");
                    break;
                }else{
                    if(attempt < 3) {
                        System.out.println("Неправильно, поробуй ещё раз: ");
                    }else{
                        System.out.println(" ;) Ты проиграл. Задумано число: " + gameNum);
                    } 
                }    
            }
            attempt++;
        }
    }
}
