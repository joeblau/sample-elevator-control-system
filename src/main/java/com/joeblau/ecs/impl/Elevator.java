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
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void addNewPickup(Integer pickup) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public ElevatorStatus status() {
    return (destinationFloors.size() > 0)?ElevatorStatus.OCCUPIED:ElevatorStatus.EMPTY;
  }
}
