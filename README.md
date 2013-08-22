# ecs - Elevator Control System

## Task

Design and implement an elevator control system. What data structures,
interfaces and algorithms will you need? Your elevator control system should
be able to handle a few elevators -- up to 16.

## Design

The elevator control system has two classes, an `Elevator` and an `ElevatorControlSystem`

### ElevatorControlSystem

The Elevator control system manages all of the elevators and process the next tick of the system.  It is responsible for
handling pickup requests which come from people outside of the elevator and destination requests which come from users
inside the elevator

### Elevator

The Elevator manages which floor it's on, which floors it needs to go to, the status, and the direction of the elevator.

__ElevatorDirection__ - An elevator can be going in one of three directions
```java
public enum ElevatorDirection {
  ELEVATOR_UP,      // Elevator is going up
  ELEVATOR_DOWN,    // Elevator is going down
  ELEVATOR_HOLD     // Elevator is being held
}
```

__ElevatorStatus__ - Each elevator has one of two status
```java
public enum ElevatorStatus {
  ELEVATOR_OCCUPIED,  // Elevator is occupied by users inside who are request floors
  ELEVATOR_EMPTY      // Elevator is empty and can be used to request a pickup
}
```

## Things to improve

- [ ] Improve algorithm for finding near elevators
- [ ] Queue that controls the destination floors could be converted into a better data structure
  - [ ] Sorted Insert List
- [ ] Handle Hold cases
  - [ ] Check timer here to alert users that they are holding the door open to long
  - [ ] Emergency situation where elevator can't be used
  - [ ] Maintenance Mode e.g. movers or maintenance people
- [ ] Added lowest and highest floors to elevators. Not all elevators in a building go to the same level
- [ ] Better error and exception handling