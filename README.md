# DiningReviewAPI
This is a project I created in completion of the Codecademy Create Rest APIs with Spring in Java course. This project is a review project where a user would first need tol register a profile, once they've regitered they would then be able to leave a review on a specified restaurant or search for a restaurant based on certain criteria. Should they leave a review, the review is not automatically posted until an admin user approves of the review.



In the project I learned how to work with an in-memory database(H2 database) from the command-line using curl statements.
    - I learned how to get the dependecies generated, wether it be via the start.spring.io website or using my chose IDE (Visual Studio Code).
    - I was to create it as a Maven project.
    - The database is set to update everytime the application starts, this means any changes to the database content or database schema will be updated when the application is run.

The project started with creating entities namely: User, Restaurant, DiningReview, AdminReview. These represent our tables in the database.

Afterwards the repositories: UserRepository, RestaurantRepository, DiningReviewRepository and AdminReviewRepossitory were created. These facilitated the queries to our database and they represented SQL queries.

Lastly the DiningReviewController class was created. This is where all API endpoints are situated. There are Create (Post), Read (Get), Update (Put) and Delete (Delete) methods in the controller facilitaing the various actions to the database.

I thoroughly enjoyed this project and the various challanges I had to face to get everythimg working. This project taught me a lodt about patience, paying close attention to detail and problem-solving issues i've never encountered before.