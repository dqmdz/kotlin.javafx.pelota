# Bouncing Ball Animation

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org)
[![JavaFX](https://img.shields.io/badge/JavaFX-17-green.svg)](https://openjfx.io/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A simple bouncing ball animation implemented in Kotlin using JavaFX, following SOLID principles and clean architecture.

## 🚀 Features

- Animated ball that bounces off screen boundaries
- Implementation of SOLID principles
- Clean and extensible architecture
- Smooth animation using JavaFX AnimationTimer

## 📋 Prerequisites

- Java JDK 17 or higher
- Gradle 8.13 or higher
- JavaFX 17

## 🔧 Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/kotlin.javafx.pelota.git
```

2. Navigate to the project directory:
```bash
cd kotlin.javafx.pelota
```

3. Build the project:
```bash
./gradlew build
```

## 🎮 Usage

Run the application using Gradle:
```bash
./gradlew run
```

## 🏗️ Architecture

The project follows SOLID principles and is structured as follows:

- `App.kt` - Main application entry point
- `GameScene.kt` - Manages the JavaFX scene
- `GameObject.kt` - Base interface for game objects
- `Movement.kt` - Defines movement behavior
- `BouncingBall.kt` - Implementation of the bouncing ball
- `CollisionHandler.kt` - Handles collision detection
- `GameLoop.kt` - Manages the game loop and updates

### Design Patterns Used

- Strategy Pattern (Movement interface)
- Observer Pattern (AnimationTimer)
- Dependency Injection

## 🧪 Testing

Run the tests using:
```bash
./gradlew test
```

## 🤝 Contributing

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ✨ Authors

* **[Your Name]** - *Initial work*

## 🎯 Future Improvements

- Add multiple balls with different behaviors
- Implement ball-to-ball collisions
- Add user controls for ball properties
- Include different movement patterns
- Add visual effects and particle systems

## 📚 Documentation

For more detailed documentation about the implementation and architecture decisions, please refer to the [Wiki](wiki-link).

## 🙏 Acknowledgments

- JavaFX community
- Kotlin community
- [Any other acknowledgments]

---
Made with ❤️ using Kotlin and JavaFX