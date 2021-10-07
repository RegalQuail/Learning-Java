
class BankAccount {
    private double balance = 0; // "private" hides the balance variable
    public void deposit(double x) { // enabling access to it through the "deposit" method
        if (x > 0) {
            balance += x;
        }
    }
}

class Person {
    private int age;
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

/* 
    Encapsulation provides:
        - Control of the way data is accessed or modified
        - More flexible and easily changed code
        - Ability to change one part of the code without affecting other parts
*/