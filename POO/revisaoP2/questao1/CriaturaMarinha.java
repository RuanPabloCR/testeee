package POO.revisaoP2.questao1;
public class CriaturaMarinha{
    private String tag;
    private String nomeEspecie;
    private int profundidadeEncontrada;
    public CriaturaMarinha(String tag, String nomeEspecie, int profundidadeEncontrada){
        this.tag = tag;
        this.nomeEspecie = nomeEspecie;
        this.profundidadeEncontrada = profundidadeEncontrada;
    }
    public String getTag() {
        return tag;
    }
    public String getNomeEspecie() {
        return nomeEspecie;
    }
    public int getProfundidadeEncontrada() {
        return profundidadeEncontrada;
    }
    @override
    public String toString() {
        return "CriaturaMarinha{" +
                "tag='" + tag + '\'' +
                ", nomeEspecie='" + nomeEspecie + '\'' +
                ", profundidadeEncontrada=" + profundidadeEncontrada +
                '}';
    }
}