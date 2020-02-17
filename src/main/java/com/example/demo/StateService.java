package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StateService {
    @Autowired
    private StateRepository stateRepos;

    //find all
    public List<StateModel> findAllStates() {
        return  stateRepos.findAll();
    }
    public StateModel postState(StateModel state) {
        return stateRepos.save(state);
    }
}

