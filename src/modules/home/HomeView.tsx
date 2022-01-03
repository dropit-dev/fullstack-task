import React, { FC } from "react";
import { Link } from "react-router-dom";

import routesApp from "../../contexts/navigation/routesApp";

import StyledHomeView from "./StyledHomeView";

const HomeView: FC = () => {
  return (
    <StyledHomeView>
      <div className="HomeView__header">
        <div className="HomeView__header_title">
          Welcome To Dropit (by Itay Golbary)
        </div>

        <Link to={routesApp.getCatalog()}>Continue to Catalog</Link>
      </div>

      <div className="HomeView__content">
        <div className="HomeView__content_github">
          <a href="https://github.com/itay-golbary/dropit-test">GitHub Repo</a>
        </div>

        <div className="HomeView__content_email">
          <a href="mailto:itay@golbary.io">Email: itay@golbary.io</a>
        </div>

        <div className="HomeView__content_phone">Phone: 052-4655995</div>
      </div>
    </StyledHomeView>
  );
};

export default HomeView;
