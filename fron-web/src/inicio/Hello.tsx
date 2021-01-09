import { useEffect } from "react";

type Props = {
    message: string;
}


const Hello = ({ message }: Props) => {

    useEffect(() => {
        //chamda para API buscar os produtos
    },[]);

    return (
        <div>
            <h1>Hello {message}!</h1>
        </div>
    );
}

export default Hello;