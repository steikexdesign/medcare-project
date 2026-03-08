# MedCare - Hospital Appointment System

A simple web-based hospital appointment booking system that demonstrates frontend development with JavaScript and browser Local Storage.

## Features

- Quick appointment booking form
- Data persistence using browser Local Storage
- No database or backend required
- Works offline
- Responsive web interface

## How to Run

### Prerequisites

- Web Browser (Chrome recommended)
- VS Code (optional)
- Live Server extension for VS Code (optional)

### Installation

1. Clone or download the project.
2. Open the project in VS Code.

### Running the Application

#### Option 1: Using Live Server Extension

1. Install the "Live Server" extension by Ritwick Dey in VS Code.
2. Open `backend/medcare/src/main/resources/static/index.html` in VS Code.
3. Right-click inside the file and select "Open with Live Server".
4. The website will open automatically in your browser at `http://127.0.0.1:5500/index.html`.

#### Option 2: Using Python HTTP Server

1. Navigate to the `backend/medcare/src/main/resources/static/` directory.
2. Run `python -m http.server 5500` (or `python3 -m http.server 5500`).
3. Open `http://127.0.0.1:5500/index.html` in your browser.

#### Option 3: Double-click

Simply double-click `index.html` to open it in your default browser.

## Usage

1. Fill in the appointment form:
   - **Doctor**: Select the department (e.g., Cardiology)
   - **Date**: Choose a future date
   - **Name**: Enter your name
   - **Phone**: Enter your phone number

2. Click "Book Appointment".

3. You will see the message: "Appointment saved successfully!"

## Data Storage

- Appointments are stored in the browser's Local Storage.
- Data persists across page refreshes but is browser-specific.
- To view stored data:
  1. Press F12 to open Developer Tools.
  2. Go to Application > Local Storage > http://127.0.0.1:5500
  3. Click on the "appointments" key.

- To clear data: Run `localStorage.removeItem("appointments")` in the Console.

## Project Architecture

```
User fills form
    ↓
JavaScript collects data
    ↓
Data stored in Local Storage
    ↓
Data persists in browser
```

## Technologies Used

- HTML5
- JavaScript (ES6)
- Browser Local Storage API

## Backend (Optional)

The project includes a Spring Boot backend for potential future expansion:

- Java 11+
- Spring Boot
- Maven

To run the backend:

```bash
cd backend/medcare
./mvnw spring-boot:run
```

The backend will serve the static files and provide REST API endpoints for appointments.

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Contact

For questions or suggestions, please open an issue on GitHub.