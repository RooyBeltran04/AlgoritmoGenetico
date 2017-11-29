/*
  Unidad de aprendizaje: Inteligencia Artificial.
  Alumnos: Beltran Alvarado Rogelio.
           Sandoval Hidalgo Juan Manuel.
  ********************************************************
 Cromosoma del Cuadro Mágico.
 */
package clases;


public class CromosomaS {
    private int fitness=0,mejorfitness,acumulador=0,numrandom;
    private final int k; //Constante Mágica
    private boolean inicio=true;
    private int mejorcromosoma[][];//Matriz del Mejor de la Generacion
    
    //Constructor que calcula automaticamente el fitness, evalua y actualiza el valor del mejor.
    public CromosomaS(int dimension, int generaciones) {
            int c[][]=new int[9][9]; //Matriz del Cromosoma
            k=45;//Calculamos la constante ´Mágica 
            c=CrearSudoku(c);
            
        while(generaciones>0 && mejorfitness<9){ //Calculo de todas las generaciones de cromosomas
            //Nueva Generación
            if(inicio){//La primera generación la guardamos como la mejor
                for (int j = 0; j <dimension ; j++) { //LLenando el primer cromosoma con numeros
                    for (int l = 0; l <dimension ; l++) {
                        
                        if(c[j][l]==0){
                            do {
                              numrandom=(int) (Math.random() *9) + 1;
                            } while (Existe(c,dimension,numrandom,j));
                            c[j][l]=numrandom;
                        }
                            
                    }
                }
                mejorfitness=Fitness(c,dimension);
                mejorcromosoma=c; //Le asignamos la primera generacion como la mejor
                inicio=false;
            }
            else{//Sino evaluamos que el fitness Generado sea mayor al que esta como menor
                switch ((int) (Math.random() * (3)) + 1) {
                    case 1://Modificamos 1/3 de la matriz
                            c=mejorcromosoma;
                            for (int i = 0; i < 3; i++) {
                                 for (int j = 0; j < 9; j++) {
                                    c[i][j]=0;
                                }
                            }
                            c=CrearSudoku(c);
                            
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 9; j++) {
                                    if(c[i][j]==0){
                                        do {
                                          numrandom=(int) (Math.random() *9) + 1;
                                        } while (Existe(c,dimension,numrandom,i));
                                        c[i][j]=numrandom;
                                    }
                                        
                                }
                            }
                            fitness=Fitness(c,dimension);
                            if(fitness>mejorfitness){
                                mejorcromosoma=c;
                                mejorfitness=fitness;
                            } 
                        break;
                    case 2://Modificamos cuadro 0,1
                            c=mejorcromosoma;
                            for (int i = 3; i < 6; i++) {
                                for (int j = 0; j <dimension; j++) {
                                    c[i][j]=0;
                                }
                            }
                            c=CrearSudoku(c);
                            
                            for (int i = 3; i < 6; i++) {
                                for (int j = 0; j < 9; j++) {
                                    if(c[i][j]==0){
                                        do {
                                          numrandom=(int) (Math.random() * 9) + 1;
                                        } while (Existe(c,dimension,numrandom,i));
                                        c[i][j]=numrandom;
                                    }
                                    
                                }
                            }
                            
                            fitness=Fitness(c,dimension);
                            if(fitness>mejorfitness){
                                mejorcromosoma=c;
                                mejorfitness=fitness;
                            } 
                        break;
                        case 3://Modificamos cuadro 0,1
                            c=mejorcromosoma;
                            for (int i = 6; i < 9; i++) {
                                for (int j = 0; j <dimension; j++) {
                                    c[i][j]=0;
                                }
                            }
                            c=CrearSudoku(c);
                            
                            for (int i = 6; i < 9; i++) {
                                for (int j = 0; j < 9; j++) {
                                    if(c[i][j]==0){
                                        do {
                                          numrandom=(int) (Math.random() * 9) + 1;
                                        } while (Existe(c,dimension,numrandom,i));
                                        c[i][j]=numrandom;
                                    }
                                    
                                }
                            }
                            
                            fitness=Fitness(c,dimension);
                            if(fitness>mejorfitness){
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
    
    private boolean Existe(int m[][],int lado,int num,int fila){
            for (int j = 0; j <lado; j++) {
                if(m[fila][j]==num)
                    return true;
            }
        return false;
    }
    
    
    private int[][] CrearSudoku(int c[][]){
        //Primera Fila
        c[0][2]=6;
        c[0][3]=5;
        c[0][5]=1;
        c[0][7]=8;
        
        //Segunda fila
        c[1][0]=8;
        c[1][2]=4;
        c[1][3]=7;
        c[1][4]=3;
        c[1][6]=5;
        
        //Tercera fila
        c[2][1]=3;
        c[2][7]=2;
        c[2][8]=7;
        
        //Cuarta fila
        c[3][0]=9;
        c[3][3]=4;
        c[3][5]=8;
        c[3][7]=6;
        c[3][8]=2;
        
        //Quinta fila
        c[4][1]=1;
        c[4][4]=6;
        c[4][7]=5;
        
        //Sexta fila
        c[5][0]=4;
        c[5][1]=6;
        c[5][3]=1;
        c[5][5]=2;
        c[5][8]=3;
        
        //Septima fila
        c[6][0]=1;
        c[6][1]=8;
        c[6][7]=4;
        
        //Octava fila
        c[7][2]=9;
        c[7][4]=8;
        c[7][5]=4;
        c[7][6]=2;
        c[7][8]=5;
        
        //Novena fila
        c[8][1]=4;
        c[8][3]=2;
        c[8][5]=7;
        c[8][6]=8;
        
        if(inicio)
            SudokuInicial(c);
        //Extra
        c[0][0]=7;
        c[1][8]=1;
        c[1][7]=9;
        c[2][0]=5;
        c[2][4]=4;
        c[3][2]=3;
        c[4][6]=4;
        c[4][2]=7;
        c[6][2]=2;
        c[6][3]=3;
        c[6][8]=6;
        c[8][7]=3;
        c[8][8]=9;
        c[7][0]=3;
        c[5][6]=9;
        c[4][5]=3;
        c[0][6]=3;
        c[2][2]=1;
        c[8][4]=1;
        
        return c;
    }
    
    private void SudokuInicial(int c[][]){
        System.out.println("Sudoku Inicial: \n");
           
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j <9; j++) {
                    if(j==3 || j==6)
                        System.out.print(" |");
                    System.out.print(" "+c[i][j]); 
                }
                System.out.println("");
                if(i==2 || i==5){
                   System.out.print("  ---------------------");
                   System.out.println("");  
                }
                   
            }
    }
    
    private int Fitness(int c[][],int d){
        int fitnesstemp=0;
        //Banderas
        boolean uno=false;
        boolean dos=false;
        boolean tres=false;
        boolean cuatro=false;
        boolean cinco=false;
        boolean seis=false;
        boolean siete=false;
        boolean ocho=false;
        boolean nueve=false;
        //Calculando el fitness
                for (int i = 0; i < d; i++) { //Sumando las columnas
                    for (int j = 0; j < d; j++) {
                        switch (c[j][i]) {
                            case 1:
                                  if(uno==false)
                                     uno=true;
                                break;
                            case 2:
                                  if(dos==false)
                                     dos=true;
                                break;
                            case 3:
                                  if(tres==false)
                                     tres=true;
                                break;
                            case 4:
                                  if(cuatro==false)
                                     cuatro=true;
                                break;
                            case 5:
                                  if(cinco==false)
                                     cinco=true;
                                break;
                            case 6:
                                  if(seis==false)
                                     seis=true;
                                break;
                            case 7:
                                  if(siete ==false)
                                     siete=true;
                                break;
                            case 8:
                                  if(ocho==false)
                                     ocho=true;
                                break;
                            case 9:
                                  if(nueve==false)
                                     nueve=true;
                                break;
                            default:
                                throw new AssertionError();
                        }
                        
                    }
                    if(uno && dos && tres && cuatro && cinco && seis && siete && ocho && nueve)
                           fitnesstemp++;
                        uno=false;
                        dos=false;
                        tres=false;
                        cuatro=false;
                        cinco=false;
                        seis=false;
                        siete=false;
                        ocho=false;
                        nueve=false;
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
