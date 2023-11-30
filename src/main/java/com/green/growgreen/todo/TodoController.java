package com.green.growgreen.todo;

import com.green.growgreen.ResVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoService service;

    @PostMapping
    public ResVo postTodo(@RequestBody TodoInsDto dto) {
        return service.postTodo(dto);
    }


}
