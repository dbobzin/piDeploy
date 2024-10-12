<template>
  <div>
    <h1>To-Do List</h1>
    <form @submit.prevent="addToDo">
      <input v-model="task" placeholder="New Task" />
      <button>Add</button>
    </form>
    <ul>
      <li v-for="todo in todos" :key="todo.id">
        {{ todo.task }}
        <button @click="deleteToDo(todo.id)">Delete</button>
      </li>
    </ul>
  </div>
</template>

<script>
import ToDoService from "@/router/ToDoService.js";

export default {
  data() {
    return {
      todos: [],
      task: ''
    };
  },
  mounted() {
    this.fetchTodos();
  },
  methods: {
    fetchTodos() {
      ToDoService.getTodos().then(response => {
        this.todos = response.data;
      });
    },
    addToDo() {
      ToDoService.createTodo({ task: this.task, completed: false }).then(() => {
        this.fetchTodos();
        this.task = '';
      });
    },
    deleteToDo(id) {
      ToDoService.deleteTodo(id).then(() => {
        this.fetchTodos();
      });
    }
  }
};
</script>
