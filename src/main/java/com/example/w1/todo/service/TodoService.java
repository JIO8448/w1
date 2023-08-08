package com.example.w1.todo.service;

import com.example.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    //enum타입으로 클래스를 작성할 경우, 가장 큰 장점: 정해진 수만큼 객체를 생성할 수 있다.
    INSTANCE;   //객체의 수 결정  TodoService.INSTANCE    //싱글톤 패턴 (singledTod pattern)

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG....." + todoDTO.toString());
    }

    public List<TodoDTO> getList(){
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i->{
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo..."+i);
            dto.setDueDate(LocalDate.now());
            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }

    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
