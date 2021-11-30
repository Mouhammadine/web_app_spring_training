package fr.lernejo.todo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoListController {
    private final List<Todo> todos = new ArrayList<>();

    @PostMapping("todo")
    public void addElement(@RequestBody Todo todo) {
        this.todos.add(todo);
    }

    @GetMapping("todo")
    public List<Todo> list() {
        return this.todos;
    }
}
