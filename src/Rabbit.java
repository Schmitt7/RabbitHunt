public class Rabbit extends Animal {

    // Local variables needed for code
    private boolean haveSeenFox = false;
    private boolean canSeeFoxNow = false;
    private int directionToFox;
    private int distanceToFox;
    private int currentDirection;


    public Rabbit(Model model, int row, int column) {
        super(model, row, column);
    }

    int decideMove() {


        //Rabbit looks around in all directions for the fox

       for(int i = Model.MIN_DIRECTION; i <= Model.MAX_DIRECTION; i++){

            //If statement checking if the rabbit it saw the fox

            if(look(i) == Model.FOX){


                //If the rabbit sees the fox he tries moving in several directions

                if (canMove(Model.turn(i, 5)))
                    return Model.turn(i, 5);
                if(canMove(Model.turn(i,3)))
                    return Model.turn(i,3);
                if(canMove(Model.turn(i,2)))
                    return Model.turn(i,2);
                if(canMove(Model.turn(i,6)))
                    return Model.turn(i,6);
                if(canMove(Model.turn(i,1)))
                    return Model.turn(i,1);
                if(canMove(Model.turn(i,7)))
                    return Model.turn(i,7);
                if(canMove(Model.turn(i,4)))
                    return Model.turn(i,4);
            }

        }



        // If rabbit does not see fox then he stays still
        return Model.STAY;
    }



    }

