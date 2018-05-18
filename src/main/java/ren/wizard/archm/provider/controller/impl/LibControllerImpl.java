package ren.wizard.archm.provider.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import ren.wizard.archm.providercontract.controller.LibController;

@RestController
public class LibControllerImpl implements LibController {
    @Override
    public String testLibGet() {
        return "from lib";
    }
}
