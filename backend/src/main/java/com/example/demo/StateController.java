package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "all")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("st")
    public List<StateModel> getAllStates() {
        return stateService.findAllStates();
    }

    @PostMapping
    public StateModel postState(@RequestBody StateModel state) {
        return stateService.postState(state);
    }
}
