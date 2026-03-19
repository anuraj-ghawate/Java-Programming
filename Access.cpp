#include<iostream>
using namespace std;
class Demo
{
    public:
        int i;
    private:
        int j;
    protected:
        int k;

    public:
        Demo()
        {
            i = 0;
            j = 0;
            k - 0;
        }

        void Display()
        {
            cout<<"Value Of i :"<<i<<"\n";  //Allowed
            cout<<"Value Of j :"<<j<<"\n";  //Allowed
            cout<<"Value Of k :"<<k<<"\n";  //Allowed

        }
};

int main()
{
    Demo dobj;

    dobj.Display();

    cout<<"Value Of i :"<<dobj.i<<"\n"; //Allowed
    cout<<"Value Of j :"<<dobj.j<<"\n"; //Not Allowed
    cout<<"Value Of k :"<<dobj.k<<"\n"; //Not Allowed

    return 0;
}