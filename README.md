#### Welcome to Dropit's Fullstack Test

### Guidelines

* use existing libraries and configuration if exists
* try to mimic the implemented architecture when adding content
* keep code clean and organized
* **either use the given BE implementation to add basic functionally with Kotlin, or implement the same functionality and structure with a language/framework of your choosing**

## Requirements

* ### Client (http://localhost:3000/)

  * set up an application state (consistent for a single session)

  * #### Catalog page
      * get products categories by sending a request to the BE
      * add search input that filter the displayed data by product's name (search is done by the BE)
      * add selector to filter the displayed data by a selected category (filter is done by the BE)
      * add sort functionality by any property (sort is done by the BE)
      * handle add product to cart
      * handle click row (navigate to product page or open product modal)
      * display the cart icon with a badge counter for the number of products (not items) in the cart
      * display "No Results" for an empty 

  * #### Product page/modal
      * set up new page/modal and module (use existing configuration)
      * get product extended data by id (send request to BE)
      * display all product extended data
      * display the cart icon with a badge counter for the number of products (not items) in the cart

  * #### Cart page
      * set up new page and module (use existing configuration)
      * display products that are in the cart state as a table (image, name, price per unit, quantity, total price)
      * show summary data (number of products, number of items, total price)
      * add a checkout button near the summary
      * post checkout request with the quantity of each product that are in the cart
      * display a successful message when done

* ### Server (http://localhost:8080/)

  * #### Catalog api & controller
    * modify **getProducts** to accept params and implement filter functionalities (search by name, filter by category and sort by any property)
    * create **getProduct** endpoint that returns a new ProductDetailsDTO will all available product data

  * #### Orders api & controller
    * modify **checkout** to accept params and implement filter functionality (search by name, filter by category and sort by a property)
    * create **getProduct** endpoint that returns a new ProductDetailsDTO will all available product data
