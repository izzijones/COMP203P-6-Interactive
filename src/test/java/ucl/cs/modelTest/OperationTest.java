package ucl.cs.modelTest;

import org.junit.Test;
import ucl.cs.model.Operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OperationTest {

    @Test
    public void computesCorrectly() throws Exception {
        Operation operation  = new Operation("+");
        assertThat(operation.compute(3,4), is(7));
    }
}
