package test.main.java.com.joeblau.ecs.impl;

import main.java.com.joeblau.ecs.impl.ElevatorControlSystem;
import org.junit.Before;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class ElevatorControlSystemTest {
  private ElevatorControlSystem elevatorControlSystem;
  @Before
  public void initialize(){
    elevatorControlSystem = new ElevatorControlSystem(2, 20);

  }
}
