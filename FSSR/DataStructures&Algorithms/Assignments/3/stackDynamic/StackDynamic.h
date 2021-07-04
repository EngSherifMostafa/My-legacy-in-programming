#ifndef STACKDYNAMIC_H
#define STACKYNAMIC_H

template <class T>
class StackDynamic
{   
public:
    //constructor
    StackDynamic(int nEle=128);
	//destructor
    ~StackDynamic();
    
	bool isEmpty() const;
    bool isFull() const;
    void getTop(T&) const;
    void push(T);
    void pop(T&);
	int stackSize() const;
    void traverse(void(*)(T)) const;

private:
    T *stack;
    int top,MaxSize;
};

#endif	//STACKDYNAMIC_H