import React, {useState} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap';
import 'popper.js';
import 'jquery';
import './Components/css/qa.css';
import sampleTodos from './sampleTodos.json';
import Header from './Components/Header';
import Footer from './Components/Footer';
import AllTodos from './Components/AllTodos';
import AddEditTodo from './Components/AddEditTodo';
 
function App() {
  const [todos, setTodos] = useState(sampleTodos);
  return (
    <div className="container">
      <Header></Header>
      <div className="container">
        <AllTodos todos={todos}></AllTodos>
        <AddEditTodo></AddEditTodo>
      </div>
      <Footer></Footer>
    </div>
  );
}

export default App;
