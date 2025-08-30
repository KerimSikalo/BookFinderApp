# 📚 BookFinder App
### *Discover Your Next Great Read*

[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?logo=jetpack-compose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Material 3](https://img.shields.io/badge/Material%203-1976D2?logo=material-design&logoColor=white)](https://m3.material.io/)
[![Android](https://img.shields.io/badge/Android-3DDC84?logo=android&logoColor=white)](https://developer.android.com/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

---

## 🎯 About The App

**BookFinderApp** is a modern Android application built with Kotlin and Jetpack Compose that transforms the way you discover and organize books. With an intuitive interface and powerful search capabilities, finding your next favorite book has never been easier.

> *"Every book is a new adventure waiting to be discovered."*

### ✨ Why BookFinderApp?
- **Lightning Fast Search**: Find books instantly by title
- **Offline Access**: Save your discoveries for later, even without internet
- **Beautiful Design**: Modern Material 3 UI that's easy on the eyes
- **Simple & Clean**: Focus on what matters - discovering great books

---

## 🚀 Features

### 🔍 **Smart Search**
- Search thousands of books by title using online providers
- Real-time search suggestions and results
- Fast and responsive search experience

### 📖 **Detailed Book Information**
| Information | Description |
|-------------|-------------|
| 📝 **Title & Author** | Complete book details and author information |
| 🏢 **Publisher** | Publishing house and publication details |
| 🏷️ **Categories** | Genre and topic classifications |
| 📄 **Description** | Full book synopsis and overview |
| 🖼️ **Cover Art** | High-quality book cover images |

### 💾 **Local Storage & Management**
- **Save Books**: Keep your discoveries in a personal library
- **Offline Access**: View saved books anytime, anywhere
- **Easy Management**: Remove books with a single tap
- **Persistent Storage**: Your library survives app restarts

### 🏠 **Personalized Home Screen**
- View all your saved books in one place
- Quick access to book details
- Clean, organized book collection display

---

## 🛠️ Tech Stack

<div align="center">

| **Category** | **Technology** | **Purpose** |
|--------------|----------------|-------------|
| **Language** | ![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?logo=kotlin&logoColor=white) | Primary development language |
| **UI Framework** | ![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?logo=jetpack-compose&logoColor=white) | Modern declarative UI |
| **Design System** | ![Material 3](https://img.shields.io/badge/Material%203-1976D2?logo=material-design&logoColor=white) | Google's latest design language |
| **Database** | ![Room](https://img.shields.io/badge/Room-4285F4?logo=android&logoColor=white) | Local data persistence |
| **Navigation** | ![Navigation Compose](https://img.shields.io/badge/Navigation%20Compose-4285F4?logo=android&logoColor=white) | Screen transitions |
| **Image Loading** | ![Coil](https://img.shields.io/badge/Coil-FF6B6B?logoColor=white) | Efficient image loading |

</div>

### 🏗️ Architecture Components
- **Room Database**: Local storage and data management
- **Content Provider**: Data sharing and persistence layer
- **Repository Pattern**: Clean separation of data sources
- **MVVM**: Modern Android architecture pattern

---

## 🚀 Getting Started

### 📋 Prerequisites
- Android Studio Arctic Fox or newer
- Android SDK 21+ (Android 5.0+)
- Kotlin 1.8+

### 🔧 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/KerimSikalo/BookFinderApp.git
   cd BookFinderApp
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository

3. **Sync dependencies**
   - Click "Sync Project with Gradle Files"
   - Wait for the sync to complete

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press Ctrl+R

---

## 📱 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/bffb229b-f9f4-4f5f-8589-6eed4312251f" width="30%" />
  <img src="https://github.com/user-attachments/assets/b2dcecd6-b850-484a-9036-0a55302e8143" width="30%" />
  <img src="https://github.com/user-attachments/assets/cad6f904-3681-4e4b-9383-a12d41042542" width="30%" />
</p>

---

## 🏗️ Project Structure

```
📦 BookFinderApp
├── 📂 ui/screens/           # Jetpack Compose screens
│   ├── HomeScreen.kt        # Main library view
│   ├── SearchScreen.kt      # Book search interface
│   └── DetailsScreen.kt     # Book details view
├── 📂 repositories/         # Data layer
│   └── BookRepository.kt    # Data fetching & persistence
├── 📂 model/               # Data models
│   └── Book.kt             # Book entity definitions
├── 📂 components/          # Reusable UI components
│   └── BookCard.kt         # Book display components
└── 📂 provider/            # Data providers
    └── BookProvider.kt     # Content provider logic
```

---

## 🎯 Usage

### 🔍 Searching for Books
1. Open the app and navigate to the Search screen
2. Enter a book title in the search bar
3. Browse through the results
4. Tap on any book to view detailed information

### 💾 Saving Books
1. From the book details screen, tap the "Save" button
2. The book will be added to your personal library
3. Access saved books from the Home screen anytime

### 🗑️ Managing Your Library
- View all saved books on the Home screen
- Tap any book to view details again
- Remove books with a single tap on the delete button

---

## 🤝 Contributing

Contributions make the open-source community an amazing place to learn, inspire, and create! Any contributions you make are **greatly appreciated**.

### 🔧 How to Contribute
1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### 🐛 Bug Reports
Found a bug? Please open an issue with:
- Device and Android version
- Steps to reproduce
- Expected vs actual behavior
- Screenshots (if applicable)


---

## 🙏 Acknowledgments

- **Google** for Jetpack Compose and Material Design
- **Book APIs** for providing comprehensive book data
- **Android Community** for excellent documentation and tutorials
- **Open Source Contributors** who inspire continuous learning

---

## 📬 Contact

**Kerim Sikalo**
- 📧 Email: [kerim.sikalo1@gmail.com](mailto:kerim.sikalo1@gmail.com)
- 🐙 GitHub: [@KerimSikalo](https://github.com/KerimSikalo)
- 💼 LinkedIn: [Connect with me](https://www.linkedin.com/in/kerim-sikalo)

---

<div align="center">

**Built with ❤️ and ☕ by [Kerim Sikalo](https://github.com/KerimSikalo)**

*Empowering readers to discover their next great adventure*

[![⭐ Star this repo](https://img.shields.io/github/stars/KerimSikalo/BookFinderApp?style=social)](https://github.com/KerimSikalo/BookFinderApp)
[![🍴 Fork this repo](https://img.shields.io/github/forks/KerimSikalo/BookFinderApp?style=social)](https://github.com/KerimSikalo/BookFinderApp/fork)

</div>



