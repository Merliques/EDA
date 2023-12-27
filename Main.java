import java.util.*;

class Main {


public static void main(String[]args){

    //Data structure & algorithm
    //EDA estructura de datos y algoritmos


//**************************************************************************************//
       // 1- Pila  / Stack
       //LIFO = Last In , First Out / Ultimo en entrar Primero en salir
                // push( objeto )       --> Agregar al ultimo
                // pop()        --> eliminar el ultimo
                // peek()       --> muestra el ultimo elemento
                // empty()      --> nos dice si la pila esta vacia (true o false)
                // serach(objeto)     --> no indica si encuetra el elemento

        // usos : undo/redo  -  forwar-back in browser -
//**************************************************************************************//


//creamos una pila

        // declaramos el tipo de objeto Stack y el tipo de datos que almacenara
        // luego asignamos el nombre al objeto y creamos la instancia

        Stack<String> pila = new Stack<String>();

        // agregamos elementos a la pila
        pila.add("COD"); // agregamos el call of duty
        pila.add("AGE"); // agregamos el Age of Empire
        pila.add("COE"); // agregamos el company of hero
        pila.add("MOH"); // agregamos el medal or honor

        System.out.println(pila);                       //mostramos el contenido de la pila
        System.out.println(pila.peek());                //muestra el ultimo elemento de la pila
        System.out.println(pila.empty());               // verifica si la pila esta vacia
        System.out.println(pila.search("COE"));      // busca un elementos y nos dice su posicion en la pila, contando desde arriba

        String elemento = pila.pop();  // elimino el ultimo y lo guardo en una variable
        System.out.println(elemento);
        System.out.println(pila);
        pila.add(elemento);             // regreso el elemento eliminado a la pila
        System.out.println(pila);

//**************************************************************************************//
        // 1- Cola  / Queue
        //FIFO = First In , First Out / Primero en entrar Primero en salir
        // offer( objeto )       --> Agregar a la cola en el ultimo lugar
        // poll()        --> eliminar el primero
        // peek()       --> muestra el primer elemento

        //operaciones adicionales
        // cola.isEmpty()               --> nos regresa si esta vacio la cola
        // cola.zise()                  --> no regresa el tamaño de la cola
        // cola.contains(object)        --> nos regresa true si el elemento esta en la cola

        // Usos : buffer .. ejemplo de teclado para ir renderizando en el mismo orden en el que ingresaron
        //       Señales de impresion



//**************************************************************************************//

        System.out.println("//**************************************************************************************//");

        //La clase Queue es abstracta por lo que no se puede instancear, en ese caso usamos una clase hija como LinekedList
        Queue<String> cola = new LinkedList<>();

                cola.offer("Mig 29");
                cola.offer("F18 Hornet");
                cola.offer("FMA IA 63");
                cola.offer("FMA IA 58");

        System.out.println(cola);

        System.out.println(cola.peek());
        String derribo = cola.poll();
        System.out.println(cola);
        cola.offer(derribo);
        System.out.println(cola);
        cola.poll();
        System.out.println(cola);

//**************************************************************************************//
// PriorityQueue()


        Queue<Double> colaP = new PriorityQueue<>(Collections.reverseOrder());//para invertir orden

        colaP.offer(3.0);
        colaP.offer(2.5);
        colaP.offer(4.0);
        colaP.offer(1.5);
        colaP.offer(2.0);

        System.out.println(colaP);

        while(!colaP.isEmpty()){
                System.out.println(colaP.poll());
                }


        Queue<String> colaP2 = new PriorityQueue<>(); //Ordena numerica y alfabeticamente
        //Queue<String> colaP2 = new PriorityQueue<>(Collections.reverseOrder()); //para invertir orden

        colaP2.offer("C");
        colaP2.offer("F");
        colaP2.offer("A");
        colaP2.offer("D");
        colaP2.offer("B");

        System.out.println(colaP2);

        while(!colaP2.isEmpty()){
                System.out.println(colaP2.poll());
        }



//**************************************************************************************//
        // 1- Listas Enlazadas  / LinquedList
        //FIFO = First In , First Out / Primero en entrar Primero en salir
        // offer( objeto )       --> Agregar a la cola en el ultimo lugar
        // poll()        --> eliminar el primero
        // peek()       --> muestra el primer elemento

        //operaciones adicionales
        // cola.isEmpty()               --> nos regresa si esta vacio la cola
        // cola.zise()                  --> no regresa el tamaño de la cola
        // cola.contains(object)        --> nos regresa true si el elemento esta en la cola

        // Usos : buffer .. ejemplo de teclado para ir renderizando en el mismo orden en el que ingresaron
        //       Señales de impresion



//**************************************************************************************//








//**************************************************************************************//
        // 1- Listas de arreglos  / ArrayList
        //FIFO = First In , First Out / Primero en entrar Primero en salir
        // offer( objeto )       --> Agregar a la cola en el ultimo lugar
        // poll()        --> eliminar el primero
        // peek()       --> muestra el primer elemento

        //operaciones adicionales
        // cola.isEmpty()               --> nos regresa si esta vacio la cola
        // cola.zise()                  --> no regresa el tamaño de la cola
        // cola.contains(object)        --> nos regresa true si el elemento esta en la cola

        // Usos : buffer .. ejemplo de teclado para ir renderizando en el mismo orden en el que ingresaron
        //       Señales de impresion



//**************************************************************************************//



        }
}