public class MaterialIndisponivelError extends Exception{
    
    public MaterialIndisponivelError(){
        super();
    }
    public MaterialIndisponivelError(String msg){
        super(msg);
    }
    public MaterialIndisponivelError(Throwable c){
        super(c);
    }
    public MaterialIndisponivelError(String msg, Throwable c){
        super(msg,c);
    }
}
