package de.maxbraun.stageoverview;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
class Stage implements Serializable {
    @NonNull private final String name;
    private final String contactFrontend;
    private final String contactBackend;
    private List<Application> applicationList = new ArrayList<Application>();

    public Stage addApplication(Application application) {
        applicationList.add(application);
        return this;
    }

}
