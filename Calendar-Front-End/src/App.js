import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Month from './components/Month';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          <h1>React Calendar</h1>
        </p>
        <Month />
      </div>
    );
  }
}

export default App;
