import { Routes, Route } from "react-router-dom";
import MainPage from "./pages/main-page";
import SignInPage from "./pages/sign-in-page";

function App() {
  return (
    <div>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/signin" element={<SignInPage />} />
      </Routes>
    </div>
  );
}

export default App;
