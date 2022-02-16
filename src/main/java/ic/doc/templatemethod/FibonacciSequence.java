package ic.doc.templatemethod;


public class FibonacciSequence extends Sequence {

  public int sequence_term(int i) {
    return sequence_term(i - 1) + sequence_term(i - 2);
  }

}
