package Entities;

import Entities.Users.User;

import java.io.*;

public class Otobus {
    private Card card;

    public Otobus(Card card) {
        this.card = card;
    }

    public void otobuseBin(User user){
        File file = new File("C:\\Users\\fatih\\Desktop\\Java Project\\KentKart\\card.txt");
        String str;

        try {
            SoforEkranı soforEkranı = new SoforEkranı("Otobus Ekranı",user,"1");
            soforEkranı.startSoforEkranı();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            str = bufferedReader.readLine();
            String values[] = str.split(" ");


            for (int k = 2; k < values.length; k += 4) {
                int a = Integer.parseInt(values[k]);
                if (a == card.getnId()) {
                    int ucret = Integer.parseInt(user.getUcret());
                    int newBalance = Integer.parseInt(values[k + 2])-ucret;
                    if (newBalance <0){
                        System.out.println("yetersiz bakiye");
                    }else {
                        values[k + 2] = String.valueOf(newBalance);
                    }
                }
            }

            String newStr = "";
            for (int i = 0; i < values.length; i++) {
                newStr += (values[i] + " ");
            }
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newStr);
            bufferedWriter.close();



        }catch (IOException e){
            e.getMessage();
        }


        String str1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            str1 = bufferedReader.readLine();
            String values[] = str1.split(" ");

            for (int k = 2; k < values.length; k += 4) {
                int a = Integer.parseInt(values[k]);
                if (a == card.getnId()) {
                    System.out.println("kalan bakiyeniz: "+values[k + 2]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }






    }

}
