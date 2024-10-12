package com.raspberrypi.piDeploy.controller;

import com.raspberrypi.piDeploy.model.ToDo;
import com.raspberrypi.piDeploy.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin("*")
public class ToDoController {
    @Autowired
    private ToDoService service;

    @GetMapping
    public List<ToDo> getAllToDos() { return service.findAll(); }

    @PostMapping
    public ToDo createToDo(@RequestBody ToDo todo) { return service.save(todo); }

    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable Long id) { service.delete(id); }
}

