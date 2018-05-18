package ren.wizard.archm.provider.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.wizard.archm.provider.controller.InterfaceController;

/**
 * @author uyangjie
 */
@RestController
public class InterfaceControllerImpl implements InterfaceController {
    @Override
    public String test() {
        return "test";
    }
}
