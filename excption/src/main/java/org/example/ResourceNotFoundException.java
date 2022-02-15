package org.example;

/**
 * The ResourceNotFoundException class is added as @ExceptionHandler in
 * ControllerExceptionHandler
 */

public class ResourceNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  public ResourceNotFoundException(String msg) {
    super(msg);
  }
}
