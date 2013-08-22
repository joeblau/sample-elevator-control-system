package main.java.com.joeblau.ecs.impl;

import main.java.com.joeblau.ecs.impl.enums.ElevatorDirection;
import main.java.com.joeblau.ecs.interfaces.ElevatorControlSystemFactory;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 9:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class ElevatorControlSystem implements ElevatorControlSystemFactory {
  Integer numberOfElevators = 0;
  Integer numberOfFloors = 0;
  ArrayList<Elevator> elevators;
  Queue<Integer> pickupLocations;

  public ElevatorControlSystem(Integer numberOfElevators, Integer numberOfFloors) {
    this.numberOfElevators = numberOfElevators;
    this.numberOfFloors = numberOfFloors;
    elevators = new ArrayList<Elevator>(numberOfElevators);
  }


  @Override
  public void status(Integer elevatorId) {
//    elevators[elevatorId];
  }

  @Override
  public void step() {
    // Loop though every elevator
    for (Elevator currElevator : elevators){
      // Check to figure out which ones are unoccupied and update call
      switch (currElevator.status()){
        case ELEVATOR_EMPTY:
          if (!pickupLocations.isEmpty())
            currElevator.addNewDestinatoin(pickupLocations.poll());
          break;
        // Move occupied Elevators one step closer to next closest destination in direction
        case ELEVATOR_OCCUPIED:
          switch (currElevator.direction()){
            case ELEVATOR_UP:
              currElevator.moveUp();
              break;
            case ELEVATOR_DOWN:
              currElevator.moveDown();
              break;
            case ELEVATOR_HOLD:
              // Could have a timer here to alert users that they are holding the door open to long
              // Could also be an emergency situation where elevator can't be used
              //
              break;
          }
          if (currElevator.direction() == ElevatorDirection.ELEVATOR_UP)
          break;
      }
    }



  }
}
