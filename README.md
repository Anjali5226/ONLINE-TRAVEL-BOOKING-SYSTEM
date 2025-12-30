🌍ONLINE TRAVEL BOOKING SYSTEM

The Online Travel Booking Platform allows users to seamlessly book flights, hotels, and rental cars.
It supports three user roles: Admin, Travel Agent, and Traveler, each with their own dashboard and functionalities.

#🧭 Project Structure:
OnlineTravelBooking/
│
├── lib/ → JDBC driver (e.g., mysql-connector-j-8.4.0.jar)
│
├── resources/ → Static files, icons, and database script
│   └── db.sql
│
├── src/
│   ├── main/ → Entry point (Main.java)
│   ├── model/ → Entity classes (User, Booking, Flight, Hotel, etc.)
│   ├── dao/ → Data Access Layer (DBConnection, UserDAO, etc.)
│   ├── service/ → Business logic (BookingService, PaymentService, etc.)
│   └── util/ → Utility classes (Validator, Constants, DBUtil)
│├── WEBAPPS: -> (Login.jsp, booking.jsp, search.jsp, success.jsp, dashboard.jsp)
|
└── README.md

#🧑‍💻 Technologies Used:

| Component   | Technology                                      |
| ----------- | ----------------------------------------------- |
| Language    | Java 17+                                        |
| Database    | MySQL Community 8.0.43                          |                                              
| Web Server  | Apache Tomcat                                   |
| IDE/Tools   | VS Code                                         |
| Build Tool  | Manual (javac/java) or IDE (VS Code )           |      
| JDBC Driver | MySQL Connector/J 9.45.jar                      |
| MySQL Tool  | MySQL extension in VS Code (`MySQL`)            |

#⚙️ Setup Instructions:
1. Clone the Repository
git clone https://github.com/yourusername/OnlineTravelBooking.git
cd OnlineTravelBooking

2. Configure Database:
->Install MySQL Community 8.0.42 and start the server.

->You can manage the database either via MySQL Workbench, Command Prompt, or VS Code MySQL extension.

Run the SQL script:
-- Using MySQL CLI
mysql -u root -p < resources/onlinetravelbooking.sql

-- OR in VS Code MySQL extension
-- Open VS Code → MySQL extension → Connect → Run the onlinetravelbooking.sql script

3. Configure Database Credentials:

Open src/util/Constants.java and update:

public static final String DB_URL = "jdbc:mysql://localhost:3306/travel_booking";
public static final String DB_USER = "root";
public static final String DB_PASSWORD = "yourpassword";

4. Add MySQL Connector:

Place mysql-connector-j-9.45.jar in the lib/ folder.

For VS Code, add this to .vscode/settings.json:

{
    "java.project.referencedLibraries": ["lib/**/*.jar"]
}

Compile & Run

From your project root:

javac -cp "lib/mysql-connector-j-9.4.5.jar;src" src/main/Main.java
java -cp "lib/mysql-connector-j-9.4.5.jar;src" main.Main


Note: Tomcat is used if you plan to deploy web components in the future.


#👥 User Roles & Dashboards:
👑 Admin

Manage users (create/update/delete)

Approve/reject travel listings

Configure system settings

View booking statistics

🧳 Travel Agent

Add and manage travel listings (flights, hotels, cars)

Communicate with users

Track and manage bookings

✈️ Traveler

Book flights, hotels, and rental cars

Manage travel itineraries

View and cancel bookings

#🗄️Database Schema (Summary):
| Table       | Purpose                              |
| ----------- | ------------------------------------ |
| users       | Stores Admins, Agents, and Travelers |
| flights     | Flight listings                      |
| hotels      | Hotel listings                       |
| car_rentals | Rental car listings                  |
| bookings    | Stores user bookings                 |



#🧠 Future Enhancements

Integrate online payment gateway (Stripe/Razorpay)

Implement RESTful APIs

Add email/SMS notifications

Migrate from Swing to JavaFX or Web frontend

#👩‍💻 Author

Anjali Dwivedi
B.Tech CSE — Project for GUVI Geek Network Pvt. Ltd.
© 2024 GUVI Geek Network Pvt. Ltd. All rights reserved.


