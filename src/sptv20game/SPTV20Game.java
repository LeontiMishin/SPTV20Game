/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SPTV20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Программа загадывает число и просит пользователя отгадать
        int max = 5, min = 0;
        Random random = new Random();
        int gamenum = random.nextInt(max-min+1)+min;
        
        System.out.println("Программа загадала число от 0 до 5, угадай: ");
        Scanner scanner = new Scanner(System.in);
        int usernum = scanner.nextInt();
        
        if(gamenum == usernum){
            System.out.println("Ура! Ты выиграл!");
        }else{
            System.out.println(" ;) Ты проиграл. Задумано число: " + gamenum);
            
        }
        
                
    }
    
}
