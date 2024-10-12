import axios from 'axios';

const API_URL = 'http://jdobecom.xyz/api/todos';

export default {
  getTodos() {
    return axios.get(API_URL);
  },
  createTodo(todo) {
    return axios.post(API_URL, todo);
  },
  deleteTodo(id) {
    return axios.delete(`${API_URL}/${id}`);
  }
};
