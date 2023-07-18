import { useEffect, useState } from "react";
import useHelloBackend from "./services/hello-backend";

function App() {
  const [message, setMessage] = useState("초기값");
  const helloBackend = useHelloBackend();
  const init = async () => {
    const data = await helloBackend();
    setMessage(data);
  };
  useEffect(() => {
    init();
  }, []);
  return (
    <div>
      <h1>{message}</h1>
      <h2>반가워요</h2>
    </div>
  );
}

export default App;
