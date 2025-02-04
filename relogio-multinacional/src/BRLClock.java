public non-sealed class BRLClock extends Clock {

  @Override
  public Clock convert(Clock clock) {

    this.second = clock.getSecond();
    this.minute = clock.getMinute();

    switch (clock) {
      case USAClock usaClock -> {

        this.hour = (usaClock.getPeriodIndicator().equals("PM")) ? usaClock.getHour() + 12 : usaClock.getHour();
      }
      case BRLClock brlClock -> {

        this.hour = brlClock.getHour();
      }

    }
    return this;
  }

}
