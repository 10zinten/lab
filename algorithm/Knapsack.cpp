#include <bits/stdc++.h>
using namespace std;

// Stucture for Item which store weight and corresponding
// value of Item
class Item {

        int id;
        int value;
        int weight;
    public :
        void getInfo(int n, int i){
            int v;
            int w;
            cout<<"Item "<<i<<endl; id = i;
            cout<<"Value: "; cin>>v; value = v;
            cout<<"Weight: "; cin>>w; weight = w;
        }

        int getId() { return id; }
        int getValue() { return value; }
        int getWeight() {return weight; }

};

// Comparison function to sort Item according to val/weight ratio
bool cmp(Item a, Item b)
{
    double r1 = (double)a.getValue() / a.getWeight();
    double r2 = (double)b.getValue() / b.getWeight();
    return r1 > r2;
}

// Main greedy function to solve problem
double fractionalKnapsack(int W, Item arr[], int n)
{


    //    Uncomment to see new order of Items with their ratio
    cout<<"Item Details: "<<endl;
    for (int i = 0; i < n; i++)
    {
        cout<<"Item: "<<arr[i].getId()<<" ";
        cout <<"\t| Value : "<< arr[i].getValue() <<"\t| "<<"Weight: "<< arr[i].getWeight() <<
             "\t| Ratio: "<< ((double)arr[i].getValue() / arr[i].getWeight()) << endl;
    }

    //    sorting Item on basis of ratio
    sort(arr, arr + n, cmp);

    cout<<endl;

    int curWeight = 0;  // Current weight in knapsack
    double finalvalue = 0.0; // Result (value in Knapsack)

    cout<<"Element content in Knapsack: "<<endl;
    // Looping through all Items
    for (int i = 0; i < n; i++)
    {
        // If adding Item won't overflow, add it completely
        if (curWeight + arr[i].getWeight() <= W)
        {
            curWeight += arr[i].getWeight();
            finalvalue += arr[i].getValue();
            cout<<1.000<<" of Item "<<arr[i].getId()<<endl;
        }

        // If we can't add current Item, add fractional part of it
        else
        {
            int remain = W - curWeight;
            finalvalue += arr[i].getValue() * ((double) remain / arr[i].getWeight());
            double accomodateRatio =  (double) remain / arr[i].getWeight();
            cout<<accomodateRatio<<" of Item "<<arr[i].getId()<<endl;
            break;
        }
    }

    // Returning final value
    return finalvalue;
}

// driver program to test above function
int main()
{
    int W; //    Weight of knapsack
    cout<<"Knapsack Weight: "; cin>>W;
    int numOfItems; // No of Item
    cout<<"No of Items: "; cin>>numOfItems;
    Item items[numOfItems];  // Array of Item
    for(int i = 0; i < numOfItems; i++)
        items[i].getInfo(numOfItems, i+1);
    cout<<"\nCapacity of knapsack: "<<W<<endl<<endl;
    cout << "\nMaximum value we can obtain = "
         << fractionalKnapsack(W, items, numOfItems);
    return 0;
}
