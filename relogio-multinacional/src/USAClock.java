public non-sealed class USAClock extends Clock {

  private String periodIndicator;

  public String getPeriodIndicator() {
    return periodIndicator;
  }

  public void setAfterMidday() {
    this.periodIndicator = "PM";
  }

  public void setBeforeMidday() {
    this.periodIndicator = "AM";
  }

  @Override
  public void setHour(int hour) {
    setBeforeMidday();
    if ((hour > 12) && (hour <= 23)) {
      setAfterMidday();
      this.hour = hour - 12;
    } else if (hour >= 24) {
      this.hour = 0;
    } else {
      this.hour = hour;
    }
  }

  @Override
  Clock convert(Clock clock) {
    this.second = clock.getSecond();
    this.minute = clock.getMinute();

    switch (clock) {
      case USAClock usaClock -> {
        this.hour = usaClock.getHour();
        this.periodIndicator = usaClock.getPeriodIndicator();
      }
      case BRLClock brlClock -> this.setHour(brlClock.getHour());
    }
    return this;
  }

  @Override
  public String getTime() {
    return super.getTime() + " " + this.periodIndicator;
  }
}
