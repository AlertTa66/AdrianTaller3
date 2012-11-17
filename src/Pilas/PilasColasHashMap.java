import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class PilasColasHashMap {
	
	private Stack<String> libros = new Stack<String>();
	private Queue<String> personas = new LinkedList<String>();
	private HashMap<String, Persona> mapaPersonas = new HashMap<String, Persona>();

	public PilasColasHashMap(){
		personas.add("a");
		personas.add("b");
		personas.add("c");
		
		System.out.println(personas.poll());
		System.out.println(personas.peek());
		System.out.println(personas.peek());
		
		libros.push("a");
		libros.push("b");
		libros.push("c");
		
		System.out.println(libros.pop());
		System.out.println(libros.peek());
		System.out.println(libros.peek());
		
		mapaPersonas.put("nico", new Persona("nicolas","tutero","123123123"));
		mapaPersonas.put("pepe", new Persona("pepe","pamplinas","123123123"));
		mapaPersonas.put("et", new Persona("e","te","123123123"));
		
		Persona nico = (Persona)mapaPersonas.get("nico");
		System.out.println(nico.getApellido());
		
	}
	
}
