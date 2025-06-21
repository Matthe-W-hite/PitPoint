# PitPoint


## 🚗 Funkcjonalności

- 🔐 **System logowania/rejestracji** użytkowników
- ⚠️ **Zgłaszanie zdarzeń** drogowych z lokalizacji
- 📋 **Lista wszystkich zdarzeń** zgłoszonych przez użytkowników
- 📱 **Nowoczesny interfejs** w Jetpack Compose

## 🛠️ Technologie

- **Firebase Authentication** - system logowania
- **Firebase Firestore** - baza danych w chmurze
- **Google Play Services** - usługi lokalizacji

### Instrukcja użytkowania:

4. **Opisz zdarzenie** w formularzu i zatwierdź
5. **Sprawdź listę zdarzeń** klikając ikonę listy w lewym dolnym rogu mapy


```
app/src/main/java/com/example/pitpoint/
├── data/
│   ├── models/           # Modele danych
│   └── repository/       # Repozytoria Firebase
├── ui/
│   ├── screens/          # Ekrany aplikacji
│   ├── navigation/       # Nawigacja między ekranami
│   └── theme/           # Motywy i style
└── MainActivity.kt      # Główna aktywność
```
