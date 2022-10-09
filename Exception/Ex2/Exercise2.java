package Exception.Ex2;

import Exception.Ex1.MyOwnException;

class Exercise2 {
    private static void exercise2() {
        wrapper();
    }

    private static void wrapper() {
        Exercise2 exercises = new Exercise2();
        try {
            exercises.ageValidator(21);
        } catch (MyOwnException e) {
            throw new RuntimeException(e);
        }
    }

    private void ageValidator(int age) throws MyOwnException {
// Walidacja sprawdzająca wiek
        if (age < 21) {
// Rzucamy wyjątek, gdy walidacja kończy się niepowodzeniem
            throw new MyOwnException("Age is below 21");
        }
    }
}