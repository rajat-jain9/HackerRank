
#include <iostream>

using namespace std;
class A {
    public:
    int i = 0;
    int print(int n) {
        cout << ++i << "\n" << "value: " << n;
        if(n > 100) {
            return n-5;
        }
        return print(print(n+11));
    }
};

int main()
{
    A obj;
    int res;
    res = obj.print(45);
    cout << "res= " << res;
    return 0;
}