package org.academiadecodigo.bootcamp;

public class GrumpyGenie extends Genie{

    public GrumpyGenie(int numberOfWishes, int id){
        super(numberOfWishes, id);
    }

    @Override
    public void makeWish() {
        super.makeWish();
        if(getNumberOfWishes() == 0){
            System.out.println("Genie " + getId() + " can only grant one wish!");
        } else {
            System.out.println("Genie " + getId() + " has granted you a wish");
            setNumberOfWishes(0);
        }
    }
}
