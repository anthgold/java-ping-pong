import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {
}
  public ArrayList<Object> runPingPong(Integer number) {
    ArrayList<Object> results = new ArrayList<Object>();
    for (Integer changeNumber = 1; changeNumber <= number; changeNumber++) {
      if ( changeNumber % 15 == 0 ) {
        results.add("pingpong");
      } else if ( changeNumber % 3 == 0 ) {
        results.add("ping");
      } else if ( changeNumber % 5 == 0 ) {
        results.add("pong");
      } else {
        results.add(changeNumber);
      }

    }
    return results;
  }
}
