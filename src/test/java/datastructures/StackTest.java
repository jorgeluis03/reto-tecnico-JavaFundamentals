package datastructures;

import org.example.datastructures.Stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StackTest {
    @Test
    @DisplayName("Test de peek en una pila con multiples elementos")
    public void testPeek() {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.peek(),"Peek debería retornar el último elemento introducido en la pila");
    }

    @Test
    @DisplayName("Test cuando la pila esta vacía")
    public void testPopEmptyStack(){
        Stack stack = new Stack(5);
        assertThrows(IllegalStateException.class, stack::pop);
    }
}
