class Queue {
  int front;
  int rear;
  int size;
  int[] arr;
  int cursize = 0;

  Queue(int size) {
    this.size = size;
    front = -1;
    rear = -1;
    arr = new int[size];
  }

  void push(int num) {
    if (isFull()) {
      System.out.println(" Queue is Full");
      return;
    }

    if (front == -1)
      front = 0;
    rear = (rear + 1)%size ;

    arr[rear] = num;
    cursize++;
  }

  int pop() {
    if (isEmpty()) {
      return -1;
    }
    int num = arr[front];
    if (front == rear) {
      front = rear = -1;
  } else {
      front++;
  }
  }

  int top() {
    if (isEmpty()) {
      return -1;
    }
    return arr[rear];
  }

  int front() {
    if (isEmpty()) {
      return -1;
    }
    return arr[front];
  }

  boolean isFull() {
    return cursize == size;

  }

  boolean isEmpty() {
    return cursize == 0;
  }

}