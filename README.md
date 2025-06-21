# PitPoint

Aplikacja Android do mapowania warsztatów i stacji paliw z możliwością zgłaszania problemów drogowych.

## 🚗 Funkcjonalności

- 🗺️ **Mapa interaktywna** z punktami serwisowymi (warsztaty, stacje paliw)
- 🔐 **System logowania/rejestracji** użytkowników
- ⚠️ **Zgłaszanie zdarzeń** drogowych z lokalizacji
- 📋 **Lista wszystkich zdarzeń** zgłoszonych przez użytkowników
- 📱 **Nowoczesny interfejs** w Jetpack Compose

## 🛠️ Technologie

- **Kotlin** - główny język programowania
- **Jetpack Compose** - nowoczesny UI framework
- **Firebase Authentication** - system logowania
- **Firebase Firestore** - baza danych w chmurze
- **Google Maps API** - wyświetlanie map i znaczników
- **Google Play Services** - usługi lokalizacji

## 📱 Jak korzystać z aplikacji

### Instrukcja użytkowania:

1. **Zaloguj się** używając swojego adresu email i hasła
2. **Przejdź do mapy** - zobaczysz warsztaty i stacje paliw w okolicy
3. **Kliknij przycisk "+"** w lewym dolnym rogu, aby zgłosić problem
4. **Opisz zdarzenie** w formularzu i zatwierdź
5. **Sprawdź listę zdarzeń** klikając ikonę listy w lewym dolnym rogu mapy

### Przepływ użytkowania:
Zaloguj się → Wybierz miejsce na mapie → Kliknij "+" aby dodać zdarzenie → Sprawdź listę zdarzeń w zakładce "Lista zdarzeń"

## 🏗️ Struktura projektu

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

## 🔧 Wymagania systemowe

- Android API 24+ (Android 7.0)
- Google Play Services
- Połączenie internetowe
- Konto Google (dla map)

## 📋 Ekrany aplikacji

- **Login** - Logowanie i rejestracja użytkowników
- **Map** - Mapa z punktami serwisowymi i przyciskami akcji
- **Report Issue** - Formularz zgłaszania zdarzeń
- **Issues List** - Lista wszystkich zgłoszonych zdarzeń

## 🚀 Instalacja

1. Sklonuj repozytorium
2. Otwórz projekt w Android Studio
3. Dodaj plik `google-services.json` z Firebase Console
4. Skonfiguruj klucz Google Maps API
5. Uruchom aplikację na urządzeniu lub emulatorze

## 📄 Licencja

Projekt studencki - do użytku edukacyjnego.

## 👨‍💻 Autor

[TWOJE_IMIĘ_NAZWISKO] - Projekt studencki 