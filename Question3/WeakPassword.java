// Add password strength validation
public boolean isValidPassword(String password) {
    // Password must be at least 8 characters, contain at least one digit, one uppercase letter, one lowercase letter, and one special character
    String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&+=!]).{8,}$";
    return password.matches(passwordPattern);
}

// usage
if (!isValidPassword(userInputPassword)) {
    showError("Password is too weak!");
}
