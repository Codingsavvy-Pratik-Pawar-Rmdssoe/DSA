//create ur own namespace

#include <iostream>
using namespace std;

// Creating your own namespace
namespace show{
    int x = 10;

    void display() {
        cout << "Inside Twin namespace" << endl;
    }
}

int main() {
    cout << "Value of x: " << show::x << endl;
    show::display();

    return 0;
}

