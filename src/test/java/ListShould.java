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
        final PersistentList list = new PersistentList(1);
        assertThat(list.size(),is(1));
        assertThat(list.get(0), is(1));
    }

    @Test
    public void have_two_elements_when_passing_them_to_the_constructor(){
        final PersistentList list = new PersistentList(1, 2);
        assertThat(list.size(),is(2));
        assertThat(list.get(0), is(2));
        assertThat(list.get(1), is(1));
    }
}
