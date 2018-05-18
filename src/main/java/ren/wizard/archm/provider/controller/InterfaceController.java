package ren.wizard.archm.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author uyangjie
 */
@RequestMapping("/interface/")
public interface InterfaceController {
    @GetMapping("/")
    String test();
}
