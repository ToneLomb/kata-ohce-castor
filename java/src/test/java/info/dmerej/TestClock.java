package info.dmerej;

public class TestClock implements IClock {
  private int currentHour;

  public TestClock(int currentHour) {
    this.currentHour = currentHour;
  }

  @Override
  public int getCurrentHour() {
    return currentHour;
  }

}
