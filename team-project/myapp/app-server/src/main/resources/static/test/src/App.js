import { Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Board from "./pages/Board";
import Login from "./pages/Login";
// import React, { useEffect, useState } from "react";
// import axios from "axios";

const App = () => {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/board" element={<Board />} />
      <Route path="/login" element={<Login />} />
    </Routes>
  );
};

export default App;

// function App() {
//   const [hello, setHello] = useState("");

//   useEffect(() => {
//     axios
//       .get("/api/hello")
//       .then((response) => setHello(response.data))
//       .catch((error) => console.log(error));
//   }, []);

//   return <div>백엔드에서 가져온 데이터입니다 : {hello}</div>;
// }

// export default App;
