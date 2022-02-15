package org.example;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.error.ErrorDetail;
import org.example.error.WMSRestErrorResponse;
import org.example.exception.BaseException;
import org.example.exception.MyResourceNotFoundException;
import org.example.exception.WMSErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import ch.qos.logback.core.joran.conditional.ElseAction;

@RestController
public class TestController  {

  @Autowired
  private MyService service;

  @GetMapping(value="/getDetails/{id}")
  @ResponseBody
  public String getActorName(@PathVariable("id") int id) {
    var message = String.format("Order %d not found", id);
    if(id>5){
      throw new ResourceNotFoundException(message);
    }
    return service.getActor(id);
  }
  @GetMapping("/users/{id}")
  public ResponseEntity < User > getUser(
      @PathVariable(value = "id") Integer userId) throws ResourceNotFoundException {
    System.out.println("hello");
    Map< Integer, User > map = new HashMap< >();
    map.put(1, new User(1, "Ramesh"));
    map.put(2, new User(2, "Tony"));
    map.put(3, new User(3, "Tom"));

    if (!map.containsKey(userId)) {
      throw new ResourceNotFoundException("Resource not found for " + userId);
    }
    return ResponseEntity.ok(map.get(userId));
  }
}
