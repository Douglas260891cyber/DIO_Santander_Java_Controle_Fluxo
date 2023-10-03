
public class ContadorController {
    public void contar(Integer v1, Integer v2) throws ParametrosInvalidosException {
        Integer contagem = v2 - v1;
        if (v2 > v1)
            for (int valor = 1; valor <= contagem; valor++)
                System.out.println("Imprimindo o número " + valor + ".");
        else
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
