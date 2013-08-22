package test.main.java.com.joeblau.ecs.impl;

import main.java.com.joeblau.ecs.impl.enums.ElevatorDirection;
import main.java.com.joeblau.ecs.impl.enums.ElevatorStatus;
import org.junit.Test;
import main.java.com.joeblau.ecs.impl.Elevator;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class ElevatorTest {
  public static final int TENTH_FLOOR = 10;
  public static final int SECOND_FLOOR = 2;
  public static final int BASEMENT_TWO = -2;

  private Elevator elevator;

  @Before
  public void initializeElevator(){
    elevator = new Elevator(0,null);
  }

  @Test
  public void testAddingDestination(){
    elevator.addNewDestinatoin(TENTH_FLOOR);
    assertEquals(TENTH_FLOOR, elevator.nextDestionation());
  }

  @Test
  public void checkCurrentFloor(){
    // Move to floor 2
    elevator.moveUp();
    elevator.moveUp();
    assertEquals(SECOND_FLOOR, elevator.currentFloor());
  }

  @Test
  public void checkMoveDown(){
    elevator.moveDown();
    elevator.moveDown();
    assertEquals(BASEMENT_TWO, elevator.currentFloor());
  }

  @Test
  public void checkDirectionUp(){
    elevator.addNewDestinatoin(SECOND_FLOOR);
    assertEquals(ElevatorDirection.ELEVATOR_UP, elevator.direction());
  }

  @Test
  public void checkDirectionDown(){
    elevator.addNewDestinatoin(BASEMENT_TWO);
    assertEquals(ElevatorDirection.ELEVATOR_DOWN, elevator.direction());
  }

  @Test
  public void checkDirectionHold(){
    assertEquals(ElevatorDirection.ELEVATOR_HOLD, elevator.direction());
  }

  @Test
  public void checkStatusEmpty(){
    assertEquals(ElevatorStatus.ELEVATOR_EMPTY, elevator.status());
  }

  @Test
  public void checkStatusOccupied(){
    elevator.addNewDestinatoin(TENTH_FLOOR);
    assertEquals(ElevatorStatus.ELEVATOR_OCCUPIED, elevator.status());
  }
}
