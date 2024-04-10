package io.github.yaowenbin.snowflake.core;

import io.github.yaowenbin.snowflake.core.IDGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdGeneratorTest {

    @Test
    public void id_should_equals_16_length() {
        var res = IDGenerator.generateId();
        assertEquals(16, String.valueOf(res).length());
    }

    @Test
    public void id_should_increment_by_time() throws InterruptedException {
        var oldId = IDGenerator.generateId();
        var newId = IDGenerator.generateId();

        Thread.sleep(1000);
        var newIdAfterTimeSleep = IDGenerator.generateId();

        assertTrue(newId > oldId);
        assertTrue(newIdAfterTimeSleep > newId);
    }

}