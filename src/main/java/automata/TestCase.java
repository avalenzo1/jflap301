package automata;

import java.io.Serializable;

/**
 * TestCase
 */
public class TestCase implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    public String input;
    public String expected;

    public TestCase(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Override
    public TestCase clone() {
        try {
            TestCase clone = (TestCase) super.clone();

            clone.input = input;
            clone.expected = expected;
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
