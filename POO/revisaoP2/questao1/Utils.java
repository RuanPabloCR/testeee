package POO.revisaoP2.questao1;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class Utils {
    public Map retornaDados(Set conjuntoCriaturas) throws FormatoIncorretoException{
        Iterator iterator = conjuntoCriaturas.iterator();
        Map dados = new HashMap();
        while (iterator.hasNext()) {
            String formato = (String) iterator.next();
            String[] partes = formato.split("#");
            if(partes.length != 3) {
                throw new FormatoIncorretoException("FormatoIncorretoException: O formato da String [" + formato + "] está incorreto.");
            } else{
                String tag = partes[0];
                String nomeEspecie = partes[1];
                int profundidadeEncontrada = Integer.parseInt(partes[2]);
                CriaturaMarinha criatura = new CriaturaMarinha(tag, nomeEspecie, profundidadeEncontrada);
                dados.put(tag, criatura);
            }
        }
        return dados;
    }
}
