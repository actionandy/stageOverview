package de.maxbraun.stageoverview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StageModelTest {
    @Test
    public void testStageModel() throws Exception {
        StageModel stage;
        ApplicationModel applicationModel;

        stage = new StageModel("test", "test1", "test2");
        applicationModel = new ApplicationModel("ab", "c", "foo");

        assertEquals(stage.getName(), "test");
        assertEquals(stage.getContactFrontend(), "test1");
        assertEquals(stage.getContactBackend(), "test2");
        assertEquals(stage.getContactBackend(), "test2");

        stage.addApplication(applicationModel);
        assertEquals(applicationModel, stage.getApplicationModelList().get(0));
    }

}
