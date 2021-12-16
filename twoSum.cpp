#include <iostream>
#include <map>
#include <vector>
#include "bits/stdc++.h"
#include<unordered_map>

using namespace std;
	vector<int> twoSum(vector<int>& nums, int target) {
        
       vector<int> v; 
       map<int,int> myMap;
        
        auto itr=nums.begin();
        auto itrMap=myMap.begin();
        int count=0;
        while(itr!=nums.end()){
            
            if(myMap.count(*itr)>0)
           
            {
                myMap[*itr+target+count]=count;
                target=target+target+count;
            }
            
            else
            {
                myMap[*itr]=count;
            }
                
            itr++;
            count++;
            
        }
              
        itrMap=myMap.begin();
        count=0;
        while(itrMap!=myMap.end())
        {
            
    
            if(myMap.count(target-itrMap->first))
            {
                v.push_back(itrMap->second);
                v.push_back(myMap[target-itrMap->first]);
                    
                
                break;
                
                
            }
            
            
            
            
            itrMap++;
        count++;
        }
        
     
        return v;
       }
	
	
	
	





int main(){


vector<int> v= {1,1,2,3,1,3,4,4,4,5};
int target =9;
vector<int> sol=twoSum(v,target);



}

