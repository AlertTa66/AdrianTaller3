
package punto4_expresionAritmetica;


public class ConvertidorInfijoAPosfijo
{
    StringBuffer infijo, posfijo;//Leer expresion
    Pila pila;
    
    public void convertidorInfijoAPosfijo(StringBuffer infijo)
    {
        posfijo = new StringBuffer();
        pila = new Pila();  
        pila.push("("); // agregar paretensis izquierdo a la pila
        infijo.append(")");  // anexar un parenteiss derechio al infijo
        
        while(!pila.estaVacia())  //mientras que la pila no esté vacía
        {
            for(int i=0; i<infijo.length(); i++)
            {
              if (Character.isDigit(infijo.charAt(i)))
              {
                  posfijo.append(infijo.charAt(i));
              }else if(infijo.charAt(i) == '('){
                  pila.push(infijo.charAt(i));
              } else if ( esOperador(infijo.charAt(i))){
                 
                  pila.push(infijo.charAt(i));
              }
            }
        }
    }
    
    public boolean esOperador(char c)
    {
        if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'||c=='%'){
            return true;
        }else return false;
    }
    
    public void precedencia(char operador1, char operador2)
    {
        
    }
  
    
}
