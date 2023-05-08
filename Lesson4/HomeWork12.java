// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - 
// возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class HomeWork12 {
        private LinkedList<HomeWork12> queue;
    
        public HomeWork12() {
            queue = new LinkedList<HomeWork12>();
        }
    
        public void enqueue(HomeWork12 element) {
            queue.addLast(element);
        }
    
        public HomeWork12 dequeue() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            HomeWork12 element = queue.getFirst();
            queue.removeFirst();
            return element;
        }
    
        public HomeWork12 first() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            HomeWork12 element = queue.getFirst();
            return element;
        }
}

