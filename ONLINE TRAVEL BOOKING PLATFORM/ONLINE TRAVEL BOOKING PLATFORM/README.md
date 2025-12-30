🌍 ONLINE TRAVEL BOOKING SYSTEM

The Online Travel Booking System is a Java MVC application that allows users to search and book flights, hotels, and rental cars.
It follows a Model-View-Controller (MVC) architecture with role-based access for Admins and Travelers.

🧭 PROJECT STRUCTURE
OnlineTravelBooking/
├── src/
│   ├── model/           → Entity classes: User, Booking, Flight, Hotel, Car, Payment
│   ├── dao/             → Data Access Layer: DBConnection, UserDAO, BookingDAO,FlightDAO   HotelDAO
     |---
│   ├── service/         → Business logic: BookingService, PaymentService, EmailNotificationThread
│   ├── util/            → Utility classes: Validator, Constants, DBUtil
│   ├── WEBAPPS/        → JSP pages: login.jsp, dashboard.jsp, booking.jsp, success.jsp, payment.jsp
│   └── Main.java        → Optional testing entry point
├── lib/                 → MySQL JDBC driver (mysql-connector-java-9.45.jar)
├── resources/           → Static files, images/icons, sample DB script (onlinetravelbooking.sql)
└── README.md

🧑‍💻 TECHNOLOGIES USED
Component -	Technology
Language -	Java 17+
Web	JSP / Servlets (javax.servlet)
Database	MySQL 8.0.43
JDBC	MySQL Connector/J 9.45.JAR
Server	Apache Tomcat 8/9
IDE	VS Code
👥 User Roles & Dashboards
👑 Admin

Manage users (create, update, delete)

View all bookings and payments

Monitor system statistics

🧳 Traveler

Search and book flights, hotels, and cars

View and cancel bookings

Track booking/payment status

🗄️ Database Schema
Table	Purpose
users	Stores Admins and Travelers
flights	Flight listings
hotels	Hotel listings
car_rentals	Rental car listings
bookings	Stores user bookings
payments	Stores payment details

Sample data is included in resources/db.sql.

🚀 How to Run (VS Code + Tomcat)

Ensure MySQL Server is running. Import db.sql:

mysql -u root -p < resources/db.sql


Update DB credentials in util/Constants.java or util/DBConnection.java:

public static final String DB_URL = "jdbc:mysql://localhost:3306/onlinetravelbooking?useSSL=false&serverTimezone=UTC";
public static final String DB_USER = "root";
public static final String DB_PASSWORD = "root";  // change as needed


Compile Java classes via VS Code Tasks → Compile Java, output to:

webapp/WEB-INF/classes


Deploy webapp/ folder to Tomcat using the VS Code Tomcat extension.

Start Tomcat and open in browser:

http://localhost:8080/webapp/login.jsp

🧠 Future Enhancements

Integrate online payment gateways (Stripe/Razorpay)

Add REST APIs for travel searches and bookings

Implement email/SMS notifications

Modern frontend migration (JavaFX or Web)

👩‍💻 Author

Anjali Dwivedi
B.Tech CSE — Project for GUVI Geek Network Pvt. Ltd.
© 2025 GUVI Geek Network Pvt. Ltd. All rights reserved.