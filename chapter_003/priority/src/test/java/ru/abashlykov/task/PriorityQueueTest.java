package src.test.java.ru.abashlykov.task;

import org.junit.Test;
import src.main.java.ru.abashlykov.task.PriorityQueue;
import src.main.java.ru.abashlykov.task.Task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PriorityQueueTest {
    @Test
    public void whenHigherPriority(){
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

}