import { BrowserRouter, Route, Routes } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.css";
import React, { useEffect, useState } from "react";
// import axios from "axios";

import Header from "./pages/area/header/Header";
import Footer from "./pages/area/footer/Footer";

import Home from "./pages/Home";
import Board from "./pages/Board";
import Insert from "./pages/Insert";
import Form from "./pages/Form";

const App = () => {
  return (
    <div className="App">
      <Header />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/board" element={<Board />} />
        <Route path="/insert" element={<Insert />} />
        <Route path="/form" element={<Form />} />
      </Routes>

      <Footer />
    </div>
  );
};

export default App;

// const baseUrl = "http://localhost:8080";

// useEffect(() => {
//   getHomes();
// }, []); // 빈배열 - 한번만 실행

// async function getHomes() {
//   axios.defaults.withCredentials = true;

//   await axios
//     .get(baseUrl + "/web")
//     .then((response) => {
//       console.log(response.data);
//     })
//     .catch((error) => {
//       console.log(error);
//     });
// }

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
