import { useState } from "react";
import { isLineBreak } from "typescript";

const Counter = () => {

    const [counter, setCounter] = useState(0);

const handleIncrease = () => {
    setCounter(counter + 1);
}

const handleDecrease = () => {
    setCounter(counter - 1);
}

    return(
        <div>
            <button onClick={handleIncrease}>Incrementar</button>
            <button onClick={handleDecrease}>Decrementar</button>
            <h3>Valor do contador: {counter}</h3>
        </div>
    );
}

export default Counter;