package com.JUnit.BasicJUnitPrograms.PerformanceTestingUsingTimeout;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {

    @Test
    void testLongRunningTaskPerformance() {

        TaskService service = new TaskService();

        assertTimeout(
            Duration.ofSeconds(2),
            () -> service.longRunningTask()
        );
    }
}
