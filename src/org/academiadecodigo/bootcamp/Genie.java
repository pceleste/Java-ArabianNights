package org.academiadecodigo.bootcamp;

public class Genie {

    private int id;
    private int numberOfWishes;
    private boolean performWish = true;

    //CONSTRUCTOR
    public Genie(int numberOfWishes, int id){
        this.numberOfWishes = numberOfWishes;
        this.id = id;
    }

    //MAKE A WISH
    public void makeWish(){
    }

    //UPDATE WISHES LEFT
    public void updateWishes(){
        numberOfWishes--;
    }

    //SET BOOLEAN MAKEWISH
    public void setPerformWish(boolean performWish) {
        this.performWish = performWish;
    }

    //GET BOOLEAN MAKEWISH
    public boolean getPerformWish(){
        return performWish;
    }

    //SETTER WISHES
    public void setNumberOfWishes(int numberOfWishes) {
        this.numberOfWishes = numberOfWishes;
    }

    //GETTER ID
    public int getId() {
        return id;
    }

    //GETTER WISHES
    public int getNumberOfWishes() {
        return numberOfWishes;
    }
}
