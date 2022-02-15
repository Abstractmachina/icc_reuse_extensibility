package ic.doc.templatemethod;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TriangleNumbersSequenceTest {

  final TriangleNumbersSequence seq = new TriangleNumbersSequence();

  @Test
  public void definesFirstTermToBeOne() {

    assertThat(seq.term(0), is(1));
  }

  @Test
  public void definesSubsequentTermsEqualToNPlusOneTimesNPlusTwoDivTwo() {

    assertThat(seq.term(2), is(6));
    assertThat(seq.term(3), is(10));
    assertThat(seq.term(4), is(15));
  }

  @Test
  public void isUndefinedForNegativeIndices() {

    try {
      seq.term(-1);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
    }
  }

  @Test
  public void canBeIteratedThrough() {
    assertThat(seq, beginsWith(1, 3, 6, 10, 15));
  }
}
