package de.maxbraun.stageoverview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stages")
public class StageController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
	public List<Stage> listStages(ModelMap model) {
        List<Stage> list;

        list = new ArrayList<Stage>();

        list.add(new Stage("foo", "bar", "bar2"));
        return list;
	}

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Stage getStage(@PathVariable String name, ModelMap model) {
        return new Stage("foo", "bar", "bar2").addApplication(new Application("com.maxbraun", "test", "http://foo.bar/"));
    }
}