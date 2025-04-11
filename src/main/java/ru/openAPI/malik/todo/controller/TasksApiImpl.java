package ru.openAPI.malik.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.openAPI.malik.todo.api.TasksApi;
import ru.openAPI.malik.todo.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TasksApiImpl implements TasksApi {

    private final Map<Long, Task> tasks = new HashMap<>();
    private long currentId = 1;

    @Override
    public ResponseEntity<List<Task>> tasksGet() {
        return ResponseEntity.ok(new ArrayList<>(tasks.values()));
    }

    @Override
    public ResponseEntity<Task> tasksPost(Task task) {
        task.setId(currentId++);
        tasks.put(task.getId(), task);
        return ResponseEntity.ok(task);
    }

    @Override
    public ResponseEntity<Task> tasksIdPut(Long id, Task task) {
        task.setId(id);
        tasks.put(id, task);
        return ResponseEntity.ok(task);
    }

    @Override
    public ResponseEntity<Void> tasksIdDelete(Long id) {
        tasks.remove(id);
        return ResponseEntity.noContent().build();
    }
}