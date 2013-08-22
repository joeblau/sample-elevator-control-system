package main.java.com.joeblau.ecs.interfaces;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 9:30 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ElevatorFactory {
  public void addNewDestinatoin(Integer destination);
  public void addNewPickup(Integer pickup);

}
