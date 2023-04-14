import React, { useEffect, useState } from "react";

import "./App.css";
import Header from "./Header/Header";
import Main from "./Main/Main";
import Login from "./Login/Login";
import Footer from "./Footer/Footer";
import Sign from "./sign/sign";
import Board from "./Board/Board";
import Form from "./Form/Form";
import FormComm from "./FormComm/FormComm";

import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <Header />

        <Routes>
          <Route path="/Main" element={<Main />} />
          <Route path="/Board" element={<Board />} />
          <Route path="/Form" element={<Form />} />
          <Route path="/FormComm" element={<FormComm />} />
          <Route path="/Login" element={<Login />} />
          <Route path="/Sign" element={<Sign />} />
        </Routes>

        <Footer />
      </div>
    </BrowserRouter>
  );
}

export default App;
