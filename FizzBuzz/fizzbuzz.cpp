#include<iostream>
#include<vector>
#include<string>

using namespace std;


int main(){
    int n;
    cin>>n;
    vector<string> strs;
    for(int i = 1; i <= n ; i++){

        if(i%3 == 0 && i%5 == 0){

            strs.push_back("FizzBuzz");


        }
        else if(i%3 == 0 ){
            strs.push_back("Fizz");
        }
        else if(i%5 == 0){
            strs.push_back("Buzz");
        }
        else{
            strs.push_back(to_string(i));
        }

    }
    
        for(string s:strs){
            cout<<s<<endl;
        }

    return 0;

}