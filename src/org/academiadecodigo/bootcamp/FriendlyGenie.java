package org.academiadecodigo.bootcamp;

public class FriendlyGenie extends Genie {


    public FriendlyGenie(int numberOfWishes, int id){
        super(numberOfWishes, id);
    }

    @Override
    public void makeWish(){
        super.makeWish();
        if(getNumberOfWishes() == 0){
            System.out.println("Genie " + getId() + " has no more wishes left");
        } else{
            updateWishes();
            System.out.println("Genie " + getId() + " granted you a wish");
            System.out.println("Genie " + getId() + " has " + getNumberOfWishes() + " left");
        }
    }

}
