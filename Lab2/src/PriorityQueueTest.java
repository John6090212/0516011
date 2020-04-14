
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collection;
import java.util.PriorityQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PriorityQueueTest {
    private int[] random_array;
    private int[] correct_array;
    private PriorityQueue<Integer> test_queue;
    public  PriorityQueueTest(int i1, int i2, int i3, int i4, int i5, int i6){
        random_array = new int[3];
        random_array[0] = i1;
        random_array[1] = i2;
        random_array[2] = i3;
        correct_array = new int[3];
        correct_array[0] = i4;
        correct_array[1] = i5;
        correct_array[2] = i6;
        test_queue = new PriorityQueue<Integer>();
        test_queue.add(i1);
        test_queue.add(i2);
        test_queue.add(i3);
    }
    @Parameters
    public static Collection testNumbers(){
        return Arrays.asList(new Integer[][] {{2,1,3,1,2,3},{3,2,4,2,3,4},{4,3,5,3,4,5},{5,4,6,4,5,6},{6,5,7,5,6,7}});
    }
    /*
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void comparator() {
    }

    @org.junit.jupiter.api.Test
    void iterator() {
    }
*/
    @Test(expected = NullPointerException.class)
    public void offer() {
        test_queue.offer(null);
    }
/*
    @org.junit.jupiter.api.Test
    void peek() {
    }
*/
    @Test
    public void poll() {
        for(int i = 0; i < 3; i++) {
            int poll_num = test_queue.poll();
            assertEquals(poll_num,correct_array[i]);
        }
    }
/*
    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }
*/
    @Test
    public void addAll() {
        Exception exception = assertThrows(NullPointerException.class,() -> {test_queue.addAll(null);});
        Exception exception2 = assertThrows(IllegalArgumentException.class,() -> {test_queue.addAll(test_queue);});
    }

/*
    @org.junit.jupiter.api.Test
    void findSlot() {
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
    }

    @org.junit.jupiter.api.Test
    void bubbleUp() {
    }

    @org.junit.jupiter.api.Test
    void resize() {
    }

 */
}