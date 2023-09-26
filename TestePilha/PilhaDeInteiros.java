public class PilhaDeInteiros {
    //atributos
    private int dados[];
    private int topo;


    //construtor 
    public PilhaDeInteiros(int capMax){
        dados = new int[capMax];
        topo = -1;
    }

    //verificar se o topo está cheio
    public boolean cheia(){
        return topo==dados.length-1;
    }
    //verificar se o topo está vazio
    public boolean vazia(){
        return topo == -1;
    }
    public void empilhar(int e)throws Exception{ // verifica se está cheia 
        if(cheia())
           throw new Exception("ERRO! Pilha cheia");
        else{
            topo++; // topo vale 0 e vai aumentando de acordo com o loop
            dados[topo]=e; //usa a variavel acima que é 0 
        }
    }
    public int desempilhar()throws Exception{
        int r = -1;
        if(vazia()){
            throw new Exception("ERRO! Pilha Vazia");
        }else{
            r = dados[topo--];
        }
        return r;
    }
    public String toString(){
        String s="";
        for(int i = 0; i<=topo;i++)
            s = s + "\t" + dados[i];
        return s;
    }
    
}
