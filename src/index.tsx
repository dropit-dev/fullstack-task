import React, { FC } from "react";
import ReactDOM from "react-dom";

import "./index.css";

import { AppRouter } from "./navigation/AppRouter";

const App: FC = () => {
  return (
    <div>
      <AppRouter />
    </div>
  );
};

ReactDOM.render(<App />, document.getElementById("root"));
