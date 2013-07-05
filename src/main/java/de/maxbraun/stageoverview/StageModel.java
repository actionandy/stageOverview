package de.maxbraun.stageoverview;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
class StageModel {
    @NonNull private final String name;
    private final String contactFrontend;
    private final String contactBackend;
    private List<ApplicationModel> applicationModelList = new ArrayList<ApplicationModel>();

    public StageModel addApplication(ApplicationModel applicationModel) {
        applicationModelList.add(applicationModel);
        return this;
    }

}
