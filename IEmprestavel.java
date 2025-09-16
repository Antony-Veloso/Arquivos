public interface IEmprestavel {
    void emprestarItem() throws MaterialIndisponivelError;
    void devolverItem();
}
