package com.raspberrypi.piDeploy.repository;

import com.raspberrypi.piDeploy.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> { }

