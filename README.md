<h1>DiningReviewAPI</h1>
<h2>Project Details</h2>
<p>This is a project I created upon completion of the Codecademy Create Rest APIs with Spring in Java course. This project is a review project where a user would first need to register a profile, once they've registered they would then be able to leave a review on a specified restaurant or search for a restaurant based on certain criteria. Should they leave a review, the review is not automatically posted until an admin user approves of the review. </p>

<p>In the project, I learned how to work with an in-memory database(H2 database) from the command line using cURL statements.</p>
<ul>
    <li>I learned how to get the dependencies generated, whether it be via the start.spring.io website or using my chosen IDE (Visual Studio Code).</li>
    <li>I was to create it as a Maven project.</li>
    <li>The database is set to update every time the application starts, this means any changes to the database content or database schema will be updated when the application is run.</li>
</ul>

<h3>The project started with creating entities, that represent our tables in the database, namely: </h3>
<ul>
    <li><strong>User</strong>: Stores information about users who can leave reviews</li>
    <li><strong>Restaurant</strong>: Stores details of the various restaurants, with their ratings</li>
    <li><strong>DiningReview</strong>: Stores details about the reviews Users leave for Restaurants</li>
    <li><strong>AdminReview</strong>: Stores the Admins username and the review they accepted or declined</li>
</ul>
<p>Below is a snippet of the Dining Review entity:</p>
<img src ="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/eb6b995f-c662-4ecf-9932-61588c135b2a" alt="Dining Review Entity attributes"/>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/68ce2e6d-f3b9-4c2d-a88e-b357ed2b9f89" alt="Dining Review Entity constructors and Getters and Setters"/>

<h3>Next I created 4 repositories that facilitated the queries to our database and they represented SQL queries.:</h3>
<ul>
    <li>UserRepository</li>
    <li>RestaurantRepository</li>
    <li>DiningReviewRepository</li>
    <li>AdminReviewRepossitory</li>
</ul>
<p>Below is a snippet of the Dining Review repository:</p>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/d9a1365a-b8bd-4700-b08a-3d6db7b70deb" alt="Dining Review Repository"/>


<h3>Lastly, the DiningReviewController class was created. This is where all API endpoints are situated:</h3>
<p>There are Create (Post), Read (Get), Update (Put), and Delete (Delete) methods in the controller facilitating the various actions to the database.</p>

<h4>POST Request</h4>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/6c5ff1fc-b6c6-49db-8d8b-f39b205ae295" alt="An example of a POST request"/>

<h4>GET Request</h4>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/144b8a64-bc2f-4ee3-a654-b531f5e7a65e alt="An example of a GET request"

<h4>PUT Request</h4>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/4de251b2-93b5-47ea-9947-2d578fdc95f0 alt="An example of a PUT request"/>

<h4>DELETE Request</h4>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/c25357d3-b725-4f05-8d64-2539197f068f" alt="An example of a DELETE request"/>

<h3>Below is an example of some of the cURL statements I used while testing my API endpoints:</h3>
<img src="https://github.com/TheMbalist/DiningReviewAPI/assets/121617487/6b53f856-5cf0-4efd-a316-de1d73fa8b4f alt="An example of my cURL statements/>


<h2>Final Reamrks</h2>
<p>I thoroughly enjoyed this project and the various challenges I had to face to get everything working. This project taught me a lot about patience, paying close attention to detail, and problem-solving issues I've never encountered before. I still have a lot of learning to do and I'm excited to do more Spring API projects and improve my skills.</p>
