package Entities;

import Entities.Users.User;

import java.io.*;

public class Belediye {
    private User user;

    public Belediye(User user){
        this.user = user;
    }

    public void createCard(){
        Card card = new Card();
        user.setCard(card);

        String str = " "+user.getId()+" "+card.getId()+" "
                +card.getCardNo()+" "+card.getBalance();

        File file = new File("card.txt");

        try {

            if (!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
