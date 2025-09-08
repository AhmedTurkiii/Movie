# Contributing to MovieApp

Thank you for your interest in contributing to MovieApp! 🎬

## 🤝 How to Contribute

### Reporting Bugs
- Use the [Bug Report template](.github/ISSUE_TEMPLATE/bug_report.md)
- Provide detailed steps to reproduce the issue
- Include device information and app version
- Add screenshots if applicable

### Suggesting Features
- Use the [Feature Request template](.github/ISSUE_TEMPLATE/feature_request.md)
- Describe the feature clearly and its benefits
- Consider the impact on existing functionality

### Code Contributions

#### Getting Started
1. **Fork the repository**
2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/Movie.git
   cd Movie/MovieApp
   ```
3. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

#### Development Guidelines

##### Code Style
- Follow [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Add comments for complex logic
- Keep functions small and focused

##### Architecture
- Follow MVVM pattern
- Use Repository pattern for data access
- Implement proper dependency injection with Hilt
- Use LiveData/StateFlow for reactive UI updates

##### Testing
- Write unit tests for ViewModels
- Add integration tests for repositories
- Include UI tests for critical user flows
- Aim for at least 80% test coverage

#### Commit Guidelines
Use conventional commit messages:
```
feat: add movie search functionality
fix: resolve crash on empty movie list
docs: update README with installation steps
test: add unit tests for MovieRepository
refactor: extract common UI components
```

#### Pull Request Process
1. **Update your branch**
   ```bash
   git fetch origin
   git rebase origin/main
   ```
2. **Run tests**
   ```bash
   ./gradlew test
   ./gradlew connectedAndroidTest
   ```
3. **Create Pull Request**
   - Use the [PR template](.github/PULL_REQUEST_TEMPLATE/pull_request_template.md)
   - Link related issues
   - Add screenshots for UI changes
   - Ensure all checks pass

## 🏗️ Project Structure

```
MovieApp/
├── app/src/main/java/com/ahmed/movieapp/
│   ├── application/          # Application class
│   ├── di/                   # Dependency injection
│   ├── model/                # Data models
│   │   ├── network/          # API & responses
│   │   └── repository/       # Repository layer
│   ├── utils/                # Utility classes
│   ├── view/                 # UI components
│   │   ├── adapter/          # RecyclerView adapters
│   │   └── screen/           # Fragments
│   └── viewmodel/            # ViewModels
└── app/src/test/             # Unit tests
```

## 🧪 Testing

### Running Tests
```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest

# Test coverage
./gradlew jacocoTestReport
```

### Writing Tests
- Use MockK for mocking
- Test ViewModel logic thoroughly
- Mock network dependencies
- Test error scenarios

## 📱 Development Setup

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 17+
- Android SDK 24+

### Environment Setup
1. Open project in Android Studio
2. Sync Gradle files
3. Run the app on device/emulator

## 🐛 Debugging

### Common Issues
- **Build failures**: Check Gradle sync
- **API errors**: Verify API key configuration
- **UI issues**: Check layout constraints

### Logging
- Use `Log.d()` for debug information
- Use Chucker for network debugging
- Enable verbose logging in debug builds

## 📋 Code Review Process

### For Contributors
- Address all review comments
- Keep PRs focused and small
- Respond to feedback promptly
- Update documentation if needed

### For Reviewers
- Be constructive and helpful
- Check code quality and architecture
- Verify tests are adequate
- Test the changes locally

## 🎯 Areas for Contribution

### High Priority
- [ ] Add movie search functionality
- [ ] Implement offline caching
- [ ] Add movie details screen
- [ ] Improve error handling

### Medium Priority
- [ ] Add unit tests
- [ ] Implement dark theme
- [ ] Add accessibility features
- [ ] Performance optimizations

### Low Priority
- [ ] Add animations
- [ ] Implement favorites
- [ ] Add movie recommendations
- [ ] UI/UX improvements

## 📞 Getting Help

- **Discussions**: Use GitHub Discussions for questions
- **Issues**: Create an issue for bugs or features
- **Documentation**: Check the README and code comments

## 📄 License

By contributing, you agree that your contributions will be licensed under the MIT License.

---

Thank you for contributing to MovieApp! 🎉
