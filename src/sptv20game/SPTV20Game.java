
package sptv20game;

import java.util.Random;
import java.util.Scanner;

public class SPTV20Game {

    public static void main(String[] args) {
        // Программа загадывает число и просит пользователя отгадать
        for(int b=0;b<20;b++){
        System.out.println("Программа загадала число от 0 до 5, угадай: ");
        int max = 5, min = 0, attempt = 1;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int gameNum = random.nextInt(max-min+1)+min;
        
            for(int i=0;i<3;i++){
                int userNum = scanner.nextInt();
                if(gameNum == userNum){
                    System.out.println("Ура! Ты выиграл!");
                    System.out.println("Чтобы продолжить нажми 1, выйти нажми 0");
                    int end1 = scanner.nextInt();
                    if (end1 == 1){
                    i=4;
                    continue;
                    }
                    if (end1 == 0){
                        b=50;
                        break;
                    }
                }else{
                    if(attempt < 3) {
                        System.out.println("Неправильно, поробуй ещё раз: ");
                        attempt=attempt+1;
                    }else{
                        System.out.println(" ;) Ты проиграл. Задумано число: " + gameNum);
                        System.out.println("Чтобы продолжить нажми 1, выйти нажми 0");
                        int end2 = scanner.nextInt();
                        if (end2 == 1){
                        i=4;
                        continue;
                        }
                        if (end2 == 0){
                            b=50;
                            break;
                    }
                    }
                    
                }
            }
            attempt++;
        }
        }   
    }
