package org.academiadecodigo.bootcamp;

public class RecyclableDemon extends Genie{

    public RecyclableDemon(int numberOfWishes, int id){
        super(numberOfWishes, id);
    }

    @Override
    public void makeWish() {
        super.makeWish();
        if(getPerformWish()) {
            System.out.println("Demon " + getId() + " granted you a wish, but also kicked your ass!");
        } else{
            System.out.println("Demon " + getId() + " has been sacrificed and cant grant more wishes!");
        }
    }

}
