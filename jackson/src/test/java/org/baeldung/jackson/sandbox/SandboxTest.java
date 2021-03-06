package org.baeldung.jackson.sandbox;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SandboxTest {

    @Test
    public final void whenDeserializing_thenCorrect() throws JsonParseException, JsonMappingException, IOException {
        final TestElement testElement = new TestElement();
        testElement.setX(10);
        testElement.setY("adasd");
        final ObjectMapper om = new ObjectMapper();
        final String serialized = om.writeValueAsString(testElement);
        System.err.println(serialized);
    }

    //

}
