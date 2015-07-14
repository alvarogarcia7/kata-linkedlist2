import com.example.kata.persistentlist.PersistentList;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ListShould {

    @Test
    public void be_empty_by_default() {
        assertThat(new PersistentList().isEmpty(), is(true));

    }

    @Test
    public void have_one_element_when_passing_it_to_the_constructor(){
        assertThat(new PersistentList(1).size(),is(1));
    }
}
