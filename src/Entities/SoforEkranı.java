package Entities;

import Entities.Users.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SoforEkranı  implements Runnable{
    private  Thread thread;
    private String threadName;
    private User user;


    public SoforEkranı(String threadName,User user){
        this.threadName= threadName;
        this.user = user;
    }

    public SoforEkranı(String threadName,User user,String ucret){
        this.threadName= threadName;
        this.user = user;
        user.setUcret(ucret);
    }

    @Override
    public void run() {
        try {

            File file = new File("C:\\Users\\fatih\\Desktop\\Java Project\\KentKart\\card.txt");
            String str;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                str = bufferedReader.readLine();
                String values[] = str.split(" ");

                for (int k = 2; k < values.length; k += 4) {
                    int a = Integer.parseInt(values[k]);
                    if (a == user.getCard().getnId()) {
                        System.out.println("Kullanıcının bakiyesi: "+values[k + 2]);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }catch (Exception e){
            System.out.println("Sofor Ekranı arızalı");
        }
    }

    public void startSoforEkranı(){

        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
