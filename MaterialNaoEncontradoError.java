public class MaterialNaoEncontradoError extends Exception{

    public MaterialNaoEncontradoError(){
        super();
    }
    public MaterialNaoEncontradoError(String msg){
        super(msg);
    }
    public MaterialNaoEncontradoError(Throwable c){
        super(c);
    }
    public MaterialNaoEncontradoError(String msg, Throwable c){
        super(msg,c);
    }
}
