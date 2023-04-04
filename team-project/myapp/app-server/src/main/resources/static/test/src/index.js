import React from "react";
import ReactDOM from "react-dom/client";

import { BrowserRouter } from "react-router-dom";
import App from "./App";

const main = ReactDOM.createRoot(document.getElementById("root"));
main.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>
);
