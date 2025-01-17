package org.ana.todo.Repositories;

import org.ana.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
   @Query("SELECT t FROM Todo t WHERE t.completed = true")
   List<Todo> findCompletedTodos();
}
