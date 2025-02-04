public class Main {

  public static void main(String[] args) {

    Clock brlclock = new BRLClock();
    brlclock.setSecond(0);
    brlclock.setMinute(0);
    brlclock.setHour(25);

    System.out.println(brlclock.getTime());

    System.out.println(new USAClock().convert(brlclock).getTime());
  }

}
