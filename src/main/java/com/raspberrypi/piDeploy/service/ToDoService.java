package com.raspberrypi.piDeploy.service;

import com.raspberrypi.piDeploy.model.ToDo;
import com.raspberrypi.piDeploy.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository repository;

    public List<ToDo> findAll() { return repository.findAll(); }
    public ToDo save(ToDo todo) { return repository.save(todo); }
    public void delete(Long id) { repository.deleteById(id); }
}

