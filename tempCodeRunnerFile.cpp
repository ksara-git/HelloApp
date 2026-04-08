#include <iostream>
using namespace std;

// abstract base class
class Student {
public:
    virtual void study() = 0;   // pure virtual function
};

class Undergraduate : public Student {
public:
    void study() {
        cout << "Undergraduate studies basic concepts\n";
    }
};

class Postgraduate : public Student {
public:
    void study() {
        cout << "Postgraduate studies advanced topics\n";
    }
};

int main() {
    Student* s;   // base class pointer

    Undergraduate u;
    Postgraduate p;

    s = &u;
    s->study();   // calls Undergraduate study

    s = &p;
    s->study();   // calls Postgraduate study

    return 0;
}