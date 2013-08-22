package main.java.com.joeblau.ecs.impl.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: josephblau
 * Date: 8/22/13
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class InvalidNumber extends Exception {
  public InvalidNumber(String msg) {
    super(msg);
  }
}