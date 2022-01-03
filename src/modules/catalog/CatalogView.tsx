import React, { FC } from "react";

import { LoadingSpinner } from "../../tools/ui_components";

import useCatalog from "./useCatalog";
import StyledCatalogView from "./StyledCatalogView";

const CatalogView: FC = () => {
  const { isLoading, products, categories, onAddProductToCart } = useCatalog();

  return (
    <StyledCatalogView>
      <div className="CatalogView__header">
        <div className="CatalogView__header_text">Catalog Page</div>
      </div>

      <div className="CatalogView__grid"></div>

      <LoadingSpinner isVisible={isLoading} />
    </StyledCatalogView>
  );
};

export default CatalogView;
