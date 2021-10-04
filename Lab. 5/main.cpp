#include <iostream>
#include <bits/stdc++.h>
#include <fstream>
#include <string>

using namespace std;

bool isEqual(string expr){
    stack<char> s;
    char x;
    for (int i = 0; i < expr.length(); i++){
        if (expr[i] == '(' || expr[i] == '[' || expr[i] == '{'){
            s.push(expr[i]);
            continue;
        }
        if (s.empty() && (expr[i] == ')' || expr[i] == ']' || expr[i] == '}')){
            return false;
        }
        switch (expr[i]) {
        case ')':
            x = s.top();
            s.pop();
            if (x == '{' || x == '[')
                return false;
            break;

        case '}':
            x = s.top();
            s.pop();
            if (x == '(' || x == '[')
                return false;
            break;

        case ']':
            x = s.top();
            s.pop();
            if (x == '(' || x == '{')
                return false;
            break;
        }
    }
    return (s.empty());
}


int main()
{
    // one_expression.txt -> denumirea primului fisier!
    ifstream f("three_expressions.txt"); // ca input stream
    string str;
    if(f) {
        while(getline(f, str)){
            cout << str << "\n";
            if (isEqual(str)){
                cout << "Balansata\n\n";
            }
            else {
                cout << "Nebalansata!\n\n";
            }
        }
    }
}
