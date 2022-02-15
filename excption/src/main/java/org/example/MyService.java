package org.example;

import java.util.Arrays;
import java.util.List;
import org.example.exception.MyResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyService {
  List<String> actors = Arrays.asList("Jack Nicholson", "Marlon Brando", "Robert De Niro", "Al Pacino", "Tom Hanks");


  public String getActor(int index) throws ResourceNotFoundException {
    if (index >= actors.size()) {
      throw new ResourceNotFoundException("Resours Not Found in Repsoitory");
    }
    return actors.get(index);
  }
}
