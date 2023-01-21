package Entities;

import java.io.*;
import java.util.ArrayList;

public class DolumMerkezi {
    private Card card;

    public DolumMerkezi(Card card) {
        this.card = card;
    }

    public void balanceAdd(int miktar) {
        File file = new File("C:\\Users\\fatih\\Desktop\\Java Project\\KentKart\\card.txt");
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            str = bufferedReader.readLine();
            String values[] = str.split(" ");


            for (int k = 2; k < values.length; k += 4) {
                int a = Integer.parseInt(values[k]);
                if (a == card.getnId()) {
                    int newBalance = Integer.parseInt(values[k + 2]) + miktar;
                    values[k + 2] = String.valueOf(newBalance);
                }
            }
            System.out.println("-------");
            System.out.println(card.getnId());
            System.out.println("-------");
            String newStr = "";
            for (int i = 0; i < values.length; i++) {
                newStr += (values[i] + " ");
            }


            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newStr);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void bakiyeOgren() {
        File file = new File("C:\\Users\\fatih\\Desktop\\Java Project\\KentKart\\card.txt");
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            str = bufferedReader.readLine();
            String values[] = str.split(" ");

            for (int k = 2; k < values.length; k += 4) {
                int a = Integer.parseInt(values[k]);
                if (a == card.getnId()) {
                    System.out.println("bakiyeniz: "+values[k + 2]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
