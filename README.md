
# 🎢 Amusement Park Attraction Management System 🎡

Welcome to the **Amusement Park Attraction Management System**! This system allows you to manage different attractions in a theme park, where users can interact with various rides, check if they meet the requirements, and track their spending.

## 🚀 Features

- **Attractions**: Manage different types of rides like Roller Coaster, Ferris Wheel (Sínia), Haunted House, and Carousel.
- **Users**: Users can enjoy the attractions, check their balance, and interact with the system.
- **Maintenance**: Attractions have maintenance checks after a certain number of users.
- **User Interactions**: Users can create accounts, see their balances, withdraw money, and enjoy attractions.
- **ID Management**: Users are automatically assigned unique IDs.
  
## 🏰 Attractions

The amusement park has several types of attractions, each with specific rules and features.

### 1. **Roller Coaster 🎢**
- **Entry Cost**: 8 euros
- **Minimum Height**: 1.40 meters
- **Capacity**: 6 users per ride
- **Maintenance**: Every 500 users
- **Additional Feature**: `paint()` - Allows painting of the attraction every time a maintenance check is performed. Each meter costs 10 euros to paint, and only the money collected from the ride can be used.

### 2. **Ferris Wheel 🎡**
- **Entry Cost**: 4 euros
- **Minimum Height**: 1.20 meters
- **Capacity**: 2 users per ride
- **Maintenance**: Every 1200 users
- **Additional Feature**: `photography()` - Takes a photo for every 4 users, earning 5 euros per photo.

### 3. **Haunted House 👻**
- **Entry Cost**: 5 euros
- **Minimum Height**: 1.10 meters
- **Capacity**: 4 users per ride
- **Maintenance**: Every 2000 users
- **Additional Feature**: `rest()` - Every 10 performances, workers take a break. The attraction needs to buy water for the workers (8 workers). Each water costs 0.50 euros.

### 4. **Carousel 🎠**
- **Entry Cost**: 2 euros
- **Minimum Height**: 0.90 meters
- **Capacity**: 20 horses per ride
- **Maintenance**: Every 700 users
- **Additional Feature**: `clean()` - Cleans the carousel after every 50 users.

---

## 👤 Users

### User Class
- **Attributes**: Name, Height, and Money.
- **Methods**: Getters and setters for all attributes, and methods to interact with attractions.

### User Interaction
1. **Creating Users**: Users can be created with a name, height, and money.
2. **Using Attractions**: Users can check if they meet the height requirement and have enough money to enjoy the attractions.
3. **Maintenance**: After a certain number of users, maintenance is triggered for each attraction.

---

## ⚙️ Flow of the Program

1. **Initial Setup**: 
   - Roller Coaster starts with 520 euros.
   - Ferris Wheel starts with 620 euros.
   - Haunted House starts with 850 euros.
   - Carousel starts with 699 euros.

2. **Creating User Jordi**:
   - **Jordi** has a height of 1.42 meters and 40 euros.
   - Jordi will visit each attraction and check if he meets the requirements.
   - After each attraction, Jordi's remaining balance will be shown.

3. **Creating a New User**:
   - A new user is created by entering their name, height, and money.
   - The user will visit each attraction and check their balance after each ride.

4. **Maintenance**:
   - After the required number of users, maintenance will be triggered for each attraction.
   - The system will display information about the maintenance status.

---

## 📜 Menu Options

The program offers a menu with the following options:

1. **Create User**: Create a new user.
2. **View Users**: See a list of all users.
3. **Delete User**: Remove a user from the system.
4. **Add Balance**: Add money to a user's account.
5. **Withdraw Balance**: Withdraw money from a user's account.
6. **Use Attraction**: Select and use an attraction.
7. **Attraction Maintenance**: Check the maintenance status of each attraction.

---

## 🛠️ Methods

### Attraction Methods
- **utilizarAtraccion()**: Checks if the user has enough money and meets the height requirement for the attraction. If so, the money is deducted from the user's balance.
- **mantenimiento()**: Displays the maintenance status of the attraction (number of users and money earned).
- **Additional Features**: 
  - `paint()`, `photography()`, `rest()`, `clean()` — Specific features for each attraction.

### User Methods
- **createUser()**: Creates a new user.
- **seeUsers()**: Displays all users.
- **deleteUser()**: Deletes a user by ID.
- **increaseBudget()**: Increases a user's balance.
- **takeOutBudget()**: Withdraws money from a user's balance (ensuring they have enough).
- **choseAttraction()**: Allows a user to select and enjoy an attraction.

---

## 📲 Running the Program

To run the program, simply compile and execute the Java files. The user will be prompted to interact with the system through a menu, and the program will handle the logic for attractions, users, and maintenance.

---

## 📚 Example Usage

1. **Creating a User**: 
   - Name: Jordi, Height: 1.42m, Money: 40€
   - Jordi visits all attractions and checks his balance after each ride.
   
2. **Maintenance**: 
   - After every 500 users on the roller coaster, 1200 on the Ferris Wheel, 2000 on the Haunted House, and 700 on the Carousel, maintenance is triggered.

---
## 🔧 Requirements
- Java 8 or higher
- A terminal or IDE to run Java programs
---

## 🎉 Enjoy the Ride!

