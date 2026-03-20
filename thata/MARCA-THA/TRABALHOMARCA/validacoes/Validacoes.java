package TRABALHOMARCA.validacoes;

/**
 * Classe utilitária para validação de marca.
 * Contém métodos estáticos para validar marca
 * e retornar mensagens de erro apropriadas.
 * 
 * Esta classe não pode ser instanciada (padrão Utility Class).
 */
public class Validacoes {

    /**
     * Construtor privado para impedir a criação de instâncias.
     */
    private Validacoes() {
        // Construtor privado para evitar instância
    }

    /**
     * Verifica se a marca informada é válida.
     * Uma marca válida não pode ser nula, vazia ou conter números.
     * 
     * @param marca A marca a ser validada
     * @return true se a marca for válida, false caso contrário
     */
    public static boolean marcaValida(String marca) {
        return !(marca == null || marca.trim().isEmpty() || marca.matches(".*\\d+.*"));
    }

    /**
     * Retorna uma mensagem de erro caso a marca seja inválida.
     * 
     * @param marca A marca a ser verificada
     * @return Mensagem de erro descritiva ou string vazia se válida
     */
    public static String mensagemErroMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            return "Erro: A marca não pode estar vazia!";
        } else if (marca.matches(".*\\d+.*")) {
            return "Erro: A marca não pode conter números!";
        }
        return "";
    }
}