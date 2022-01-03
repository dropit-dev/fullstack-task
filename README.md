#### Welcome to Dropit's React Test

### Guidelines

* use existing components and configuration if exists
* try to mimic the implemented architecture when adding content
* keep code clean and organized

## Requirements

* setup an application state (consistent for a single session)

* #### Catalog page
    * get products categories by sending a request to the BE
    * add search input that filter the displayed data by product's name (search is done by the BE)
    * add selector to filter the displayed data by a selected category (filter is done by the BE)
    * add sort functionality (sort is done by the BE)
    * handle add product to cart
    * display the cart icon with a badge counter for the number of products (not items) in the cart

* #### Product page
    * setup new page and module (use existing configuration)
    * get product extended data by id (send request to BE)
    * display product extended data
    * display the cart icon with a badge counter for the number of products (not items) in the cart

* #### Cart page
    * setup new page and module (use existing configuration)
    * display products that are in the cart state as a table (image, name, price per unit, quantity, total price)
    * show summary data (number of products, number of items, total price)
    * add a checkout button near the summary
    * post checkout request with the quantity of each product that are in the cart
    * display successful message when done
