#include <iostream>
#include <vector>

using namespace std;

int main()
{
   int i = 10;
   char ch = 'R';
   string s = "Rajat Jain";

   //First Method using string
   string arr[2] = { "Rajat Jain", "Parveen" };

   //Second Method usong 2D char
   char arr1[2][10] = { "Vijay gju", "Pankaj" };

   //Third method using vector
   vector <string> colour;
   colour.push_back("Blue");
   colour.push_back("Red");
   colour.push_back("Green");

   cout << "Number: " << i << "\t" << "Character: " << ch << "\t" <<
   "String: " << s;

   cout << "\n";
   for(int i = 0;i < 2; i++) {
       cout << "\n" << arr[i];
   }

   cout << "\n";
   for(int i = 0;i < 2; i++) {
       cout << "\n" << arr1[i];
   }

   cout << "\n" << "\n";
   for (int i=0; i<colour.size(); i++) {
        cout << colour[i] << "\n";
    }
   return 0;
}