#ifndef QUEUEDYNAMIC_H
#define QUEUEDYNAMIC_H

template <class T>
class QueueDynamic
{   
public:
    //constructor
    QueueDynamic(int nEle=128);
    //destructor    
    ~QueueDynamic();
    
    bool isEmpty() const;
    bool isFull() const;
    void getFront(T&) const;
    void enQueue(T);
    void deQueue(T&);
    int queueLength() const;
    void traverse(void(*)(T)) const;
    
//private:
    T *queue;
    int front,rear,lengthOfQueue,MaxSize;
};
#endif	//QUEUEDYNAMIC_H