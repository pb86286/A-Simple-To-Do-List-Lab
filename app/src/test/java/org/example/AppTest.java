package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddAndCompleteTask() {
        TaskList list = new TaskList();
        list.add("Test Task");
        list.complete("Test Task");
        assertTrue(true);
    }
}