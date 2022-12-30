 /* 
In the given string, replace character 1 (c1) with character
2 (c2) and vice versa.
*/ 
#include <iostream>
#include <string>
using namespace std;

string replace(string str, char c1, char c2) {
	for (int i =0; i < str.length(); i++) {
		if (str[i] == c1) {
			str[i] = c2;
		}
		else if (str[i] == c2) {
			str[i] = c1;
		}
	}
	return str;	
}

int main() {
	std::cout  << "swap 'e' and 's' in:  Ths rsplacsmsnt sxprseeion"  << endl;
	std::cout  <<  "After swap:  " + replace("Ths rsplacsmsnt sxprseeion" , 'e', 's') << endl;
	std::cout  << "swap 'a' and  'i' in:  irmidallo antamadItaon"  << endl;
	std::cout  << "After swap: " + replace("irmidallo antamaditaon", 'i', 'a') << endl;
	return 0;
}


	

	

