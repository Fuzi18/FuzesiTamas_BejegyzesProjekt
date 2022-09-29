package hu.fuzesitamas.bejegyzesprojekt;

import java.time.LocalDateTime;

public class Bejegyzes {
     String szerzo;
     String tartalom;
     int likeok;
     LocalDateTime letrejott;
     LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom){
        this.szerzo=szerzo;
        this.tartalom=tartalom;
        this.likeok=0;
        this.letrejott=LocalDateTime.now();
        this.szerkesztve=LocalDateTime.now();
    }

    public String getSzerzo(){
        return szerzo;
    }
    public String getTartalom(){
        return tartalom;
    }
    public void setTartalom(){
        return;
    }
    public int getLikeok(){
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }
    public void like(){
        likeok+=1;
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %d \n Szerkeztve: %s \n %s",szerzo,likeok,letrejott,getSzerkesztve(),tartalom);
    }
}
