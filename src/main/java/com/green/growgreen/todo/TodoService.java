package com.green.growgreen.todo;


import com.green.growgreen.ResVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoMapper mapper;

    public ResVo postTodo(TodoInsDto dto) {
        int affectedRows = mapper.insTodo(dto);
        return new ResVo(dto.getItodo());
    };
}
