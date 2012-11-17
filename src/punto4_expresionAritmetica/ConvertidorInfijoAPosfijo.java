
package punto4_expresionAritmetica;


public class ConvertidorInfijoAPosfijo
{
    StringBuffer infijo, posfijo;//Leer expresion
    Pila pila;
    
    public void convertidorInfijoAPosfijo(StringBuffer infijo)
    {
        posfijo = new StringBuffer();
        pila = new Pila();  
        pila.push('('); // agregar paretensis izquierdo a la pila
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
                  pila.ultimo();
                  Nodo operador = pila.getActual();
                  if(esOperador(operador.datos)){
                       posfijo.append(operador.datos);
                  }
                  while(pila.anterior()&&esOperador(pila.getActual().datos)&&precedencia(operador.datos, pila.getActual().datos)){
                      operador = pila.getActual();
                      posfijo.append(operador.datos);
                  }
                      
              } else if(infijo.charAt(i) == '('){
                  
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
    
    public boolean precedencia(char op1, char op2){
        
        int valorOp1 = 0;
        int valorOp2 = 0;
        
        switch (op1) {
            case '+':valorOp1=1;
                break;
            case '-':valorOp1=2;
                break;
            case '*':valorOp1=3;
                break;
            case '/':valorOp1=4;
                break;
            case '^':valorOp1=5;
                break;
            case '%':valorOp1=6;
                break;
        }

        switch (op2) {
            case '+':valorOp2=1;
                break;
            case '-':valorOp2=2;
                break;
            case '*':valorOp2=3;
                break;
            case '/':valorOp2=4;
                break;
            case '^':valorOp2=5;
                break;
            case '%':valorOp2=6;
                break;
        }
        
        if(valorOp1<valorOp2){
            return true;
        } else{
            return false;
        }
        
    }
  
    
}
