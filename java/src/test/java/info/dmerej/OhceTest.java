package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OhceTest {
  @Test
  void testMainLoop() {
    /*
     TODO: check that given the following inputs:
      - hello
      - oto
     - quit

    The following messages are shown to the user:
     - olleh
     - oto
     - That was a palindrome!

    */
    var list = new String[]{"hello", "oto", "quit"};
    var interactor = new TestConsoleInteractor(list);
    var ohce = new Ohce(interactor);
    ohce.mainLoop();

    assertAll(
      () -> assertEquals("olleh", interactor.getOutput().get(0)),
      () -> assertEquals("oto", interactor.getOutput().get(1)),
      () -> assertEquals("That was a palindrome!", interactor.getOutput().get(2))
    );

  }
}
