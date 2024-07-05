package org.ana.todo.service;

import org.ana.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ana.todo.Repositories.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    //private List<Todo> todos = new ArrayList<>();
  //  private Long currentId = 1L;

    //public List<Todo> getAllTodos() {
      //  return todos;
    //}

//    public Todo addTodo(Todo todo) {
//        todo.setId(currentId++);
//        todos.add(todo);
//        return todo;
//    }
//
//    public void deleteTodoById(Long id) {
//        todos.removeIf(todo -> todo.getId().equals(id));
//    }
@Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
    public List<Todo> getCompletedTodos(){
        return todoRepository.findCompletedTodos();
    }


}
