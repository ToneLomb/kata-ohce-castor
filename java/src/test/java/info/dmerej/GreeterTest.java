package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class GreeterTest {
  @Test
  void nightlyGreeting() {
    assertEquals("Good night", new Greeter(new TestClock(0)).greet());
  }

  @Test
  void neverAsserts() {
    // Assert that the assertion in greet() is never thrown, by checking all hours from 0 to 23
    for (int i = 0; i < 24; i++) {
      try {
        new Greeter(new TestClock(i)).greet();
      } catch (AssertionError e) {
        fail(String.format("Assertion was thrown for hour %d", i));
      }
    }
  }
}
