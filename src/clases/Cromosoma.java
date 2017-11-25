/*
  Unidad de aprendizaje: Inteligencia Artificial.
  Alumnos: Beltran Alvarado Rogelio.
           Sandoval Hidalgo Juan Manuel.
  ********************************************************
 Cromosoma del Cuadro Mágico.
 */
package clases;


public class Cromosoma {
    private int fitness=0,mejorfitness=1,acumulador=0,numrandom;
    private final int k; //Constante Mágica
    private boolean inicio=true;
    private int mejorcromosoma[][];//Matriz del Mejor de la Generacion
    
    //Constructor que calcula automaticamente el fitness, evalua y actualiza el valor del mejor.
    public Cromosoma(int dimension, int generaciones) {
            int c[][]=new int[dimension][dimension]; //Matriz del Cromosoma
            k=dimension*((dimension*dimension)+1)/2;//Calculamos la constante ´Mágica 
        
        while(generaciones>0 && mejorfitness>0){ //Calculo de todas las generaciones de cromosomas
            //Nueva Generación
            if(inicio){//La primera generación la guardamos como la mejor
                for (int j = 0; j <dimension ; j++) { //LLenando el primer cromosoma con numeros
                    for (int l = 0; l <dimension ; l++) {
                        do {
                          numrandom=(int) (Math.random() * (dimension*dimension)) + 1;
                            System.out.println(""+numrandom);
                        } while (Existe(c,dimension,numrandom));
                        System.out.println("Guardo:"+numrandom);
                        c[j][l]=numrandom;
                    }
                }
                mejorfitness=Fitness(c,dimension);
                
                mejorcromosoma=c; //Le asignamos la primera generacion como la mejor
                inicio=false;
            }
            else{//Sino evaluamos que el fitness Generado sea menor al que esta como menor
                switch ((int) (Math.random() * (2)) + 1) {
                    case 1://Modificamos la primer mitad del cromosoma
                            c=mejorcromosoma;
                            for (int i = 0; i < dimension/2; i++) {
                                for (int j = 0; j < dimension; j++) {
                                    do {
                                      numrandom=(int) (Math.random() * (dimension*dimension)) + 1;
                                    } while (Existe(mejorcromosoma,dimension,numrandom));
                                    c[i][j]=numrandom;
                                }
                            }
                            fitness=Fitness(c,dimension);
                            if(fitness<mejorfitness){
                                mejorcromosoma=c;
                                mejorfitness=fitness;
                            } 
                        break;
                    case 2://Modificamos la segunda mitad del cromosoma
                            c=mejorcromosoma;
                            for (int i = dimension/2; i < dimension; i++) {
                                for (int j = 0; j < dimension; j++) {
                                    do {
                                      numrandom=(int) (Math.random() * (dimension*dimension)) + 1;
                                    } while (Existe(c,dimension,numrandom));
                                    c[i][j]=numrandom;
                                }
                            }
                            fitness=Fitness(c,dimension);
                            if(fitness<mejorfitness){
                                mejorcromosoma=c;
                                mejorfitness=fitness;
                            } 
                        break;
                    default:
                        throw new AssertionError();
                }
                
            }
            generaciones--;
        }
        
    }
    
    private boolean Existe(int m[][],int lado,int num){
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j <lado; j++) {
                if(m[i][j]==num)
                    return true;
            }
        }
        return false;
    }
    
    private int Fitness(int c[][],int d){
        int fitnesstemp=0;
        //Calculando el fitness
                for (int i = 0; i < d; i++) { //Sumando las filas
                    acumulador=0;
                    for (int j = 0; j < d; j++) {
                        acumulador+=c[i][j];
                    }
                    fitnesstemp+=Math.abs(k-acumulador);
                }
                
                for (int i = 0; i < d; i++) { //Sumando las columnas
                    acumulador=0;
                    for (int j = 0; j < d; j++) {
                        acumulador+=c[j][i];
                    }
                    fitnesstemp+=Math.abs(k-acumulador);
                }
                return(fitnesstemp);
    }

    public int getMejorfitness() {
        return mejorfitness;
    }

    public int[][] getMejorcromosoma() {
        return mejorcromosoma;
    }
    
 
    
    
}
