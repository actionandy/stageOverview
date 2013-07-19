package de.maxbraun.stageoverview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StageTest {
    @Test
    public void testStageModel() throws Exception {
        Stage stage;
        Application application;

        stage = new Stage("test", "test1", "test2");
        application = new Application("ab", "c", "foo");

        assertEquals(stage.getName(), "test");
        assertEquals(stage.getContactFrontend(), "test1");
        assertEquals(stage.getContactBackend(), "test2");
        assertEquals(stage.getContactBackend(), "test2");

        stage.addApplication(application);
        assertEquals(application, stage.getApplicationList().get(0));
    }

}
