# PitPoint

Aplikacja Android umożliwiająca zgłaszanie problemów drogowych.

## 🚗 Funkcjonalności

- 🗺️ **Mapa interaktywna** 
- 🔐 **System logowania/rejestracji** użytkowników
- ⚠️ **Zgłaszanie zdarzeń** drogowych z lokalizacji
- 📋 **Lista wszystkich zdarzeń** zgłoszonych przez użytkowników
- 📱 **Nowoczesny interfejs** w Jetpack Compose

## 🛠️ Technologie

- **Kotlin** - język programowania
- **Jetpack Compose** - UI framework
- **Firebase Authentication** - system logowania
- **Firebase Firestore** - baza danych w chmurze
- **Google Maps API** - wyświetlanie map
- **Google Play Services** - usługi lokalizacji

### Instrukcja użytkowania:

1. **Zaloguj się / Zarejestruj się** używając adresu email i hasła
2. **Przejdź do mapy** - zobaczysz mapę w celu wybrania lokalizacji
3. **Kliknij przycisk "+"** w lewym dolnym rogu, aby zgłosić zdarzenie
4. **Opisz zdarzenie** w formularzu i zatwierdź
5. **Sprawdź listę zdarzeń** klikając ikonę listy w lewym dolnym rogu mapy

## Struktura projektu

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
