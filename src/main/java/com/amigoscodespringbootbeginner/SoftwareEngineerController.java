package com.amigoscodespringbootbeginner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer("Java", 1, "John Doe"),
                new SoftwareEngineer("Python", 2, "Jane Smith"),
                new SoftwareEngineer("JavaScript", 3, "Alice Johnson")
        );
    };
}
