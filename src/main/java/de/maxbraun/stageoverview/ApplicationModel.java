package de.maxbraun.stageoverview;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApplicationModel {

    public final String groupId;
    @NonNull public final String artifactId;
    @NonNull public final String url;

}
