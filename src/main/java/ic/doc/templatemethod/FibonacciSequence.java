package ic.doc.templatemethod;


public class FibonacciSequence extends Sequence {

  public int sequence_term(int i) {
    if (i < 2) {
      return 1;
    }
    return sequence_term(i - 1) + sequence_term(i - 2);
  }

}
