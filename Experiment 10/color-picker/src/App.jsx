import { useState } from 'react'
import './App.css'

function App() {
  const [color, setColor] = useState('--');

  function handleBtn(c) {
    setColor(c);
    document.querySelector("body").style.backgroundColor = c;
  }

  return (
    <>
      <div className="container">
        {/* Large text message */}
        <h1 id="message">You have clicked {color} button</h1>

        {/* Color Buttons */}
        <div className="button-group">
          <button onClick={e => { handleBtn('Red') }} className="btn-red">
            Red
          </button>
          <button onClick={e => { handleBtn('Blue') }} className="btn-blue">
            Blue
          </button>
          <button onClick={e => { handleBtn('Green') }} className="btn-green">
            Green
          </button>
          <button onClick={e => { handleBtn('Yellow') }} className="btn-yellow">
            Yellow
          </button>
        </div>
      </div>
    </>
  )
}

export default App
