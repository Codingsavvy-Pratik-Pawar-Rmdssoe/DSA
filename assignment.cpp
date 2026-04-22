#include <iostream>
using namespace std;

int main() {
    int a, b;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    cout << "Add: " << a + b << endl;

    cout << "Sub: " << a - b << endl;

    cout << "Multiplication: " << a * b << endl;

    if(b != 0) {
        cout << "Div: " << a / b << endl;
        cout << "Mod: " << a % b << endl;
    } else {
        cout << "Division and Modulus not possible (division by 0)" << endl;
    }

    cout << "Inc = " << a << " = " << ++a << endl;
    cout << "Dec = " << --a << endl;

    return 0;
}