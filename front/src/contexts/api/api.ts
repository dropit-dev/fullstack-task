import Axios from "axios";

import { CatalogProduct, ProductDetails } from "../../modules/product/types";

const AxiosClient = Axios.create({
  baseURL: "http://localhost:8080",
});

const API = {
  product: {
    getById: async (productId: number): Promise<ProductDetails> =>
      AxiosClient.get<ProductDetails>(`/catalog/products/${productId}`).then(
        (response) => response.data
      ),
    getAll: async (): Promise<CatalogProduct[]> =>
      AxiosClient.get<CatalogProduct[]>(`/catalog/products`).then(
        (response) => response.data
      ),
  },
  category: {
    getAll: async (): Promise<string[]> =>
      AxiosClient.get<string[]>(`/catalog/categories`).then(
        (response) => response.data
      ),
  },
  cart: {
    postCheckout: async (cartData: Record<string, number>): Promise<void> =>
      AxiosClient.post(`/checkout`, { cartData }),
  },
};

export { API };
