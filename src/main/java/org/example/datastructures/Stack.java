package org.example.datastructures;

public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    /**
     * Contrucctor para inicializar la pila
     *
     * @param capacity: Capacidad maxima de la pila
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; //indica que la pila esta vacia
    }

    /**
     * Añade un elemento al tope de la pila
     *
     * @param value: Valor a añadir
     */
    public void push(int value) {
        if (isFull()) throw new IllegalStateException("Stack is full");
        stack[++top] = value;
    }

    /**
     * Remueve y retorna el elemento del tope de la pila
     *
     * @return El valor en el tope de la pila
     */
    public int pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return stack[top--];
    }

    /**
     * Retorna el elemento del tope de la pila sin removerlo.
     *
     * @return El valor en el tope de la pila.
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}
