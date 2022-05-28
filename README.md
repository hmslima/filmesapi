# Filmes API

This is a simple API that shows some movies I like. Obviously that you cannot 
add, modify or delete the data.

You can access the API through this [hyperlink](https://hmslimafilmesapi.herokuapp.com/filmes).

-----

## Technical details

The data is stored in a PostgreSQL database in Heroku, it was used Java and Spring to get the data from the database and make it available as JSON.

The data is transmitted through three layers:

Database => DAO *(Data access object)* layer => service layer => controller layer

The service layer  is unnecessary for this project, but I want to develop the habit of using it.

Only the method GET was made available, the codes for the POST, PUT and DELETE methods are all commented.