package fr.lernejo.todo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoListController {
    private final TodoRepository repository;

    public TodoListController(TodoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("todo")
    public void addElement(@RequestBody TodoEntity todo) {
        this.repository.save(todo);
    }

    @GetMapping("todo")
    public Iterable<TodoEntity> list() {
        return this.repository.findAll();
    }
}
