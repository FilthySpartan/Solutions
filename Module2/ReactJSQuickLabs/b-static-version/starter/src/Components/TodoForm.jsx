import React, {useState} from "react";
import DateCreated from './utils/DateCreated';

const TodoForm = () => {
    const [todoDescription, setTodoDescription] = useState(''); 
    const [todoDateCreated, setTodoDateCreated] = useState(null);
    const [todoCompleted, setTodoCompleted] = useState(false);
    const disabled = !todoDescription;
    return (
        <form>
            <div className="form-group">
                <label htmlFor="todoDescription">
                    Description:&nbsp;
                </label>
                <input className="form-control" name='todoDescription' placeholder='Todo Description' value={todoDescription} onChange={event => setTodoDescription(event.target.value)}></input>
            </div>
            <div className="form-group">
                <label htmlFor="todoDateCreated">
                    Created on:&nbsp;                   
                </label>
                <DateCreated updateDateCreated={dateCreated => setTodoDateCreated(dateCreated)}></DateCreated>
            </div>
            <div className="form-group">
                <label htmlFor="todoCompleted">
                    Completed:&nbsp;
                </label>
                <input type='checkbox' name="todoCompleted" checked={todoCompleted} onChange={event => setTodoCompleted(event.target.checked)}></input>
            </div>
            <div className="form-group">
                <input className="btn btn-primary" type="submit" value='Submit' disabled={disabled}></input>
            </div>
        </form>
    );
};

export default TodoForm;