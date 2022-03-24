package org.academiadecodigo.bootcamp;

public class MagicLamp {

    private int numberGenies;
    private int countGenies = 0;
    private int genieId = 0;
    private boolean sacrifice = false;
    private int timesRecycled = 0;

    //Constructor
    public MagicLamp(int numberGenies){
        this.numberGenies = numberGenies;
    }

    //RUBB MAGIC LAMP
    public Genie rubbLamp(){
        int range = (numberGenies - 1) + 1;
        int randNumber = (int)(Math.random() * range) + 1;

        if(countGenies == numberGenies){ //CREATE DEMON
            genieId++;
            System.out.println("Demon created with id: " + genieId);
            return new RecyclableDemon(2, genieId);
        } else if(randNumber % 2 == 0){ //CREATE FRIENDLY
            countGenies++;
            genieId++;
            System.out.println("Friendly created with id: " + genieId);
            return new FriendlyGenie(2, genieId);
        } else{ // CREATE GRUMPY
            countGenies++;
            genieId++;
            System.out.println("Grumpy created with id: " + genieId);
            return new GrumpyGenie(2, genieId);
        }

    }

    //SACRIFICE DEMON
    public void sacrificeDemon(Genie demon){
        if(!sacrifice) {
            countGenies = 0;
            genieId = 0;
            demon.setPerformWish(false);
            System.out.println("Demon " + demon.getId() + " has been sacrificed!!!");
            sacrifice = true;
            timesRecycled++;
        } else{
            System.out.println("This demon has already been sacrificed!");
        }
    }

    //COMPARE LAMPS
    public void compareLamps(MagicLamp l2){
        if(timesRecycled == l2.timesRecycled && countGenies == l2.countGenies && numberGenies == l2.numberGenies){
            System.out.println("The lamps are equal");
        } else{
            //number of genies
            System.out.println("Lamp 1 has " + numberGenies + " total Genies capacity and Lamp 2 has " + l2.numberGenies);
            //number of remaining genies
            System.out.println("Lamp 1 has " + (numberGenies - countGenies) + " remaining genies and Lamp 2 has " + (l2.numberGenies - l2.countGenies));
            //number times recycled
            System.out.println("Lamp 1 has been " + timesRecycled + " recycled and Lamp 2 has been " + l2.timesRecycled);
        }
    }

}
