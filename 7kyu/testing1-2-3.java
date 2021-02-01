import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        ArrayList<String> LineNumbering  = new ArrayList<String>();
         int n=1; // numbering starts at 1

      for (String l : lines) {
            LineNumbering.add(String.format("%d: %s", n,l)); // d returns decimal integer, : specified and s returns string value
            n++;
        }
        return LineNumbering;
    }
}