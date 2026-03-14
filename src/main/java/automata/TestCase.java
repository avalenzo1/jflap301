package automata;

import java.io.Serializable;

/**
 * TestCase
 */
public class TestCase implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    String input;
    boolean expectedAccept;

    public TestCase(String input, boolean expected) {
        this.input = input;
        this.expectedAccept = expected;
    }

    @Override
    public TestCase clone() {
        try {
            TestCase clone = (TestCase) super.clone();

            clone.input = input;
            clone.expectedAccept = expectedAccept;
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
