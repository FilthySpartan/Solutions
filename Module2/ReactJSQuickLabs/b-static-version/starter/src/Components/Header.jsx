import React from "react";
import logo from './images/qalogo.svg';

const Header = () => {
    return (
        <header>
            <nav className='navbar navbar-expand-sm'>
                <a className='navbar-brand' href='https://www.qa.com/' target='_blank' rel='noopener noreferrer' >
                    <img 
                    src={logo}
                    alt="QA Ltd" 
                    style={{ width: '100px'}} 
                    />
                </a>
                <a class='navbar-brand' href='/'>
                    <h1>ToDo App</h1>
                </a>
            </nav>
        </header>
    );
};

export default Header