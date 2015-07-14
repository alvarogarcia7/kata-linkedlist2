import com.example.kata.persistentlist.PersistentList;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ListShould {

    @Test
    public void be_empty_by_default() {
        assertThat(new PersistentList().isEmpty(), is(true));
    }
}
