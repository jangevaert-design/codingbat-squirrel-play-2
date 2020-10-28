public class SquirrelPlay2 {
  public boolean squirrelPlay(int temp, boolean isSummer) {
    return ((temp >= 60 && temp <= 90 && !isSummer) ||
        (temp >= 60 && temp <= 100 && isSummer));
  }
}
