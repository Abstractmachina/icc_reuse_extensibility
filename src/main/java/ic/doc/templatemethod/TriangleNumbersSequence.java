package ic.doc.templatemethod;

import java.util.Iterator;

public class TriangleNumbersSequence extends Sequence {
  @Override
  public int sequence_term(int i) {
    if (i < 1) {
      return 1;
    }
    return (i + 1) * (i + 2) / 2;
  }
}
