package udemy.ivan;

interface FlightEnabled {

    void takeOff();
    void land();
    void fly();

    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}


