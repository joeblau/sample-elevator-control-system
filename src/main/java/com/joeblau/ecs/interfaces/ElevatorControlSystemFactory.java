package main.java.com.joeblau.ecs.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ElevatorControlSystemFactory {
  public void pickUp(Integer pickUpFloor);
  public void destination(Integer elevatorId, Integer destinationFloor);
  public void step();

}
