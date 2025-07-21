# BookFinderApp

**BookFinderApp** is a modern Kotlin Android application that allows users to search, browse, and save books with ease. Designed using Jetpack Compose, it features an intuitive and clean UI focused on delivering a smooth reading discovery experience.

---

## ✨ Features

- 🔍 **Search for books** by title using an online provider.
- 📚 **View detailed information** including title, author(s), publisher, categories, and a full description.
- 💾 **Save books locally**, so users can access them even after restarting the app.
- 🗑️ **Remove saved books** from the local database with a single click.
- 🏠 **Home screen** displays all books previously saved by the user.

---

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/bffb229b-f9f4-4f5f-8589-6eed4312251f" width="30%" />
  <img src="https://github.com/user-attachments/assets/b2dcecd6-b850-484a-9036-0a55302e8143" width="30%" />
  <img src="https://github.com/user-attachments/assets/cad6f904-3681-4e4b-9383-a12d41042542" width="30%" />
</p>


---

## 🛠️ Built With

- **Kotlin** – Primary programming language  
- **Jetpack Compose** – Declarative UI framework  
- **Material 3** – Design system  
- **Room & Content Provider** – Local storage and data management  
- **Coil** – Image loading  
- **Navigation Compose** – For screen transitions

---

## 🚀 Getting Started

To run this project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/bookish.git
2. Open the project in Android Studio

3. Click "Sync Gradle" to resolve dependencies

4. Run the app on an emulator or real Android device

---

##  📁 Project Structure

📂 ui/screens

     └─ Composables for Home, Details, and Search screens

📂 repositories

     └─ BookRepository.kt – Handles data fetching and persistence

📂 model

     └─ Data classes for Book and related entities

📂 components

     └─ UI components like book cards

📂 provider

     └─ Content provider logic for storing/removing books


