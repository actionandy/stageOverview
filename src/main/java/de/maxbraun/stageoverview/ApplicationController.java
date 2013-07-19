package de.maxbraun.stageoverview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/stages/{stage}/applications")
public class ApplicationController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String printWelcome(@PathVariable String stage, ModelMap model) {

        model.addAttribute("message", "Application of stage " + stage + " here");
        return "hello";
    }

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public String getStage(@PathVariable String name, @PathVariable String stage,  ModelMap model) {
        model.addAttribute("message", "Details for Application" + name + " on Stage " + stage);
        return "hello";
    }
}