import React from 'react';
import ReactDOM from 'react-dom/client';
import './styles/styles.css';
import App from './App';

// Use React 18's createRoot instead of render
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>, // Add a trailing comma here
);

// Add a newline at the end of this file
