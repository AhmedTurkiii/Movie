# 🎬 MovieApp

<div align="center">
  <img src="assets/logo/movieapp-logo.svg" alt="MovieApp Logo" width="200" height="200">
  <br>
  <em>Discover Your Next Favorite Movie</em>
</div>

A modern Android movie discovery app built with Kotlin, showcasing popular movies with a beautiful Material Design interface.

## ✨ Features

- 🎭 **Popular Movies**: Browse trending and popular movies
- 🖼️ **High-Quality Images**: Smooth image loading with Glide
- 🔍 **Search Functionality**: Find movies easily
- 📱 **Modern UI**: Material Design with smooth animations
- 🌙 **Dark Theme Support**: Beautiful dark mode interface
- 📊 **Movie Details**: View comprehensive movie information
- ⭐ **Favorites**: Bookmark your favorite movies
- 🔄 **Pull-to-Refresh**: Easy content updates

## 🏗️ Architecture

This project follows **MVVM (Model-View-ViewModel)** architecture with:

- **Repository Pattern**: Clean data layer abstraction
- **Dependency Injection**: Dagger Hilt for dependency management
- **Reactive Programming**: RxJava and Kotlin Coroutines
- **Navigation Component**: Modern Android navigation
- **LiveData**: Reactive UI updates

## 🛠️ Tech Stack

### Core Technologies
- **Language**: Kotlin
- **UI Framework**: Android Views with Material Design
- **Architecture**: MVVM + Repository Pattern
- **Dependency Injection**: Dagger Hilt
- **Navigation**: Navigation Component

### Networking & Data
- **HTTP Client**: Retrofit 2
- **JSON Parsing**: Gson
- **Image Loading**: Glide
- **Network Monitoring**: OkHttp with Chucker

### Reactive Programming
- **RxJava 2**: Reactive streams
- **Kotlin Coroutines**: Asynchronous programming
- **LiveData**: UI-reactive data

### Testing
- **Unit Testing**: JUnit, Mockito, MockK
- **UI Testing**: Espresso
- **Architecture Testing**: Core Testing

## 🎨 Logo & Branding

The MovieApp logo features a modern film strip design with a play button, representing the core functionality of movie discovery and playback.

### Logo Variations
- **Full Logo**: Complete logo with app name and tagline
- **Mini Logo**: Compact version for app icons
- **Text Logo**: Horizontal layout for headers
- **Favicon**: Browser tab icon

All logo assets are available in the [`assets/logo/`](assets/logo/) directory in SVG format for scalability.

## 📱 Screenshots

*Screenshots will be added here*

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 17 or later
- Android SDK 24+ (Android 7.0+)
- Internet connection for API calls

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/AhmedTurkiii/Movie.git
   cd Movie/MovieApp
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the `MovieApp` folder

3. **Sync Project**
   - Android Studio will automatically sync Gradle files
   - Wait for the sync to complete

4. **Run the App**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`

### API Configuration

The app uses The Movie Database (TMDB) API. The API key is currently hardcoded in the `MovieApi.kt` file. For production use, consider:

- Moving the API key to `local.properties`
- Using environment variables
- Implementing proper API key management

## 📁 Project Structure

```
MovieApp/
├── app/
│   ├── src/main/java/com/ahmed/movieapp/
│   │   ├── application/          # Application class
│   │   ├── di/                   # Dependency injection modules
│   │   ├── model/                # Data models
│   │   │   ├── network/          # API interfaces & responses
│   │   │   └── repository/       # Repository contracts & implementations
│   │   ├── utils/                # Utility classes
│   │   ├── view/                 # UI components
│   │   │   ├── adapter/          # RecyclerView adapters
│   │   │   └── screen/           # Fragments
│   │   └── viewmodel/            # ViewModels
│   └── src/main/res/             # Resources
│       ├── drawable/             # Images and drawables
│       ├── layout/               # XML layouts
│       ├── values/               # Strings, colors, dimensions
│       └── navigation/          # Navigation graphs
└── build.gradle.kts              # Project configuration
```

## 🔧 Configuration

### Build Variants

- **Debug**: Development build with logging enabled
- **Release**: Production build with optimizations

### Dependencies

Key dependencies include:
- `androidx.core:core-ktx:1.10.1`
- `com.google.dagger:hilt-android:2.44`
- `com.squareup.retrofit2:retrofit:2.9.0`
- `com.github.bumptech.glide:glide:4.14.2`

## 🧪 Testing

### Running Tests

```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest

# All tests
./gradlew check
```

### Test Coverage

The project includes comprehensive testing:
- Unit tests for ViewModels
- Repository tests with mocking
- UI tests with Espresso
- Architecture component tests

## 📈 Performance

- **Image Optimization**: Glide handles efficient image loading and caching
- **Memory Management**: Proper lifecycle management with ViewModels
- **Network Efficiency**: Retrofit with OkHttp for optimized HTTP requests
- **UI Performance**: RecyclerView with proper view recycling

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some amazing feature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **Open a Pull Request**

### Code Style

- Follow Kotlin coding conventions
- Use meaningful variable and function names
- Add comments for complex logic
- Write unit tests for new features

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Ahmed Torki**
- GitHub: [@AhmedTurkiii](https://github.com/AhmedTurkiii)

## 🙏 Acknowledgments

- [The Movie Database (TMDB)](https://www.themoviedb.org/) for providing the movie API
- [Material Design](https://material.io/) for design guidelines
- Android community for excellent libraries and tools

## 📞 Support

If you have any questions or need help, please:

1. Check the [Issues](https://github.com/AhmedTurkiii/Movie/issues) page
2. Create a new issue if your problem isn't already reported
3. Provide detailed information about your issue

---

⭐ **Star this repository if you found it helpful!**