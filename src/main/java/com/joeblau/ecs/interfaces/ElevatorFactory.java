package main.java.com.joeblau.ecs.interfaces;

import main.java.com.joeblau.ecs.impl.enums.ElevatorDirection;
import main.java.com.joeblau.ecs.impl.enums.ElevatorStatus;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 9:30 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ElevatorFactory {
  public void moveUp();
  public void moveDown();
  public void addNewDestinatoin(Integer destination);
  public ElevatorDirection direction();
  public ElevatorStatus status();

}
