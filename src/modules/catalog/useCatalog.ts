import { useCallback, useEffect, useState } from "react";

import { API } from "../../api";
import useFlag from "../../hooks/useFlag";

import { Product } from "../product/types";

const useCatalog = () => {
  const [products, setProducts] = useState<Product[]>([]);
  const [categories, setCategories] = useState<string[]>([]);
  const [isLoading, onStartLoading, onEndLoading] = useFlag(true);

  const handleAddProductToCart = useCallback((product: Product) => {
    // TODO
  }, []);

  useEffect(
    () => {
      API.product
        .getAll()
        .then(setProducts)
        .then(API.category.getAll)
        .then(setCategories)
        .finally(onEndLoading);
    },
    [] // eslint-disable-line
  );

  return {
    isLoading,
    products,
    categories,
    onAddProductToCart: handleAddProductToCart,
  };
};

export default useCatalog;
