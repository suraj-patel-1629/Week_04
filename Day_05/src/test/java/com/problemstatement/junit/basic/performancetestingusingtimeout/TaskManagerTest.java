package com.problemstatement.junit.basic.performancetestingusingtimeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {

    private final TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    void testLongRunning(){
        taskManager.logRunningTask();
    }
}
