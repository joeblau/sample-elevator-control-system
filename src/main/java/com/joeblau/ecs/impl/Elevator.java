package main.java.com.joeblau.ecs.impl;

import main.java.com.joeblau.ecs.interfaces.ElevatorFactory;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 9:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Elevator implements ElevatorFactory {
  private Integer currentFloor;
  private ArrayList<Integer> destinationFloors;

  public Elevator(Integer currentFloor, ArrayList<Integer> destinationFloors) {
    this.currentFloor = currentFloor;
    this.destinationFloors = new ArrayList<Integer>();;
  }

  @Override
  public void addNewDestinatoin(Integer destination) {
    this.destinationFloors.add(destination);
  }

  @Override
  public ElevatorStatus status() {
    return (destinationFloors.size() > 0)?ElevatorStatus.ELEVATOR_OCCUPIED:ElevatorStatus.ELEVATOR_EMPTY;
  }
}
