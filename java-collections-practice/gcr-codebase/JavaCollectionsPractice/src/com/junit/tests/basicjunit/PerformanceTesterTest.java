package com.junit.tests.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.main.basicjunit.PerformanceTester;

import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        PerformanceTester.longRunningTask();
    }
}
