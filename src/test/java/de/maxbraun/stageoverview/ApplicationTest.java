package de.maxbraun.stageoverview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    @Test
    public void testApplicationModel() throws Exception {
        Application application;

        application = new Application("com.groupId", "artifactId", "http://foo.bar:1010");

        assertEquals("com.groupId", application.getGroupId());
        assertEquals("artifactId", application.getArtifactId());
        assertEquals("http://foo.bar:1010", application.getUrl());
    }
}
