package info.dmerej;

import java.time.LocalTime;

public class SystemClock implements IClock {
  @Override
  public int getCurrentHour() {
    var now = LocalTime.now();
    return now.getHour();
  }
}
