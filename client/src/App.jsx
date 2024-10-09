import React from 'react';
import './styles/styles.css';

function App() {
  return (
    <div className="App">
      <nav className="navbar">
        <div className="logo">Global Hope Consortium</div>
        <ul className="nav-links">
          <li><a href="#home">Home</a></li>
          <li><a href="#software">Software</a></li>
          <li><a href="#accounting">Accounting</a></li>
          <li><a href="#transport">Transport</a></li>
          <li><a href="#electronics">Electronics</a></li>
          <li><a href="#contact">Contact</a></li>
        </ul>
        <div className="hamburger">
          <div className="line" />
          <div className="line" />
          <div className="line" />
        </div>
      </nav>

      <header className="header">
        <h1 className="heading">Welcome to Global Hope Consortium</h1>
        <button className="cta-button" type="button">Learn More</button>
      </header>
    </div>
  );
}

export default App;

// Add a newline (blank line) here: